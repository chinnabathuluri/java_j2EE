package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import javax.imageio.stream.FileCacheImageInputStream;

public class Employee implements Serializable
{ 
	
		int eid;
		String ename;
		double esalary;
		public static void Serialization() throws Exception
		{
			Employee employee=new Employee();
			employee.eid=100;
			employee.ename="ramudu";
			employee.esalary=25000.00;
			FileOutputStream fos=new FileOutputStream(new File("D:/serializtion.txt")); 
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(employee);
			System.out.println("serializtion");
		}
		public static void deserialization() throws Exception
		{
			FileInputStream fis=new FileInputStream("D:/serializtion.txt");
			ObjectInputStream oos=new ObjectInputStream(fis);
			Object obj=oos.readObject();
			Employee employee=(Employee)obj;
			System.out.println("deserializtion");
			System.out.println("id="+employee.eid);
			System.out.println("name="+employee.ename);
			System.out.println("salary="+employee.esalary);
		}
		public static void main(String[]args) throws Exception
		{
			/*try {
				Serialization();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			deserialization();
			
			
			
			
			
			
			
			
			
			
		}
	}

