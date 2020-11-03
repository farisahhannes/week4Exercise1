public class Circle{
	//field or attribute
	private double jejari = 1;

	//overload methos toString()
	public String toString(){
		return "Jejari = " + jejari + "\nLuas adalah " + KiraLuas();
	}

	//setter
	public void setJejari(double jejari){
		this.jejari = jejari;
		System.out.println(jejari);
	}

	//getter
	//takyah buat this.jejari cuz nnty lmbat(?)
	public double getJejari(){
		return jejari;
	}


	//default constructor
	public Circle(){
		//System.out.println("Call default constructor ");
	}


	// overloading constructor - parameter
	public Circle(double jejari){
		this.jejari = jejari;
		// System.out.println("Jejari = " + jejari  );
	}

	//overloading constructor - 2 parameter
	public Circle(double r, String n){
		jejari = r;
		System.out.println("Jejari = " + jejari + " String = " + n );
	}

	//method
	public double KiraLuas(){
		return jejari * jejari * Math.PI;
	}

	
}