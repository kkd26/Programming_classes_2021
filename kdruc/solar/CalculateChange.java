package kdruc.solar;

public class CalculateChange {

	public static AstralObject updateAstralObject(AstralObject astralObject, AstralObject centerOfMass) {
		double M = centerOfMass.mass();
		Vector R = centerOfMass.position();
		double m1 = astralObject.mass();
		Vector r1 = astralObject.position();
		double m2 = M - m1;
		Vector r2 = (R.scale(M).add(r1.scale(-m1))).scale(1 / m2);
		

		return new AstralObject(m1, r, v, a);
	}
}
