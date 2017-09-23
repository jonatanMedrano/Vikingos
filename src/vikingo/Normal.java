package vikingo;

public class Normal implements EstadoVikingo {

	public static final int ATAQUE = 10;
	public static final int DEFENSA = 5;
	private int ataque;
	private int defensa;
	
	public Normal(){
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

		return new Ebrio();
	}

	
}
