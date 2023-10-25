package com.gradedproject.q1;

class SuperDepartment {
    public String departmentName() {
        return "Super Department";
    }

    public String getTodaysWork() {
        return "No Work as of now";
    }

    public String getWorkDeadline() {
        return "Nil";
    }

    public String isTodayAHoliday() {
        return "Today is not a holiday";
    }
}

class AdminDepartment extends SuperDepartment {
    public String departmentName() {
        return "Admin Department";
    }

    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}

class HrDepartment extends SuperDepartment {
    public String departmentName() {
        return "HR Department";
    }

    public String getTodaysWork() {
        return "Team Lunch";
    }

    public String getWorkDeadline() {
        return "Fill today’s timesheet and mark your attendance";
    }

    public String doActivity() {
        return "Team Lunch";
    }
}

class TechDepartment extends SuperDepartment {
    public String departmentName() {
        return "Tech Department";
    }

    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }


    public static void main(String[] args) {
        AdminDepartment admin = new AdminDepartment();
        HrDepartment hr = new HrDepartment();
        TechDepartment tech = new TechDepartment();

        System.out.println("Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());

        System.out.println("Welcome to " + hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());

        System.out.println("Welcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
    }
}
