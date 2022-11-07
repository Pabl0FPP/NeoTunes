package model;

import java.util.ArrayList;

public class ProducerContentCreator extends Producer{

    private ArrayList<AudioPodcast >podcasts;

    public ProducerContentCreator(String nickname, String id, Date bondingDate, String name, String url) {
        super(nickname, id, bondingDate, name, url);
        this.podcasts = new ArrayList<AudioPodcast>();

    }

    public ArrayList<AudioPodcast> getPodcasts() {
        return podcasts;
    }

    public void setPodcasts(ArrayList<AudioPodcast> podcasts) {
        this.podcasts = podcasts;
    }
}
