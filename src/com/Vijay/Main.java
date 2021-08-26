package com.Vijay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Contacts> arrayListContacts;

    public static void main(String[] args) {
        myApp();
    }

    private static void myApp() {

        Contacts contact1 = new Contacts("Gaurav", "99999");
        Contacts contact2 = new Contacts("Gracy", "8888");
        Contacts contact3 = new Contacts("Aditya", "55555");
        Contacts contact4 = new Contacts("Vijay", "23245");

        arrayListContacts = new ArrayList<>();
        arrayListContacts.add(contact1);
        arrayListContacts.add(contact2);
        arrayListContacts.add(contact3);
        arrayListContacts.add(contact4);

        System.out.println("Select Operation: ");
        System.out.println(
                "1. Create " +
                        "2. Delete " +
                        "3. Search by name " +
                        "4. Search by number  " +
                        " 5. Update name by number  " +
                        " 6. Update number by name " +
                        "  7. Exit");

        selectOperation();
    }

    private static void selectOperation() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    createContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    searchContact("vijay");
                    break;
                /*case 4 -> number_search();
                case 5 -> name_update();
                case 6 -> number_update();
                case 7 -> exit();*/
                default:
                    System.out.println("Enter correct operation.\n");
            }
        }
    }

    private static void searchContact(String toSearch) {

        for (int i = 0; i < arrayListContacts.size(); i++) {

            Contacts currentObject = arrayListContacts.get(i);
            String currentContactName = currentObject.getName();

            if(currentContactName.equals(toSearch)){
                // now do the operation
                currentObject.name = "vijay";
            }
        }

    }


    static void createContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the following details:-");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Number: ");
        String number = scanner.nextLine();

        Contacts contact = new Contacts(name, number);
        arrayListContacts.add(contact);

        System.out.println("Next Operation: ");
    }

    static void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        boolean exists = false;
        for (int i = 0; i < arrayListContacts.size(); i++) {
            Contacts temp = arrayListContacts.get(i);
            String tempNumber = temp.getNumber();
            if (number.equals(tempNumber)) {
                arrayListContacts.remove(temp);
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("No Number");
        }
        System.out.println("Next Operation");
    }




}

