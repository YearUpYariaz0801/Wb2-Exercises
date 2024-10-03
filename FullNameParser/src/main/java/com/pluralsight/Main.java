package com.pluralsight;
import java.util.*;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String fullname = PromptForString("Please enter your FULL name: ");
        // "Ylandre Smith-Cash"
        // "Ylandre Yvonne Smith-Cash"
        // "Ylandre Y. Smith-Cash"

        //"Smith-Cash"
        //"Yvonne Smith-Cash"

        int indexOfFirstSpace = fullname.indexOf(' ');
        String firstName = fullname.substring(0, indexOfFirstSpace);
        String endingpart = fullname.substring(indexOfFirstSpace + 1);
        int indexOfSpaceInEndingPart = endingpart.indexOf(" ");
        String middleName;
        String lastName;
        if(indexOfSpaceInEndingPart < 0){
            //don't have a middle name;
            middleName = "";
            lastName = endingpart;
        }
        else{
            middleName = endingpart.substring(0, indexOfSpaceInEndingPart);
            lastName = endingpart.substring(indexOfSpaceInEndingPart + 1);
        }
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }
    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}