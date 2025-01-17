package com.example.soundSphere.repository;

import com.example.soundSphere.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

    @Query(value = "INSERT INTO app.cancionesplaylist (id_Cancion, id_Playlist) VALUES (:songId, :playlistId)", nativeQuery = true)
    void addSongToPlaylist(@Param("songId") int songId, @Param("playlistId") int playlistId);
}
