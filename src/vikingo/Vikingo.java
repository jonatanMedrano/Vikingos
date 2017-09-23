package vikingo;

public class Vikingo {
	
	private EstadoVikingo estado;
	private int salud;

	public Vikingo() {
		this.salud = 100;
		this.estado = new Normal();
	}

	public void atacar(Vikingo viki){
		viki.setSalud(viki.getSalud() - this.estado.getAtaque() + viki.estado.getDefensa());	
	}

	public void beber(){
		this.estado = estado.beber();
	}	

	public void sacudir(){
		this.estado = estado.sacudir();
	}	

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}


	public EstadoVikingo getEstado() {
		return estado;
	}


	public void setEstado(EstadoVikingo estado) {
		this.estado = estado;
	}


}
