package act.voting_system_v1;
public class Voting_system_V1 {

    public static void main(String[] args) {
    CaptureUserData x = new CaptureUserData();
    CaptureVote y = new CaptureVote();
    
    x.captureUserData();
    y.captureVote();
    y.displayResults();
        
    }}
    