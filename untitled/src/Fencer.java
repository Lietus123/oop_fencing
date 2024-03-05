public class Fencer extends Person{

    private String coach;
    private double height;
    private double weight;
    private int points;
    private double time;

    public Fencer(String country, String namesurname, int age, String gender, String coach, double height, double weight, int points, double time) {
        super(country, namesurname, age, gender);
        this.coach = coach;
        this.height = height;
        this.weight = weight;
        this.points = points;
        this.time = time;
    }

    public double pointsperminute(){
        double pointsperminute;
        pointsperminute = points/time;
        return pointsperminute;
    }

    public String soutfencer() {
        if (getGender().equalsIgnoreCase("Male")) {
            return("\nFencer is from: " + getCountry() +
                    "\nHis Name Surname is: " + getNamesurname() +
                    "\nHe is: " + getGender() +
                    "\nHis coach is: " + coach +
                    "\nHis height is: " + height +
                    "\nHis weight is: " + weight +
                    "\nHis points per match is: " + points +
                    "\nHis time of match is: " + time+
                    "\nHis points per minute is: "+pointsperminute()+
                    "\n-----------------------");
        } else {
            return("\nFencer is from: " + getCountry() +
                    "\nHer Name Surname is: " + getNamesurname() +
                    "\nShe is: " + getGender() +
                    "\nHer coach is: " + coach +
                    "\nHer height is: " + height +
                    "\nHer weight is: " + weight +
                    "\nHer points per match is: " + points +
                    "\nHer time of match is: " + time+
                    "\nHer points per minute is: "+pointsperminute() +
                    "\n-----------------------");
        }
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
