package com.example.soundSphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @GetMapping("/playlists")
    public String getPlaylists(Model model) {
        List<Playlist> playlists = playlistService.getAllPlaylists();
        model.addAttribute("playlists", playlists);
        return "playlists";
    }

    @PostMapping("/playlists/add")
    public String addPlaylist(@RequestParam("name") String name, @RequestParam("userId") int userId) {
        playlistService.createPlaylist(name, userId);
        return "redirect:/playlists";
    }

    @PostMapping("/playlists/addSong")
    public String addSongToPlaylist(@RequestParam("songId") int songId, @RequestParam("playlistId") int playlistId) {
        playlistService.addSongToPlaylist(songId, playlistId);
        return "redirect:/playlists";
    }
}
