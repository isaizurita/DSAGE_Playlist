package com.example.soundSphere.service;

import com.example.soundSphere.model.Playlist;
import com.example.soundSphere.repository.PlaylistRepository;
import com.example.soundSphere.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    @Autowired
    private SongRepository songRepository;

    public List<Playlist> getAllPlaylists() {
        return playlistRepository.findAll();
    }

    public void createPlaylist(String name, int userId) {
        playlistRepository.save(new Playlist(name, userId));
    }

    public void addSongToPlaylist(int songId, int playlistId) {
        playlistRepository.addSongToPlaylist(songId, playlistId);
    }
}
