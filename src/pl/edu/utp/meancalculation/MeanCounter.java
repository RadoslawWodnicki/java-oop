package pl.edu.utp.meancalculation;

// object oriented approach
public class MeanCounter {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 40;
		
		// najpierw deklaruje referencja (typ + nazwa obiektu)
		ArithmeticMeanAlgorithm meanAlgorithm = new ArithmeticMeanAlgorithm(); 
		meanAlgorithm.add(a);
		meanAlgorithm.add(b);
		meanAlgorithm.add(c);
		
		displayMean(meanAlgorithm);
		
		GeometricMeanAlgorithm geomeanAlgorithm = new GeometricMeanAlgorithm(); 
		geomeanAlgorithm.add(a);
		geomeanAlgorithm.add(b);
		geomeanAlgorithm.add(c);
		
		displayMean(geomeanAlgorithm);
	}
	
	public static void displayMean(MeanAlgorithm algorithm) {
		System.out.println(algorithm.calculateMean());
		

	}
	
	public static void displayMean(MeanAlgorithms... algorithms) {
		for (MeanAlgorithm algorithm : algorithms)}
			displayMean(algorithm);
	}

}
