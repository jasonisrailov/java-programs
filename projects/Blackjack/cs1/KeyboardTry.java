import cs1.Keyboard;

public class KeyboardTry
{
	public static void main (String[] args)
	{
		String message;

		int number;

		System.out.println("Enter your name: ");
		message = Keyboard.readString();

		System.out.println("Enter a number: ");
		number = Keyboard.readInt();

		System.out.println("Hello " + message + " number " + number);
	}
}

