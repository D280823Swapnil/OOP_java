package assign_3_Q3;

public class Driving {
	double totalMilesDrivenPerDay;
	double costPerGallonofGasoline;
	double averageMilesPerGallon;
	double parkingFeesPerDay;
	double tollsPerDay;
	

	public Driving(double totalMilesDrivenPerDay, double costPerGallonofGasoline, double averageMilesPerGallon,
			double parkingFeesPerDay, double tollsPerDay) {
		this.totalMilesDrivenPerDay = totalMilesDrivenPerDay;
		this.costPerGallonofGasoline = costPerGallonofGasoline;
		this.averageMilesPerGallon = averageMilesPerGallon;
		this.parkingFeesPerDay = parkingFeesPerDay;
		this.tollsPerDay = tollsPerDay;
	}



	public double calculateDrivingCost() {
		return this.tollsPerDay + this.parkingFeesPerDay + ((this.totalMilesDrivenPerDay/ this.averageMilesPerGallon) * this.costPerGallonofGasoline); 
	}


}
