import java.util.List;

public class Calculator {
	public void calculateCost(Card card,String travelMethod,List<Integer> sourceZones,List<Integer> destinationZones) {
		if(travelMethod=="Bus") {
			card.setBalance(card.getBalance()-1.8);
			return;
		}
		int count = countZones(sourceZones,destinationZones);
		
		if(count==0 && (sourceZones.contains(1) && destinationZones.contains(1))){
			card.setBalance(card.getBalance()-2.5);
		}
		else if(count ==0 && (sourceZones.contains(2) && destinationZones.contains(2))) {
			card.setBalance(card.getBalance()-2.0);
		}
		else if(count==1 && (sourceZones.contains(1) || destinationZones.contains(1))) {
			card.setBalance(card.getBalance()-3.0);
		}
		else if(count ==1 && (!sourceZones.contains(1) && !destinationZones.contains(1))) {
			card.setBalance(card.getBalance()-2.25);
		}
		else if(count ==2) {
			card.setBalance(card.getBalance()-3.20);
		}
		
	}
	
	public int countZones(List<Integer> sourceZones,List<Integer> destinationZones) {
		int min = Integer.MAX_VALUE;
		for(int sZone:sourceZones) {
			for(int dZone:destinationZones) {
				min = Math.min(Math.abs(sZone-dZone), min);
			}
		}
		return min;
	}
	
}
