import java.util.ArrayList;
import java.util.Scanner;

public class ContactsManager {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> phoneNumbers = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            showMenu();
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    addContact(names, phoneNumbers, scan);
                    break;
                case 2:
                    showContacts(names, phoneNumbers);
                    break;
                case 3:
                    deleteContact(names, phoneNumbers, scan);
                    break;
                case 4:
                    continueLoop = false;
                    System.out.println("Thank you for using our application!.");
                    break;
                default:
                    System.out.println("Invalid choice!.");
            }
        }
        scan.close();
    }

    public static void showMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Add contact");
        System.out.println("2. Show all contacts");
        System.out.println("3. Delete a contact");
        System.out.println("4. Exit");
        System.out.print("Choose one option : ");
    }

    public static void addContact(ArrayList<String> names, ArrayList<String> phoneNumbers, Scanner scanner) {
        System.out.print("Enter the contact's name : ");
        String name = scanner.nextLine();
        System.out.print("Enter the contact's phone number : ");
        String phoneNumber = scanner.nextLine();

        names.add(name);
        phoneNumbers.add(phoneNumber);
        System.out.println("Contact add successful !");
    }

    public static void showContacts(ArrayList<String> names, ArrayList<String> phoneNumbers) {
        if (names.isEmpty()) {
            System.out.println("\n" + "No contacts saved.");
        } else {
            System.out.println("\n--- List of contacts ---");
            for (int i = 0; i < names.size(); i++) {
                System.out.println((i + 1) + ". " + names.get(i) + " - " + phoneNumbers.get(i));
            }
        }
    }

    public static void deleteContact(ArrayList<String> names, ArrayList<String> phoneNumbers, Scanner scanner) {
        System.out.print("Enter the contact's name to delete : ");
        String contactName = scanner.nextLine();

        int index = names.indexOf(contactName);
        if (index != -1) {
            names.remove(index);
            phoneNumbers.remove(index);
            System.out.println("Contact delete successful !");
        } else {
            System.out.println("Contact not found.");
        }
    }
}
