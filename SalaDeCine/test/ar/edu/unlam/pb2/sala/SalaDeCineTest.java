package ar.edu.unlam.pb2.sala;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaDeCineTest {

	// ESTO VA A ESTAR LLENO DE METODOS, POR ESO NO TENGO ATRIBUTOS
	// VARIOS TEST EN UNA FUNCIONALIDAD, TEST POR FUNCIONALIDAD(UNITARIOS)

	@Test
	public void queAlCrearLaSalaTodasLasButacasEstenVacias() {

		// DEFINO ATRIBUTOS

		Integer butacasTotales = 10;
		Integer cantidadFilas = 2;
		Boolean valorEsperado = true;
		SalaDeCine sala = new SalaDeCine(butacasTotales, cantidadFilas); // PREPARACION
		Boolean valorObtenido = sala.estaVacia(); // EJECUCION
		assertEquals(valorEsperado, valorObtenido); // CONTRASTACION
	}

	// CONVENCION
	@Test

	public void queSePuedaOcuparUnaButacaVacia() {
	}

	@Test

	public void consultarButacaOcupada() {
	}

	@Test

	public void ocuparUnaButacaVacia() {
	}

	@Test

	public void consultarCantidadDeButacasOcupadas() {
	}

	@Test

	public void consultarSiSePuedeOrdenarButacasContiguas() {
	}
}
