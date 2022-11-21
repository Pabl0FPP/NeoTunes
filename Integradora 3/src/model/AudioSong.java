package model;

public class AudioSong extends Audio{

    private String album;
    private double saleValue;
    private AudioSGenre typeSong;

    public AudioSong(String name, String url, double duration, int numPlays, double reproducedTime, String album, double saleValue, int typeSong) {
        super(name, url, duration, numPlays, reproducedTime);
        this.album = album;
        this.saleValue = saleValue;
        this.typeSong = AudioSGenre.values()[typeSong];
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }

    @Override
    public void play() {

    }
}
