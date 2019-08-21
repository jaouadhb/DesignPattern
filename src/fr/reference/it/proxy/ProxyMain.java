package fr.reference.it.proxy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProxyMain {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/test.txt")))
        {
        }catch(IOException e)
        {
            e.getStackTrace();
        }
    }
}
