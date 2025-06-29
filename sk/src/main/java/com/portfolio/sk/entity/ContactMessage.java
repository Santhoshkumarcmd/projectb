package com.portfolio.sk.entity;

import jakarta.persistence.*;

@Entity
public class ContactMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String subject;
    @Column(length = 2000)
    private String message;

    // Getters and setters
    // ...
}