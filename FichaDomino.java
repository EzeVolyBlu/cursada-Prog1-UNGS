
public class FichaDomino {

	private int numero1;
	private int numero2;
	
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		if(numero1 < 0 || numero1 > 6) {
			throw new RuntimeException("El valor debe estar entre 0 y 6");
		} else {
			this.numero1 = numero1;
		}
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		if(numero2 < 0 || numero2 > 6) {
			throw new RuntimeException("El valor debe estar entre 0 y 6");
		} else {
			this.numero2 = numero2;
		}
	}
	
}
