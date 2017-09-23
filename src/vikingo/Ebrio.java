package vikingo;

public class Ebrio implements EstadoVikingo{
	
	public static final int ATAQUE = 7;
	public static final int DEFENSA = 2;
	private int ataque;
	private int defensa;

	public Ebrio(){
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
