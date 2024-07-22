package Builder;

public class Student {
    private String name;
    private int age;
    private String universityName;
    private int psp;
    private int gradYear;

    private Student(String name, int age, String universityName, int psp, int gradYear) {
        this.name = name;
        this.age = age;
        this.universityName = universityName;
        this.psp = psp;
        this.gradYear = gradYear;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private String universityName;
        private int psp;
        private int gradYear;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        private void validate() {
            if (age < 18) {
                throw new IllegalArgumentException("Age cannot be less than 18");
            }
            if (gradYear < 2025) {
                throw new IllegalArgumentException("Must be student of current year");
            }
        }

        public Student build() {
            validate();
            return new Student(this.name, this.age, this.universityName, this.psp, this.gradYear);
        }

    }
}
