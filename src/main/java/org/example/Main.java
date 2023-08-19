package org.example;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        String[] dict = {"Арбуз", "Яблоко", "Дыня", "Виноград"};
        new Dictionary(dict).CreateFile(10);
        String content = Dictionary.ReadFile();
        System.out.println("Сгенерирован файл dict.txt");

        System.out.println("Содержимое файла:");
        System.out.println(content);

        Collect collection = new Collect(content);
        String[] SortedCollection = collection.SortCollect(false);
        System.out.println("Отсортированное содержимое файла в алфавитном порядке:");
        for (String el : SortedCollection) {
            System.out.println(el);
        }
        //System.out.println("Содержимое файла без повторений:");
        String[] UniqCollect = Collect.UniqCollect(SortedCollection);
        for (String el : UniqCollect) {
            System.out.println(el);
        }
        //System.out.println("Debug**********************1");
        Word[] Words = new Word[UniqCollect.length];
        int count = 0;
        int i = 0;
        for (String word : UniqCollect) {
            for (String el : SortedCollection) {
                //	System.out.println(word+":"+el+(word.equals(el)));
                if (word.equals(el)) {
                    count++;
                }
                //	System.out.println(count);
            }
            //System.out.println("create in Words "+word+";"+count);
            Words[i] = new Word(word, count);
            i++;
            count = 0;
        }
        System.out.println("Всего в файле: ");
        String s = null;
        int quantity = 0;
        for (Word el : Words) {
            System.out.println(el.getWord() + ":" + el.getCount());
            if (el.getCount() > quantity) {
                quantity = el.getCount();
            }
        }
        System.out.println("Слов(о) с максимальным количеством повторений: ");
        for (Word el : Words) {
            if (el.getCount() == quantity) {
                System.out.println(el.getWord() + ": " + quantity);
            }
        }
    }
}