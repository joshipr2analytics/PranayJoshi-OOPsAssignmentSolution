package com.greatlearning.main;


import com.greatlearning.subClass.*;

public class Main {
    public static void main(String[] args) {
        HrDepartment hd = new HrDepartment();
        TechDepartment td = new TechDepartment();
        AdminDepartment ad = new AdminDepartment();
        
        String a_departmentName = ad.departmentName();
        String a_gettodaysWork = ad.getTodaysWork();
        String a_getworkDeadline = ad.getWorkDeadline();
        String a_istodayaHoliday = ad.isTodayAHoliday();

        System.out.println("Welcome to "+ a_departmentName);
        System.out.println(a_gettodaysWork);
        System.out.println(a_getworkDeadline);
        System.out.println(a_istodayaHoliday);
        System.out.println(  );

        String h_departmentName = hd.departmentName();
        String h_gettodaysWork = hd.getTodaysWork();
        String h_getworkDeadline = hd.getWorkDeadline();
        String h_doActivity = hd.doActivity();
        String h_istodayaHoliday = hd.isTodayAHoliday();
        
        System.out.println("Welcome to "+h_departmentName);
        System.out.println(h_gettodaysWork);
        System.out.println(h_getworkDeadline);
        System.out.println(h_doActivity);
        System.out.println(h_istodayaHoliday);
        System.out.println(  );

        String t_departmentName = td.departmentName();
        String t_gettodaysWork = td.getTodaysWork();
        String t_getworkDeadline = td.getWorkDeadline();
        String t_StackInformation = td.getTechStackInformation();
        String t_istodayaHoliday = hd.isTodayAHoliday();

        System.out.println("Welcome to "+t_departmentName);
        System.out.println(t_gettodaysWork);
        System.out.println(t_getworkDeadline);
        System.out.println(t_StackInformation);
        System.out.println(t_istodayaHoliday);

    }

    
} 