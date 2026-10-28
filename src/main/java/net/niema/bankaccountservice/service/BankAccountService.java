package net.niema.bankaccountservice.service;

import net.niema.bankaccountservice.dto.BankAccountRequestDTO;
import net.niema.bankaccountservice.dto.BankAccountResponseDTO;

public interface BankAccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);

}
