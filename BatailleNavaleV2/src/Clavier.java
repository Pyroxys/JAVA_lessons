import java.util.Scanner;

class Clavier {
	Scanner scanner = new Scanner(System.in);
	
	String lireString() {
		return scanner.next();
	}
	
	int lireEntier() {
		return scanner.nextInt();
	}
	
	char lireCaractere() {
		return (lireString().charAt(0));
	}
	
	boolean lireBoolean() {
		return scanner.nextBoolean();
	}
}