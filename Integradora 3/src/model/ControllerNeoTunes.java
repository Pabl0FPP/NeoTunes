package model;

import java.util.ArrayList;


public class ControllerNeoTunes {
    private ArrayList<User> users;
    private ArrayList<Audio> audios;
    private ArrayList<Playlist> playlists;

    public ControllerNeoTunes() {
        this.users = new ArrayList<User>();
        this.audios = new ArrayList<Audio>();
        this.playlists = new ArrayList<Playlist>();

    }

    public boolean registerProducer(int option, String nickname, String id, int day, int month, int year, String name, String url){
        switch(option){
            //1 artist, 2 contentCreator
            case 1 :
                users.add(new ProducerArtist(nickname, id, new Date(day, month, year), name, url));
                break;

            case 2 :
                users.add(new ProducerContentCreator(nickname, id, new Date(day, month, year), name, url));
                break;

            default:
                break;

        }
        return false;
    }

    public boolean registerConsumer(int option, String nickname, String id, int day, int month, int year, int accumulatedReproductions, double totalReproducedTime){
        //1 standard, 2 premium
        switch (option){
            case 1 :
                users.add(new ConsumerStandard(nickname, id, new Date(day, month, year), accumulatedReproductions, totalReproducedTime));
                break;

            case 2 :
                users.add(new ConsumerPremium(nickname, id, new Date(day, month, year), accumulatedReproductions, totalReproducedTime));
                break;

            default:
                break;

        }
        return false;

    }

    public boolean registerAudio(int option, String name, String url, double duration, int numPlays, double reproducedTime, String album, double saleValue, int typeSong, String description, int typePodcast){
        //1 song, 2 podcast
        switch (option){

            case 1:
                audios.add(new AudioSong(name, url, duration, numPlays, reproducedTime, album, saleValue, typeSong));
                break;

            case 2:
                audios.add(new AudioPodcast(name, url, duration, numPlays, reproducedTime, description, typePodcast));
                break;

            default:
                break;
        }
        return false;
    }

    public boolean registerPlaylist(String name){

        return playlists.add(new Playlist(name));
    }


    /*
    public boolean editPlayList(int option, int index, String name, AudioSong song){
//1 = add song
// 2 = podcast
        // 2 = remove song - podcast
        // 3 = edit name
        switch (option){
            case 1 :
                playlists.set(index, );
                break;
            case 2 :
                playlists.set(index)
                break;

            case 3:
                playlists.set(index, name);
                break;

            default:
                break;

        }



        return playlists.set(index, );
    }
     */



}
