public class Student {
    public int IDNumber, GPA;
    public String name;
    public Student(int IDNumber, String name, int GPA){
        this.IDNumber = IDNumber;
        this.name = name;
        this.GPA = GPA;
    };

    public String toString(){
        return "имя студентa: " + name + " ID номер: " + this.IDNumber + " GPA: " + this.GPA;
    }
}
