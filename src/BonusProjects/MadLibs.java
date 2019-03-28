package BonusProjects;

public class MadLibs {
}

//================================= OOP BONUSES
//
//1. Study the code and use the Mad Lib program several times. Answer the following questions:
//
//  How does this program demonstrate abstraction? Encapsulation?
//
//  Why are public access modifiers not included for any methods or classes? What may cause us to add them?
//
//  What is the purpose of using a seperate output method rather than using System.out.println directly?
//
//  What is the advantage of how the getScanner() method creates and accesses a Scanner object? What "Gang of Four" design pattern does this demonstrate?
//
//  What is null coalescing? Is it needed considering how the Mad Lib program currently works?
//
//
//2. Write a Javadoc comment for each method. Use the following format:
//
//  /**  (press enter in IntelliJ after typing the "/**" to automatically begin a Javadoc comment)
//   * Here write as many lines as needed to describe the method
//   * @param someParam  here explain what this param represents
//   * @return  here describe what the method is returning
//   */
//  public static String hereIsAMethod(String someParam) {
//    return "hello " + someParam;
//  }
//
//  additional documentation on Javadoc comments: https://www.oracle.com/technetwork/java/javase/tech/index-137868.html
//
//
//3. Refactor the code to add additional features:
//
//  - allow the user to enter as many mad lib answers for a given created mad lib as they want
//  - allow the user to create a new mad lib or answer the current one
//  - allow the user to preview the mad lib and give them the choice to create it again before entering in solutions
//  - format the output to put more space between the mad lib generated and the prompts to fill in the generated mad lib
