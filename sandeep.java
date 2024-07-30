package com.exception.e1;
class MinorException extends Exception{
	
}
class Ageverify{
	static void ageverifier(int age) throws MinorException{
		if(age<18) {
			throw new MinorException();
		}
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		try {
			Ageverify.ageverifier(18);
			Ageverify.ageverifier(12);
		}
		catch(MinorException e) {
			System.err.println("MINOR NOT ALLOWED TO ACCESS");
		}
	}

}
