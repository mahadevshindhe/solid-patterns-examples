package solid.openclosedprinciple;

public class Doctor extends Employee {

    private int id;
    private String name;
    private String department;
    private boolean working;

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action");
    }

    @Override
    void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }

    private void prescribeMedicine() {
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients() {
        System.out.println("Diagnosing Patient");
    }
}
