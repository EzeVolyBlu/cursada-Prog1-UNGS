public class JugadaGenerala {

	private int[] dados;
	private boolean escalera = false;
	private boolean poker = false;
	private boolean generala = false;
	private int puntos = 0;
	
	public JugadaGenerala(int[] dados) {
		this.chequearJugada(dados);
	}
	
	public int[] getDados() {
		return dados;
	}

	public void setDados(int[] dados) {
		this.chequearJugada(dados);
	}

	public boolean isEscalera() {
		return escalera;
	}

	public boolean isPoker() {
		return poker;
	}

	public boolean isGenerala() {
		return generala;
	}

	public int getPuntos() {
		return puntos;
	}

	private void chequearJugada(int[] dados) {
		if(dados.length != 5) {
			throw new RuntimeException("La jugada debe tener 5 dados");
		} else {
			this.dados = dados;
			this.escalera = true;
			
			for(int dado : dados) {

				if(dado < 1 || dado > 6) {
					throw new RuntimeException("Los dados deben valer entre 1 y 6");
				}
				if(cantidadAp(dado, dados) > 1) {
					this.escalera = false;
					puntos += 20;
				}
				if(cantidadAp(dado, dados) == 4) {
					this.poker = true;
					puntos += 40;
				}
				if(cantidadAp(dado, dados) == 5) {
					this.generala = true;
					puntos += 50;
				}
				
			}
		}
	}
	
	private int cantidadAp(int numero, int[] dados) {
		// TODO Auto-generated method stub
		int cantidadAp = 0;
		for(int dado : dados) {
			if(dado == numero) {
				cantidadAp++;
			}
		}
		return cantidadAp;
	}

}
