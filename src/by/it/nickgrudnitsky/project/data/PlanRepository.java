package by.it.nickgrudnitsky.project.data;

import by.it.nickgrudnitsky.project.entities.Plan;

import java.io.File;
import java.util.List;

//Объект, который работает со всей базой тарифных планов (замена базы данных)


public class PlanRepository {
    private List<Plan> plans;
    private File file = new File(System.getProperty("user.dir"), "by/it/nickgrudnitsky/project/resources/plansList.txt");

    public PlanRepository(List<Plan> plans) {
        this.plans = plans;
    }

    public List<Plan> getPlans() {
        return plans;
    }
}
