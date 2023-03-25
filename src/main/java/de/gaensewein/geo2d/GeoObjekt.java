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
 * Diese Klasse ist die Basis für Geometrische Objekte in der euklidischen Ebene.
 * 
 * @author ktnagel
 * @remark Diese Klasse enthält die gmeinsamen Methoden der Geometrischen Objektre.
 * 	   Diese Klasse ist abstrakt, da sie nicht instanziiert werden kann.
 */
public abstract class GeoObjekt {
	protected double x;
	protected double y;

	public GeoObjekt(double xx, double yy) {
		setX(xx);
		setY(yy);
	}

	public void setX(double neu_x) {
		x = neu_x;
	}

	public double getX() {
		return x;
	}

	public void setY(double neu_y) {
		y = neu_y;
	}

	public double getY() {
		return y;
	}

	/**
	 * Berechnet die Fläche des Objektes.
	 * @return die Fläche des Objektes
	 */
	public double flaeche() {
		return 0;
	}

	/**
	 * Prüft, ob ein Punkt in einem Objekt liegt.
	 * @param xx X-Position des Punktes
	 * @param yy Y-Position des Punktes
	 * @return true, wenn der Punkt in dem Objekt liegt, sonst false
	 */
	public boolean in(double xx, double yy) {
		if(xx == x && yy == y) {
			return true;
		}
		return false;
	}

	public String toString( ) {
		return this.getClass().getSimpleName() +  ": X: " + x + " Y: " + y;
	}
}
