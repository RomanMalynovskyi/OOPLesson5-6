package com.rmal.javaOOP.IO2;

/*Напишите программу которая примет на вход 2 текстовых
        файла, а вернет один. Содержимым этого файла должны
        быть слова которые есть и в первом и во втором файле.*/

import java.io.*;

class TwoFiles {

    public TwoFiles() {
        super();
    }

    public void createFiles() {
        File fileOne = new File("c:\\Task2\\1.doc");
        File fileTwo = new File("c:\\Task2\\2.doc");
        try {
            fileOne.createNewFile();
            fileTwo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeWordsInFiles(String s1, String s2) {
        try (PrintWriter pw1 = new PrintWriter("c:\\Task2\\1.doc"); PrintWriter pw2 = new PrintWriter("c:\\Task2\\2.doc")) {
            pw1.print(s1);
            pw2.print(s2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String readFile(File file) {
        String s1 = "";
        String str = null;
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            for (; (s1 = bf.readLine()) != null; ) {
                str = s1;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    private String[] splitingString(String str) {
        String[] array = str.split(" ");
        return array;
    }

    public File searchSameWords(File one, File two) {
        File result = new File("c:\\Task2\\3.doc");
        try {
            result.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (PrintWriter a = new PrintWriter(result)) {
            String[] array1 = splitingString(readFile(one));
            String[] array2 = splitingString(readFile(two));
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i].equals(array2[j])) {
                        a.print(array1[i] + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
