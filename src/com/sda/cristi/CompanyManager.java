package com.sda.cristi;

public class CompanyManager extends CompanyEmployees implements WorkSchedule {

    private boolean itHasExperience;
    private String heldFunction;

    public CompanyManager() {
      super();

    }

    @Override
    public void workSchedule() {

    }

    @Override
    public int work(String start, String end) {
        return 0;
    }


    @Override
    public void workingHolidays() {


    }

}