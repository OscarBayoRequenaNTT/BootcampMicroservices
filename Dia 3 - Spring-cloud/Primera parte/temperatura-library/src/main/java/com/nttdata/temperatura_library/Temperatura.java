package com.nttdata.temperatura_library;

public class Temperatura {

	private String tempInicial = "celsius";
	private String tempFinal = "farenheit";

	public Temperatura(String tempInicial, String tempFinal) {
		super();
		this.tempInicial = tempInicial;
		this.tempFinal = tempFinal;
	}

	public float convierteTemperatura(float temp) {

		float result = 0;

		switch (this.tempInicial) {
		case "celsius":
			switch (this.tempFinal) {
			case "celsius":
				result = temp;
				break;
			case "farenheit":
				result = (temp * 9 / 5) + 32;
				break;
			case "kelvin":
				result = temp - (float) (273.15);
				break;
			}
			break;
		case "farenheit":
			switch (this.tempFinal) {
			case "celsius":
				result = (temp - 32) * 5 / 9;
				break;
			case "farenheit":
				result = temp;
				break;
			case "kelvin":
				result = 5 / 9 * (temp - 32) + (float) (273.15);
				break;
			}
			break;
		case "kelvin":
			switch (this.tempFinal) {
			case "celsius":
				result = (temp - 32) * 5 / 9;
				break;
			case "farenheit":
				result = temp;
				break;
			case "kelvin":
				result = 5 / 9 * (temp - 32) + (float) (273.15);
				break;
			}
			break;
		default:
			result = 0;
		}

		return result;
	}

}
