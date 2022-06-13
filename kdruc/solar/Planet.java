package kdruc.solar;

import java.awt.*;

public class Planet extends AstralObject {
	private final String name;

	public Planet(String name, double mass) {
		super(mass);
		this.name = name;
	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(10, 10, 100, 100);
	}
}
