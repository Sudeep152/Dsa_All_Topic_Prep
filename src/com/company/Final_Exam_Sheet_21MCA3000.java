package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Final_Exam_Sheet_21MCA3000 {
   public static HashMap<String, String > PhoneBook = new HashMap<>();
    public static  void main(String [] args){



        System.out.println("Contact List");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1: addNumberInPhoneBook();
             break;
            case 2: SearchinPhoneBook();
            break;
            default:System.out.println("Wrong Choice");
        }



    }
    static void addNumberInPhoneBook(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a name ");
      String   name= scanner.next();
        System.out.println("Enter a Mobile Number ");
      String  mobNumber= scanner.next();
        PhoneBook.put(name,mobNumber);

        System.out.println(PhoneBook);
    }

    static void  SearchinPhoneBook(){
        HashMap <String,String>  TelephoneBook = new HashMap <String, String> ();

        TelephoneBook.put("Shashank Kumar Dahiya", "6263033921");
        TelephoneBook.put("User1", "746648730");
        TelephoneBook.put("User2", "678645730");
        TelephoneBook.put("User3", "670967548");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name=");
        String name=sc.next();

        if(TelephoneBook.containsKey(name)) {
            System.out.println(name +"= "+TelephoneBook.get(name));
        }else {
            System.out.println(TelephoneBook);
        }
    }

}
