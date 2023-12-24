package question_1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;

public class ProjectDeSerializer {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Project,ArrayList<Employee>> projectMap1=null;
		String filename="EmpProj.txt";
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream ob_in=new ObjectInputStream(file);
			
			projectMap1=(Map<Project,ArrayList<Employee>>) ob_in.readObject();
			ob_in.close();
			file.close();
			for(Map.Entry<Project, ArrayList<Employee>> entry : projectMap1.entrySet()) {
				Project key=entry.getKey();
				ArrayList<Employee> employees=entry.getValue();
				System.out.println("DeSerialized Data :");
				System.out.println("The Project");
				System.out.println("Project [projectCode="+key.projectCode+", projectName="+key.projectName+
						", projectStrength="+key.projectStrength+"]Has the Following Employees");
				System.out.println("Employee..........");
				System.out.print("[Employee ");
				for(Employee emp:employees) {
					System.out.println("[employeeId="+emp.EmployeeId+", employeeName="+emp.EmployeeName+", employeePhone="+emp.EmployeePhone+
							", employeeAddress="+emp.EmployeeAddress+", employeeSalary="+emp.EmployeeSalary+"]"+"]");
				}
				System.out.println();
			}
		}
			catch(Exception e) {
				System.out.println("Error :"+e);
			}
		

	}
	}

	


