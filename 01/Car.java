public class Car {
  private String model;
  private int year;
  private String color;
  private double price;
  private double power;
  private double acceleration;
  private double topSpeed;
  private double height;
  private double width;
  private double length;
  private double wheelBase;
  private boolean engineStarted;

  public Car(String model, int year, String color) {
    switch (model) {
      case "colt":
        Init("colt", year, color, 290000.0, 70.0, 11.1, 180.0, 1550.0, 1695.0, 3870.0, 2500.0);
        break;

      case "corola":
        Init("corola", year, color, 1950000.0, 82.3, 10.8, 185.0, 1435.0, 1780.0, 4630.0, 2700.0);
        break;

      case "supra":
        Init("supra", year, color, 5950000.0, 251.0, 4.3, 250.0, 1292.0, 1854.0, 4379.0, 2470.0);
        break;

      case "panamera":
        Init("panamera", year, color, 16150000.0, 353.0, 3.9, 300.0, 1423.0, 1937.0, 5049.0, 2950.0);
        break;

      default:
        Init("colt", year, color, 290000.0, 70.0, 11.1, 180.0, 1550.0, 1695.0, 3870.0, 2500.0);
        break;
    }
  }

  // ------------------------------
  // Methods
  // ------------------------------

  public double Drive(int t) {
    if (!this.engineStarted) {
      return 0.0;
    }
    double a = 100 / this.acceleration;
    return a * t * t / 2;
  }

  public void StartEngine() {
    System.out.println(this.Model() + " ...Wwwwrrrr");
    this.engineStarted = true;
  }

  public void StopEngine() {
    System.out.println(this.Model() + " Rrrr...");
    this.engineStarted = false;
  }

  public String Info() {
    return "Car: " + this.Model() + "\nYear: " + this.Year() + "\nColor: " + this.Color() + "\nAverage price: "
        + this.Price() + "\nPower in wats: " + this.Power() + "\nPower in HP: " + this.PowerInHorses()
        + "\nAcceleration: " + this.Acceleration() + "\nTop: " + this.TopSPeed() + "\nHeight: " + this.Height()
        + "\nWidth: " + this.Width() + "\nLength: " + this.Length() + "\nWheelbase: " + this.WheelBase();
  }

  // ------------------------------
  // Getters
  // ------------------------------

  public String Model() {
    switch (this.model) {
      case "colt":
        return "Mitsubishi Colt";
      case "corola":
        return "Toyota Corola";
      case "supra":
        return "Toyota Supra";
      case "panamera":
        return "Porshe Panamera";

      default:
        return "Unkown model";
    }
  }

  public String Year() {
    return String.valueOf(this.year);
  }

  public String Color() {
    return this.color;
  }

  public String Price() {
    return String.valueOf(this.price) + "₽";
  }

  public String PowerInHorses() {
    return String.valueOf(this.power * 1.3596) + " horse power";
  }

  public String Power() {
    return String.valueOf(this.power) + "kW";
  }

  public String Acceleration() {
    return String.valueOf(this.acceleration) + " sec";
  }

  public String TopSPeed() {
    return String.valueOf(this.topSpeed) + " km / h";
  }

  public String Height() {
    return String.valueOf(this.height) + " mm";
  }

  public String Width() {
    return String.valueOf(this.width) + " mm";
  }

  public String Length() {
    return String.valueOf(this.length) + " mm";
  }

  public String WheelBase() {
    return String.valueOf(this.wheelBase) + " mm";
  }

  public void Init(String model, int year, String color, double price, double power, double acceleration,
      double topSpeed, double height, double width, double length, double wheelBase) {
    this.model = model;
    this.year = year;
    this.color = color;
    this.price = price;
    this.power = power;
    this.acceleration = acceleration;
    this.topSpeed = topSpeed;
    this.height = height;
    this.width = width;
    this.length = length;
    this.wheelBase = wheelBase;
    this.engineStarted = false;
  }

  public static void main(String args[]) {
    Car colt = new Car("colt", 2005, "green");
    System.out.println(colt.Info());
    System.out.println("");

    Car corola = new Car("corola", 2018, "blue");
    System.out.println(corola.Info());
    System.out.println("");

    Car supra = new Car("supra", 2020, "yellow");
    System.out.println(supra.Info());
    System.out.println("");

    Car panamera = new Car("panamera", 2021, "firebrick");
    System.out.println(panamera.Info());
    System.out.println("");

    colt.StartEngine();
    corola.StartEngine();
    supra.StartEngine();
    panamera.StartEngine();

    int sec = 4;
    System.out.println(colt.Model() + " has driven " + colt.Drive(sec) + " meters in " + sec + " seconds");
    System.out.println(corola.Model() + " has driven " + corola.Drive(sec) + " meters in " + sec + " seconds");
    System.out.println(supra.Model() + " has driven " + supra.Drive(sec) + " meters in " + sec + " seconds");
    System.out.println(panamera.Model() + " has driven " + panamera.Drive(sec) + " meters in " + sec + " seconds");
  }
}
