
public class Lavarropa {

	private String tipo;
	private int programas;
	private int capacidad;
	private boolean aguaCaliente;
	private boolean mediaCarga;

	public Lavarropa(String tipo) {
		
		switch(tipo.toLowerCase()) {
		
			case "automático": 
				this.tipo = tipo.toLowerCase();
				this.programas = 12;
				this.capacidad = (5 + 18) / 2;
				this.aguaCaliente = true;
				this.mediaCarga = false;
				break;
				
			case "semiautomático":
				this.tipo = tipo.toLowerCase();
				this.programas = 12;
				this.capacidad = (5 + 18) / 2;
				this.aguaCaliente = true;
				this.mediaCarga = false;
				break;
				
			default:
				throw new RuntimeException("Tipo no aceptado");
		}
		
	}
	
	public String getTipo() {
		return tipo;
	}
	
	// la clase no tiene setTipo porque traeria muchos problemas de validacion
	
	public int getProgramas() {
		return this.programas;
	}
	
	public void setProgramas(int programas) {
		
		switch(this.tipo) {
		
			case "automático": 

				if(programas < 12) {
					throw new RuntimeException("Automático debe tener al menos 12 programas");
				} else {
					this.programas = programas;
				}
				break;
				
			case "semiautomático":

				if(programas > 10) {
					throw new RuntimeException("Semiautomático no debe tener más de 10 programas");
				} else if(programas <= 0) {
					throw new RuntimeException("Semiautomático debe tener al menos 1 programa");
				} else {
					this.programas = programas;
				} 
				break;
				
			default:
				throw new RuntimeException("Error inesperado");
		}
		
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		
		switch(this.tipo) {
		
			case "automático": 
				if(capacidad < 5 || capacidad > 8) {
					throw new RuntimeException("La capacidad de un automático debe ser entre 5 y 8 kg");
				} else {
					this.capacidad = capacidad;
				}
				break;
				
			case "semiautomático":
				if(capacidad != 5) {
					throw new RuntimeException("Semiautomático debe tener una capacidad de 5 kg");
				} else {
					this.capacidad = capacidad;
				} 
				break;
			
			default:
				throw new RuntimeException("Error inesperado");
		}	
	}
	
	public boolean isAguaCaliente() {
		return aguaCaliente;
	}
	
	public void setAguaCaliente(boolean aguaCaliente) {
		
		switch(this.tipo) {
			case "automático": 
				if(this.mediaCarga) {
					throw new RuntimeException("Automático no permite lavar con agua caliente y media carga");
				} else {
					this.aguaCaliente = aguaCaliente;
				}
				break;
				
			case "semiautomático":
				throw new RuntimeException("Semiautomático no permite lavar con agua caliente");
		default:
				throw new RuntimeException("Error inesperado");
		}
	}
	
	public boolean isMediaCarga() {
		return mediaCarga;
	}
	
	public void setMediaCarga(boolean mediaCarga) {
		
		switch(this.tipo) {
			case "automático": 
				if(this.aguaCaliente) {
					throw new RuntimeException("Automático no permite lavar con agua caliente y media carga");
				} else {
					this.mediaCarga = mediaCarga;
				}
				break;
				
			case "semiautomático":
				this.mediaCarga = mediaCarga;
			default:
				throw new RuntimeException("Error inesperado");
		}
	}
	
	
	

}
