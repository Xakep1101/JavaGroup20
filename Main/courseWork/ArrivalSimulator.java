package courseWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrivalSimulator {
	private double P_probability;
	private double Q_probability;
	
	private int pValue;
	private int qValue;
	
	private List<Double> pList = new ArrayList<>();
	private List<Double> qList = new ArrayList<>();
	
//	private float ArrivalProbability;
//	private float LeaveProbability;
	
	private Random random;
	
	public ArrivalSimulator(Random random, int p, int q) {
		this.random = random;
		pValue=p;
		qValue=q;
		generatePProbability();
		generateQProbability();
	}
	
	public void generatePProbability() {
		pList.add(0.001);
		pList.add(0.002);
		pList.add(0.003);
		pList.add(0.004);
		pList.add(0.005);
	}
	
	public void generateQProbability() {
		qList.add(0.002);
		qList.add(0.004);
		qList.add(0.006);
		qList.add(0.008);
		qList.add(0.01);
	}
	
	public boolean getPProbability() {
		Double nextdouble;
		//P_probability=pList.get(random.nextInt(pList.size()));
		P_probability=pList.get(pValue);
		nextdouble = random.nextDouble();
		if (P_probability>nextdouble) {
			return true;
		}
		return false;
	}
	
	public double getQProbability() {
		//Q_probability=qList.get(random.nextInt(qList.size()));
		Q_probability=qList.get(qValue);
		return Q_probability;
	}
	
	public void createCombinations() {
		int i = 0;
		while(i<4) {
			int j = 0;
			while(j<4) {
				System.out.println(pList.get(i));
				System.out.println(qList.get(j));
				j++;
			}
		i++;
		}
		
	}
}






