package com.example.designPattern.builderPattern.before;

import java.time.LocalDate;

public class App {
    // shortPlan을 세팅이 어떤 값을 강제하고 싶어도 그렇게 할 수 없다. (가령 setNights를 한다면, setDays를 한다던지)
    // 하여 만약 생성자로 강제한다고 해도 생성자가 지나치게 길어진다. 또한 인스턴스마다 생성자가 다르므로 다양한 생성자를 만들어야 한다.
    // 하여 사용자는 어떤 때에 어떤 사용자를 사용해야 하는지 어렵다.
    // 이때 빌더 패턴을 적용한다면,

    public static void main(String[] args) {

        //당일치기 여행
        TourPlan shortPlan = new TourPlan();
        shortPlan.setTitle("오레곤 롱비치 여행");
        shortPlan.setStartDate(LocalDate.of(2021, 7, 15));

        //2박3일 여행
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");
    }
}
