import java.util.List;
import java.util.HashMap;

public class StationInfo {
	public List<Integer> getZones(String station) {
		return stations.get(station);
	}

	public void setStations(String station, List<Integer> list) {
		this.stations.put(station, list);
	}
	
	public void print() {
		System.out.println(stations);
	}

	private HashMap<String,List<Integer>> stations = new HashMap<>();
}
