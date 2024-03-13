/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlistapplication;

import java.util.List;

/**
 *
 * @author yonas
 */
public class GenrePlaylist implements PlayList {
    private String genre;
    private List<Song> songs; 

    public GenrePlaylist(String genre, List<Song> songs) {
        this.genre = genre;
        this.songs = songs;
    }
    
    
//implement playList methods 
    @Override
    public boolean isEmpty() {
       
    }

    @Override
    public int size() {
       
    }

    @Override
    public void addSong(Song song) {
     
    }

    @Override
    public void removeSong(Song song) {
        
    }

    @Override
    public Song searchSong(String title) {

    }

    @Override
    public void print() {
      
    }
}