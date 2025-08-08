public class Voting {
    private String id;
    private boolean hasVoted;
    
    public Voting(String id) {
        this.id = id;
        this.hasVoted = false;
    }
    
    public boolean vote() {
        if(!hasVoted) {
            hasVoted = true;
            System.out.println("Voter " + id + " voted successfully");
            return true;
        }
        System.out.println("Voter " + id + " already voted");
        return false;
    }
    
    public static void main(String[] args) {
        Voting v = new Voting("V123");
        v.vote();  
        v.vote();  
    }
}
