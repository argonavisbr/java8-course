package br.com.argonavis.java.classes.geometria;

public class Ponto implements Cloneable, Comparable<Ponto> {
	protected int x;
	protected int y;
	
	/*public Ponto() {
		System.out.println("Chamando Ponto()");
	}*/
	
	public Ponto(int x, int y) {
		System.out.println("Chamando Ponto("+x+","+y+")");
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distancia() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double distancia(Ponto p) { 
		long q = (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y);
		return Math.sqrt(q);
	}
	
	public String imprimir() {
		return "("+x+","+y+")";
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	@Override
	public int compareTo(Ponto p) {
		return (int)p.distancia() - (int)this.distancia();
	}

}
