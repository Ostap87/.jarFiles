
package pac1;



public class MyPractice {

	public static void main(String[] args) {
System.out.println(factorial(4));

	}
	
	public static int factorial(int x) {
		if(x == 0) {
			return 0;
		}else if(x == 1){
			return 1;
		}else{
			return(x*factorial(x-1));
		}
	}
}
