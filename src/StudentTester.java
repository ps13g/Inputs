public class StudentTester {
    public static void main(String[] args) {
    Student student1 = new Student( 3.74, 12345, "RC" );

    System.out.println("Before: ");

    System.out.println(student1);

    student1.setGpa(2.50);

    student1.getGpa();

    System.out.println("After: ");

    System.out.println(student1);

    }
}
