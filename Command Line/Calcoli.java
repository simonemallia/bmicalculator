public class Calcoli {
	private double peso;
	private double altezza;
	
	public void setPeso (double p) {
		peso = p;
	}
	
	public void setAltezza (double a) {
		altezza = a;
	}
	
	public double getBMI () {
		return  Math.floor(peso / ((altezza/100) * (altezza/100))*10)/10;
		}
	public void getStatistiche () {
		if (getBMI() < 15.50) {
			System.out.println("Sei gravemente sottopeso!");
		}
		else if (getBMI() >= 15.50 && getBMI() < 17.50) {
			System.out.println("Sei visibilmente sottopeso!");
		}
		else if (getBMI() >= 17.50 && getBMI() < 18) {
			System.out.println("Sei leggermente sottopeso!");
		}
		else if (getBMI() >= 18 && getBMI() < 25) {
			System.out.println("Complimenti! Sei in peso forma!");
		}
		else if (getBMI() >= 25 && getBMI() < 30) {
			System.out.println("Sei in sovrappeso!");
		}
		else if (getBMI() >= 30 && getBMI() < 35) {
			System.out.println("Obesità di 1° classe");
		}
		else if (getBMI() >= 35 && getBMI() < 40) {
			System.out.println("Obesità di 2° classe");
		}
		else if (getBMI() >= 40) {
			System.out.println("Obesità di 3° classe");
		}
		
		}
	
	public int getPesoForma () {
		return (int) Math.floor(22 * ((altezza/100) * (altezza/100)));
	}
	
	
		
	
	
}
		
	
	
	


