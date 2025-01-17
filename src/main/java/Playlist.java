package com.example.soundSphere.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "playlist", schema = "app")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlaylist;

    private String nombre;
    private LocalDate fechaCreacion;
    private int id_Usuario;

    // Constructores, getters y setters
    public Playlist() {}

    public Playlist(String nombre, int id_Usuario) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.id_Usuario = id_Usuario;
    }
    // Getters y setters
}
