package com.Abduvaliev;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class Reminder {
    private ArrayList<String> reminders = new ArrayList<String>();

    public void setUp () {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to My Reminders");
        System.out.println("Choose one of the options below");
        System.out.println();
        System.out.println("1: Add reminder");
        System.out.println("2: Show reminders");
        System.out.println("3: Modify a reminder");
        System.out.println("4: Delete a reminder");
        System.out.println("5: Clear all reminders");
        System.out.println("6: Quit");
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("================================");
                    addReminder();
                    System.out.println("================================");
                    break;
                case 2:
                    System.out.println("================================");
                    showReminders();
                    System.out.println("================================");
                    break;
                case 3:
                    System.out.println("================================");
                    modReminder();
                    System.out.println("================================");
                    break;
                case 4:
                    System.out.println("================================");
                    delReminder();
                    System.out.println("================================");
                    break;
                case 5:
                    System.out.println("================================");
                    clearAllReminders();
                    System.out.println("All reminders cleared");
                    System.out.println("================================");
                    break;
                case 6:
                    System.out.println("================================");
                    break;
                default:
                    System.out.println("Error. Choose a number from 1 through 6");
            }
        } while (choice != 6);
        System.out.println("This is your reminder for the day: ");
        System.out.println();
        showReminders();
    }

    // create a addReminder method
    private void addReminder () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type S to stop adding reminders");
        String addRem;
        do {
            System.out.println("Type in your reminder: ");
            addRem = scanner.nextLine();
            reminders.add(addRem);
            if (addRem.equals("S")) {
                break;
            }
        } while (1 != 0);
        reminders.remove(reminders.size()-1);
    }

    private void showReminders () {
        for (String reminder : reminders) {
            System.out.println(reminder + "\n");
        }
    }

    // create a modReminder method
    // not fully functional
    private void modReminder () {
        Scanner scanner = new Scanner(System.in);
        showReminders();
        System.out.println("Enter the index for the reminder to be modified: ");
        int index = scanner.nextInt();
        System.out.println("Type in your reminder to be replaced: ");
        String reminder = scanner.nextLine();
        reminders.set(index - 1, reminder);
    }

    // create a delReminder method
    private void delReminder () {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        showReminders();
        System.out.println("Enter in an index of the reminder you want to remove: ");
        int delRem = scanner.nextInt();
        reminders.remove(delRem - 1);
    }

    // create a clearReminder method
    private void clearAllReminders () {
        reminders.clear();
    }
}
