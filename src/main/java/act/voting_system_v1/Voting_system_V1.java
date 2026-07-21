/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package act.voting_system_v1;
import java.util.Scanner;

/**
 *
 * @author mnisi
 */
public class Voting_system_V1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
         //Accumulator counters for party votes
        int ancVotes = 0;
        int daVotes = 0;
        int actionSaVotes = 0;
        int effVotes = 0;
        int gnuVotes = 0;
        
        //PARTY ARRAY
        String[] parties = {"ANC", "DA", "Action SA", "EFF", "GNU"};
        
        //array
        String[] names = new String[5];
        String[] surnames = new String[5];
        int[] ages = new int[5];
        String[] ids = new String[5];
        int[] partys = new int[5];

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hello, Welcome to the new voting system. Enter your personal details below to begin: ");
        
        for (int i = 0; i<1; i++){
        System.out.println("Enter your name");
        String name = sc.nextLine();
        names[i] = name;
        //System.out.println(names[i]+" "+ ">>CAPTURED<<"); //see if stored

        System.out.println("Enter your surname");
        String surname = sc.nextLine();
        surnames[i] = surname;

        System.out.println("Enter your age");
        int age = sc.nextInt();
        playsong.playSound("You suffer.wav");
        ages[i] = age; 
        

        //while(true){
        if (age >= 18 && age <=80) {
            System.out.println("Eligible to vote. Please proceed.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            //break;
        } else {
            System.out.println("Not eligible to vote.");
            return;
        }

        sc.nextLine(); //  clear buffer

        //while (true){
        System.out.println("Enter your ID number (must be 13 characters)");
        String id = sc.nextLine();
        ids[i] = id;

        if (id.length() == 13) {
            System.out.println("Personal details captured successfully");
            //break;
        } else {
            System.out.println("INOCORRECT FORMAT.ID number must be 13 characters long.");
            return;
        }}

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("User data:");
        for (int display = 0; display<1; display++){
            System.out.println("names " + names[display]);
            System.out.println("surnames " + surnames[display]);
            System.out.println("ages " + ages[display]);
            System.out.println("ID num " + ids[display]);
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int vote = 0; vote<1; vote++){
        System.out.println("To vote for a party just enter a number:");
        System.out.println("1: ANC  2: DA  3: Action-SA  4: EFF  5: GNU");
        playsong.playSound("You suffer.wav");
        int party = sc.nextInt();
        partys[vote] = party;
        
            switch (party) {
                case 1:
                    System.out.println(names[vote] +" "+ "ID: "+""+ ids[vote]);
                    System.out.println("Voted for" +" "+ parties[vote]);
                    ancVotes++;
                    break;
                case 2:
                    System.out.println(names[vote] +" "+ "ID: "+""+ ids[vote]);
                    
                    daVotes++;
                    break;
                case 3:
                    System.out.println(names[vote] +" "+ "ID: "+""+ ids[vote]);
                    
                    actionSaVotes++;
                    break;
                case 4:
                    System.out.println("Voted for" +" "+ party);
                    
                    effVotes++;
                    break;
                case 5:
                    System.out.println("Voted for" +" "+ party);
                   
                     gnuVotes++;
                    break;
                    
                default:
                    break;
            }}
          //Accumulated results
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("---BRAAM STATION---");
        System.out.println("FINAL VOTING RESULTS:");
        System.out.println("ANC VOTE: " + ancVotes);
        System.out.println("DA VOTE: " + daVotes);
        System.out.println("Action-SA VOTE: " + actionSaVotes);
        System.out.println("EFF VOTE: " + effVotes);
        System.out.println("GNU VOTE: " + gnuVotes);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }}
    