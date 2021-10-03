package com.BridgeLabz;

import java.util.Random;

public class UC1_EmpAbsentPresent {
    public static void main(String[] args) {
        int present = 1;
        Random attend = new Random();
        for(int day=1; day<=5; day++) {
            int check = attend.nextInt(2);
            System.out.println(check);
            if(check== present) {
                System.out.println("Emploee is Present" +day);
            }
            else {
                System.out.println("Employee is Absent" +day);
            }
        }
    }

}
