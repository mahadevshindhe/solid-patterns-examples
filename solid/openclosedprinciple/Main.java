package solid.openclosedprinciple;

public class Main {

    public static void main(String[] args) {
        HospitalManagement hospitalManagement = new HospitalManagement();
        Employee raj = new Nurse(1, "raj", "emergency", true);
        hospitalManagement.callUpon(raj);

        Employee ram = new Doctor(2, "ram", "emergency", true);
        hospitalManagement.callUpon(ram);

    }
}


