package clustering;

public class DistanceEuclidienne implements Distance {

	@Override
	public double valeur(Donnee d1, Donnee d2) {
		double res;
		double[] data1 = d1.getValeurs();
		double[] data2 = d2.getValeurs();
		res = 0;
		for(int i = 0;i<d1.getDim();i++){
			res += Math.pow(data1[i] - data2[i], 2.0);
		}
		return Math.sqrt(res);
	}

}
