package progetto1;

import java.io.*;

import rubrica.Rubrica;
import rubrica.Voce;

public class Progetto1
{
	/**
	 * Main.
	 * @param args.
	 * @throws IOException.
	 */
	public static void main(String[] args) throws IOException
	{
		Rubrica rubric = new Rubrica();
		int choice = 0;
		showMenu();
		while((choice = getNumber("Make your choice: ")) != 4)
		{
			System.out.println();
			switch(choice)
			{
				case 1:
					Voce voice = new Voce(getString("Enter the name: "), getString("Enter the surname: "), getString("Enter the number: "));
					rubric.addEntry(voice);
					break;
				case 2:
					rubric.deleteEntry(getNumber("Index of the entry to delete: ")-1);
					break;
				case 3:
					rubric.print();
					break;
			}
		}
	}
	
	/**
	 * Asks for a string.
	 * @param inputText.
	 * @return read string.
	 * @throws IOException.
	 */
	public static String getString(String inputText) throws IOException
	{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(inputText);
		return keyboard.readLine();
	}
	
	/**
	 * Asks for a number.
	 * @param inputText.
	 * @return read number.
	 * @throws IOException.
	 */
	public static int getNumber(String inputText) throws IOException
	{
		boolean legalValue = false;
		int number = 0;
		while(!legalValue)
		{
			try
			{
				number = Integer.valueOf(getString(inputText)).intValue();
				legalValue = true;
			}
			catch(NumberFormatException error)
			{
				System.out.println("It isn't a number.");
			}
			catch(IllegalArgumentException error)
			{
				error.getMessage();
			}
		}
		return number;
	}
	
	/**
	 * Shows the menu.
	 */
	public static void showMenu()
	{
		System.out.println("[1] Add Entry");
		System.out.println("[2] Delete Entry");
		System.out.println("[3] Show Rubric");
		System.out.println("[4] Exit");
	}
}