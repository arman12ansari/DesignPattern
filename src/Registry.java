import java.util.HashMap;

public class Registry {
    private HashMap<String, Student> studentRegistry;

    public Registry() {
        this.studentRegistry = new HashMap<>();
    }

    public Student add(Student studentPrototype) {
        studentRegistry.put(studentPrototype.getBatchName(), studentPrototype);
        return studentPrototype;
    }

    public Student get(String batchName) {
        return studentRegistry.get(batchName);
    }

    public Student remove(String batchName) {
        return studentRegistry.remove(batchName);
    }
}
