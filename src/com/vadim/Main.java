package com.vadim;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static volatile int sum;

    public static void main(String[] args) {
        try {
            for (String fileName :
                    args) {
                FileReader fileReader = new FileReader(fileName);
                Scanner sc = new Scanner(fileReader);
                new ReadingThread(sc);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
