package week1.day2;

public class Mycalculator {
	public static void main(String[] args) 
	{
		
			Calculator obj= new Calculator();
			obj.add(2,3,4);
			System.out.println(obj.add);
			obj.sub(9,6);
			System.out.println(obj.sub);
			obj.multiply(5,6);
			System.out.println(obj.multiply);
			obj.divide(9,3);
			System.out.println(obj.divide);
			
		}
}
