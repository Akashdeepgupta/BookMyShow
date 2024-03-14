package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
