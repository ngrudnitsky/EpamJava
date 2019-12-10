package by.it.nickgrudnitsky.project.entities;


//тарифы для частного дома
public class PrivateHousePlan extends HomePlan {

    private double trafficVolumeOn1MbeatSpeed;
    private double turboButtonCost;

    @Override
    public int compareTo(Plan o) {  //сортировка по умолчанию (в алфавитном порядке)
        return this.getName().compareTo(o.getName());
    }

    public double getTurboButtonCost() {
        return turboButtonCost;
    }

    public void setTurboButtonCost(double turboButtonCost) {
        this.turboButtonCost = turboButtonCost;
    }

    public double getTrafficVolumeOn1MbeatSpeed() {
        return trafficVolumeOn1MbeatSpeed;
    }

    public void setTrafficVolumeOn1MbeatSpeed(double trafficVolumeOn1MbeatSpeed) {
        this.trafficVolumeOn1MbeatSpeed = trafficVolumeOn1MbeatSpeed;
    }

    @Override
    public String toString() {
        return this.getName() +
                "\nВключено интернет трафика " + this.getVolumeOfInternetTraffic() +
                "\nабонентская плата " + this.getSubscriptionFee() +
                "\n";
    }
}
