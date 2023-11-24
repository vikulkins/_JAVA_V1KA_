public class Student implements Comparable<Student> {
    private String surname;
    private int number;
    private int testResults;
    Student() {
        number = 0;
        testResults = 0;
        surname = "";
    }
    Student(int number, String surname, int testResults) {
        this.number = number;
        this.testResults = testResults;
        this.surname = surname;
        checkSurname();
    }
    public void checkSurname() {
        if (surname.compareTo("") == 0)
            throw new EmptyStringException("Surname is empty");
    }

    @Override
    public int compareTo(Student student) {
        if (testResults == student.testResults)
            return 0;
        else if (testResults > student.testResults)
            return 1;
        else
            return -1;
    }
    @Override
    public boolean equals(Object obj) {
        return surname.compareTo(((Student)obj).surname) == 0;
    }
    @Override
    public String toString() {
        return surname + " " + testResults + "\n";
    }
}