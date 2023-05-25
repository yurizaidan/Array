package Arrays;
import java.util.Scanner;

public class EvenNumArray {

	public static void main(String[] args) {
		int a, b, aux;
		int countEvenNum=0;
		int i=0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer 1/2 of the interval: "); 
		a = in.nextInt();
		System.out.println("Enter integer 2/2 of the interval: "); 
		b = in.nextInt();
		
		if (a>b) {
			aux=a;
			a=b;
			b=aux;
		} 
			
		for (int index=a;index<=b;index++) {
			if (index%2==0) {
				countEvenNum++;
			}
		}

		System.out.println("Count of even numbers is:"+countEvenNum);
		
		int [] arrayLength = new int[countEvenNum];
				
		while (a<=b) {
			if (a%2==0) {
				arrayLength[i]=a;
				i++;
			}
			a++;
		}
		i=0;
		while (i<countEvenNum) {
			System.out.println("Integer "+"*"+arrayLength[i]+"*"+" and position of element in array is:"+i);
			i++;
		}
		
	}

}
