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

/**
 * ein Quadrat
 */	
public class Quadrat extends GeoObjekt {
	private double a;

	/**
	 * Erstelle ein Quadrat
	 * @param xx X-Position
	 * @param yy Y-Position
	 * @param aa Kantenlänge
	 */
	public Quadrat(double xx, double yy, double aa) {
		super(xx, yy);
		setA(aa);
	}

	public void setA(double aa) {
		a = aa;
	}

	public double getA() {
		return a;
	}

	public double flaeche() {
		return a * a;
	}

	public String toString( ) {
		return super.toString() + " A: " + a;
	}

	/**
	 * Prüfe, ob ein Punkt innerhalb des Quadrats liegt
	 * Dies ist wieder ein Beispiel für eine fehlerhafte Implementierung,
	 * denn der Referenzpunkt soll ja in der Mitte liegen, nicht unten links.
	 * @param xx X-Position des Punktes
	 * @param yy Y-Position des Punktes
	 * @return true, wenn der Punkt innerhalb des Quadrats liegt
	 */
	public boolean in(double xx, double yy) {
		if (xx >= x && xx <= x + a && yy >= y && yy <= y + a) {
			return true;
		}
		return false;
	}
}
