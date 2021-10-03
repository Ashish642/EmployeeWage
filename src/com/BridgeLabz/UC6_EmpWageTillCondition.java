package com.BridgeLabz;
import java.util.Random;

public class UC6_EmpWageTillCondition {
    public static void main(String[] args){
        // TODO Auto-genrated method stub
        int present = 1;
        int partTime = 2;
        int dailyWage = 0;
        int empWagePerHr = 20;
        int fullDayHr = 8;
        int partTimeHr = 4;
        int partTimeWage =0;
        Random attend = new Random();
        for(int day=1; day<=20; day++){
            int check = attend.nextInt(3);

            if(check == present) {
                dailyWage = dailyWage + empWagePerHr*fullDayHr;
                System.out.println(check+":" + "Day" + day+ "Emlpoyee is present and earning is" +empWagePerHr*fullDayHr);
            }
            else if(check == partTime) {
                partTimeWage = partTimeWage + empWagePerHr*partTimeHr;
                System.out.println(check+ ":" + "Day" + day+ "Employee is present and doing part time earning is" +empWagePerHr*partTimeHr);

            }
            else {
                System.out.println(check+ ":" +"Day" +day+ "Employee is Absent");
            }
        }
        System.out.println("Employee wage for the month is :" +(dailyWage+partTime));
    }
}



