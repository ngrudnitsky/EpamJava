package by.it.nickgrudnitsky.project.entities;

public class CellularPlan extends Plan {

    private int minutesOnCall;
    private double outgoingCallsPrice;
    private double roumingCallPrice;
    private double volumeOfInternetTraffic;
    private double outgoingInterntPrice;
    private double mobileHotspot;
    private double mtsTvTraffic;

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

    public double getRoumingCallPrice() {
        return roumingCallPrice;
    }

    public void setRoumingCallPrice(double roumingCallPrice) {
        this.roumingCallPrice = roumingCallPrice;
    }

    public double getVolumeOfInternetTraffic() {
        return volumeOfInternetTraffic;
    }

    public void setVolumeOfInternetTraffic(double volumeOfInternetTraffic) {
        this.volumeOfInternetTraffic = volumeOfInternetTraffic;
    }

    public double getOutgoingInterntPrice() {
        return outgoingInterntPrice;
    }

    public void setOutgoingInterntPrice(double outgoingInterntPrice) {
        this.outgoingInterntPrice = outgoingInterntPrice;
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

    private double sms;

}
