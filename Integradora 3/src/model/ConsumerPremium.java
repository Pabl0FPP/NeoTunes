package model;

import java.util.ArrayList;

public class ConsumerPremium extends Consumer{

    private ArrayList<AudioSong> purchasedSongs;
    private ArrayList<Playlist >playlists;

    public ConsumerPremium(String nickname, String id, Date bondingDate, int accumulatedReproductions, double totalReproducedTime) {
        super(nickname, id, bondingDate, accumulatedReproductions, totalReproducedTime);
        this.purchasedSongs = new ArrayList<AudioSong>();
        playlists = new ArrayList<Playlist>();
    }

    public ArrayList<AudioSong> getPurchasedSongs() {
        return purchasedSongs;
    }

    public void setPurchasedSongs(ArrayList<AudioSong> purchasedSongs) {
        this.purchasedSongs = purchasedSongs;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }
}
