public class EmployeeProfileReport {
    public static void main(String[] args) {
       
        StringBuffer report = new StringBuffer();

       
        report.append("============================\n");
        report.append("   EMPLOYEE PROFILE REPORT\n");
        report.append("============================\n\n");
        report.append("Name: Asritha\n");
        report.append("Employee ID: 12345\n");
        report.append("Department: Engineering\n");
        report.append("Position: java developer\n");
        report.append("Salary: $350000\n");
        report.append("============================\n");

        
        System.out.println("Original Employee Profile:");
        System.out.println(report);

       
        StringBuffer reversedReport = new StringBuffer(report);
        reversedReport.reverse();
        
        System.out.println("\nReversed Report (Demonstration):");
        System.out.println(reversedReport);
    }
}
