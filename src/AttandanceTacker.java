public class AttandanceTacker {
    public static void main(String[] args) {
        
        String[] students = {"Asritha", "lakshmi", "kakarla"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
        int[][] attendance = {
            {1, 0, 1},  
            {1, 1, 1}, 
            {0, 1, 0},  
            {1, 1, 1}, 
            {0, 0, 1},  
            {1, 1, 0},  
            {0, 0, 0}  
        };

        System.out.println("===== Weekly Attendance Report =====");
        System.out.println("(1: Present | 0: Absent)\n");

        System.out.print("Day\t\t");
        for (String student : students) {
            System.out.print(student + "\t");
        }
        System.out.println();

        for (int i = 0; i < attendance.length; i++) {
            System.out.print(days[i] + "\t\t");
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.print(attendance[i][j] + "\t\t");
            }
            System.out.println();
        }

        int totalPresent = 0;
        for (int i = 0; i < attendance.length; i++) {
            for (int j = 0; j < attendance[i].length; j++) {
                if (attendance[i][j] == 1) {
                    totalPresent++;
                }
            }
        }
        System.out.println("\nTotal Present: " + totalPresent + " records");
    }
}
