import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int x=0;
		for (int i = 0; i <3; i++)
		{
			x = (amount *10)/100;
            amount -= x; 
        }
                
		System.out.println(amount);  
		
	}
}