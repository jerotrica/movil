package com.unlam.programacionbasica2.clase3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovilTests {

	@Test
	public void queSeCreaUnMovilConTiempoCeroYDistanciaCero() {


		Movil miMovil = new Movil(1.34);

		// quiero probar que la distancia inicial es cero
		assertEquals(0.0, miMovil.obtenerDistanciaRecorrida(), 0.01);
		assertEquals(0.0, miMovil.obtenerTiempoTotalConsumido(), 0.01);

	}

	@Test
	public void moverUnMovilDesdeElEstadoInicial() {

		Movil miMovil = new Movil(1.34);

		miMovil.moverse(10.0, 1.0);

		// quiero probar que la distancia inicial es cero
		assertEquals(10.0, miMovil.obtenerDistanciaRecorrida(), 0.01);
		assertEquals(1.0, miMovil.obtenerTiempoTotalConsumido(), 0.01);

	}

	@Test
	public void calcularLaVelicidadLuegoDelEstadoInicial() {

		Movil miMovil = new Movil(1.34);

		miMovil.moverse(10.0, 2.0);

		// quiero probar que la distancia inicial es cero
		assertEquals(5.0, miMovil.obtenerVelocidad(), 0.01);
	}

	@Test
	public void testQueCalculaLaAceleracion() {

		Movil miMovil = new Movil(1.34);

		miMovil.moverse(10.0, 1.0);
		miMovil.moverse(20.0, 3.0);

		// quiero probar que la distancia inicial es cero
		assertEquals(((30.0 / 4) / 4.0), miMovil.obtenerAceleracion(), 0.01);

		//otra forma de realizar esta comproboacion seria
		assertEquals((miMovil.obtenerVelocidad() / 4.0), miMovil.obtenerAceleracion(), 0.01);
	}
	
	/*
	 * Todos los tests utilizan una variable del tipo movil, es un buen ejercicio pensar un refactor utilizando
	 * el un metodo anotado como @Before http://junit.sourceforge.net/javadoc/org/junit/Before.html
	 */

}
