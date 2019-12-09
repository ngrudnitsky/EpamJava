package by.it.nickgrudnitsky.project.service;

import by.it.nickgrudnitsky.project.entities.Plan;

import java.io.File;
import java.util.List;

public interface PlanService {

    void readPlans(File file);

    int countSubscribers();

    List<Plan> getAll();

    List<Plan> sortBySubscriptionFee();

    List<Plan> sortByMinutesOnCall();

    List<Plan> sortByInternetTraffic();

    List<Plan> sortByRoumingPrice();
}
