package ui;

import java.util.Scanner;

import model.AudioPodcast;
import model.AudioSong;
import model.ControllerNeoTunes;
import model.Playlist;

public class Main {
    private Scanner sc;
    private ControllerNeoTunes controller;

    public Main() {
        this.sc = new Scanner(System.in);
        this.controller = new ControllerNeoTunes();
    }

    public void menu(){
        System.out.println("Welcome to NeoTunes");

        boolean exit=false;
        while (!exit){
            System.out.println("1.Register Producer\n2.Register Consumer\n3.Register Audio\n4. Register Playlist \n5. Edit a Playlist");
            int option=sc.nextInt();

            switch (option){
                case 1 :
                    registerProducer();

                    break;

                case 2:
                    registerConsumer();

                    break;

                case 3 :
                    registerAudio();

                    break;

                case 4 :
                    registerPlaylist();

                    break;

                case 5 :

                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.menu();

    }

    public void registerProducer(){
        System.out.println("You want register:\n1. Artist\n2. ContentCreator");
        int op=sc.nextInt();

        System.out.println("Type the nickname");
        sc.nextLine();
        String nickname=sc.nextLine();

        System.out.println("Type the id");
        String id=sc.nextLine();

        System.out.println("Type the bonding Date");
        System.out.println("Day:");
        int day= sc.nextInt();
        System.out.println("Month");
        int month=sc.nextInt();
        System.out.println("Year");
        int year=sc.nextInt();

        System.out.println("type the name");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("Type the url");
        String url=sc.nextLine();

        if(controller.registerProducer(op, nickname, id, day, month, year, name, url)){
            System.out.println("producer registered successfully");

        }else{
            System.out.println("Error registering the producer");

        }

    }
    public void registerConsumer(){

        System.out.println("You want register:\n1. Standard\n2. Premium");
        int op= sc.nextInt();

        System.out.println("Type the nickname");
        sc.nextLine();
        String nickname=sc.nextLine();

        System.out.println("Type the id");
        String id=sc.nextLine();

        System.out.println("Type the bonding date");
        System.out.println("Day:");
        int day= sc.nextInt();
        System.out.println("Month");
        int month=sc.nextInt();
        System.out.println("Year");
        int year=sc.nextInt();

        int accumulatedReproductions=0;
        int totalReproducedTime=0;

        if(controller.registerConsumer(op, nickname, id, day, month, year, accumulatedReproductions, totalReproducedTime)){
            System.out.println("Consumer registered successfully");

        }else{
            System.out.println("Error registering the consumer");

        }

    }

    public void registerAudio(){

        System.out.println("You want register\n1. Song\n2. Podcast");

        int op=sc.nextInt();
        System.out.println("What artist does the song belong to?(Type the position)");
        System.out.println(controller.showProducer(op));
        int index=sc.nextInt();

        System.out.println("Type the name of the audio");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("Type the url");
        String url=sc.nextLine();

        System.out.println("Type the duration");
        double duration=sc.nextDouble();

        int numPlays=0;
        double reproducedTime=0;
        String album="";
        double saleValue=0;
        int typeSong=0;
        String description="";
        int typePodcast=0;
        AudioSong song = null;
        AudioPodcast podcast=null;

        if(op==1){
            System.out.println("Type the album of the song");
            sc.nextLine();
            album=sc.nextLine();

            System.out.println("Type the Sale Value of the song");
            saleValue= sc.nextDouble();

            System.out.println("Type the song genre\n1. ROCK, 2. POP, 3. TRAP, 4. HOUSE");
            typeSong=sc.nextInt()-1;
            song =new AudioSong(name, url, duration, numPlays, reproducedTime, album, saleValue, typeSong);

        } else if(op==2){
            System.out.println("Type the Podcast description");
            sc.nextLine();
            description=sc.nextLine();

            System.out.println("Type the Podcast category\n1. POLITIC, 2. ENTERTAINMENT, 3. VIDEOGAMES, 4. FASHION");
            typePodcast=sc.nextInt()-1;
            podcast=new AudioPodcast(name, url, duration, numPlays, reproducedTime, description, typePodcast);
        }

        if(controller.registerAudio(index, op, name, url, duration, numPlays, reproducedTime, album, saleValue, typeSong, description, typePodcast, song, podcast)){
            System.out.println("Audio registered successfully");

        } else{
            System.out.println("Error registering the audio");

        }

    }

    public void registerPlaylist(){
        Playlist playlist=null;
        String code="";

        System.out.println("What type of consumer are you going to add the playlist to?\n1. Standard\n2. Premium");
        int option=sc.nextInt();
        System.out.println(controller.showConsumer(option));

        System.out.println("Type the number of the consumer to register the playlist to");
        int indexConsumer=sc.nextInt();

        System.out.println("Type the Playlist Name");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("Enter the type of the playlist\n1. SONGS, 2. PODCASTS, 3.BOTH");
        int typePlaylist=sc.nextInt();
        playlist=new Playlist(name, typePlaylist, code);

        if(controller.registerPlaylist(option, indexConsumer,name, typePlaylist,code, playlist)){
            System.out.println("Playlist registered successfully");

        }else{
            System.out.println("Error registering the playlist");
        }

    }


}
