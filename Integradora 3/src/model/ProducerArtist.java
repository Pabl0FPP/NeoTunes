package model;

import java.util.ArrayList;

public class ProducerArtist extends Producer{

    private ArrayList<AudioSong> songs;

    public ProducerArtist(String nickname, String id, Date bondingDate, String name, String url) {
        super(nickname, id, bondingDate, name, url);
        this.songs = new ArrayList<AudioSong>();
    }

    public ArrayList<AudioSong> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<AudioSong> songs) {
        this.songs = songs;
    }

    /**
     * addSong: add a song to Artist
     * @param songs refers to the song to add
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean addSong(AudioSong songs){
        return this.songs.add(songs);
    }
}
