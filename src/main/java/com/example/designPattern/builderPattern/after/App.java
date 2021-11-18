package com.example.designPattern.builderPattern.after;

import com.example.designPattern.builderPattern.before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        /*  빌더를 가지고 클라이언트가 직접 만들기  */
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan cancunTour = builder.title("베를린여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2024, 2, 23))
                .whereToStay("호텔")
                .addPlan(0, "체크인하기")
                .addPlan(1, "카페가기")
                .addPlan(2, "도시구경")
                .getPlan();



        TourPlan lotteWorldTour = builder.title("롯데월드")
                                        .startDate(LocalDate.of(2024, 2, 23))
                                        .getPlan();


        /*  디렉터를 통해서 만들기  */
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTour2 = director.cancunTrip();
        TourPlan lotteWorldTour2 = director.lotteWorldTrip();
    }
}
