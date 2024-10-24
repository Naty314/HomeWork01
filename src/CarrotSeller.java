import java.time.LocalDate;

public class CarrotSeller {
    private String name;
    private LocalDate birthDate;
    private int numberOfContracts;
    private double totalCarrotsSold;
    private String cityName;
    private String registrationPlate; // Vehicle registration plate
    private double fuelConsumption; // Vehicle consumption in liters per 100 km

    // All parametrs
    public CarrotSeller(String name, LocalDate birthDate, int numberOfContracts, double totalCarrotsSold, String cityName, String registrationPlate, double fuelConsumption) {
        this.name = name;
        this.birthDate = birthDate;
        this.numberOfContracts = numberOfContracts;
        this.totalCarrotsSold = totalCarrotsSold;
        this.cityName = cityName;
        this.registrationPlate = registrationPlate;
        this.fuelConsumption = fuelConsumption;
    }

    // just name
    public CarrotSeller(String name) {
        this(name, null, 0, 0.0, "Unknown", "Unknown", 0.0);
    }

    // name and birthdate
    public CarrotSeller(String name, LocalDate birthDate) {
            this(name, birthDate, 0, 0.0, "Unknown", "Unknown", 0.0);
    }

    // name and adress
    public CarrotSeller(String name, String cityName) {
        this(name, null, 0, 0.0, cityName, "Unknown", 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public double getTotalCarrotsSold() {
        return totalCarrotsSold;
    }

    public void setTotalCarrotsSold(double totalCarrotsSold) {
        this.totalCarrotsSold = totalCarrotsSold;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
