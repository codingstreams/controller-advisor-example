package com.akshay.notes.repo;

import com.akshay.notes.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepo extends JpaRepository<Note, String> {
}
