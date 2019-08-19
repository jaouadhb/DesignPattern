package fr.reference.it.adapter;

public class Mp4 implements MediaPackage {
    @Override
    public void playFile(String pFile) {
        System.out.println("Mp4 media package for file : "+pFile);
    }
}
