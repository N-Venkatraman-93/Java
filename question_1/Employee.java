package question_1;

import java.io.Serializable;

class Employee implements Serializable {
    public static final long serialVersionUID = 1L;

    // Instance variables
    String EmployeeId;
    String EmployeeName;
    String EmployeePhone;
    String EmployeeAddress;
    int EmployeeSalary;

    // Constructor
    public Employee(String employeeId, String employeeName, String employeePhone, String employeeAddress, int employeeSalary) {
        super();
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        EmployeePhone = employeePhone;
        EmployeeAddress = employeeAddress;
        EmployeeSalary = employeeSalary;
    }
}
