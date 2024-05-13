package core.java.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomeSerilization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a = new Account();
		
		FileOutputStream fos = new FileOutputStream("abc.ser"); 
	    try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(a);
		}
	    FileInputStream fis = new FileInputStream("abc.ser");
	    try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Account acc = (Account) ois.readObject();
			
			System.out.println(acc.userName +"----"+acc.pwd);
		}
	}
			

}


class Account implements Serializable{
	
	String userName = "Pawan";
	
	transient String pwd = "abc";
	
	private void writeObject(ObjectOutputStream oos) throws Exception 
    { 
        // to perform default serialization of Account object. 
        oos.defaultWriteObject(); 
  
        // epwd (encrypted password) 
        String epwd = "123" + pwd; 
  
        // writing encrypted password to the file 
        oos.writeObject(epwd); 
    } 
	
	private void readObject(ObjectInputStream ois) throws Exception 
    { 
        // performing default deserialization of Account object 
        ois.defaultReadObject(); 
  
        // deserializing the encrypted password from the file 
        String epwd = (String)ois.readObject(); 
  
        // decrypting it and saving it to the original password 
        // string starting from 3rd  index till the last index 
        pwd = epwd.substring(3); 
    } 
}
