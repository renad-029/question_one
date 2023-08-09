/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_one1;

/**
 *
 * @author renadabdullah
 */
public class FullEmployee extends Employee{
    private int id;
    public FullEmployee(int id,String name,String position,double salary,int experience,String EducationaLevel){
        super(name,position,salary,experience,EducationaLevel);
        this.id = id;
        
    }
    public double SalaryBonus(){ 
        double salary = (super.getSalary()) * (0.03);
        salary+=getSalary();
        return salary;
}
    public void displaySalary(){
        System.out.println("Salary of FullEmployee "+getName()+" "+getSalary());
        System.out.println("Salary of FullEmployee after bonus "+SalaryBonus());
    }
}

