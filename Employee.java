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
public abstract class Employee {
    private String name;
    private String position;
    private double salary;
    private int experience;
    private String EducationaLevel;
    
    
    public Employee(String name,String position,double salary,int experience,String EducationaLevel){
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
        this.EducationaLevel = EducationaLevel;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
     public String getPosition(){
        return position;
    }
    public void setPosition(String Position){
        this.position = position;
    }
     public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
      public String getEducationaLevel(){
        return EducationaLevel;
    }
       public void setEducationaLevel(String EducationaLevel){
        this.EducationaLevel = EducationaLevel;
    }
       public void setSalary(){
         this.salary = salary; 
    }  
    public double getSalary(){
        return salary; 
    }
  
    
    public double calculateSalary(){
          salary = (salary)+(salary*(0.05)*experience);
         if(EducationaLevel == "Bachelor"){
             salary+=500;
         }
         else if(EducationaLevel == "Diploma"){
             salary+=250;
         }
         else {
             salary+=0; 
         }
        return salary;
}
    
    
}
