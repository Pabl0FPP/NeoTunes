package model;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Audio> audios;

    public Playlist(String name) {
        this.name = name;
        this.audios = new ArrayList<Audio>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Audio> getAudios() {
        return audios;
    }

    public void setAudios(ArrayList<Audio> audios) {
        this.audios = audios;
    }

    private String generateCode(){

        return "";
    }

}
