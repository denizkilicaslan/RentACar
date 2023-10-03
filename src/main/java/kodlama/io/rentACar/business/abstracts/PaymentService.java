package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreatePaymentRequest;

public interface PaymentService {

    void pay(CreatePaymentRequest createPaymentRequest);
}
