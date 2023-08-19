package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Dictionary{
    java.lang.String[] dict;
    java.lang.String filepath = "dict.txt";


    public Dictionary(java.lang.String[] dict) {
        this.filepath = filepath;
        this.dict = dict;
    }

    public void CreateFile(int count){
        PrintWriter file = null;
        try {
            try {
                file = new PrintWriter(new File(filepath));
                for (int i = 0; i < count; i++) {
                    int index = (int) (Math.random() * dict.length);
                    file.write(dict[index] + ' ');
                    //file.write(i + "\n");
                }
            } finally {
                assert file != null;
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static java.lang.String ReadFile(){
        //    File = new File("dict.txt");
        //    return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        java.lang.String content = "";
        try{
            content = Files.readString(Paths.get("dict.txt"));
        }
        catch(IOException e){
            e.printStackTrace();
        }

        return content;
    }
}

