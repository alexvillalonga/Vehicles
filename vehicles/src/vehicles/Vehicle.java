package vehicles;

public class Vehicle {
	
	public static final int velocitat_maxima = 120;
	public static final int marxes = 5;
	
	private int cilindrada;
	private int portes;
	private int velocidad_actual;
	private int marxa_actual;
	
	
	public Vehicle(int cilindrada, int portes) {
		super();
		this.cilindrada = cilindrada;
		this.portes = portes;
		this.velocidad_actual = 0;
		this.marxa_actual = 0;
	}
	
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPortes() {
		return portes;
	}
	public void setPortes(int portes) {
		this.portes = portes;
	}
	public int getVelocidad_actual() {
		return velocidad_actual;
	}
	public void setVelocidad_actual(int velocidad_actual) {
		this.velocidad_actual = velocidad_actual;
	}
	public int getMarxa_actual() {
		return marxa_actual;
	}
	public void setMarxa_actual(int marxa_actual) {
		this.marxa_actual = marxa_actual;
	}


	public void Accelerar() {
		if ((this.velocidad_actual + 10) <= velocitat_maxima) {
			this.velocidad_actual = this.velocidad_actual + 10;
		}
	}
	
	public void Decelerar() {
		if ((this.velocidad_actual - 10) >= 0) {
			this.velocidad_actual = this.velocidad_actual - 10;
		}
	}
	
	public void pujaMarxa() {
		if ((this.marxa_actual + 1) <= marxes) {
			this.marxa_actual++;
		}
	}
	
	public void quitaMarxa() {
		if ((this.marxa_actual - 1) >= 0) {
			this.marxa_actual--;
		}
	}
	
	

}
