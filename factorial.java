import java.util.Scanner;
class factorial{
	public static void main(String[] args){
		System.out.println("Enter your number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=num-1;i>=1;i--){
			num=num*i;
		}
		System.out.println(num);
	}
}