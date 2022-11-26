package solid.openclosedprinciple;

public class Nurse extends Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action");
    }

    @Override
    void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }


    private void checkVitalSigns() {
        System.out.println("Checking Vitals");
    }

    private void drawBlood() {
        System.out.println("drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("cleaning Patient Area");
    }
}
