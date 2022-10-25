package com.nttdata.patronesdediseno.prototype;

public class Circle extends Shape{

	Circle(Shape circulo){
		this.ancho = circulo.getAncho();
		this.alto = circulo.getAlto();
	}
	
	

	public Shape clone(Shape forma) {
		return new Circle(forma);
	}
	
}
