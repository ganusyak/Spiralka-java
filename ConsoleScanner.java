import java.util.Scanner;

public class ConsoleScanner 
{
	int getNumberFromConsole () 
	{
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number here:");
		
		if (scanner.hasNextInt()) {
			result = scanner.nextInt();

			scanner.close();
		}
		return result;
	}

}