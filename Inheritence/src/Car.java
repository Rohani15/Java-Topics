
public class Car 
{
	private String make = "Tesla";
	private String model = "Model X";
	private String color = "Black";
	private int doors = 2;
	private boolean convertible = false; 
	
	public void describeCar() //Method
	{
		System.out.println(doors + "-Door " +
				color + " " +
				make + " " +
				model + " " +
				(convertible ? "Convertible" : ""));
	}
	
	public String getMake() 
	{
		return make;
	}
	public String getModel() 
	{
		return model;
	}
	public String getColor() 
	{
		return color;
	}
	public int getDoors() 
	{
		return doors;
	}
	public boolean isConvertible() 
	{
		return convertible;
	}
	public void setMake(String make) 
	{
		if (make == null) make = "Unknown"; 
		String lowecaseMake = make.toLowerCase();
		switch(lowecaseMake)
		{
			case "holden", "porsche", "tesla" -> this.make = make;
			default -> 
			{
				this.make = "unsupported "; 
			}
		}
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setDoors(int doors) 
	{
		this.doors = doors;
	}
	public void setConvertable(boolean convertible)
	{
		this.convertible = convertible;
	}

}
