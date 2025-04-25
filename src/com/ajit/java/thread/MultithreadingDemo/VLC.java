package com.ajit.java.thread.MultithreadingDemo;

public class VLC {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        AudioPlayer audioPlayer = new AudioPlayer();
        SubtitlePlayer subtitlePlayer = new SubtitlePlayer();
        Next next = new Next();

        videoPlayer.start();
        audioPlayer.start();
        subtitlePlayer.start();
//        next.run();
        Thread t1 = new Thread(next);
        t1.start();
    }
}

class VideoPlayer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Playing video frame :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class AudioPlayer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Audio player running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SubtitlePlayer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Subtitle player showing subtitle " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Next implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ajit" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
