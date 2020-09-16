package java5;

public class Assertion {
	public static void main(String[] args) {
	      int age = 12;
	      assert age <= 18 : "Not eligible to vote";
	      System.out.println("The voter's age is " + age);
	   }
}
