package model;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private String code;
    private TypePlaylist typePlaylist;
    private ArrayList<Audio> audios;

    public Playlist(String name, int typePlaylist, String code) {
        this.name = name;
        this.code=code;
        this.typePlaylist=TypePlaylist.values()[typePlaylist];
        this.audios = new ArrayList<Audio>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePlaylist getTypePlaylist() {
        return typePlaylist;
    }

    public void setTypePlaylist(TypePlaylist typePlaylist) {
        this.typePlaylist = typePlaylist;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    /**
     * addAudio: add a audio to Playlist
     * @param audios refers to the audio to add
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean addAudio(Audio audios){

        return this.audios.add(audios);
    }

    /**
     * deleteAudio: remove a audio of the Playlist
     * @param audios refers to the audio to remove
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean deleteAudio(Audio audios){
        return this.audios.remove(audios);

    }


}
