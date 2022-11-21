package model;

public abstract class Audio implements Playable {

    private String name;
    private String url;
    private double duration;

    private int numPlays;

    private double reproducedTime;

    public Audio(String name, String url, double duration, int numPlays, double reproducedTime) {
        this.name = name;
        this.url = url;
        this.duration = duration;
        this.numPlays = numPlays;
        this.reproducedTime = reproducedTime;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getNumPlays() {
        return numPlays;
    }

    public void setNumPlays(int numPlays) {
        this.numPlays = numPlays;
    }

    public double getReproducedTime() {
        return reproducedTime;
    }

    public void setReproducedTime(double reproducedTime) {
        this.reproducedTime = reproducedTime;
    }
}
