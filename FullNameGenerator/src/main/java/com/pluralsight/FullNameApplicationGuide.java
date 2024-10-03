package com.pluralsight;
import java.util.*;
public class FullNameApplicationGuide {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = PromptForString("First name: ");
        String middleName = PromptForString("Middle name: ");
        String lastName = PromptForString("Last name: ");
        String suffix = PromptForString("Suffix: ");

        String fullname;

        if(middleName.isBlank()){
            if(suffix.isBlank()){
                fullname = firstName + " " + lastName;
            }
            else{
                fullname = firstName + " " + lastName + ", " + suffix;
            }
        }
        else{
            if(suffix.isBlank()){
                fullname = firstName + " " + middleName + " " + lastName;
            }
            else
            {
                fullname = firstName + " " + middleName + " " + lastName + ", " + suffix;
            }
        }

        System.out.println("Hello " + fullname);







    }


    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}

}
