package com.akshay.notes.service;

import com.akshay.notes.exceptions.NoteNotFoundException;
import com.akshay.notes.models.Note;
import com.akshay.notes.repo.NotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService{
    @Autowired
    private NotesRepo notesRepo;

    @Override
    public List<Note> getAllNotes() {
        return notesRepo.findAll();
    }

    @Override
    public Note getNote(String noteId) {
        return null;
    }

    @Override
    public Note createNote(Note note) {
        return notesRepo.save(note);
    }

    @Override
    public Note updateNote(String noteId, Note note) {
        // Find note by noteId
        var savedNote = notesRepo.findById(noteId)
                .orElseThrow(()->new NoteNotFoundException("Note Not Found"));

        // Update details of current note obj with new note obj
        savedNote.setData(note.getData());

        // Save and return note
        return notesRepo.save(savedNote);
    }

    @Override
    public void deleteNote(String noteId) {
        var isExists = notesRepo.existsById(noteId);

        if(!isExists){
            throw new NoteNotFoundException("Note Not Found");
        }

        notesRepo.deleteById(noteId);
    }
}
