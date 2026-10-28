package net.niema.bankaccountservice.repositories;

import net.niema.bankaccountservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
