package com.sda.cristi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppManager {
    public List<CompanyEmployees> employeesList;
    public List<CompanyManager> managerList;

  CompanyEmployees companyEmployees = new CompanyEmployees();


    public void menu() {

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add employee.");
        System.out.println("2. Edit employee.");
        System.out.println("3. Remove employee.");
        System.out.println("4. List employee.");
        System.out.println("5. Exit");
        System.out.println("Please choose one option [1-5]: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addEmployee();
                break;
            case 2:
                editEmployee();
                break;
            case 3:
                removeEmployee();
                break;
            case 4:
                selectEmployee();
                break;
            case 5:
                System.out.println("Exit system");
                flag = false;
                break;
            default:
                System.out.println("Error input");
        }

    }
    public  void addEmployee(){

        List<CompanyEmployees> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            System.out.println("Enter employee name you want  to add:(Quit to exit)");
            String name = scanner.next();


            if ( name.equalsIgnoreCase("Quit")){
                break;
            }
            System.out.println("Enter ID  you want to assign to new employee ");
            int ID = scanner.nextInt();
            CompanyEmployees employee = new CompanyEmployees();
            employees.add(employee);

        }
        for ( CompanyEmployees e: employees ) {
            System.out.println( " name: " + e.getName() +  "\nID: " + e.getId());
        }

    }

    public void listEmployee() {

        this.employeesList = new ArrayList<>();
        System.out.println("Employees List: ");

        CompanyEmployees companyEmployees = new CompanyEmployees();
        CompanyEmployees companyEmployees1 = new CompanyEmployees();
        CompanyEmployees companyEmployees2 = new CompanyEmployees();
        CompanyEmployees companyEmployees3 = new CompanyEmployees();
        employeesList.add(companyEmployees);
        System.out.println(companyEmployees.toString());
        System.out.println(companyEmployees1.toString());
        System.out.println(companyEmployees2.toString());
        System.out.println(companyEmployees3.toString());
        System.out.println("---------------------------");


    }

    public void editEmployee() {



    }

    public void removeEmployee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");


    }

    public void selectEmployee() {

    }

    public void addManager() {
        this.managerList = new ArrayList<>();
        System.out.println("Manager List: ");
        CompanyManager companyManager = new CompanyManager();
        managerList.add(companyManager);
        System.out.println(companyManager.toString());
    }

}





