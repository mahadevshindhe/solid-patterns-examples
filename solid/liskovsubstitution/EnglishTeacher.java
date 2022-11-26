package solid.liskovsubstitution;

public class EnglishTeacher extends SchoolStaff implements CourseInstruction {
    @Override
    public void teach() {
        System.out.println("Teach English");
    }
}


