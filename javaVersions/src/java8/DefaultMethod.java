package java8;

interface Sayable{    
    default void say(){    
        System.out.println("default method");    
    }    
    void sayMore(String msg);    
    static void sayLouder(String msg){    
        System.out.println(msg);    
    }    
}    
public class DefaultMethod implements Sayable{    
    public void sayMore(String msg){      
        System.out.println(msg);    
    }    
    public static void main(String[] args) {    
        DefaultMethod dm = new DefaultMethod();    
        dm.say();                       
        dm.sayMore("Practice makes man Perfect");        
        Sayable.sayLouder("Hello World");    
    }    
}    