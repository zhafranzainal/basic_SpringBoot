package com.example.librarymanagementsystem.models.repositories;

import com.example.librarymanagementsystem.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
