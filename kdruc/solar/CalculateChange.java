package kdruc.solar;

public class CalculateChange {

	public static final double G = 6.6743015e-11;

	public static AstralObject updateAstralObject(IAstralObject astralObject, IAstralObject centerOfMass, double dt) {
		double M = centerOfMass.mass();
		Vector R = centerOfMass.position();
		double m1 = astralObject.mass();
		Vector r1 = astralObject.position();
		double m2 = M - m1;
		Vector r2 = (R.scale(M).add(r1.scale(-m1))).scale(1 / m2);

		Vector d = r1.add(r2.scale(-1));
		double length = d.length();
		Vector unitR = d.normal();
		Vector a = unitR.scale(G * m2 / (length * length));

		Vector dv = a.scale(dt);
		Vector v = astralObject.velocity().add(dv);
		Vector dr = v.scale(dt);
		Vector r = astralObject.position().add(dr);

		return new AstralObject(m1, r, v, a);
	}
}
