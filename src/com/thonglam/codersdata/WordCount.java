package com.thonglam.codersdata;

import java.util.StringTokenizer;

public class WordCount {
  public static void main(String[] args) {
    String paragraph = "This is a sample paragraph. It has multiple sentences.";
    int count = countWords(paragraph);
    System.out.println("Number of words in the paragraph: " + count);  // prints "Number of words in the paragraph: 11"
  }
  
  public static int countWords(String paragraph) {
    StringTokenizer tokenizer = new StringTokenizer(paragraph);
    return tokenizer.countTokens();
  }
}