package rubrica;

public class Voce
{
	private String name;
	private String surname;
	private String number;
	
	/**
	 * Sets the fields of the class.
	 * @param name.
	 * @param surname.
	 * @param number.
	 */
	public Voce(String name, String surname, String number)
	{
		this.name = new String(name);
		this.surname = new String(surname);
		this.number = new String(number);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	@Override public String toString()
	{
		return "Voce [Name=" + name + ", Surname=" + surname + ", Number=" + number + "]";
	}
}