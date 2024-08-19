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

		Integer butacasTotales = 10;
		Integer cantidadFilas = 2;
		Boolean valorEsperado = true;
		SalaDeCine sala = new SalaDeCine(butacasTotales, cantidadFilas); // PREPARACION
		Boolean valorObtenido = sala.ocuparButaca(1, 4);
		assertEquals(valorEsperado, valorObtenido);

	}

	@Test

	public void consultarButacaOcupada() {
		Integer butacasTotales = 10;
		Integer cantidadFilas = 2;
		Boolean valorEsperado = true;
		SalaDeCine sala = new SalaDeCine(butacasTotales, cantidadFilas); // PREPARACION
		Boolean ocupacionTest = sala.ocuparButaca(1, 4);
		Boolean valorObtenido = sala.estaOcupada(1, 4);
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test

	public void ocuparUnaButacaVacia() {
		Boolean valorObtenido = false;
		Integer butacasTotales = 10;
		Integer cantidadFilas = 2;
		Boolean valorEsperado = true;
		SalaDeCine sala = new SalaDeCine(butacasTotales, cantidadFilas);
		if (!(sala.estaOcupada(1, 4))) {
			valorObtenido = sala.ocuparButaca(1, 4);
		}
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test

	public void consultarCantidadDeButacasOcupadas() {
		Boolean valorObtenido = false;
		Integer butacasTotales = 10;
		Integer cantidadFilas = 2;
		Boolean valorEsperado = true;
		SalaDeCine sala = new SalaDeCine(butacasTotales, cantidadFilas);
		// OCUPACION PARA TESTEAR
		sala.ocuparButaca(1, 4);
		Integer butacasOcupadas = sala.cantidadDeButacasOcupadas();
		// PENSE EN AGREGAR EL METODO "estaVacia()" PERO NO PARECE OPTIMIZAR... no se
		if (butacasOcupadas > 0) {
			valorObtenido = true;
		}
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test

	public void consultarSiSePuedeOrdenarButacasContiguas() {
		Boolean valorObtenido = false;
		Integer butacasTotales = 10;
		Integer cantidadFilas = 2;
		Boolean valorEsperado = true;
		SalaDeCine sala = new SalaDeCine(butacasTotales, cantidadFilas);
		valorObtenido = sala.hayEspacioPara(5);
		assertEquals(valorEsperado, valorObtenido);

	}
}
