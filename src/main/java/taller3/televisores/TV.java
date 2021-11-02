package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	
	TV(Marca x, boolean y){
		this.marca = x;
		this.estado = y;
		numTV ++;
	}
	
	public String getMarca() {
		return this.marca.getNombre();
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
	
	public int getNumTV() {
		return numTV;
	}
	
	void turnOn() {
		if(estado == false) {
			estado = true;
		}
	}
	void turnOff() {
		if(estado == true) {
			estado = false;
		}
	}
	public boolean getEstado() {
		return this.estado;
	}
	
	void canalUp() {
		if(estado == true && canal <= 120) {
		this.canal ++;
		}
	}
	
	void canalDown() {
		if(estado == true && canal>=1) {
		this.canal --;
	}
	}
	
	void volumenUp() {
		if(estado == true && volumen >= 0 && volumen < 7) {
		this.volumen++;
		}
	}
	
	void volumenDown() {
		if(estado == true && volumen <= 7 && volumen > 0) {
		this.volumen--;
		}
	}
}
