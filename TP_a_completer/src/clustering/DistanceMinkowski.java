package clustering;

public class DistanceMinkowski implements Distance {

	private double q;
	
	public DistanceMinkowski(double q){
		this.q = q;
	}
	
	@Override
	public double valeur(Donnee d1, Donnee d2) {
		double res=0;
		double[] data1 = d1.getValeurs();
		double[] data2 = d2.getValeurs();
		for (int i=0; i<data1.length; i++){
			res += Math.pow(Math.abs(data1[i]-data2[i]), this.q);
		}
		try {
			res = Math.pow(res, 1/q);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return res;
	}

}
