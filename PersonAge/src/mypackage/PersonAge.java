package mypackage;
import java.util.*;
public class PersonAge {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("ENTER THE PERSON AGE");
		int age= sc.nextInt();
		if(age>=14 && age<=44) {
			System.out.println(" PERSON below to young AGE");
			
		}else {
			System.out.println(" PERSON doesnt below to young AGE");
		}
		
	}
	
	
}