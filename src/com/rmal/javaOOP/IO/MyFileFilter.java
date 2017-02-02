package com.rmal.javaOOP.IO;

/*Напишите программу которая скопирует файлы (с заранее
        определенным расширением — например только doc) из
        каталога источника в каталог приемник.*/

import java.io.File;
import java.io.FileFilter;

class MyFileFilter implements FileFilter {
    private String[] array;

    public MyFileFilter(String... array) {
        this.array = array;
    }

    public MyFileFilter() {
        super();
    }

    public boolean checkExtension(String extension) {
        for (String st : array) {
            if (st.equals(extension)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int index = pathname.getName().lastIndexOf(".");
        if (index == -1) {
            return false;
        }
        String extension = pathname.getName().substring(index + 1);
        return checkExtension(extension);
    }
}
