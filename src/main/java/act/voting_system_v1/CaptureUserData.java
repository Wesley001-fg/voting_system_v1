package act.voting_system_v1;
import java.util.Scanner;

public class CaptureUserData {

    Scanner sc = new Scanner(System.in);

    // Arrays
    protected String[] names = new String[5];
    protected String[] surnames = new String[5];
    protected int[] ages = new int[5];
    protected String[] ids = new String[5];

    protected int totalVoters = 0;

    // Encapsulation
    private String name;
    private String surname;
    private int age;
    private String id;

    // Modified constructor
    public CaptureUserData(String name, String surname,int age, String id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    // Default constructor
    public CaptureUserData() {

    }

    public void captureUserData() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to the new voting system.");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your name:");
            names[i] = sc.nextLine();

            System.out.println("Enter your surname:");
            surnames[i] = sc.nextLine();

            System.out.println("Enter your age:");
            int ageInput = sc.nextInt();
            sc.nextLine();

            if (ageInput >= 18 && ageInput <= 80) {
                ages[i] = ageInput;
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.println("Enter your ID number:");
            String idInput = sc.nextLine();

            if (idInput.length() == 13) {
                ids[i] = idInput;
                totalVoters++;
                System.out.println("Personal details captured successfully.");
            } else {
                System.out.println(
                    "Incorrect format. ID must be 13 characters."
                );
                continue;
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("User data:");
        for (int display = 0; display < 5; display++) {
            if (ids[display] != null) {
                System.out.println("Name: " + names[display]);
                System.out.println("Surname: " + surnames[display]);
                System.out.println("Age: " + ages[display]);
                System.out.println("ID: " + ids[display]);
            }
        }
    }
}