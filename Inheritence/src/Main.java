
public class Main 
{

	public static void main(String[] args) 
	{
		//Create an Object------
		Car car = new Car();
		car.setMake("Porsche");
		car.setModel("Carrera"); 
		car.setDoors(2);
		car.setConvertable(true);
		car.setModel("black");
		//obj1
		System.out.println("Make = " + car.getMake());
		System.out.println("Model = " + car.getModel());

		car.describeCar(); 
	}

}
