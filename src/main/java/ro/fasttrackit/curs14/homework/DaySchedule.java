package ro.fasttrackit.curs14.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final Day day;
    private final List<String> activities;

    public DaySchedule(Day day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public Day getDay() {
        return day;
    }

    public List<String> getActivities() {
        return new ArrayList<>(activities);
    }

    public void addActivity(String activity){
        activities.add(activity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule schedule = (DaySchedule) o;
        return day == schedule.day && Objects.equals(activities, schedule.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }

    public boolean containsActivity(String activity) {
        return activities.contains(activity);
    }
}

