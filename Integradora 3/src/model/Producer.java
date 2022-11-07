package model;

import java.util.ArrayList;

public abstract class Producer extends User{

    private String name;
    private String url;

    private ArrayList<Audio> audios;

    public Producer(String nickname, String id, Date bondingDate, String name, String url) {
        super(nickname, id, bondingDate);
        this.name = name;
        this.url = url;
        this.audios = new ArrayList<Audio>();
    }

    public String getName() {

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
}
