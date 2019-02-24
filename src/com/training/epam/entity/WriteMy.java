package com.training.epam.entity;

import java.io.*;

public class WriteMy {
    public static void main(String[] args) {
        try {
            String f = "toWrite.txt";
            File file = new File(f);
            FileWriter writer = new FileWriter (file);
           // BufferedWriter bufWriter = new BufferedWriter(writer);
           // PrintWriter printWriter = new PrintWriter(bufWriter);
           // printWriter.println("ay");
            for (int i = 0; i< 5; i++){
                writer.write(i);
            }
                        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
