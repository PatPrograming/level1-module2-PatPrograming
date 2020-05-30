package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy=new Smurf ("HandySmurf");
	Handy.eat();
	System.out.println(Handy.getName());
	Smurf Papa=new Smurf ("Papa Smurf");
	System.out.println(Papa.getName());
	System.out.println("My hat color is "+Papa.getHatColor());
	System.out.println("I am a "+Papa.isGirlOrBoy());
	Smurf fette=new Smurf ("Smurfette");
	System.out.println(fette.getName());
	System.out.println("My hat color is "+fette.getHatColor());
	System.out.println("I am a "+fette.isGirlOrBoy());
}
}
