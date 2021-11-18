package com.example.designPattern.builderPattern.after;

import com.example.designPattern.builderPattern.before.DetailPlan;
import com.example.designPattern.builderPattern.before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;

public class DefaultTourBuilder implements TourPlanBuilder{
//    private String title;
//    private int nights;
//    private int days;
//    private LocalDate startDate;
//    private String whereToStay;
//    private List<DetailPlan> plans;

    private TourPlan tourPlan;
    public TourPlanBuilder newInstance(){
        this. tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }
    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;
    }
    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }
    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }
    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.tourPlan.getPlans() == null)
            this.tourPlan.setPlans(new ArrayList<>());
        this.tourPlan.getPlans().add(new DetailPlan(day, plan));
        return this;
    }
    @Override
    public TourPlan getPlan() {
        return this.tourPlan;
    }
//    @Override
//    public TourPlanBuilder title(String title) {
//        this.title = title;
//        return this;
//    }
//    @Override
//    public TourPlanBuilder nightAndDays(int nights, int days) {
//        this.nights = nights;
//        this.days = days;
//        return this;
//    }
//    @Override
//    public TourPlanBuilder startDate(LocalDate startDate) {
//        this.startDate = startDate;
//        return this;
//    }
//    @Override
//    public TourPlanBuilder whereToStay(String whereToStay) {
//        this.whereToStay = whereToStay;
//        return this;
//    }
//    @Override
//    public TourPlanBuilder addPlan(int day, String plan) {
//        if (this.plans == null)
//            this.plans = new ArrayList<>();
//
//        this.plans.add(new DetailPlan(day, plan));
//        return this;
//    }
//    @Override
//    public TourPlan getPlan() {
//        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
//    }
}
