package com.example.bibliotheque.repositories;
import com.example.bibliotheque.entities.Book;
import com.example.bibliotheque.entities.Loan;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
