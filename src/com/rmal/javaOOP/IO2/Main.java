package com.rmal.javaOOP.IO2;

/*Напишите программу которая примет на вход 2 текстовых
        файла, а вернет один. Содержимым этого файла должны
        быть слова которые есть и в первом и во втором файле.*/

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File fileOne = new File("c:\\Task2\\1.doc");
        File fileTwo = new File("c:\\Task2\\2.doc");

        TwoFiles twoFiles = new TwoFiles();
        twoFiles.createFiles();
        twoFiles.writeWordsInFiles("Hello world !!! ", "Hello Java !!!");

        twoFiles.searchSameWords(fileOne, fileTwo);
    }
}
