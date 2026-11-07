package act.voting_system_v1;

public class CaptureVote extends CaptureUserData {

    // Accumulator counters
    int ancVotes = 0;
    int daVotes = 0;
    int actionSaVotes = 0;
    int effVotes = 0;
    int gnuVotes = 0;

    // Party array
    String[] parties = {"ANC", "DA", "Action SA", "EFF", "GNU"};

    public CaptureVote() {
        super();
    }

    public void captureVote() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int vote = 0; vote < 5; vote++) {
            if (ids[vote] == null) {
                continue;
            }

            System.out.println("To vote, enter a number:");
            System.out.println("1: ANC  2: DA  3: Action-SA  4: EFF  5: GNU");
            int party = sc.nextInt();

            if (party < 1 || party > 5) {
                System.out.println("Invalid party selection.");
                vote--;
                continue;
            }

            System.out.println(
                names[vote] + " ID: " + ids[vote]
            );

            System.out.println(
                "Voted for: " + parties[party - 1]
            );

            switch (party) {

                case 1:
                    ancVotes++;
                    break;

                case 2:
                    daVotes++;
                    break;

                case 3:
                    actionSaVotes++;
                    break;

                case 4:
                    effVotes++;
                    break;

                case 5:
                    gnuVotes++;
                    break;
            }
        }
    }

    public void displayResults() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("--- BRAAM STATION ---");
        System.out.println("FINAL VOTING RESULTS:");

        System.out.println("ANC VOTE: " + ancVotes);
        System.out.println("DA VOTE: " + daVotes);
        System.out.println("Action-SA VOTE: " + actionSaVotes);
        System.out.println("EFF VOTE: " + effVotes);
        System.out.println("GNU VOTE: " + gnuVotes);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}