package taller3.televisores;

public class Control {
	TV tv;
	
	public void turnOn(){
		this.tv.turnOn();
	}
	
	public void turnOff(){
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int d) {
		this.tv.setCanal(d);
	}
	
	public void enlazar(TV tv) {
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
