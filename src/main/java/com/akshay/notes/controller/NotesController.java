package com.akshay.notes.controller;

import com.akshay.notes.models.Note;
import com.akshay.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NotesController {
    @Autowired
    private NotesService notesService;

    @GetMapping("/")
    public ResponseEntity<List<Note>> getAllNotes(){
        var notes = notesService.getAllNotes();
        return ResponseEntity.ok(notes);
    }

    @PostMapping("/")
    public ResponseEntity<Note> createNote(@RequestBody Note note){
        var savedNote = notesService.createNote(note);
        return ResponseEntity.ok(savedNote);
    }

    @PutMapping("/{noteId}")
    public ResponseEntity<Note> updateNote(@PathVariable String noteId, @RequestBody Note note){
        var savedNote = notesService.updateNote(noteId, note);
        return ResponseEntity.ok(savedNote);
    }

    @DeleteMapping("/{noteId}")
    public void deleteNote(@PathVariable String noteId){
        notesService.deleteNote(noteId);
    }
}
