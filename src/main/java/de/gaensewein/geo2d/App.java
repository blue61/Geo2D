/*
 * This file is part of the Geo2D project.
 * The Geo2D project contains an arbitrary number of geometric objects and their data.
 * No warranty is given, especially not for correctness or efficiency.
 * If you need any help in reading the german comments look at www.leo.org for translations.
 * Assembled by Thomas Nagel.
 * 
 * Dies ist Open Source Software
 * Diese Bibliothek besteht aus Texten, die zum größten Teil von Github Copilot generiert wurden.
 * Es werden keinerlei Garantien übernommen, insbesondere nicht für Korrektheit oder Effizienz.
 * Diese Programmtexte dienen ausschließlich der Illustration der Möglichkeiten von Github Copilot 
 * und ähnlicher KI Software. Für die Rechte zu Kopien gelten daher im Zweifelsfall die Benutzungsrechte 
 * zu von Github Copilot erzeugten Programmtexten.
 */
package de.gaensewein.geo2d;


public class App {

	/**
	 * only a small test app for the Geo2D project 
	 * @param args
	 */
	public static void main(String[] args) {
		GeoObjekt g1 = new Kreis( 2.1d, 3.5d, 2.7d );
		
		System.out.print(g1);
		System.out.println();
		System.out.print( " Fläche: " + g1.flaeche());
		System.out.println();
		
		g1 = new Quadrat( 2.5d, 2.5d, 3.2d );

		System.out.print(g1);
		System.out.println();
		System.out.print( " Fläche: " + g1.flaeche());
		System.out.println();
		
		g1 = new Rechteck( 2.5d, 2.5d, 3.2d, 4.5d );

		System.out.print(g1);
		System.out.println();
		System.out.print( " Fläche: " + g1.flaeche());
		System.out.println();

		g1 = new Dreieck( 2.5d, 2.5d, 3.2d, 4.5d, 5.5d );

		System.out.print(g1);
		System.out.println();
		System.out.print( " Fläche: " + g1.flaeche());
		System.out.println();



	}

}
