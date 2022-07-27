package com.sass.main;

import java.util.Scanner;

import com.sass.ex1.FindTriangle;
import com.sass.ex11.SnackAndLadder;
import com.sass.ex14.WordyEnough;
import com.sass.ex16.PatternMatching;
import com.sass.ex2.WordCount;
import com.sass.ex3.RealNumber;
import com.sass.ex4.AckermannFunction;
import com.sass.ex6.RomanConversion;
import com.sass.ex7.ZeroMatrix;
import com.sass.ex9.PolynominalAddition;


public class MainClass {

	public static void main(String[] args) {

//		FindTriangle t1 = new FindTriangle();
//		t1.findMyTriangleType();

//		WordCount wc = new WordCount();
//		wc.wordCount();

//		AckermannFunction ak = new AckermannFunction();
//		ak.Ackermann_Function();

//		RealNumber rn = new RealNumber();
//		rn.formateRealNumber();
//		
//		RomanConversion rc = new RomanConversion();
//		rc.convertNumberToRoman();

//		ZeroMatrix zm = new ZeroMatrix();
//		zm.removeZeroRowCol();

//		SnackAndLadder sl = new SnackAndLadder();
//		sl.playSnackAndLadder();
//		

//		PatternMatching pm = new PatternMatching();
//		pm.findMaxStringLength();
		
//		PolynominalAddition pa = new PolynominalAddition();
//		pa.takeInputPolyExpression();
		
		
		WordyEnough we = new WordyEnough();
		try {
			we.readInp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		we.sortWords();
		
		
		
		
		
		
		
		
	}
	
	
	

}
