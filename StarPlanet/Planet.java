
public class Planet extends CelestialObject {

    private Star centerStar;

    public Planet() {
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    @Override
    public int hashCode() {
        int result = 1;
        return super.hashCode() + 31 *result + centerStar.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (super.equals(obj)) {
                if (!(obj instanceof Planet)) {
                    return false;
                }
                Planet others = (Planet) obj;
                if (others.centerStar == this.centerStar) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.centerStar == null || this == null) {
            return String.format("%s circles around %s at the 0.000 AU.", this.name, this.name);
        }
        double distance = getDistanceBetween(this, this.centerStar);
        return String.format("%s circles around %s at the %.3f AU.", this.name, centerStar.name, distance);
    }
}
