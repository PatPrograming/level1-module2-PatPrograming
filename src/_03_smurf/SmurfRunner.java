package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy=new Smurf ("HandySmurf");
	Handy.eat();
	Handy.getName();
	Smurf Papa=new Smurf ("Papa Smurf");
	Papa.getName();
	Papa.getHatColor();
	Papa.isGirlOrBoy();
	Smurf fette=new Smurf ("Smurfette");
	fette.getName();
	fette.getHatColor();
	fette.isGirlOrBoy();
}
}
