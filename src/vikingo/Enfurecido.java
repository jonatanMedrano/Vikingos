package vikingo;

public class Enfurecido implements EstadoVikingo {

	public static final int ATAQUE = 30;
	public static final int DEFENSA = 0;
	private int ataque;
	private int defensa;

	public Enfurecido(){
		this.ataque = ATAQUE;
		this.defensa = DEFENSA;
	}
	
	
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	
	public EstadoVikingo sacudir() {

			return new Enfurecido();
	}

	public EstadoVikingo beber() {

		return new Normal();
	}
}
