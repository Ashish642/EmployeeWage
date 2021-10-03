package com.BridgeLabz;
import java.util.Random;

public class UC3_EmpPartTime {
    public static void main(String[] args) {
      //  TODO AUTO-genrated method stub
        int Present = 1;
        int PartTime = 2;
        int DailyWage = 0;
        int EmpWagePerHr = 20;
        int FullDayHr = 8;
        int PartTimeHr = 4;
        int PartTimeWage = 0;
        Random attend = new Random();

        for(int day=1; day<=10; day++) {
            int check = attend.nextInt(3);
            if(check ==Present) {
                DailyWage = DailyWage + EmpWagePerHr*FullDayHr;
                System.out.println(check+":" + "Day" +day+ "Employee is present earning is:" +EmpWagePerHr*FullDayHr);
            }
            else if(check ==PartTime) {
                PartTimeWage = PartTimeWage + EmpWagePerHr*PartTimeHr;
                System.out.println(check+":" + "Day" +day+ "Empoyee is Part time earning is:" +EmpWagePerHr*PartTimeHr);
            }
            else {
                System.out.println(check+":" + "Day" +day+ "Employee is Absent");
            }
        }
    }
}
