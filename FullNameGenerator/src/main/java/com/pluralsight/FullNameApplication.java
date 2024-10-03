package com.pluralsight;

import java.util.*;
public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);
       public static void main(String[] args){

     String firstName = PromptForString("First Name");
     String middleName = PromptForString("Middle Name");
     String lastName = PromptForString("Last Name");
     String suffix = PromptForString("Suffix");

     System.out.println(firstName);
     System.out.println(middleName);
     System.out.println(lastName);
     System.out.println(suffix);

       String fullName;

       if(middleName.isBlank()){
           if(suffix.isBlank()){
               fullName = firstName + " " + lastName;
           }
           else{
               fullName = firstName + " " + lastName + ", " + suffix;
           }
       }
       else{
           if(suffix.isBlank()) {
               fullName = firstName + " " + middleName + " " + lastName;
           }
           else
           {
               fullName + " " + middleName + " " + lastName + ", " suffix;
           }
       }

       }

    public static String PromptForString(String []) {
           System.out.print(prompt);
    }
}
