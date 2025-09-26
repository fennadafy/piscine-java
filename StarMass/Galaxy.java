
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
        Map<String, Integer> massRepartition = new HashMap<>();
        int somme = 0;
        massRepartition.put("Planet", 0);
        massRepartition.put("Other", 0);
        massRepartition.put("Star", 0);
        for (CelestialObject o : celestialObjects) {
            if (o instanceof Star) {
                somme = massRepartition.get("Star") + o.getmass();
                massRepartition.put("Star", somme);
            }else if (o instanceof Planet) {
                somme = massRepartition.get("Planet") + o.getmass();
                massRepartition.put("Planet", somme);
            }else {
                somme = massRepartition.get("Other") + o.getmass();
                massRepartition.put("Other", somme);
            }
            
        }
        return massRepartition;
    }
}
