package temperatura;

public class Temperatura {

	public static void main(String[] args) {
		double fahrenheit = 80.5;
		
		double celsius = (5.0 / 9.0) * (fahrenheit - 32); //Sapendo poi che la temperatura in gradi Celsius è pari a 	5/9 della temperatura in gradi Fahrenheit meno 32,
		
		System.out.println(fahrenheit + " gradi fahrenheit corrispondono a " + celsius + " gradi celsius");
	}

}

