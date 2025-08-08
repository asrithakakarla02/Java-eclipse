import java.util.ArrayList;
import java.util.List;

public class VotingApplication {
    
    // Voter class (inner class)
    static class Voter {
        private final String voterId;
        private boolean hasVoted;

        public Voter(String voterId) {
            this.voterId = voterId;
            this.hasVoted = false;
        }

        public String getVoterId() {
            return voterId;
        }

        public boolean hasVoted() {
            return hasVoted;
        }

        public void castVote() {
            if (!hasVoted) {
                hasVoted = true;
                System.out.println("Voter " + voterId + " has voted successfully.");
            } else {
                System.out.println("Error: Voter " + voterId + " already voted!");
            }
        }
    }

    // VotingSystem class (inner class)
    static class VotingSystem {
        private final List<Voter> voters;

        public VotingSystem() {
            this.voters = new ArrayList<>();
        }

        public void registerVoter(String voterId) {
            voters.add(new Voter(voterId));
            System.out.println("Voter " + voterId + " registered.");
        }

        public void processVote(String voterId) {
            for (Voter voter : voters) {
                if (voter.getVoterId().equals(voterId)) {
                    voter.castVote();
                    return;
                }
            }
            System.out.println("Error: Voter " + voterId + " not found!");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        VotingSystem election = new VotingSystem();
        
        // Register voters
        election.registerVoter("V1001");
        election.registerVoter("V1002");
        
        // Process votes
        election.processVote("V1001");  // Success
        election.processVote("V1001");  // Try to vote again (should fail)
        election.processVote("V1002");  // Success
        election.processVote("V9999");  // Invalid voter (should fail)
    }
}
