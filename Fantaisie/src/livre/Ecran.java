package livre;

public class Ecran implements Livre {

	@Override
	public void ecrire(String text) {
		System.out.print(text);	
	}
}
