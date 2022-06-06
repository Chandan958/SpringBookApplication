package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.book.Book;

public interface BookJpaRepository extends JpaRepository<Book, Integer>{

}
