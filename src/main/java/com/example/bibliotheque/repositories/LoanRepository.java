package com.example.bibliotheque.repositories;
import com.example.bibliotheque.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
