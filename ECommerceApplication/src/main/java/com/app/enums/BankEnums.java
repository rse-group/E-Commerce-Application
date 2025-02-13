package com.app.enums;

import com.app.payloads.BankResponse;

import java.util.ArrayList;
import java.util.List;

public enum BankEnums {
    BCA("1234556"),
    MANDIRI("9876543"),
    BNI("4567890");

    private final String bankNumber;

    BankEnums(String bankNumber) {
        this.bankNumber = bankNumber.toUpperCase();
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public static List<BankResponse> getAllBank() {
        List<BankResponse> banks = new ArrayList<>();
        for (BankEnums bank : BankEnums.values()) {
            banks.add(new BankResponse(bank.name(), bank.getBankNumber()));
        }
        return banks;
    }

    public static boolean checkBankByPaymentMethod(String paymentMethod) {
        for (BankEnums bank : BankEnums.values()) {
            if (bank.name().equalsIgnoreCase(paymentMethod)) {
                return true;
            }
        }
        return false;
    }
}
