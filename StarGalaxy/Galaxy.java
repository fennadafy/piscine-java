import java.util.ArrayList;
import java.util.List;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        celestialObjects = new ArrayList<>();
    }
    public List<CelestialObject> getCelestialObjects(){
        return celestialObjects;
    }
    public void addCelestialObject(CelestialObject object){
        celestialObjects.add(object);
    }
}
