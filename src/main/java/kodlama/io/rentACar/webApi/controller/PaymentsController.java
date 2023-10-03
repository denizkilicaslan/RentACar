package kodlama.io.rentACar.webApi.controller;

import kodlama.io.rentACar.business.abstracts.PaymentService;
import kodlama.io.rentACar.business.requests.CreatePaymentRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/payments")
@AllArgsConstructor
public class PaymentsController {
    private PaymentService paymentService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void pay(@RequestBody CreatePaymentRequest createPaymentRequest) {
        paymentService.pay(createPaymentRequest);
    }
}
