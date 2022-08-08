package com.example.notesystem.controller;

import com.example.notesystem.model.Note;
import com.example.notesystem.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
@CrossOrigin
public class NoteController {
        @Autowired
        private NoteService noteService;

        @PostMapping("/add")
        public String add(@RequestBody Note note){
            noteService.saveNote(note);
            return "New note is added";
        }

        @GetMapping("/getAll")
        public List<Note> list(){
            return noteService.getAllNotes();
        }
}

