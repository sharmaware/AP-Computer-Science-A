/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author saarthaksharma
 */
public class Unit7Lab1_ssharma1293386 {

    public static void main(String[] args) {

        boolean countCharacters = false;
        boolean countWords = false;
        boolean countSentences = false;
        boolean countParagraphs = false;

        for (int i = 0; i < args[0].length(); i++) {
            if (args[0].charAt(i) == 'c') {
                countCharacters = true;
            }
            if (args[0].charAt(i) == 'w') {
                countWords = true;
            }
            if (args[0].charAt(i) == 's') {
                countSentences = true;
            }
            if (args[0].charAt(i) == 'p') {
                countParagraphs = true;
            }
        }

        String fileName = args[1];

        readFromFile(fileName, countCharacters, countWords, countSentences, countParagraphs);

    }

    public static void readFromFile(String fileName,
            boolean countCharacters, boolean countWords,
            boolean countSentences, boolean CountParagraphs) {

        int characters = 0;
        int words = 0;
        int paras = 0;
        int sentences = 0;
        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            // This will reference one line at a time
            while ((line = bufferedReader.readLine()) != null) {
                
                paras++;

                characters = characters + CharCount(line);
                if (WordCount(line) > 0) {
                    words = words + WordCount(line) + 1;
                }
                sentences += SentenceCount(line);

            }
            if (countCharacters) {
                System.out.println("There are " + characters + " characters.");
            }
            if (countWords) {
                System.out.println("There are " + words + " words.");
            }
            if (countSentences) {
                System.out.println("There are " + sentences + " sentences.");
            }
            if (CountParagraphs) {
                System.out.println("There are " + paras + " paragraphs.");
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }

    public static int CharCount(String a) {
        int characters = 0;
        for (int i = 0; i < a.length(); i++) {
            
            if (a.charAt(i) != ' ' && a.charAt(i) != '.' && a.charAt(i) != '\n') {
                characters++;
            }
        }

        return characters;
    }

    public static int WordCount(String a) {
        int words = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                words++;
            }
        }
        return words;

    }

    public static int SentenceCount(String a) {
        int sentences = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '.') {
                sentences++;
            }
        }
        return sentences;
    }
}
