package solid.liskovsubstitution;

public class MathTeacher extends SchoolStaff implements CourseInstruction {

    @Override
    public void teach() {
        System.out.println("Teach Math");
    }
}
