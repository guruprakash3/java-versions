package java8;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  
class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Collector{  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"Lenovo Mobile",25000f));  
        productsList.add(new Product(2," Samsung Mobile",30000f));  
        productsList.add(new Product(3,"Realme Mobile",28000f));  
        productsList.add(new Product(4,"Sony Mobile",28000f));  
        productsList.add(new Product(5,"Apple Mobile",90000f));  
        List<Float> productPriceList =   
                productsList.stream()  
                            .map(x->x.price)         
                            .collect(Collectors.toList());  
        System.out.println(productPriceList);  
    }  
}  