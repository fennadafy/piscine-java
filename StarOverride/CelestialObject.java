
public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String name1, double x1, double y1, double z1) {
        x = x1;
        y = y1;
        z = z1;
        name = name1;
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

    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)",getName() , getX() , getY() , getZ());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CelestialObject object = (CelestialObject) obj;

        return this.x == object.x && this.y == object.y && this.z == object.z && this.name.equals(object.name);
    }

    public int hashCode() {
        int result = name == null ? 0 : this.name.hashCode();
        result = 31 * result + Double.hashCode(this.x);
        result = 31 * result + Double.hashCode(this.y);
        result = 31 * result + Double.hashCode(this.z);
        return result;
    }
}
