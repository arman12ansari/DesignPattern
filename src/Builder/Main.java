package Builder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .setName("John")
                .setAge(12)
                .setUniversityName("University of California")
                .setPsp(123456)
                .setGradYear(2025)
                .build();
        System.out.println(student);
    }
}