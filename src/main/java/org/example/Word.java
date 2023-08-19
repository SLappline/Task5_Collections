package org.example;

import java.lang.String;
public class Word{
    public String word;
    public int Count;
    public Word(String word,int Count){
        this.word = word;
        this.Count = Count;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }
}