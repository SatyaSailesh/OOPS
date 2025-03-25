
public class Patient{
   private String patientid;
   private String name;
   private String appointmentDate;
  
public Patient(String patientid,String name,String appointmentDate){
       this.patientid=patientid;
       this.name=name;
       this.appointmentDate=appointmentDate;
   }
  public String getPatientId(){
     return patientid;
}
   public String getName(){
     return name;
 }
   public String getAppointmentDate(){
      return appointmentDate;
}

  public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
  public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientid);
        System.out.println("Name: " + name);
        System.out.println("Appointment Date: " + appointmentDate);
    }
} 
public class HospitalAppointment {
    public static void main(String[] args) {
        
        Patient patient1 = new Patient("ch24", "Satya", "2025-03-30");
        patient1.displayPatientDetails();
        patient1.setAppointmentDate("2025-04-05");
        System.out.println("\nUpdated Appointment Details:");
        patient1.displayPatientDetails();
    }
}
