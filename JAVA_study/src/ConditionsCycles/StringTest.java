package ConditionsCycles;

public class StringTest {

	public static void main(String[] args) {
		String myString = new String ("Ёквилибристика");
		int myStringLength = myString.length();
		System.out.println(myStringLength);
		String myStringFirst = myString.substring(0, myStringLength/2);
		String myStringSecond = myString.substring(myStringLength/2);
		System.out.println(myStringFirst);
		System.out.println(myStringSecond);
	}
}