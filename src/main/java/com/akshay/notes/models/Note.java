package com.akshay.notes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@ToString
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String data;
    private LocalDateTime createdAt = LocalDateTime.now();
}
