package day_44_constructors;

public class Job {
   private String title, company;
   private double annualSalary;
   
   public Job(){
	   System.out.println("Nor - args constructor");
	   title ="undefined";
	   this.company = "undefined";
	    }
   public Job(String title) {
	   System.out.println("One-arg constructor");
	   this.title = title;
	   this.company ="undefined";
   }
   
   public Job(String title, String company, double annualSalary) {
	   System.out.println("Three-args constructor");
	   this.title = title;
	   this.company = company;
	   this.annualSalary = annualSalary;
   }
@Override
public String toString() {
	return "\nJob [title=" + title + ", company=" + company + ", anuualSalary=" + annualSalary + "]";
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company= company;
}
public double getAnuualSalary() {
	return annualSalary;
}
public void setAnuualSalary(double anuualSalary) {
	this.annualSalary = anuualSalary;
}

}