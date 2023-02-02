
package com.mycompany.csc229_assignment01;


/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {     //driver class instantiating and call its methods to change the id, name, and code
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
    
    

    
}
