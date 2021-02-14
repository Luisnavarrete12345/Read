/*
 * Nombre: Luis Javier Navarrete Cruz
 * Matricula:2022235
 */
package mx.edu.cesba.model;

public class Employees {

    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public int phoneNumber;
    public double salary;
    public String hireDate;

    public void getDetails() {
        
        System.out.println("id: " + id);
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("age: " + age);
        System.out.println("email: " + email);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("salary: " + salary);
        System.out.println("hireDate: " + hireDate);
    }
    
    
}
