package ro.fasttrackit.curs14.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaySchedule mySchedule = new DaySchedule(Day.MONDAY);
       List<String> act = mySchedule.getActivities();
        System.out.println();
        act.add("Hackermann");
        System.out.println(mySchedule.getActivities());
        System.out.println(act);
        mySchedule.addActivity("running");
        System.out.println(mySchedule.getActivities());

        WeeklyPlanner planer=new WeeklyPlanner();
        planer.addActivity(Day.THURSDAY,"Course");
        planer.addActivity(Day.THURSDAY,"Food");
        System.out.println(planer.getDaySchedule(Day.THURSDAY));

        planer.addActivity(Day.THURSDAY, "inot");
        planer.addActivity(Day.THURSDAY, "chitara");
        System.out.println(planer.getDaySchedule(Day.THURSDAY));
        planer.removeActivity(Day.THURSDAY, "inot");
        System.out.println(planer.getDaySchedule(Day.THURSDAY));
//		planer.removeActivity(Day.THURSDAY, "crosetat");
        System.out.println(planer.getDaySchedule(Day.THURSDAY));

        try {
            System.out.println(planer.endPlanning());
        } catch (NoActivitiesForDayException er) {
            System.err.println(er.getMessage());
        }
    }
}
