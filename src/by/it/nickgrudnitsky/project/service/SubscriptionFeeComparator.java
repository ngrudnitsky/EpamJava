package by.it.nickgrudnitsky.project.service;

import by.it.nickgrudnitsky.project.entities.Plan;

import java.util.Comparator;

public class SubscriptionFeeComparator implements Comparator<Plan> {

    @Override
    public int compare(Plan o1, Plan o2) {
        return Double.compare(o1.getSubscriptionFee(), o2.getSubscriptionFee());
    }

}
