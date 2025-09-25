
public class Star extends CelestialObject {

    private double magnitude;
    private double x;
    private double y;
    private double z;
    private String name;

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public Star() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        magnitude = 0.0;
        name = "Soleil";
    }

    public Star(String Sname, double Sx, double Sy, double Sz, double Smagnitude) {
        x = Sx;
        y = Sy;
        z = Sz;
        magnitude = Smagnitude;
        name = Sname;
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", name, this.magnitude);
    }

    @Override
    public int hashCode() {
        int result = 31 * super.hashCode() + Double.hashCode(magnitude);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //   Identity check (performance optimization)
        if(this ==obj){
            return true;
        }
       // 2. Type check and null check (using instanceof)
        if (!(obj instanceof CelestialObject)){
            return false;
        }
         // 3. Cast to the correct type
        Star others = (Star) obj;
        // 4. Field-by-field comparison
        
        return this.magnitude == others.magnitude && this.x == others.x && this.y == others.y && this.z == others.z && this.name.equals(others.name);

    }
}
   