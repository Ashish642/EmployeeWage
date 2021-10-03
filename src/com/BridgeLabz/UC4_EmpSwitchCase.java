package com.BridgeLabz;
import java.util.Random;


public class UC4_EmpSwitchCase {
    public static void main(String[] args) {
        // TODO Auto-genrated method stub

        int dailyWage = 0;
        int empWagePerHr = 20;
        int fullDayHr = 8;
        int partTimeHr = 4;
        int partTimeWage = 0;
        Random attend = new Random();
        for(int day =1; day<=20; day++) {
            int check = attend.nextInt(3);
            switch (check) {
                case 1:
                    dailyWage = dailyWage + empWagePerHr*fullDayHr;
                    System.out.println(check+":" + "Day" +day+ "Employee is present earning is" + empWagePerHr*fullDayHr );
                case 2:
                    partTimeWage = partTimeWage + empWagePerHr*partTimeHr;
                    System.out.println(check+":" + "Day" +day+ "Employee is part time earning is:" + empWagePerHr*partTimeHr);
                case 0:
                    System.out.println(check+":" + "Day" +day+ "Employee is Absent");

            }
        }
        System.out.println("Employee wage for the month is:" + (dailyWage+partTimeWage));
    }

}
