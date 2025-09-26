
public class Star extends CelestialObject {

    private double magnitude;

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public Star() {
    }

    public Star(String Sname, double Sx, double Sy, double Sz, double Smagnitude) {
        super(Sname, Sx, Sy, Sz);
        this.magnitude = Smagnitude;

    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", name, this.magnitude);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode() + Double.hashCode(this.magnitude);
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            if (super.equals(obj)) {
                // 2. Type check and null check (using instanceof)

                if (super.equals(obj)) {
                    if (!(obj instanceof Star)) {
                        return false;
                    }
                    Star others = (Star) obj;
                    return this.magnitude == others.magnitude;

                }
                // 3. Cast to the correct type
            }
        }
        return false;

    }
}
