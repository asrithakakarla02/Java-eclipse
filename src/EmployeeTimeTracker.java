public class EmployeeTimeTracker {
    public static void main(String[] args) {
        
        String[] employees = {"Asritha", "bhavani", "Uma"};
        
        int[][] workHours = {
            {8, 7, 6, 8},    
            {8, 8, 0},        
            {6, 6, 7, 8, 5}  
        };

        System.out.println("=== Weekly Work Hours ===");
        for (int i = 0; i < workHours.length; i++) {
            int totalHours = 0;
            System.out.print(employees[i] + ": ");
            
            for (int hours : workHours[i]) {
                System.out.print(hours + "h ");
                totalHours += hours;
            }
            
            System.out.println("| Total: " + totalHours + "h");
        }
    }
}
