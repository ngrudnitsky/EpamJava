package by.it.nickgrudnitsky.project.entities;

public class CellularPlan extends Plan {

    private int minutesOnCall;
    private double outgoingCallsPrice;
    private double roamingCallPrice;
    private double outgoingInternetPrice;
    private double mobileHotspot;
    private double mtsTvTraffic;
    private double sms;

    public int getMinutesOnCall() {
        return minutesOnCall;
    }

    public void setMinutesOnCall(int minutesOnCall) {
        this.minutesOnCall = minutesOnCall;
    }

    public double getOutgoingCallsPrice() {
        return outgoingCallsPrice;
    }

    public void setOutgoingCallsPrice(double outgoingCallsPrice) {
        this.outgoingCallsPrice = outgoingCallsPrice;
    }

    public double getRoamingCallPrice() {
        return roamingCallPrice;
    }

    public void setRoamingCallPrice(double roamingCallPrice) {
        this.roamingCallPrice = roamingCallPrice;
    }

    public double getOutgoingInternetPrice() {
        return outgoingInternetPrice;
    }

    public void setOutgoingInternetPrice(double outgoingInternetPrice) {
        this.outgoingInternetPrice = outgoingInternetPrice;
    }

    public double getMobileHotspot() {
        return mobileHotspot;
    }

    public void setMobileHotspot(double mobileHotspot) {
        this.mobileHotspot = mobileHotspot;
    }

    public double getMtsTvTraffic() {
        return mtsTvTraffic;
    }

    public void setMtsTvTraffic(double mtsTvTraffic) {
        this.mtsTvTraffic = mtsTvTraffic;
    }

    public double getSms() {
        return sms;
    }

    public void setSms(double sms) {
        this.sms = sms;
    }

    @Override
    public String toString() {
        return this.getName() +
//                "\nМинут на звонки " + minutesOnCall +
//                "\nСтоимость звонка " + outgoingCallsPrice +
//                "\nСтоимость роуминга " + roamingCallPrice +
                "\nВключено интернет трафика " + this.getVolumeOfInternetTraffic() +
//                "\nСтоимость звонка сверх трафика " + outgoingInternetPrice +
//                "\nИнтернета в режиме модема " + mobileHotspot +
//                "\nТрафика на мтс тв " + mtsTvTraffic +
//                "\nsms " + sms +
                "\nплата " + this.getSubscriptionFee()+ "\n";
    }

    @Override
    public int compareTo(Plan o) {  //сортировка по умолчанию (в алфавитном порядке)
        return this.getName().compareTo(o.getName());
    }
}
