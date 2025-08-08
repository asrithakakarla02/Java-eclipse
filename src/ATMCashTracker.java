public class ATMCashTracker {
    public static void main(String[] args) {
        
        String[] atmIds = {"ATM-1", "ATM-2", "ATM-3"};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        
        int[][] cashFlow = {
            {5000, -2000, 3000},   
            {-1500, 4000, 2500},   
            {2000, -1000, -500},    
            {3000, 0, 1000},       
            {-2500, 5000, -3000},  
            {0, -2000, 4000},      
            {1000, 1000, -2000}    
        };

        System.out.println("===== ATM Cash Flow =====");
        System.out.print("Day\t");
        for (String atmId : atmIds) System.out.print(atmId + "\t");
        System.out.println();

        for (int i = 0; i < cashFlow.length; i++) {
            System.out.print(days[i] + "\t");
            for (int j = 0; j < cashFlow[i].length; j++) {
                System.out.print(cashFlow[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
