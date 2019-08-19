package fr.reference.it.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        MediaPlayer mediaMp3 = new Mp3();
        mediaMp3.play("music 1 ");
        MediaPackage mp4 = new Mp4();

        mediaMp3 = new MediaAdapter(mp4);
        mediaMp3.play("music 2");
    }
}
