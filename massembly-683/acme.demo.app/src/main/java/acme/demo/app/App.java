package acme.demo.app;

import acme.demo.lib_a.LibA;
import acme.demo.lib_b.LibB;

public class App {

	public static void main(String[] args) {
		System.out.println("The answer is " + new App().getAnswer() + ".");
		System.out.println("The answer is " + new LibA().getAnswer() + ".");
		System.out.println("The answer is " + new LibB().getAnswer() + ".");
	}

	public String getAnswer() {
		return "42";
	}

}
