package org.sid.bank_account_service.mappers;

import net.niema.bankaccountservice.dto.BankAccountRequestDTO;
import net.niema.bankaccountservice.dto.BankAccountResponseDTO;
import net.niema.bankaccountservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }

    public BankAccount toBankAccount(BankAccountRequestDTO requestDTO) {
        BankAccount bankAccount = new BankAccount();
        BeanUtils.copyProperties(requestDTO, bankAccount);
        return bankAccount;
    }
}
