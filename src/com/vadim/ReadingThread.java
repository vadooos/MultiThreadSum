package com.vadim;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vadim on 24.04.2017.
 */
public class ReadingThread implements Runnable{
    private Thread t;
    private Scanner sc;
    ReadingThread(Scanner sc){
        this.sc = sc;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {


        ArrayList<Integer> nums = new ArrayList<>();
        while (sc.hasNext()) {
            nums.add(sc.nextInt());
        }
        nums.parallelStream().filter(i -> i > 0).filter(i-> i % 2 == 0).forEach(i->printSum(i));
    }

    void  printSum(int i){
        Main.sum += i;
        System.out.println(Main.sum);
    }
}
