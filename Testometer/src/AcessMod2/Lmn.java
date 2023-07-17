package AcessMod2;

import AceesMod1.Abc;

public class Lmn extends Abc{

	public static void main(String[] args) {
		Abc a= new Abc();
		System.out.println("Public variable in different package : " +a.h); //
	    Lmn l=new Lmn();
	    l.methodm2();
	}
	
	void methodm2(){
			System.out.println("Protected variable in different package : " +i);
	}
	}

