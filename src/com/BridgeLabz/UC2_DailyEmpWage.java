package com.BridgeLabz;
import java.util.Random;

public class UC2_DailyEmpWage {
    public static void main(String[] args) {
        // TODO Auto-genrated method stub
        int present = 1;
        int empWagePerHr = 20;
        int fullDayHr = 8;
        Random attend = new Random();
        for(int day=1; day<=5;day++) {
            int chek = attend.nextInt(2);
            if(chek == present) {

                System.out.println(chek+ ":" + "Day" + day+ "Employee is present and earning is; " +empWagePerHr*fullDayHr);

            }
            else
                System.out.println(chek +":" + "Day" + day+ "Employee is Absent and earnig is: " );
            }
        }

    }


