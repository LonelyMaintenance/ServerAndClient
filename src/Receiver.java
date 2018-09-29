import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
 public class Receiver { 
 
public void receive() { 
	String filename = "panel.ser"; 
 TheFrame theFrame=null; 
 ThePanel panel = null; 
 FileInputStream fis = null; 
 ObjectInputStream in = null; 
 try { 
	 fis = new FileInputStream(filename); 
	 in = new ObjectInputStream(fis); 
	 panel = (ThePanel)in.readObject(); 
	 in.close(); 
	 } catch(IOException ex){ 
		 ex.printStackTrace(); 
		 } catch(ClassNotFoundException ex){ 
			 ex.printStackTrace(); 
			 } 
 theFrame= new TheFrame(panel); 
 System.out.println("Panel info: " + panel.getInfo()); 
 } 
} 