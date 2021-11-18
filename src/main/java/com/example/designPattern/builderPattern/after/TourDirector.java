package com.example.designPattern.builderPattern.after;

import com.example.designPattern.builderPattern.before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip(){
        return tourPlanBuilder.title("베를린여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2024, 2, 23))
                .whereToStay("호텔")
                .addPlan(0, "체크인하기")
                .addPlan(1, "카페가기")
                .addPlan(2, "도시구경")
                .getPlan();
    }

    public TourPlan lotteWorldTrip(){
        return tourPlanBuilder.title("롯데월드")
                .startDate(LocalDate.of(2024, 2, 23))
                .getPlan();
    }
}
