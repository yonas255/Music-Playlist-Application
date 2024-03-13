/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package playlistapplication;

/**
 *
 * @author yonas
 */
public interface PlayList {
    boolean isEmpty();
    int size();
    void addSong(Song song);
    void removeSong(Song song);
    Song searchSong(String title);
    void print();  
}
