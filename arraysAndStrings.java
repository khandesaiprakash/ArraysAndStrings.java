//Create a rit package  
//package rit;
//create string and integer user input  
import java.util.Scanner;
//create a class 
public class arraysAndStrings {
    //create a main method it can be performming run the java code
  public static void main(String[] args){
    //create a Scanner object
    Scanner userInput = new Scanner(System.in);
    //print the user input statement
    System.out.println("Please write a sentence to analyze");
    //enter the sentence
    String words =userInput.nextLine();
    //print the number of words  
    System.out.println("........analyzing sentence: " + words);
    //Read a sentence from the user
    System.out.println(words.length());
    //split the sentence into words
    String[] totalwords = words.split("\\s");
    //Print the number of total words
   System.out.println(totalwords.length);
   //count the letters using for loop
    for(int i = 0;i<totalwords.length;i++){
        //print the number of letters/characters
        System.out.println("word " + 
        totalwords[i]+ " has " +totalwords[i].length() +
         " letters");
    }
  }  
}
