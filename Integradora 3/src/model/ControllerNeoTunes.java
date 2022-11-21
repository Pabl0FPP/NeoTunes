package model;

import java.util.ArrayList;
import java.util.Random;


public class ControllerNeoTunes {
    Random ale = new Random();
    private ArrayList<User> users;
    private ArrayList<Audio> audios;
    private ArrayList<Playlist> playlists;

    public ControllerNeoTunes() {
        this.users = new ArrayList<User>();
        this.audios = new ArrayList<Audio>();
        this.playlists = new ArrayList<Playlist>();

    }

    /**
     *registerProducer: register a consumer in the program
     * @param option refers to the option to register an Artist or a Content Creator
     * @param nickname refers to the nickname of the producer
     * @param id refers to the id of the producer
     * @param day refers to the day of the bonding date of the producer
     * @param month refers to the month of the bonding date of the producer
     * @param year refers to the year of the bonding date of the producer
     * @param name refers to the name of the producer
     * @param url refers to the url of the producer image
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean registerProducer(int option, String nickname, String id, int day, int month, int year, String name, String url) {
        switch (option) {
            //1 artist, 2 contentCreator
            case 1:
                users.add(new ProducerArtist(nickname, id, new Date(day, month, year), name, url));
                return true;

            case 2:
                users.add(new ProducerContentCreator(nickname, id, new Date(day, month, year), name, url));
                return true;

            default:
                break;

        }
        return false;
    }

    /**
     *registerConsumer: register a consumer in the program
     * @param option refers to the option to register a consumer standard or a consumer premium
     * @param nickname refers to the nickname of the consumer
     * @param id refers to the id of the consumer
     * @param day refers to the day of the bonding date of the consumer
     * @param month refers to the month of the bonding date of the consumer
     * @param year refers to the year of the bonding date of the consumer
     * @param accumulatedReproductions refers to the accumulated reproductions of their audios
     * @param totalReproducedTime refers to the total reproduced time of their audios
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean registerConsumer(int option, String nickname, String id, int day, int month, int year, int accumulatedReproductions, double totalReproducedTime) {
        //1 standard, 2 premium
        switch (option) {
            case 1:
                users.add(new ConsumerStandard(nickname, id, new Date(day, month, year), accumulatedReproductions, totalReproducedTime));
                return true;


            case 2:
                users.add(new ConsumerPremium(nickname, id, new Date(day, month, year), accumulatedReproductions, totalReproducedTime));
                return true;

            default:
                break;

        }
        return false;

    }

    /**
     *ShowProducer: show the producers registered in the program
     * @param option refers to the option to show an artist or a content creator
     * @return msg refers to producers registered in the program
     */

    public String showProducer(int option) {
        String msg = "";
        for (int i = 0; i < users.size(); i++) {
            if (!users.isEmpty()) {
                switch (option) {
                    case 2:
                        if (users.get(i) instanceof ProducerContentCreator) {
                            msg += "\n" + (i) + ". " + ((ProducerContentCreator) users.get(i)).getName();
                        }
                        return msg;
                    case 1:
                        if (users.get(i) instanceof ProducerArtist) {
                            msg += "\n" + (i) + ". " + ((ProducerArtist) users.get(i)).getName();
                        }
                        return msg;
                    default:
                        break;
                }
            }
        }
        if (msg.equals("")) {
            msg = "There are no Producers registered yet";
        }
        return msg;
    }

    /**
     *
     *ShowProducer: show the consumers registered in the program
     * @param option refers to the option to show a consumer standard or a consumer premium
     *@return msg refers to consumers registered in the program
     *      */

    public String showConsumer(int option) {
        String msg = "";
        for (int i = 0; i < users.size(); i++) {
            if (!users.isEmpty()) {
                switch (option) {
                    case 1:
                        if (users.get(i) instanceof ConsumerStandard) {
                            msg += "\n" + (i) + ". " + users.get(i).getNickname();
                        }
                        return msg;
                    case 2:
                        if (users.get(i) instanceof ConsumerPremium) {
                            msg += "\n" + (i) + ". " + users.get(i).getNickname();
                        }

                        return msg;
                    default:
                        break;
                }
            }
        }
        if (msg.equals("")) {
            msg = "There are no Consumers registered yet";
        }
        return msg;
    }

    /**
     * registerAudio: register a Audio(Song or Podcast) in the program
     * @param indexProducer refers to the producer of the audio to register.
     * @param option refers to the option to register a Song or a podcast
     * @param name refers to the name of the Audio
     * @param url refers to the url of the Audio
     * @param duration refers to the duration of the Audio
     * @param numPlays refers to the number of reproductions of the Audio
     * @param reproducedTime refers to the time reproduced of the Audio
     * @param album refers to the album of the Song
     * @param saleValue refers to the sale Value of the Song
     * @param typeSong refers to the genre of the song
     * @param description refers to the description of the podcast
     * @param typePodcast refers to the category of the podcast
     * @param songs refers to the song to register
     * @param podcasts refers to the podcast to register
     * @return true or false depending on whether it satisfies the condition
     */

    public boolean registerAudio(int indexProducer, int option, String name, String url, double duration, int numPlays, double reproducedTime, String album, double saleValue, int typeSong, String description, int typePodcast, AudioSong songs, AudioPodcast podcasts) {
        //1 song, 2 podcast
        switch (option) {

            case 1:

                for (int i = 0; i < audios.size(); i++) {
                    if (!audios.isEmpty()) {
                        if (i == indexProducer) {
                            audios.add(new AudioSong(name, url, duration, numPlays, reproducedTime, album, saleValue, typeSong));
                            if (users.get(i) instanceof ProducerArtist) {
                                ((ProducerArtist) users.get(i)).addSong(songs);
                            }
                        }
                    }
                }
                return true;

            case 2:
                for (int i = 0; i < audios.size(); i++) {
                    if (!audios.isEmpty()) {
                        if (i == indexProducer) {
                            audios.add(new AudioPodcast(name, url, duration, numPlays, reproducedTime, description, typePodcast));
                            if (users.get(i) instanceof ProducerContentCreator) {
                                ((ProducerContentCreator) users.get(i)).addPodcast(podcasts);
                            }
                        }
                    }
                }
                return true;

            default:
                break;
        }
        return false;
    }

