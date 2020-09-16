package java5;

class Animal {
	  public void displayInfo() {
	    System.out.println("Jhonny is an animal.");
	  }
	}

	class Dog extends Animal {
	  @Override
	  public void displayInfo() {
	    System.out.println("Jhonny is a dog.");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Dog d1 = new Dog();
	    d1.displayInfo();
	  }
	}