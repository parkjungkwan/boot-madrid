package kr.scalar.api.bank.domain;

import lombok.Data;

@Data
public class BankAccountDTO {

    private String name;
    private String accountNumber;
    private int money;
    private int balance;
    private String date;
    private float interest;
    public static final String BANK_NAME = "비트은행";


}
