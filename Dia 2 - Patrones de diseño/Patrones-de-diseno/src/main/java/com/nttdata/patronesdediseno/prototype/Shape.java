package com.nttdata.patronesdediseno.prototype;

public abstract class Shape implements IClonable {

	protected int ancho;
	protected int alto;

	
	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public Object clone(Object forma) {
		return null;
	}
	
//	public Shape clone(Shape forma) {
//		return null;
//	}
	
	
}
