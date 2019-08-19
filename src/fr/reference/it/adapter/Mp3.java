package fr.reference.it.adapter;

public class Mp3 implements MediaPlayer{
    @Override
    public void play(String pFile) {
        System.out.println("Mp3 media player for file :"+pFile);
    }
}
