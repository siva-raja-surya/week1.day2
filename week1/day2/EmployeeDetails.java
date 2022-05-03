package week1.day2;

public class EmployeeDetails {
	
	public void printEmployeeName(String empName, int empId) {
	System.out.println(" empName & empId " + empName +" "+ empId);
		
	}
	
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee address: "+ empAddress);
		
	}
	
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee salary: "+ empSalary);
		
		
	}
	 public void printEmployeeMobileNumber(long mobNum) {
		 System.out.println("Employee number: "+ mobNum);
		
		 
	}
	
	
	
	public static void main(String[] args) {

		EmployeeDetails obj=new EmployeeDetails();
		
		obj.printEmployeeName("surya", 00157);
		obj.getEmployeeAddress("42, asde nagar,aefs,dgfjsgf -123654");
		obj.printEmployeeSalary(643466);
				obj.printEmployeeMobileNumber(8548632158l);
		
	}

}
