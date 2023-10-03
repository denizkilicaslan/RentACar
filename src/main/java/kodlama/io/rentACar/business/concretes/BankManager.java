package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BankService;
import kodlama.io.rentACar.business.requests.CreateBankRequest;
import org.springframework.stereotype.Service;

@Service
public class BankManager implements BankService {
    @Override
    public boolean cardPayment(CreateBankRequest request) {
        return true;
    }
}
