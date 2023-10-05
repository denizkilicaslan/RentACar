package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BankService;
import kodlama.io.rentACar.business.abstracts.PaymentService;
import kodlama.io.rentACar.business.requests.CreatePaymentRequest;
import kodlama.io.rentACar.business.rules.PaymentBusinessRules;
import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.PaymentRepository;
import kodlama.io.rentACar.dataAccess.abstracts.RentalRepository;
import kodlama.io.rentACar.entities.concretes.Payment;
import kodlama.io.rentACar.entities.concretes.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class PaymentManager implements PaymentService {
    ModelMapperService modelMapperService;
    PaymentRepository paymentRepository;
    BankService bankService;
    RentalRepository rentalRepository;
    PaymentBusinessRules paymentBusinessRules;

    @Transactional
    @Override
    public void pay(CreatePaymentRequest createPaymentRequest) {
        if (bankService.cardPayment(createPaymentRequest.getCardDetail())) {
            Payment payment = modelMapperService.forRequest().map(createPaymentRequest, Payment.class);
            double totalPrice = paymentBusinessRules.calculateTotalPrice(createPaymentRequest.getRentalId());
            payment.setTotalPrice(totalPrice);
            paymentRepository.save(payment);

            Rental rental = rentalRepository.findById(createPaymentRequest.getRentalId()).orElseThrow();
            rental.setPaid(true);
            rental.getCar().setState(2);
            rentalRepository.save(rental);
        } else {
            throw new BusinessException("Payment could not be received");
        }
    }
}

