package vikingos;

import org.junit.Assert;
import org.junit.Test;

import vikingo.Ebrio;
import vikingo.EstadoVikingo;
import vikingo.Vikingo;

public class VikingoTest {
	
	@Test
	public void verificoAtaque(){
		
		Vikingo rollo = new Vikingo();
		Vikingo ragnar = new Vikingo();
		
		rollo.atacar(ragnar);
				
		Assert.assertEquals(95, ragnar.getSalud());
		Assert.assertEquals(100, rollo.getSalud());	
	}
	
	@Test
	public void verificoSacudirAVikingoNormal(){
		
		Vikingo rollo = new Vikingo();
		Vikingo ragnar = new Vikingo();
		
		rollo.atacar(ragnar);
	
		ragnar.sacudir();
		
		ragnar.atacar(rollo);
		Assert.assertEquals(75, rollo.getSalud());			
	}

	@Test
	public void verificoQueSePongaEbrio(){
		
		Vikingo rollo = new Vikingo();
		EstadoVikingo ebrio = new Ebrio();
		rollo.beber();
		Assert.assertEquals(ebrio.getClass(), rollo.getEstado().getClass());			
	}
}
