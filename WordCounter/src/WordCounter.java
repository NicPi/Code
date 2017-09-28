import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args){

        WordCounter wordCounter = new WordCounter();
        wordCounter.createWordList();

        //to print the whole list
        wordCounter.printWordList(wordCounter.createWordList());

    }

    public HashMap<String, Integer> createWordList() {
        //Create a HashMap that contains each distinct word and their count as value
        HashMap<String, Integer> wordList = new HashMap<String, Integer>();

        try {
            Scanner scanner  = new Scanner(new File("document.txt"));

            while(scanner.hasNext())
            {
                String word = scanner.next();
                int countWord = 0;

                if(!wordList.containsKey(word))
                {
                    wordList.put(word, 1); //first time the word occured. The value represents the word count.
                }
                else
                {
                    countWord = wordList.get(word) +1; // increment word count

                    //a HashMap cannot have duplicate keys, therefor the key has to be removed first and then re-entered
                    wordList.remove(word);
                    wordList.put(word, countWord); //added with new word count
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return wordList; //return the list of distinct words and their word count
    }

    public void printWordList(HashMap<String, Integer> wordList)
    {
        System.out.println(wordList);
    }

}
