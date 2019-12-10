package by.it.nickgrudnitsky.project.entities;

public class PrivateHousePlan extends HomePlan {

    private double trafficVolumeOnMaxSpeed;
    private double trafficVolumeOn1MbeatSpeed;
    private double turboButtonCost;

    @Override
    public int compareTo(Plan o) {
        return 0;
    }
}
