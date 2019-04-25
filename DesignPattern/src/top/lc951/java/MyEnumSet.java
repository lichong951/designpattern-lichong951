package top.lc951.java;

import java.util.*;

public class MyEnumSet {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

    }

    static class Worker {
        String name;
        Set<Day> availableDays;

        public Worker(String name, Set<Day> availableDays) {
            this.name = name;
            this.availableDays = availableDays;
        } //省略 getter 方法 }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<Day> getAvailableDays() {
            return availableDays;
        }

        public void setAvailableDays(Set<Day> availableDays) {
            this.availableDays = availableDays;
        }
    }

    //·有没有 哪天 一个 人都 不会 来？
// ·有 哪些 天 至少 会有 一个人 来？
// ·有 哪些 天 至少 会有 两 个人 来？
// ·有 哪些 天 所有人 都会 来， 以便 开会？
// ·哪些 人 周 一 和 周 二 都会 来？
    public static void main(String[] args) {
        Worker[] workers = new Worker[]{
                new Worker(" 张三", EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.FRIDAY))
                , new Worker(" 李四", EnumSet.of(Day.TUESDAY, Day.THURSDAY, Day.SATURDAY))
                , new Worker(" 王 五", EnumSet.of(Day.TUESDAY, Day.THURSDAY)),};
        whichDayNoOne(workers);
        whichDaysLessOne(workers);


        System.out.println("有 哪些 天 所有人 都会 来？【交集】");
        Set<Day> days = EnumSet.allOf(Day.class);
        for (Worker w : workers) {
            days.retainAll(w.getAvailableDays());
        }
        System.out.println(days);

//        哪些 人 周 一 和 周 二 都会 来？
        System.out.println("哪些 人 周 一 和 周 二 都会 来？[]");
        Set<Worker> availableWorkers = new HashSet<Worker>();
        for (Worker w : workers) {
            if (w.getAvailableDays().containsAll(EnumSet.of(Day.MONDAY, Day.TUESDAY))) {
                availableWorkers.add(w);
            }
        }
        for (Worker w : availableWorkers) {
            System.out.println(w.getName());
        }

        System.out.println("哪些 天 至少 会有 两 个人 来？");
        Map<Day, Integer> countMap = new EnumMap<>(Day.class);
        for (Worker w : workers) {
            for (Day d : w.getAvailableDays()) {
                Integer count = countMap.get(d);
                countMap.put(d, count == null ? 1 : count + 1);
            }
        }

        Set<Day> days1 = EnumSet.noneOf(Day.class);
        for (Map.Entry<Day, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= 2) {
                days1.add(entry.getKey());
            }
        }
        System.out.println(days1);
    }


    private static void whichDaysLessOne(Worker[] workers) {
        //        有 哪些 天 至少 会有 一个人 来？
        System.out.println("有 哪些 天 至少 会有 一个人 来？【并集】");
        Set<Day> days = EnumSet.noneOf(Day.class);
        for (Worker w : workers) {
            days.addAll(w.getAvailableDays());
        }
        System.out.println(days);
    }

    private static void whichDayNoOne(Worker[] workers) {
        //哪些 天 一个 人都 不会 来？
        System.out.println("哪些 天 一个 人都 不会 来？[并集的补集]");
        Set<Day> days = EnumSet.allOf(Day.class);
        for (Worker w : workers) {
            days.removeAll(w.getAvailableDays());
        }
        System.out.println(days);
    }
}