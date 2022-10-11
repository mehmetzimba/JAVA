
public class Araba {
 private String marka;
 private String model;
 private Motor motor; //motor tipinde bir değişken tanımladık
 
 
 
 
 
 
 public String getMarka() {
	return marka;
}
 public String getModel() {
	return model;
}
 public void setMarka(String marka) {
	this.marka = marka;
}
 public void setModel(String model) {
	this.model = model;
}
 
 public Motor getMotor() {
	return motor;
}
 public void setMotor(Motor motor) {
	this.motor = motor;
}
 
 
 public class Motor{             // inner class
	 private int hacim;
	 public int getHacim() {
		return hacim;
	}
	 public void setHacim(int hacim) {
		this.hacim = hacim;
	}
	 
	 
	 
 }
 
 
 
 
}
