
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {

    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject object) {
        celestialObjects.add(object);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> myMap = new HashMap<>();

        double sumS = 0;
        double sump = 0;
        double sumO = 0;
        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                sumS = sumS + obj.mass;
            }else if (obj instanceof Planet) {
                sump = sump + obj.mass;
            }else  {
                sumO = sumO + obj.mass;
            }
        }
        myMap.put("Star" , (int) sumS);
        myMap.put("Planet" , (int) sump);
        myMap.put("Other" , (int) sumO);

        return myMap;
    }
}
