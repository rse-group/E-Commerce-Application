package com.app.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "bank")
@NoArgsConstructor
@AllArgsConstructor

public class Bank {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;
    private String bankName;
    private long norek;
}
