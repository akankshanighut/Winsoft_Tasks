//Author:Akanksha Kailas Nighut
//Date: 4/4/2024
//Program:count word occurance in str using hashmap.
//Input : use java and use springboot.
/*Output: 
Occurrences of each word:
java: 1
use: 2
and: 1
springboot: 1
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String input = scanner.nextLine();

        Map<String, Integer> wordCounts = countWords(input);

        System.out.println("Occurrences of each word:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}