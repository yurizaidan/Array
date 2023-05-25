package Arrays;
//import java.util.Scanner;
import java.util.Random; 
public class MyFirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Random randomNum = new Random();
		int size = 10;
		double number [] = new double [size];
		
		for (int i=0;i<size;i++) {
			//System.out.println("Please fill in the array with number "+i+"/"+size+":");
			number [i]= randomNum.nextDouble(1000);
		}
		
		for (int i=0;i<size;i++) {
			System.out.println("Number:"+number[i]+" is stored on position "+i+" of array.");
		}
		
	

	}

}
