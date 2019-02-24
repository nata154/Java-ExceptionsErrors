package com.training.epam.entity;

import java.io.*;

public class RunMyApp {
    public static void main(String[] args) {

        String readedLine = null;
        StringBuilder sb = new StringBuilder();
        FileReader reader = null;
        BufferedReader bufReader = null;

        try {
            reader = new FileReader("c:\\Users\\Тоха\\IdeaProjects\\JavaErrorsExceptions\\src\\com\\training\\epam\\resources\\toRead.txt");
            bufReader = new BufferedReader(reader);

            while ((readedLine = bufReader.readLine()) != null) {
                String a = readedLine;
                sb.append(a + '\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufReader != null) {
                    bufReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
        System.out.println(sb);

        FileWriter writer = null;
        BufferedWriter bufWriter = null;
        PrintWriter printWriter = null;

        try {
            writer = new FileWriter("c:\\Users\\Тоха\\IdeaProjects\\JavaErrorsExceptions\\src\\com\\training\\epam\\resources\\toWrite.txt");
            bufWriter = new BufferedWriter(writer);
            if (sb != null) {
                bufWriter.write((sb.toString()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sb != null) {
                    bufWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
