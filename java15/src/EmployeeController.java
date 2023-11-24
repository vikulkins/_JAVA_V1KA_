public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void setEmployeeSalary(String rollNo) {
        model.setSalary(rollNo);
    }
    public void updateView() {
        view.printCourseDetails(model.getName(), model.getSalary());
    }
}