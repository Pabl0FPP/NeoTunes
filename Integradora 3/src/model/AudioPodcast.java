package model;

public class AudioPodcast extends Audio {

    private String description;
    private AudioPCategory typePodcast;

    public AudioPodcast(String name, String url, double duration, int numPlays, double reproducedTime, String description, int typePodcast) {
        super(name, url, duration, numPlays, reproducedTime);
        this.description = description;
        this.typePodcast = AudioPCategory.values()[typePodcast];
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public void play() {

    }
}
