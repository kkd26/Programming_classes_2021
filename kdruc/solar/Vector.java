package kdruc.solar;

public class Vector {
	private final double x;
	private final double y;

	public Vector() {
		this(0, 0);
	}

	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vector scale(double m) {
		return new Vector(x * m, y * m);
	}

	public Vector add(Vector v) {
		return new Vector(x + v.x, y + v.y);
	}

	public double length() {
		return Math.sqrt(x * x + y * y);
	}

	public Vector normal() {
		return this.scale(1 / this.length());
	}

	public double x() {
		return x;
	}

	public double y() {
		return y;
	}

}
