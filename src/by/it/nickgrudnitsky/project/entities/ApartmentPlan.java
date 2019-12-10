package by.it.nickgrudnitsky.project.entities;

//тарифы для квартиры
public class ApartmentPlan extends HomePlan {

    private int accessSpeed;

    public int getAccessSpeed() {
        return accessSpeed;
    }

    public void setAccessSpeed(int accessSpeed) {
        this.accessSpeed = accessSpeed;
    }

    @Override
    public int compareTo(Plan o) {  //сортировка по умолчанию (в алфавитном порядке)
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return this.getName() +
                "\nВключено интернет трафика " + this.getVolumeOfInternetTraffic() +
                "\nабонентская плата " + this.getSubscriptionFee() +
                "\n";
    }
}
