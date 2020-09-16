package java5;

public class Varargs {
	public void getData(String...values) {  
        for(String string:values) {  
             System.out.println(string);  
        }  
   }  
   public static void main(String[] args) {  
        Varargs varargs = new Varargs();  
        varargs.getData("Carrot","Radish","Cucumber","Brinjal");       
        String[] vargs = new String[] {"Mango","Grapes","Banana","Papaya"};  
        varargs.getData(vargs);  
   } 
}