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
			System.out.println("Index out of bounds" + ", cannot delete entry." + "\n");
		}
	}

	/**
	 * Prints the rubric.
	 */
	public void print()
	{
		for(int counter = 0; counter < list.size(); counter++)
			System.out.println("Position: " + (counter+1) + ", " + this.list.elementAt(counter));
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