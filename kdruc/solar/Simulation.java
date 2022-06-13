package kdruc.solar;

import javax.swing.*;

public class Simulation {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Solar System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Planet("Earth", 1000));
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}
