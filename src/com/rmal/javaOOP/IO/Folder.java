package com.rmal.javaOOP.IO;

/*Напишите программу которая скопирует файлы (с заранее
        определенным расширением — например только doc) из
        каталога источника в каталог приемник.*/

import java.io.File;
import java.io.IOException;

class Folder {

    public Folder() {
        super();
    }

    public void createSourceFolder() {
        File sourceFolder = new File("c:\\SourceFolder");
        sourceFolder.mkdir();
    }

    public void createReceiverFolder() {
        File receiverFolder = new File("c:\\ReceiverFolder");
        receiverFolder.mkdir();
    }

   public static void creatingFiles() {
        File file1 = new File("c:\\SourceFolder\\1.pdf");
        File file2 = new File("c:\\SourceFolder\\2.doc");
        File file3 = new File("c:\\SourceFolder\\3.exe");
        File file4 = new File("c:\\SourceFolder\\4.doc");
        File file5 = new File("c:\\SourceFolder\\5.bat");
        File file6 = new File("c:\\SourceFolder\\6.exe");
        File file7 = new File("c:\\SourceFolder\\7.doc");
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            file4.createNewFile();
            file5.createNewFile();
            file6.createNewFile();
            file7.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
