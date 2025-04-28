package org.example.creditbackend.repository;

import org.example.creditbackend.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface LoanRepository extends JpaRepository<Loan, UUID> {
}

