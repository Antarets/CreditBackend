package org.example.creditbackend.repository;

import org.example.creditbackend.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, UUID> {
}
