import java.util.*;

public class Main {

    // 📍 In-memory data (acts like database)
    static List<String> places = new ArrayList<>();
    static List<String> contacts = new ArrayList<>();

    // 📍 Load Places (instead of DB)
    public static void loadPlaces() {
        places.add("Rishikesh - Yoga Capital & Adventure Hub");
        places.add("Nainital - Lake city surrounded by hills");
        places.add("Mussoorie - Queen of Hills");
        places.add("Kedarnath - Spiritual destination");
    }

    // 📍 Display Places
    public static void displayPlaces() {
        System.out.println("\n📍 Tourist Places:");
        for (String place : places) {
            System.out.println("➡ " + place);
        }
    }

    // 📩 Save Contact (in memory)
    public static void saveContact(String name, String email, String message) {
        String contact = "Name: " + name + ", Email: " + email + ", Message: " + message;
        contacts.add(contact);

        System.out.println("✅ Contact saved successfully!");
    }

    // 📄 Show All Contacts (extra feature)
    public static void showContacts() {
        System.out.println("\n📋 Saved Contacts:");
        for (String c : contacts) {
            System.out.println("➡ " + c);
        }
    }

    // 🚀 Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Uttarakhand Tourist Guide =====");

        // Load and show places
        loadPlaces();
        displayPlaces();

        // Take user input
        System.out.println("\n📩 Enter Contact Details:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Message: ");
        String message = sc.nextLine();

        // Save contact
        saveContact(name, email, message);

        // Show saved contacts (optional)
        showContacts();

        sc.close();
    }
}