    /**
     *registerPlaylist: register a Playlist in the program
     * @param option refers to the option to register a playlist to a Consumer premium or Standard
     * @param indexConsumer refers to the consumer of the playlist to register.
     * @param name refers to the name of the Playlist
     * @param typePlaylist refers to the type of playlist
     * @param code refers to the code of the playlist that changes according to the type of playlist
     * @param playlist refers to the playlist to register
     * @return true or false depending on whether it satisfies the condition
     */
    public boolean registerPlaylist(int option, int indexConsumer, String name, int typePlaylist, String code, Playlist playlist) {

        switch (option) {
            case 1:
                for (int i = 0; 20 < playlists.size(); i++) {
                    if (!playlists.isEmpty()) {
                        if (i == indexConsumer) {
                            playlists.add(new Playlist(name, typePlaylist, code));
                            if (users.get(i) instanceof ConsumerStandard) {
                                ((ConsumerStandard) users.get(i)).addPlaylistSt(playlist);
                            }
                        }
                    }
                }
                return true;
            case 2:
                for (int i = 0; i < playlists.size(); i++) {
                    if (!playlists.isEmpty()) {
                        if (i == indexConsumer) {
                            playlists.add(new Playlist(name, typePlaylist, code));
                            if (users.get(i) instanceof ConsumerPremium) {
                                ((ConsumerPremium) users.get(i)).addPlaylistPm(playlist);
                            }
                        }
                    }
                }
                return true;
        }
        return false;
    }

    /**
     * showPlaylist: show the playlists registered in the program
     * @return msg refers to playlist registered in the program
     */

    public String showPlaylists() {
        String msg = "";
        for (int i = 0; i < playlists.size(); i++) {
            msg += (i) + ". " + playlists.get(i).getName();
        }
        return msg;
    }
/*
    public boolean editPlaylist(int option, String name, int indexPlaylist, String newname, Audio audios) {
        //1 rename,2add,3remove

        switch (option) {
            case 1:
                playlists.get(indexPlaylist).addAudio(audios.get(indexAudio));
                return true;
            case 2:
                for (int i = 0; i < playlists.size(); i++) {
                    if (!playlists.isEmpty()) {
                        if (i == indexPlaylist) {
                            playlists.get(indexPlaylist).addAudio(audios.get(indexAudio));
                        }
                    }
                }

                return true;
            case 3:
                playlists.get(indexPlaylist).deleteAudio(audios.getName(name));
                return true;
        }
        return false;

    }
    */




    public String codePlaylistSong() {
        String code = "";

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; i < matrix.length; i++) {
                matrix[i][j] = ale.nextInt(9 - 0 + 1) + 0;
            }
        }

        for (int i = matrix[0].length; i > 0; i--) { // Columnas
            code += matrix[i - 1][0];
        }

        for (int i = 0; i < matrix.length; i++) { // Filas

            for (int j = 0; j < matrix[0].length; j++) { // Columnas

                if (i == j && i > 0 && i < matrix.length - 1) {

                    code += matrix[i][j];
                }
            }
        }

        for (int i = matrix[0].length; i > 0; i--) { // Columnas

            code += matrix[i - 1][matrix[0].length - 1];
        }
        return code;
    }

    public String codePlaylistPodcasts() {
        String code = "";

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; i < matrix.length; i++) {
                matrix[i][j] = ale.nextInt(9 - 0 + 1) + 0;
            }
        }

        for (int i = matrix[0].length; i > 0; i--) { // Columnas
            code += matrix[i - 1][0];
        }

        for (int i = 0; i < matrix.length; i++) { // Filas

            for (int j = 0; j < matrix[0].length; j++) { // Columnas

                if (i == j && i > 0 && i < matrix.length - 1) {

                    code += matrix[i][j];
                }
            }
        }

        for (int i = matrix[0].length; i > 0; i--) { // Columnas

            code += matrix[i - 1][matrix[0].length - 1];
        }
        return code;
    }

    public String codeBoth() {
        String code = "";

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; i < matrix.length; i++) {
                matrix[i][j] = ale.nextInt(9 - 0 + 1) + 0;
            }
        }

        for (int i = matrix[0].length; i > 0; i--) { // Columnas
            code += matrix[i - 1][0];
        }

        for (int i = 0; i < matrix.length; i++) { // Filas

            for (int j = 0; j < matrix[0].length; j++) { // Columnas

                if (i == j && i > 0 && i < matrix.length - 1) {

                    code += matrix[i][j];
                }
            }
        }

        for (int i = matrix[0].length; i > 0; i--) { // Columnas

            code += matrix[i - 1][matrix[0].length - 1];
        }
        return code;
    }

    /*
    public boolean buySong(){

    }
*/









/*
        for(int i=0;i<playlists.size();i++){
            if(!playlists.isEmpty()){
                if((playlists.get(i).getTypePlaylist()).equals("SONGS")){

                }else if((playlists.get(i).getTypePlaylist()).equals("PODCASTS")){



                }else if((playlists.get(i).getTypePlaylist()).equals("")){



                }
            }

        }

    }
*/


}








