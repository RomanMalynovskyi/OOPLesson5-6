package com.rmal.javaOOP.IO;

/*Напишите программу которая скопирует файлы (с заранее
        определенным расширением — например только doc) из
        каталога источника в каталог приемник.*/

import java.io.File;

public class Main {

    public static void main(String[] args) {

        //Creating source and receiver folders
        Folder folder = new Folder();
        folder.createSourceFolder();
        folder.createReceiverFolder();

        //Creating  files
        Folder.creatingFiles();

        //Copying  files
        CopyFiles c = new CopyFiles();
        File source = new File("c:\\SourceFolder");
        File receiver = new File("c:\\ReceiverFolder");
        c.copyOnlyDocFiles(source, receiver);
    }
}
