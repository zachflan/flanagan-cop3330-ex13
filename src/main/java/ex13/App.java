/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex13;

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {

        Scanner principle = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String principleS = principle.nextLine();
        double principleD = Double.parseDouble(principleS);

        Scanner roi = new Scanner(System.in);
        System.out.print("Enter the rate of interest: ");
        String roiS = roi.nextLine();
        double roiD = Double.parseDouble(roiS);
        double percentRoid = roiD / 100;

        Scanner years = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        String yearsS = years.nextLine();
        double yearsI = Double.parseDouble(yearsS);

        Scanner compoundsYear = new Scanner(System.in);
        System.out.print("What is the number of times the interest is compounded per year? ");
        String compoundsYearS = compoundsYear.nextLine();
        int compoundsYearI = Integer.parseInt(compoundsYearS);

        double interest = principleD * Math.pow(1 + (percentRoid / compoundsYearI), (compoundsYearI * yearsI));

//        System.out.format("After %f years at %.2f%%, the investment will be worth $%.2f.", yearsI, roiD, interest);
        System.out.format("$%.2f invested at %.2f%% for %.0f years compounded %d times per year is $%.2f", principleD, roiD, yearsI, compoundsYearI, interest);
    }
}