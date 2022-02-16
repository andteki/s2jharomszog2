/*
* File: App.java
* Author: Nagy János
* Copyright: 2022, Nagy János
* Group: Szoft I N
* Date: 2022-02-16
* Github: https://github.com/andteki/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class App {
	
	public static void main (String[] args) {
		System.out.println("Nagy Janos, 2022-02-16, Szoft I N");
		System.out.println("Feladat 0306");
		System.out.println("Haromszog teruletszamitas");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Alap: ");
		double alap = sc.nextDouble();
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		
		double terulet = alap * magassag / 2;
		System.out.println("Terulet: " + terulet);
	}
}
