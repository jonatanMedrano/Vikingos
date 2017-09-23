package vikingo;

public interface EstadoVikingo {

	public abstract EstadoVikingo sacudir();

	public abstract EstadoVikingo beber();
	
	public abstract int getAtaque();

	public abstract void setAtaque(int ataque);
	

	public abstract int getDefensa();

	public abstract void setDefensa(int defensa);
	
}
