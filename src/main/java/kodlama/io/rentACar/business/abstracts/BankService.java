package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreateBankRequest;

public interface BankService {

    boolean cardPayment(CreateBankRequest request);
}
