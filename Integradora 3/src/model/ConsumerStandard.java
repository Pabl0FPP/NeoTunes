package model;

import java.util.ArrayList;

public class ConsumerStandard extends Consumer{

    private ArrayList<AudioSong> purchasedSongs;
    private ArrayList<Playlist >playlists;
    public ConsumerStandard(String nickname, String id, Date bondingDate, int accumulatedReproductions, double totalReproducedTime) {
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
    public boolean addPlaylistSt(String name){

        Playlist newPlaylist = new Playlist(name);

        for(int i=0;i<playlists.length;i++){

            if(playlists[i]!=null){
                playlists[i]= newPlaylist;
                return true;
            }
        }
        return false;
    }

 */
    /**
     * addPlaylistSt: add Playlist to Consumer standard
     * @param playlists refers to the playlist to register
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean addPlaylistSt(Playlist playlists){
    return this.playlists.add(playlists);
}
    /**
     * addPurchasedSong: add a purchased song to Consumer standard
     * @param purchasedSongs refers to the songs to buy
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean addPurchasedSong(AudioSong purchasedSongs){
        return this.purchasedSongs.add(purchasedSongs);
    }




}
