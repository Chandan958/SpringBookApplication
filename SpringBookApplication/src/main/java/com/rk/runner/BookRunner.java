package com.rk.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.rk.book.Book;
import com.rk.repo.BookJpaRepository;

@Component
public class BookRunner implements CommandLineRunner {
	@Autowired
	private BookJpaRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		
		/*
		 * Arrays.asList( repo.saveAll(Arrays.asList( new Book(101, "java", "chandan",
		 * 300.0, "backend"), new Book(102, "ajava", "kundan", 200.0, "frotend"), new
		 * Book(103, "bjava", "kiran", 330.0, "backend"), new Book(104, "pjava", "shiv",
		 * 302.0, "frotend"), new Book(105, "sjava", "sushila", 400.0, "backend") )) );
		 */
		
		
		Book b = new Book();
		b.setBooktype("backend");
		Example ex = Example.of(b);
		List<Book> list = repo.findAll(ex);
		//System.out.println(list);
		list.forEach(System.out::println);
		
	}

}
