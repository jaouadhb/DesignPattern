package fr.reference.it.adapter;

public class MediaAdapter implements  MediaPlayer{
    MediaPackage mediaPackage;

    public MediaAdapter(MediaPackage pMediaPackage)
    {
        mediaPackage = pMediaPackage;
    }
    @Override
    public void play(String pFile) {
        System.out.println("From the adapter");
        mediaPackage.playFile(pFile);
    }
}
