package com.techsnob.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest {

	//Write the emp obj to a file
	/*public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.setName("Ashintha");
        employee.setSalary(30L);
        employee.setId(1);
        FileOutputStream fout = new FileOutputStream("C:\\Users\\techsnob\\Desktop\\employee.data");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(employee);
        oos.close();
        System.out.println("Process complete");
    }*/
	
	//Read written emp obj back to java
	public static void main(String[] args) throws ClassNotFoundException, IOException {
        Employee employee = new Employee();
        FileInputStream fin = new FileInputStream("C:\\Users\\techsnob\\Desktop\\employee.data");
        ObjectInputStream ois = new ObjectInputStream(fin);
        employee = (Employee) ois.readObject();
        ois.close();
        System.out.println(employee.whoIsThis());
    }
	

}
