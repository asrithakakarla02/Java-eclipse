public class TheaterSeatBooking {
    public static void main(String[] args) {
     
        String[] rows = {"A", "B", "C", "D", "E"};
        int[][] seats = new int[5][10];

        
        seats[0][0] = 1; 
        seats[2][4] = 1; 
        seats[4][9] = 1; 

        
        System.out.println("===== THEATER SEATING =====");
        System.out.print("   ");
        for (int i = 1; i <= 10; i++) System.out.print(i + " "); 
        System.out.println();

        for (int i = 0; i < seats.length; i++) {
            System.out.print(rows[i] + "  "); 
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print((seats[i][j] == 1 ? "[X]" : "[ ]") + " "); 
            }
            System.out.println();
        }
    }
}
