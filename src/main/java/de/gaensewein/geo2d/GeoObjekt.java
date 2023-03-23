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
 * Diese Klasse ist die Basis für alle Geometrischen Objekte
 * 
 * @author ktnagel
 * 
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

	public void bewegeZu(double neu_x, double neu_y) {
		setX(neu_x);
		setY(neu_y);
	}
	
	public double flaeche() {
		return 0;
	}

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
