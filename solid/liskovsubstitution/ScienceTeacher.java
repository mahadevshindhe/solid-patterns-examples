package solid.liskovsubstitution;

public class ScienceTeacher extends SchoolStaff implements CourseInstruction {
    @Override
    public void teach() {
        System.out.println("Teach Science");
    }
}
