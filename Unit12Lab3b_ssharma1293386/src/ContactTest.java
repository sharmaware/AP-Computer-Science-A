/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.util.Scanner;
//import java.nio.file.DirectoryStream;
//import java.nio.file.Files;
import java.io.File;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.HashMap;
//import java.io.FileReader;
//import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.FormatterClosedException;

/**
 *
 * @author saarthaksharma
 */
public class ContactTest {

    private static Scanner input;
    private static Scanner UserInput;
    private static String filePath;

    private static Formatter output;
    private static HashMap<String, Contact> ContactList;

    public static void main(String[] args) throws IOException {

        ArrayList intStack = new ArrayList(10);
//Get user input for path to file
        //Finding file with Contact info and storing the Contacts in a HashMap
        UserInput = new Scanner(System.in);
        System.out.printf("Enter the path to the file containing the ContactList ");
        filePath = UserInput.next();
        //filePath must be absolute path
        openFile(filePath);
        HashMap<String, Contact> ContactList = new HashMap<>();
        ContactList = readContacts(filePath);
        //System.out.println("Reached here");

        //Menu
        System.out.printf("Type:%nAdd to add a contact%nDelete to delete a contact%nDisplay to display the list of contacts%nQuit to quit application%n");
        boolean quit = false;
        while (quit == false) {
            String constantUI = UserInput.next().toLowerCase();
            if (constantUI.equals("add")) {
                Contact newContact = makeContact();
                ContactList.put(newContact.getLastName(), newContact);
                System.out.printf("Contact %s has been added.", newContact.getFirstName());
            }
            if (constantUI.equals("delete")) {
                //All contacts must have unique last names because last name is key and hashmap must have unique keys
                System.out.printf("Enter Last Name: ");
                String key = UserInput.next();
                Contact contactToDelete = ContactList.get(key);
                System.out.printf("Would you like to delete %s %s? Type 'yes' or 'no'%n", contactToDelete.getFirstName(), contactToDelete.getLastName());
                if (UserInput.next().toLowerCase().equals("yes")) {
                    ContactList.remove(key);
                }
                System.out.printf("Contact %s has been deleted.", contactToDelete.getFirstName());
            }
            if (constantUI.equals("display")) {
                Scanner fileContents = new Scanner(Paths.get(filePath));
                
                while (fileContents.hasNext()) {
                    System.out.printf("%s %s %s %s%n", fileContents.next(), fileContents.next(), fileContents.next(), fileContents.next());
                    String delimiter = fileContents.next();
                }
            }
            if (constantUI.equals("quit")) {
                break;
            }

            //Deleting original file to rewrite updated map
            File originalFile = new File(filePath);
            originalFile.delete();

            //Allow formatter output to output to new file
            try {
                output = new Formatter(filePath);
            } catch (SecurityException securityException) {
                System.err.println("Write permission denied. Terminating...");
                System.exit(1);
            }

            ArrayList<String> ContactArrayList = new ArrayList<>(ContactList.entrySet().size());
            for (Map.Entry<String, Contact> contact : ContactList.entrySet()) {
                ContactArrayList.add(contact.getValue().getLastName());
            }
            //Alphabetizing
            Collections.sort(ContactArrayList);

            //Writing to file
            for (int i = 0; i < ContactArrayList.size(); i++) {
                try {
                    output.format("%s %s %s %s ^%n", ContactList.get(ContactArrayList.get(i)).getFirstName(),
                            ContactList.get(ContactArrayList.get(i)).getLastName(), ContactList.get(ContactArrayList.get(i)).getPhoneNumber(),
                            ContactList.get(ContactArrayList.get(i)).getEmail());
                } catch (FormatterClosedException formatterClosedException) {
                    System.err.println("Error writing to file. Terminating.");
                }
            }

            if (output != null) {
                output.close();
            }
        }
    }

    public static void openFile(String filePath) {
        try {
            input = new Scanner(Paths.get(filePath));
        } catch (IOException ioexception) {
            System.err.println("Error opening file. Terminating...");
            System.exit(1);
        }
    }

    public static HashMap<String, Contact> readContacts(String filePath) {
        HashMap<String, Contact> ContactList = new HashMap<>();
        for (int i = 0; i < numberOfContacts(filePath); i++) {

            String firstName = input.next();
            String lastName = input.next();
            String phoneNumber = input.next();
            String email = input.next();

            Contact contact = new Contact(firstName, lastName, phoneNumber, email);
            //Getting rid of the ^ symbol
            String delimiter = input.next();
            ContactList.put(contact.getLastName(), contact);
        }
        return ContactList;
    }

    public static int numberOfContacts(String filePath) {
        int count = 0;
        try {
            Scanner fileInput = new Scanner(Paths.get(filePath));

            while (fileInput.hasNext()) {
                //The delimiter ^ indicates the end of a contact's information
                if (fileInput.next().equals("^")) {
                    count++;
                }
            }
        } catch (IOException ioexception) {
            System.err.println("Error opening file. Terminating...");
            System.exit(154);
        }

        return count;
    }

    public static Contact makeContact() {

        System.out.printf("Enter:%nFirst Name: ");
        String firstName = UserInput.next();
        System.out.printf("Last Name: ");
        String lastName = UserInput.next();
        System.out.printf("Phone Number: ");
        String phoneNumber = UserInput.next();
        System.out.printf("Email: ");
        String email = UserInput.next();

        Contact newContact = new Contact(firstName, lastName, phoneNumber, email);
        return newContact;
    }

}
