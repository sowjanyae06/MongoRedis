package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;

import lombok.Data;

@Data
public class Book {
	@Id
	private String id;
	@Indexed
	private String title;
	private String author;
	private String description;
}
