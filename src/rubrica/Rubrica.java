package rubrica;

import java.util.Vector;

/**
 * Creates a rubric and provides methods to manage it.
 * @author Alex.
 */
public class Rubrica
{
	private Vector<Voce> list;

	/**
	 * Instantiates a dynamic array.
	 */
	public Rubrica()
	{
		list = new Vector<Voce>(1, 1);
	}

	/**
	 * Adds an entry into the dynamic array.
	 * @param v to add.
	 */
	public void addEntry(Voce v)
	{
		list.addElement(v);
		System.out.println("Entry added." + "\n");
	}
	
	/**
	 * Deletes an entry from the dynamic array.
	 * @param index of the entry to delete.
	 */
	public void deleteEntry(int index)
	{
		try
		{
			list.removeElementAt(index);
			System.out.println("Entry deleted." + "\n");
		}
		catch(IndexOutOfBoundsException error)
		{
			System.out.println("Index is out of bounds");
		}
	}

	/**
	 * Prints the rubric.
	 */
	public void print()
	{
		for(int counter = 0; counter < list.size(); counter++)
			System.out.println("Name: " + list.elementAt(counter).getName() + ", Surname: " + list.elementAt(counter).getSurname() + ", Number: " + list.elementAt(counter).getNumber());
	}

	public Vector<Voce> getList()
	{
		return list;
	}

	public void setList(Vector<Voce> list)
	{
		this.list = list;
	}
}