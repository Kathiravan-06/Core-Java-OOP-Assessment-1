import java.util.*;
abstract class Doctor {
    double consultationCharge;
    Doctor(double charge) {
        consultationCharge = charge;
    }
    abstract String getDoctorType();
    double calculateTotalBill(double testCharges) {
        return consultationCharge;
    }
}
class GeneralPhysician extends Doctor {
    GeneralPhysician() {
        super(500.0);
    }
    String getDoctorType() {
        return "General Physician";
    }
}
class Specialist extends Doctor {
    Specialist() {
        super(1000.0);
    }
    String getDoctorType() {
        return "Specialist";
    }
}
class EmergencyDoctor extends Doctor {
    EmergencyDoctor() {
        super(1500.0);
    }
    String getDoctorType() {
        return "Emergency Doctor";
    }
    double calculateTotalBill(double testCharges) {
        return consultationCharge + testCharges;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        double testCharges = sc.nextDouble();
        Doctor doctor;
        switch (type) {
            case 1:
                doctor = new GeneralPhysician();
                break;
            case 2:
                doctor = new Specialist();
                break;
            default:
                doctor = new EmergencyDoctor();
        }
        double total = doctor.calculateTotalBill(testCharges);
        System.out.println("Doctor Type: " + doctor.getDoctorType());
        System.out.printf(Locale.US, "Consultation Charge: %.2f%n",doctor.consultationCharge);
        System.out.printf(Locale.US, "Test Charges: %.2f%n", testCharges);
        System.out.printf(Locale.US, "Total Bill: %.2f%n", total);
    }
}
