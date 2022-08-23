package com.example.notesystem;

import com.example.notesystem.model.Note;
import com.example.notesystem.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotesystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NotesystemApplication.class, args);
	}

	@Autowired
	private NoteRepository noteRepository;

	@Override
	public void run(String... args) throws Exception {

	//	Note note1=Note.builder()
	//	.name("note1")
	//	.content("content1")
	//	.build();
	}
}
