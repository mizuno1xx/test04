package differential;

import java.util.Scanner;

public class Differential_main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );
		System.out.print( "Input value of  a> " );
		double a = Double.parseDouble( scan.next() );
		System.out.print( "Input value of h> " );
		double h = Double.parseDouble( scan.next() );
		
		Differential_lib dlib = new Differential_lib( a , h );
		System.out.println( "�����W���F" + dlib.getRx() );
		System.out.println( "���l�����l�F" + dlib.getDx() );
		System.out.println( "���Ό덷�F" + Math.abs( dlib.getRx() - dlib.getDx() ) / dlib.getRx() * 100 );
	}
}
