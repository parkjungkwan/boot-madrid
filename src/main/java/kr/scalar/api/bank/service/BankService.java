package kr.scalar.api.bank.service;

import kr.scalar.api.bank.domain.AccountDTO;
import java.util.List;

/**
 * * 은행이름은 상수로 정한다.
 이름을 입력하면 계좌가 생성된다. 단 계좌번호는 ****-****-**** 이고 랜덤값이다.
 금액, 계좌번호 을 입력한후 입금한 후 잔액을 확인한다
 금액, 계좌번호 을 입력한후 출금한 후 잔액을 확인한다
 금액, 계좌번호 을 입력한후 잔액을 확인하면 잔액이 보인다.

 이름, 계좌번호 을 입력한후 계좌를 해지한다.



 * */
public interface BankService {

    void createAccount(AccountDTO bank);
    String count();
    List<? extends AccountDTO> findAll();
    String[] findAllAccountNumbers();
    String findBalance(AccountDTO bank);
    String deposit(AccountDTO bank);
    String withdraw(AccountDTO bank);
    void dropAccount(AccountDTO bank);
}
