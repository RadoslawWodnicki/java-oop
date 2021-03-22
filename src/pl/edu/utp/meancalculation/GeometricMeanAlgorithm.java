package pl.edu.utp.meancalculation;

public class GeometricMeanAlgorithm implements MeanAlgorithm {

	public double calculateMean() {
		// fields - pola, wewnetrzny stan naszego algorytmu. nikt nie powinien ich edytowac
		private double currentSum;
		private double noOfFactors;
		
		// constructor 
		public GeometricMeanAlgorithm() {
			currentSum = 1;
			noOfFactors = 0;
		}
		
		public void add(double factor) {
			currentSum *= factor;
			noOfFactors++;
		}
		
		public double calculateMean() {
			return Math.pow(currentSum, calculateMean)
		}
		
		return 0;
	}

	@Override
	public void add(double factor) {
	}
	
}

