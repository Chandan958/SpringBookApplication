package com.rk.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Book {
	@Id
	@NonNull
	@Column(name = "bid")
	private Integer boodId;
	@Column(name = "bname")
	private String bookName;
	@Column(name = "bauthor")
	private String bookAuthor;
	@Column(name = "bcost")
	private Double bookcost;
	@Column(name = "btype")
	private String booktype;
	
}
