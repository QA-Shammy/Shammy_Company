package com.usa.abstraction;

public class ClassB extends AbstractClassA {

	@Override
	public void getPushpo() {
		// TODO Auto-generated method stub
		System.out.println("BMW");
		
	}
public static void main(String[] args) {
	ClassB obj = new ClassB();
	obj.getFarzana();
	obj.getPushpo();
	obj.getRezwana();
	obj.getSalary();
	obj.getShahadat();
}
}
