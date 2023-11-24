public class MVCPatternDemo_E {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeSalary("100000000$");
        System.out.println("\nAfter updating, Details are as follows");
        controller.updateView();
    }
    private static Employee retriveCourseFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Sergey Lashkov");
        employee.setSalary("0");
        return employee;
    }
}