package ro.fasttrackit.curs14.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeeklyPlanner {
    private final List<DaySchedule> daySchedule = new ArrayList<>();

    public void addActivity(Day day, String activity) {
        if (activity == null) {
            throw new NoActivityException("Activity is null");
        }
        var foundSchedule = getDaySchedule(day);
        if (foundSchedule == null) {
            foundSchedule = new DaySchedule(day);
            daySchedule.add(foundSchedule);
        }
        foundSchedule.addActivity(activity);
    }

    public DaySchedule getDaySchedule(Day day) {
        for (DaySchedule schedule : daySchedule) {
            if (schedule.getDay() == day) {
                return schedule;
            }
        }
        return null;
    }

    public void removeActivity(Day day, String activity) {
        DaySchedule daySchedule = getDaySchedule(day);
        if (daySchedule == null || !daySchedule.containsActivity(activity)) {
            throw new NoActivityException("Day " + day + " doesn't have activity");
        } else {
            daySchedule.removeActivity(activity);
        }
    }

    public List<String> getActivities(Day day) {
        DaySchedule schedule = getDaySchedule(day);
        if (schedule != null) {
            return schedule.getActivities();
        } else {
            return List.of();
        }
    }

    public Map<Day, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<Day, List<String>> result = new HashMap<>();
        for (Day day : Day.values()) {
            DaySchedule schedule = getDaySchedule(day);
            if (schedule == null || schedule.getActivities().isEmpty()) {
                throw new NoActivitiesForDayException("no activities for " + day);
            }
            result.put(schedule.getDay(), schedule.getActivities());
        }
        return result;
    }
}
