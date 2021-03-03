/*
 * Nombre: Luis Javier Navarrete Cruz
 * Matricula:2022235
 */
package mx.edu.cesba.model;

public class Employees {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private double salary;
    private String hireDate;
    
    
    //metodos para acceder al campo: private int id;
 /*   public void setid(int id){
        this.id =id;
    }
    public int getid(){
        return id;
    }     
    
     //metodos para acceder al campo: private String firstName;
        public void setfirstName(String firstName){
        this.firstName =firstName;
    }
    public String getfirstName(){
        return firstName;
    }
    //metodos para acceder al campo: private String lastName;
      public void setlastName(String lastName){
        this.lastName =lastName;
    }
    public String getlastName(){
        return lastName;
    }
    //metodos para acceder al campo: private int age;    
      public void setage(int age){
            if(age>=18 &&age<65){
             this.age =age;
      }else{
    System.err.println("Edad invalida");
}
        
    }
    public int getage(){
      
        return age;
    }
    //metodos para acceder al campo: private String email;  
      public void setemail(String email){
        this.email =email;
    }
    public String getemail(){
        return email;
    }
    //metodos para acceder al campo: private int phoneNumber;  
     public void setphoneNumber(int phoneNumber){
        this.phoneNumber =phoneNumber;
    }
    public int getphoneNumber(){
        return phoneNumber;
    }
    //metodos para acceder al campo: private double salary;  
    public void setsalary(double salary){
        this.salary =salary;
    }
    public double getsalary(){
        return salary;
    }
    //metodos para acceder al campo: private String hireDate;  
       public void sethireDate(String hireDate){
        this.hireDate =hireDate;
    }
    public String gethireDate(){
        return hireDate;
    }
    */
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }

    public String getLastName() {
        return lastName;
    } 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18 &&age<65){
             this.age =age;
      }else{
    System.err.println("Edad invalida");
        this.age = age;
    }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    
    
}
