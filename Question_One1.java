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
public class Question_One1 {

    public static void main(String[] args) {
        // TODO code application logic here
        FullEmployee employ1 = new FullEmployee(1,"Abdullah","staff",5000,2,"Bachelor");
        employ1.calculateSalary();
        employ1.displaySalary();
        System.out.println("-----------------------------------------");
        PartEmployee employ2 = new PartEmployee(2,"Sara","staff",3000,3,"Diploma");
        employ2.calculateSalary();
        employ2.displaySalary();
    }
    
}

    

