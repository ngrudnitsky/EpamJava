package by.it.nickgrudnitsky.project.service;

import by.it.nickgrudnitsky.project.data.PlanRepository;
import by.it.nickgrudnitsky.project.entities.Plan;

import java.io.*;
import java.util.List;

import static by.it.nickgrudnitsky.project.service.Parser.readPlansFromFile;

public class PlanService{

    private PlanRepository planRepository = new PlanRepository();

    public static void main(String[] args) {
        PlanService planService = new PlanService();
        System.out.println(planService.readPlans(new File(System.getProperty("user.dir"),
                "src/by/it/nickgrudnitsky/project/resources/plansList.txt")));
        System.out.println("Всего клиентов " + planService.countSubscribers());

    }

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
        return null;
    }

    private List<Plan> sortBySubscriptionFee() {
        return null;
    }

    private List<Plan> sortByMinutesOnCall() {
        return null;
    }

    private List<Plan> sortByInternetTraffic() {
        return null;
    }

    private List<Plan> sortByRoumingPrice() {
        return null;
    }
}
