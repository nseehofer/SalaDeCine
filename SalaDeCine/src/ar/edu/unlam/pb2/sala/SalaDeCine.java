package ar.edu.unlam.pb2.sala;

public class SalaDeCine {

	private Integer cantidadFilas;
	private Integer butacasTotales;
	private Integer butacasPorFila;
	private Boolean[][] butacas;

	public SalaDeCine(Integer butacasTotales, Integer cantidadFilas) {
		this.butacasTotales = butacasTotales;
		this.cantidadFilas = cantidadFilas;
		this.butacasPorFila = this.butacasTotales / this.cantidadFilas;
		this.butacas = new Boolean[this.cantidadFilas][this.butacasPorFila];
		for (int fila = 0; fila < this.cantidadFilas; fila++) {
			for (int asiento = 0; asiento < this.butacasPorFila; asiento++) {
				this.butacas[fila][asiento] = false;
			}

		}
	}

	public Boolean estaVacia() {
		for (int fila = 0; fila < this.cantidadFilas; fila++) {
			for (int asiento = 0; asiento < this.butacasPorFila; asiento++) {
				if (this.butacas[fila][asiento] == true)
					return false;
			}
		}

		return true;
	}

	public Boolean ocuparButaca(Integer numeroDeFila, Integer numeroDeButaca) {

		if (this.butacas[numeroDeFila][numeroDeButaca] == false) {
			this.butacas[numeroDeFila][numeroDeButaca] = true;
			return true;
		}

		return false;
	}

	public Boolean estaOcupada(Integer numeroDeFila, Integer numeroDeButaca) {

		if (this.butacas[numeroDeFila][numeroDeButaca] == true) {
			return true;
		}

		return false;
	}

	public Integer cantidadDeButacasOcupadas() {

		Integer butacasOcupadas = 0;

		for (int fila = 0; fila < this.cantidadFilas; fila++) {
			for (int asiento = 0; asiento < this.butacasPorFila; asiento++) {
				if (this.butacas[fila][asiento] = true) {
					butacasOcupadas++;
				}
			}
		}
		return butacasOcupadas;
	}

	// COMPLETAR ESTE METODO

	public Boolean hayEspacioPara(Integer cantidadDePersonas) {
		// TODO Auto-generated method stub
		Boolean hayEspacio = false;
		return hayEspacio;
	}

}
