package com.example.GymManagementSystem.entity;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role; // e.g., "admin", "customer"

    // Getters and setters
}

