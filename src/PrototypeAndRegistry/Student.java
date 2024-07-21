package PrototypeAndRegistry;

public class Student implements Prototype<Student> {

    private String name;
    private String email;
    private String batchName;
    private String instructorName;
    private String moduleName;

    public Student(String name, String email, String batchName, String instructorName, String moduleName) {
        this.name = name;
        this.email = email;
        this.batchName = batchName;
        this.instructorName = instructorName;
        this.moduleName = moduleName;
    }

    public Student(Student student) {
        this.name = student.name;
        this.email = student.email;
        this.batchName = student.batchName;
        this.instructorName = student.instructorName;
        this.moduleName = student.moduleName;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
