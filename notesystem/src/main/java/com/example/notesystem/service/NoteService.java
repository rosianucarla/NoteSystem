package com.example.notesystem.service;

import com.example.notesystem.model.Note;

import java.util.List;

public interface NoteService {
    public Note saveNote(Note note);
    public List<Note> getAllNotes();
}
