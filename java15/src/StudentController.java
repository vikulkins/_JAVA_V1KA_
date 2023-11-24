public class StudentController {
    private Student model;
    private StudentView view;
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public String getStudentName() {
        return model.getName();
    }
    public String getStudentRollNo() {
        return model.getRollNo();
    }
    public void setStudentName(String name) {
        model.setName(name);
    }
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }
    public void updateView() {
        view.printCourseDetails(model.getName(), model.getRollNo());
    }
}