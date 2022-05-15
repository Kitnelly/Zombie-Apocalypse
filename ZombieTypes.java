import java.util.HashMap;
import java.util.Map;

public class ZombieTypes {

	//Maps to hold the type of zombie and its related strength or weakness
	//if this needed to be a evolving list of weakness/strengths changing the map to 
	//Map<String, ArrayList<String>> would be an easy to way do that. 
	public Map<String, String> weakness = new HashMap<>();
	public Map<String, String> strengths = new HashMap<>();
	
	//method to add a zombie and its weakness
	public void addZombiesWeakness(String type, String weak) {
		weakness.put(type, weak);
	}
	
	//method to add a zombie and its strength
	public void addZombiesStrength(String type, String strong) {
		strengths.put(type, strong);
	}
	
	//method to return weakness of zombie type
	public String getWeakness(String type) {
		return weakness.get(type);
	}
	
	//method to return strengt of a zombie type
	public String getStrength(String type) {
		return strengths.get(type);
	}
}
