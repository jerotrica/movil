package com.unlam.programacionbasica2.clase3;

public class Movil {
	
	private Double masa;
	private Double tiempoTotalConsumido;
	private Double distanciaTotalRecorrida;

	public Movil(Double masa) {
		
		this.masa = masa;
		this.tiempoTotalConsumido = 0.0;
		this.distanciaTotalRecorrida = 0.0;
		
	}

	public Double obtenerDistanciaRecorrida() {
	

		return this.distanciaTotalRecorrida;
	}

	public Double obtenerTiempoTotalConsumido() {
		
		
		return this.tiempoTotalConsumido;
	}

	public void moverse(Double distanciaParcialRecorrida, Double tiempoConsumido) {

		this.distanciaTotalRecorrida += distanciaParcialRecorrida;
		this.tiempoTotalConsumido += tiempoConsumido;
		
	}
	
	public Double obtenerAceleracion(){
		
		return this.obtenerVelocidad() / this.tiempoTotalConsumido;
	}

	public Double obtenerVelocidad() {

		return this.distanciaTotalRecorrida / this.tiempoTotalConsumido;
	}

}
