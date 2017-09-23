package vikingos;

import org.junit.Assert;
import org.junit.Test;

import vikingo.Ebrio;
import vikingo.Vikingo;

public class VikingoTest {
	
	@Test
	public void verificoAtaque(){
		
		Vikingo rollo = new Vikingo();
		Vikingo ragnar = new Vikingo();
		
		rollo.atacar(ragnar);
		
		System.out.println(rollo.getEstado().getAtaque());
		System.out.println(rollo.getEstado().getDefensa());
		System.out.println(rollo.getSalud());
		System.out.println(ragnar.getSalud());
		
		Assert.assertEquals(95, ragnar.getSalud());
		Assert.assertEquals(100, rollo.getSalud());
		
		ragnar.sacudir();
		
		ragnar.atacar(rollo);
		System.out.println(rollo.getSalud());
		
		
	}

}
