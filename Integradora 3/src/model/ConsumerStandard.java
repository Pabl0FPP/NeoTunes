package model;

public class ConsumerStandard extends Consumer{

    private AudioSong[] purchasedSongs;
    private Playlist[] playlists;

    public ConsumerStandard(String nickname, String id, Date bondingDate, int accumulatedReproductions, double totalReproducedTime) {
        super(nickname, id, bondingDate, accumulatedReproductions, totalReproducedTime);
        purchasedSongs = new AudioSong[100];
        playlists = new Playlist[25];
    }

    public AudioSong[] getPurchasedSongs() {
        return purchasedSongs;
    }

    public void setPurchasedSongs(AudioSong[] purchasedSongs) {
        this.purchasedSongs = purchasedSongs;
    }

    public Playlist[] getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist[] playlists) {
        this.playlists = playlists;
    }
}
