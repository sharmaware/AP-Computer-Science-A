/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author saarthaksharma
 */
public class ContactTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        System.out.printf("Type:%n'Add' to add a contact%n'Delete' to delete a contact or%n'Display' to display the contact list%n");

        HashMap<Integer, Contact> ContactList = new HashMap<>();
        String UserInput = "Continue";
        int count = 0;
        while (UserInput.equals("quit") == false) {
            count++;
            UserInput = input.next();

            if (count == 1 && UserInput.toLowerCase().equals("add")) {
                Contact e = makeContact();
                ContactList.put(0, e);
            } else if (UserInput.equals("add") || UserInput.equals("Add")) {
                //Create Contact Object    
                Contact contact = makeContact();

                //placing in correct alphabetical order
                addValueAZ(ContactList, contact);
            }
            if (UserInput.toLowerCase().equals("delete")) {
                System.out.println("What is the first name of the contact that you would like to delete?");
                String FirstName = input.next();
                System.out.println("What is the last name?");
                String LastName = input.next();

                deleteValue(ContactList, FirstName, LastName);
            }
            if (UserInput.toLowerCase().equals("display")) {
                System.out.printf("Contact No.\tFirst Name\tLast Name\tPhone Number\tEmail%n");
                int c = 1;
                for (HashMap.Entry contactT : ContactList.entrySet()) {

                    Contact contact = ContactList.get(contactT.getKey());
                    System.out.printf("%s\t\t%s\t%s\t\t%s\t%s%n", c, contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber(), contact.getEmail());
                }
            }

        }

    }

    public static void addValueAZ(HashMap<Integer, Contact> OriginalMap, Contact value) {
        int index = 0;
        int n = 0;
        int k = 0;
        boolean success = false;

//success is finding index    
        while (success == false) {

            {
                int ContactChar = (int) (OriginalMap.get(k).getFirstName().charAt(n));
                int ValueChar = (int) (value.getFirstName().charAt(n));

                if (ValueChar > ContactChar) {
                    if (n == 0) {
                        index = k - 1;
                    }
                    if (n > 0) {
                        index = k;
                    }
                    //break
                    success = true;
                }

                if (ValueChar == ContactChar) {
                    n += 1;

                }
                if (ValueChar < ContactChar) {
                    //keepgoing
                }

            }
            k = k + 1;
        }

        HashMap<Integer, Contact> NewMap = new HashMap();

        for (int i = 0; i < index; i++) {
            NewMap.put(i, OriginalMap.get(i));
        }
        NewMap.put(index, value);
        for (int i = index + 1; i < OriginalMap.size(); i++) {
            NewMap.put(i, OriginalMap.get(i - 1));
        }
        //final result
        OriginalMap = NewMap;

    }

    public static void deleteValue(HashMap<Integer, Contact> ContactList, String FirstName, String LastName) {
        FirstName = FirstName.toLowerCase();
        LastName = LastName.toLowerCase();

        ArrayList<Contact> FirstNameMatch = new ArrayList<>();

        int key = 0;
        int k = 0;
        //Checking for First name match
        for (int i = 0; i < ContactList.size(); i++) {
            if (ContactList.get(i).getFirstName().toLowerCase().equals(FirstName)) {

                FirstNameMatch.add(ContactList.get(i));
                k++;
            }
        }

        for (int i = 0; i < FirstNameMatch.size(); i++) {
            if (FirstNameMatch.get(i).getLastName().toLowerCase().equals(LastName)) {
                key = k + i;
            }
        }

        //deleting
        HashMap<Integer, Contact> NewList = new HashMap<>();

        for (int i = 0; i < key; i++) {
            NewList.put(i, ContactList.get(i));
        }
        for (int i = key + 1; i < ContactList.size(); i++) {
            NewList.put(i - 1, ContactList.get(i));
        }

        //Final Result
        ContactList = NewList;
    }

    public static Contact makeContact() {
        String FirstName;
        String LastName;
        String PhoneNumber;
        String email;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Name:");
        FirstName = input.next();
        System.out.println("Enter Last Name:");
        LastName = input.next();
        System.out.println("Enter Phone Number:");
        PhoneNumber = input.next();
        System.out.println("Enter email:");
        email = input.next();

        Contact contact = new Contact(FirstName, LastName, PhoneNumber, email);
        return contact;
    }
}
