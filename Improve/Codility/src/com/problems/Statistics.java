package com.problems;

import java.util.HashSet;
import java.util.Scanner;

public class Statistics {

    public String solution(String s) {

        Scanner sc = new Scanner(s);

        //HashSet for storing different types of music file extension
        HashSet<String> music = new HashSet<>();

        //HashSet for storing different types of image files extension
        HashSet<String> image = new HashSet<>();

        //HashSet for storing different types of movie files extension
        HashSet<String> movie = new HashSet<>();

        //adding different types of music files to HashSet music
        music.add("mp3");
        music.add("aac");
        music.add("flac");

        //adding different types of image files to HashSet music
        image.add("jpg");
        image.add("bmp");
        image.add("gif");

        //adding different types of image files to HashSet music
        movie.add("mp4");
        movie.add("avi");
        movie.add("mkv");

        //Intializing size of music, image, movie, other files to "0"
        Long sizeMusic = 0L, sizeImage = 0L, sizeMovie = 0L, sizeofOther = 0L;

        //loop continues if input contains next line
        while (sc.hasNextLine()) {

            String nextLineOfInput = sc.nextLine();

            //splitting line on space now fileDescription contains file name and file size
            String[] fileDescription = nextLineOfInput.split(" ");

            //splitting file name on "." to get file extension
            String[] splitFileNameOnDot = fileDescription[0].split("\\.");

            //storing file extension
            String extensionType = splitFileNameOnDot[splitFileNameOnDot.length - 1];

            int lenOfFile = fileDescription[1].length();

            char lastCharValueOfInput = nextLineOfInput.charAt(nextLineOfInput.length() - 1);

            //depending on last value of input adding file sizes
            if (lastCharValueOfInput != '"') {
                if (music.contains(extensionType))
                    sizeMusic += Long.parseLong(fileDescription[1].substring(0, lenOfFile - 1));
                else if (image.contains(extensionType))
                    sizeImage += Long.parseLong(fileDescription[1].substring(0, lenOfFile - 1));
                else if (movie.contains(extensionType))
                    sizeMovie += Long.parseLong(fileDescription[1].substring(0, lenOfFile - 1));
                else
                    sizeofOther += Long.parseLong(fileDescription[1].substring(0, lenOfFile - 1));
            } else {
                if (music.contains(extensionType))
                    sizeMusic += Long.parseLong(fileDescription[1].substring(0, lenOfFile - 2));
                else if (image.contains(extensionType))
                    sizeImage += Long.parseLong(fileDescription[1].substring(0, lenOfFile - 2));
                else if (movie.contains(extensionType))
                    sizeMovie += Long.parseLong(fileDescription[1].substring(0, lenOfFile - 2));
                else
                    sizeofOther += Long.parseLong(fileDescription[1].substring(0, lenOfFile - 2));
            }

            if (lastCharValueOfInput == '"')
                break;

        }

        //converting file size to string
        String strMusic = Long.toString(sizeMusic);
        String strImage = Long.toString(sizeImage);
        String strMovie = Long.toString(sizeMovie);
        String strOther = Long.toString(sizeofOther);

        String fileSizeOfEachType = "\"music " + strMusic + "b" + "\n" + "images " + strImage + "b" + "\n" + "movie " + strMovie + "b" + "\n" + "other " + strOther + "b\"";

        return fileSizeOfEachType;

    }

    public static void main(String[] args) {

        //creating Statistics object
        Statistics statisticsObj = new Statistics();
        String s = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
        System.out.println(statisticsObj.solution(s));
    }
}

