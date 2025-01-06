import java.util.Scanner;

public class IT24103838Lab10Q1{
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a mark: ");
	int mark = scanner.nextInt();

	assert (mark >= 0 && mark <= 100) : "Invalid Mark";

	System.out.println("Mark is Validated");
	}
}
