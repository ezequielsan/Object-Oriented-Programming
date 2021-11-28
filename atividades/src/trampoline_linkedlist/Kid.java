package trampoline_linkedlist;

public class Kid {
    private int age;
    private String name;
    
    public Kid(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
    public int getAge() {
    	return age;
    }
    
    public String getName() {
    	return name;
    }
    
    public String toString() {
    	return String.format("%s:%d", name, age);
    }
}


