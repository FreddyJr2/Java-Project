
public class Vehicle {


	private String make, year, mileage, bodyType, transmission, driveTrain, condition;

	public Vehicle() {
		super();
		this.make = "Missing make";
		this.year = "Unknown year";
		this.mileage = "Unknown";
		this.bodyType = "Unknown";
		this.transmission = "Unknown";
		this.driveTrain = "Unknown";
		this.condition = "Unknown";
	}
	
	public Vehicle(String make, String year, String mileage, String bodyType, String transmission, String driveTrain,
			String condition) {
		super();
		this.make = make;
		this.year = year;
		this.mileage = mileage;
		this.bodyType = bodyType;
		this.transmission = transmission;
		this.driveTrain = driveTrain;
		this.condition = condition;
	}





	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getDriveTrain() {
		return driveTrain;
	}

	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}



	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", year=" + year + ", mileage=" + mileage + ", bodyType=" + bodyType
				+ ", transmission=" + transmission + ", driveTrain=" + driveTrain + ", condition=" + condition + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	