//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student studentPrototypeA = new Student("Arman", "arman@gmail.com", "Batch A", "Instructor A", "Module A");
        Student studentPrototypeB = new Student("Abhi", "abhi@gmail.com", "Batch B", "Instructor B", "Module B");
        Student studentPrototypeC = new Student("Amit", "amit@gmail.com", "Batch C", "Instructor C", "Module C");

        Registry studentRegistry = new Registry();
        studentRegistry.add(studentPrototypeA);
        studentRegistry.add(studentPrototypeB);
        studentRegistry.add(studentPrototypeC);

        Student Arman = studentRegistry.get("Batch A").clone();

        System.out.println(Arman.getName());
    }
}
