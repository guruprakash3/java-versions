package java5;

public class EnhancedForLoop {
	public static void main(String args[]){  
		   int arr[]={10,20,50,70,80};  
		   int total=0;  
		   for(int i:arr){  
		     total=total+i;  
		   }  
		  System.out.println("Total: "+total);  
		 }   
}
