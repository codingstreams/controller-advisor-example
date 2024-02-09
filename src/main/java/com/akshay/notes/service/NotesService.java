package com.akshay.notes.service;

import com.akshay.notes.models.Note;

import java.util.List;

public interface NotesService {
    List<Note> getAllNotes();
    Note getNote(String noteId);
    Note createNote(Note note);
    Note updateNote(String noteId, Note note);
    void deleteNote(String noteId);
}
