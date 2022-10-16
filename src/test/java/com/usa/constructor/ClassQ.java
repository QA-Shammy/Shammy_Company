package com.usa.constructor;

public class ClassQ {
	
	public ClassQ(int age) {
    System.out.println(age);
	}

    public ClassQ(String name,int age) {
    System.out.println(name+age);
	
}    public ClassQ() {
	// TODO Auto-generated constructor stub
}
    public static void main(String[] args) {
    ClassQ obj = new ClassQ(100);
    ClassQ obj1= new ClassQ("Towhid",100);
		
	}
}


