package th.ac.ku.atm.service;

import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {

    private List<BankAccount> bankAccountList;

    @PostConstruct
    public void postConstruct() {
        this.bankAccountList = new ArrayList<>();
    }

    public List<BankAccount> getBankAccounts(){
        return new ArrayList<>(this.bankAccountList);

    }

    public void addBankAccount(BankAccount bankAccount){
        this.bankAccountList.add(bankAccount);
    }

}