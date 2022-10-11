import java.util.Date;
import java.util.Scanner;

public class Employee {
 private String name;
 private double salary;
 private int workHour;
 private Date hireYear;
 
 public Employee(String name,double salary,int workHour,Date hireYear) {
	 this.hireYear=hireYear;
	 this.name=name;
	 this.salary=salary;
	 this.workHour=workHour;
 }
 
 public Date getHireYear() {
	return hireYear;
}
 public String getName() {
	return name;
}
 public double getSalary() {
	return salary;
}
 public int getWorkHour() {
	return workHour;
}
 public void setHireYear(Date hireYear) {
	this.hireYear = hireYear;
}
 public void setName(String name) {
	this.name = name;
}
 public void setSalary(double salary) {
	this.salary = salary;
}
 public void setWorkHour(int workHour) {
	this.workHour = workHour;
}
 
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"  "+salary+"   "+workHour+"  "+hireYear;
	}
 
 public void tax() {
	 
	 if(salary<=100)
	  System.out.println("vergi 0");
	 else
		 System.out.println((salary*3)/100);
  }
 public void bonus() {
	 System.out.println("toplam çalışma saatinizi giriniz");
	 Scanner scanner =new Scanner(System.in);
	 int mesai =scanner.nextInt();
	 
		 System.out.println("fazla mesai ücreti:"+mesai*50 );
	
	 }
public void raiseSalary() {
	

		

}
 }
 
 
 
 

