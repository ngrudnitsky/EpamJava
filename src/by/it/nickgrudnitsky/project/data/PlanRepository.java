package by.it.nickgrudnitsky.project.data;

import by.it.nickgrudnitsky.project.entities.CellularPlan;
import by.it.nickgrudnitsky.project.entities.Plan;

import java.util.ArrayList;
import java.util.List;


//Класс, который работает со всей базой тарифных планов (замена базы данных)

public class PlanRepository {
    private List<Plan> plans = new ArrayList<>();  //тут хранятся все прочитанные тарифы

    private void addPlan(Plan plan) {
        plans.add(plan);
    } //добавление плана в базу

    public List<Plan> createPlans(List<List<String>> plansInfo){ //создание планов из входных данных

        for (List<String> planInfo : plansInfo) {

            String tariffType = planInfo.get(0);

            if (tariffType.startsWith("Тариф Мобильный")){

                CellularPlan cellularPlan = new CellularPlan();
                fillCellularPlan(cellularPlan, planInfo);
                addPlan(cellularPlan);

            }
        }
        return plans;
    }

    private void fillCellularPlan(CellularPlan cellularPlan, List<String> planInfo){
        cellularPlan.setName(planInfo.get(0));
        cellularPlan.setVolumeOfInternetTraffic(Double.valueOf(planInfo.get(1)));
        cellularPlan.setOutgoingInternetPrice(Double.valueOf(planInfo.get(2)));
        cellularPlan.setMobileHotspot(Double.valueOf(planInfo.get(3)));
        cellularPlan.setMinutesOnCall(Integer.valueOf(planInfo.get(4)));
        cellularPlan.setOutgoingCallsPrice(Double.valueOf(planInfo.get(5)));
        cellularPlan.setRoamingCallPrice(Double.valueOf(planInfo.get(6)));
        cellularPlan.setSms(Double.valueOf(planInfo.get(7)));
        cellularPlan.setMtsTvTraffic(Double.valueOf(planInfo.get(8)));
        cellularPlan.setSubscriptionFee(Double.valueOf(planInfo.get(9)));
        cellularPlan.setConnectionPrice(Double.valueOf(planInfo.get(10)));
        cellularPlan.setConnectedSubscribers(Integer.valueOf(planInfo.get(11)));

    }

    public List<Plan> getPlans() {
        return plans;
    }
}
