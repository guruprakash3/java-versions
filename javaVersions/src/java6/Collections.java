package java6;
import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>(); 
list.add("Green");
list.add("Blue");  
list.add("Green");  
list.add("Red"); 
list.add("White"); 
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
} 
