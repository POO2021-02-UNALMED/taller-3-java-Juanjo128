package taller3.televisores;

public class Control {
	TV tv;
	
	void turnOn(){
		this.tv.turnOn();
	}
	
	void turnOff(){
		this.tv.turnOff();
	}
	
	void canalUp() {
		this.tv.canalUp();
	}
	
	void canalDown() {
		this.tv.canalDown();
	}
	
	void volumenUp() {
		this.tv.volumenUp();
	}
	
	void volumenDown() {
		this.tv.volumenDown();
	}
	
	void setCanal(int d) {
		this.tv.setCanal(d);
	}
	
	void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
}
