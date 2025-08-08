public class patientrecord {
    
    private String name;
    private int age;
    private String medicalHistory; 
    
   
    public patientrecord(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
     public String getMedicalHistory() {
        
        return "[REDACTED] Medical information is protected. Access requires authorization.";
    }
    
    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if(age > 0 && age < 120) {
            this.age = age;
        }
    }
    
   
    public static void main(String[] args) {
        patientrecord patient = new patientrecord(" john ", 32, "Diabetes, Asthma");
        
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Patient Age: " + patient.getAge());
        
        
        System.out.println("\nMedical History Request:");
        System.out.println(patient.getMedicalHistory());
       
    }
}
