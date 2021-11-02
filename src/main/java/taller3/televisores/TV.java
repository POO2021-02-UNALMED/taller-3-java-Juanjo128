package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	
	public TV(Marca x, boolean y){
		this.marca = x;
		this.estado = y;
		numTV ++;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca(String y) {
		this.marca.setNombre(y);
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setControl(Control a) {
		this.control = a;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int b) {
		this.precio = b;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setVolumen(int c) {
		this.volumen = c;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal(int d) {
		if(d>= 120 && d>= 1) {
		this.canal = d;
		}
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		if(this.estado == false) {
			this.estado = true;
		}
	}
	public void turnOff() {
		if(this.estado == true) {
			this.estado = false;
		}
	}
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if(this.estado == true && canal <= 120) {
		this.canal ++;
		}
	}
	
	public void canalDown() {
		if(this.estado == true && this.canal>=1) {
		this.canal --;
	}
	}
	
	public void volumenUp() {
		if(this.estado == true && this.volumen >= 0 && this.volumen < 7) {
		this.volumen++;
		}
	}
	
	public void volumenDown() {
		if(this.estado == true && this.volumen <= 7 && this.volumen > 0) {
		this.volumen--;
		}
	}
	
	public static void setNumTV(int f) {
		numTV = f;
	}
}
