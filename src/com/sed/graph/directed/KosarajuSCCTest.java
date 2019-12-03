package com.sed.graph.directed;

public class KosarajuSCCTest {

	public static void main(String[] args) {
		DiGraph dg = DiGraphProvider.provideSCCDi();
		KosarajuSCC ksr = new KosarajuSCC(dg);
		KosarajuSCCTest ksrt = new KosarajuSCCTest();
		ksrt.printSCCCOunt(ksr);
		ksrt.isSCC(ksr, 1, 0);
		ksrt.isSCC(ksr, 4, 0);
	}
	
	private void printSCCCOunt(KosarajuSCC ksr) {
		System.out.println("Count of SCC in DiGraph is: " + ksr.compCount());
	}
	
	private void isSCC(KosarajuSCC ksr, int v, int w) {
		System.out.print("" + v + " and " + w + " are ");
		if(ksr.isStronglyConnected(v, w)) {
			System.out.print("strongly connected");
		} else {
			System.out.print(" NOT strongly connected");
		}
		System.out.println();
	}

}
