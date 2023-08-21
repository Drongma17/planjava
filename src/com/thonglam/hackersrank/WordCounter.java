package com.thonglam.hackersrank;

import java.util.Scanner;

public class WordCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == ' ') {
        count++;
      }
    }
    count++;
    System.out.println("Number of words: " + count);
  }
}
