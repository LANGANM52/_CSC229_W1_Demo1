/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */


public class Course {
    String code;
    String name;                   //Constructor initializing Code, Name, and ID
    int id;
    
    public static void main(String[] args) {    //driver class instantiating and call its methods to change the id, name, and code
        System.out.println("Hello World!");
        Course crs;
        crs= new Course();
        crs.setName("Moaath");                    //testing
        crs.setCode("CSC229");
        crs.setID(12012);
        crs.getName();
        crs.getCode();
        crs.getID();
        Course cr2= new Course(12012, "Moaath", "CSC229");
        cr2.getName();
        cr2.getCode();
        cr2.getID();
    }
    
    
    Course(int i, String c, String n) {
        code = c;
        name = n;                 //Overloaded constructor that accepts 3 parameters to update the member variables
        id = i;
    }

    Course() {                   //Course initialized
    }

    
    
  public String getName() {
    System.out.println(name);       //Name getter
        return name;
  }

  public void setName(String newName) {      //Name setter
    this.name = newName;
  }
  
  public int getID() {
    System.out.println(id);       //ID getter
    return id;
  }

  public void setID(int newID) {       //ID setter
    this.id = newID;
  }
  
  public String getCode() {
    System.out.println(code);       //Code getter
    return code;
  }

  public void setCode(String newCode) {       //Code setter
    this.code = newCode;
  }


    

}
