import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		StationInfo stationInfo = new StationInfo();
		stationInfo.setStations("Holborn",List.of(1));
		stationInfo.setStations("Earl's Court",List.of(1,2));
		stationInfo.setStations("Wimbledon",List.of(3));
		stationInfo.setStations("Hammersmith",List.of(2));
		
		Scanner sc = new Scanner(System.in);
		String travelMethod[] = {"Tube","Bus","Tube"};
		String departStation[] = {"Holborn","Earl's Court","Earl's Court"};
		String arrivalStation[] = {"Earl's Court","Wimbledon","Hammersmith"};
		
		Card customerOne = new Card();
		customerOne.setBalance(30);
		
		Calculator calculator = new Calculator(); 
		
		for(int i=0;i<3;i++) {
			calculator.calculateCost(customerOne,travelMethod[i],stationInfo.getZones(departStation[i]),stationInfo.getZones(arrivalStation[i]));
		}
		
		double balance = customerOne.getBalance();
		System.out.println("Cost for travelling => "+(30-balance));
		System.out.println("Current Card Balance => "+balance);
	}

}
