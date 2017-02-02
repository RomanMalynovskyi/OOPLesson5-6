package com.rmal.javaOOP.IO;

/*Напишите программу которая скопирует файлы (с заранее
        определенным расширением — например только doc) из
        каталога источника в каталог приемник.*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFiles {

    public CopyFiles() {
        super();
    }

    public void copyOnlyDocFiles(File source, File receiver) {

        MyFileFilter mff = new MyFileFilter("doc");
        File[] docFiles = source.listFiles(mff);

        for (File elem : docFiles) {
            if (elem.exists() && receiver.exists()) {
                try (FileInputStream input = new FileInputStream(elem);
                     FileOutputStream output = new FileOutputStream(receiver.getAbsolutePath() + "\\" + elem.getName())) {
                    byte[] buffer = new byte[1024];
                    int byteread;
                    for (; (byteread = input.read(buffer)) > 0; ) {
                        output.write(buffer, 0, byteread);
                    }
                    System.out.println(elem.getName() + " has been copied to " + receiver.getName());
                } catch (IOException e) {
                    System.out.println(e);
                }
            } else {
                System.out.println("Source file or Receiver file  doesn`t exist!!!");
                return;
            }
        }
    }
}


