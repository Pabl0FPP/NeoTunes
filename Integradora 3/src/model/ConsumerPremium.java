package model;

import java.util.ArrayList;

public class ConsumerPremium extends Consumer{

    private ArrayList<AudioSong> purchasedSongs;
    private ArrayList<Playlist >playlists;

    public ConsumerPremium(String nickname, String id, Date bondingDate, int accumulatedReproductions, double totalReproducedTime) {
        super(nickname, id, bondingDate, accumulatedReproductions, totalReproducedTime);
        this.purchasedSongs = new ArrayList<AudioSong>();
        this.playlists = new ArrayList<Playlist>();
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

    /*
    public boolean addPlaylistPm(String name){

        Playlist newPlaylist=new Playlist(name);

        for(int i=0;i<playlists.size();i++){
                playlists.get(i)=newPlaylist;
                return true;

        }
        return false;
    }

     */

    /**
     * addPlaylistPm: add Playlist to Consumer premium
     * @param playlists refers to the playlist to register
     * @return true or false depending on whether it satisfies the condition
     */
    public boolean addPlaylistPm(Playlist playlists){

        return this.playlists.add(playlists);
    }

    /**
     * addPurchasedSong: add a purchased song to Consumer premium
     * @param purchasedSongs refers to the songs to buy
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean addPurchasedSong(AudioSong purchasedSongs){
        return this.purchasedSongs.add(purchasedSongs);
    }

}
