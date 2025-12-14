package com.example.bibliotheque.repositories;
import com.example.bibliotheque.entities.Book;
import com.example.bibliotheque.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
