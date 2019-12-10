package by.it.nickgrudnitsky.project.service;

import by.it.nickgrudnitsky.project.data.PlanRepository;
import by.it.nickgrudnitsky.project.entities.Plan;

import java.io.*;
import java.util.List;

import static by.it.nickgrudnitsky.project.service.Parser.readPlansFromFile;

public class PlanService{

    public static void main(String[] args) {
        PlanService planService = new PlanService();
        planService.readPlans(new File("src/by/it/nickgrudnitsky/project/resources/plansList.txt"));
        System.out.println(planService.getAll());
    }

    private PlanRepository planRepository = new PlanRepository();

    //Чтени входных данных из файла
    //Метод читает файл и создает планы в репозитории
    private List<Plan> readPlans(File file) {
        return planRepository.createPlans(readPlansFromFile(file));
    }

    //Подсчет общего числа клиентов (условие задания)
    private int countSubscribers() {

        int subscribersAmount = 0;

        for (Plan plan : planRepository.getPlans()) {
            subscribersAmount += plan.getConnectedSubscribers();
        }
        return subscribersAmount;
    }

    private List<Plan> getAll() {
        return planRepository.getPlans();
    }

    private List<Plan> sortBySubscriptionFee() {  //сортировка тарифов по абонентской плате
        List<Plan> plans = planRepository.getPlans();
        plans.sort(new SubscriptionFeeComparator());
        return plans;
    }

    private List<Plan> sortByInternetTraffic() { //сортировка тарифов по включенному интернет трафику
        List<Plan> plans = planRepository.getPlans();
        plans.sort(new InternetTrafficComparator().reversed());
        return plans;
    }

    private List<Plan> sortByInternetTrafficAndFee() { //сортировка тарифов по включенному интернет трафику
        List<Plan> plans = planRepository.getPlans();  //и абонентской плате
        plans.sort(new InternetTrafficComparator().thenComparing(new SubscriptionFeeComparator()));
        return plans;
    }

}
