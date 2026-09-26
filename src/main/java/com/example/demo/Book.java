package com.example.demo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String tytul;
    private String autor;
    private Date rok_wydania;

    public Book(){}

    public Book(Long id, String tytul, String autor, Date rok_wydania) {
        this.id = id;
        this.tytul = tytul;
        this.autor = autor;
        this.rok_wydania = rok_wydania;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getRok_wydania() {
        return rok_wydania;
    }

    public void setRok_wydania(Date rok_wydania) {
        this.rok_wydania = rok_wydania;
    }
}
