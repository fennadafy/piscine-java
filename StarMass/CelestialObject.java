
public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;
    public int mass;

    public CelestialObject() {
        name = "Soleil";
        x = 0.0;
        y = 0.0;
        z = 0.0;
        mass = 0;
    }

    public CelestialObject(String name1, double x1, double y1, double z1, int m) {
        name = name1;
        x = x1;
        y = y1;
        z = z1;
        mass = m;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public void setX(double new_x) {
        x = new_x;
    }

    public void setY(double new_y) {
        y = new_y;
    }

    public void setZ(double new_z) {
        z = new_z;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setmass(int m) {
        mass = m;
    }

    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double res = Math.pow((obj2.x - obj1.x), 2) + Math.pow((obj2.y - obj1.y), 2) + Math.pow((obj2.z - obj1.z), 2);
        return Math.sqrt(res);
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        double res = Math.pow((obj2.x - obj1.x), 2) + Math.pow((obj2.y - obj1.y), 2) + Math.pow((obj2.z - obj1.z), 2);
        return Math.sqrt(res) * 150000000;
    }
    //public constant double property
    public static double KM_IN_ONE_AU = 150000000;

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", getName(), getX(), getY(), getZ());
    }

    @Override
    public boolean equals(Object obj) {
        CelestialObject object = (CelestialObject) obj;
        if (this.x == object.x && this.y == object.y && this.z == object.z && this.name == object.name) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + Double.hashCode(this.x) + Double.hashCode(this.y) + Double.hashCode(this.z);

    }
}
