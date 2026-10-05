package in.drastick.MySpringProject.Model;

public class Employee {
    private Long empId;
    private String emp_name;
    private String department_name;

    public Employee() {
    }

    public Employee(Long empId, String emp_name, String department_name) {
        this.empId = empId;
        this.emp_name = emp_name;
        this.department_name = department_name;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", emp_name='" + emp_name + '\'' +
                ", department_name='" + department_name + '\'' +
                '}';
    }
}
