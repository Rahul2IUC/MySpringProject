package in.drastick.MySpringProject.Controller;

import in.drastick.MySpringProject.Model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(1l, "Rahul Murmu", "TCS"));
        employees.add(new Employee(2l, "Deepak Kumar", "Cognigent"));
        employees.add(new Employee(3l, "Ashutosh Kumar", "Amex"));
        employees.add(new Employee(4l, "Kirti pandey", "Accenture"));
        employees.add(new Employee(5l, "Sandeep Mandal", "TCS"));
        employees.add(new Employee(6l, "Ayushi Upadhyay", "Capgemini"));
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employees;
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long empId){
        for(Employee emp: employees){
            if(emp.getEmpId().equals(empId)){
                return emp;
            }
        }
        return null;
    }
    @PostMapping("/employees/add")
    public Employee addEmployee(@RequestBody Employee emp){
        employees.add(emp);
        return emp;
    }
    @PutMapping("employees/update/{id}")
     public Employee updateEmployee(@PathVariable("id") Long empId, @RequestBody Employee updatedEmployee){
        for(Employee emp: employees){
            if(emp.getEmpId().equals(empId)) {
                emp.setEmp_name(updatedEmployee.getEmp_name());
                emp.setDepartment_name(updatedEmployee.getDepartment_name());
                return updatedEmployee;
            }
        }
        return null;
    }
    @DeleteMapping("/employees/delete/{id}")
    public Employee deleteEmployee(@PathVariable("id") Long empId){
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()){
            Employee emp = itr.next();
            if(emp.getEmpId().equals(empId)){
                itr.remove();
                return emp;
            }
        }
        return null;
    }
}
