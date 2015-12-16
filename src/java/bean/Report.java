/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;

/**
 *
 * @author Nizul Zaim
 */
public class Report {
    public static ArrayList<User> allUser = User.getAllClient();
    public static ArrayList<Package> allPackage = Package.allPackage();
    public static ArrayList<Transaction> allTransaction= Transaction.getAllTransaction();

    public static int getTotalUser() {
        return allUser.size();
    }
    
    public static int getTotalPackage() {
        return allPackage.size();
    }
    
    public static int getTotalOrder() {
        return allTransaction.size();
    }
    
    public static int totalSuccessOrder() {
        int count = 0;
        for(int i = 0; i< allTransaction.size(); i++) {
            if (allTransaction.get(i).getNumericStatus() == 2) {
                count++;
            }
        }
        
        return count;
    }
    
    public static int totalPendingOrder() {
        int count = 0;
        for(int i = 0; i< allTransaction.size(); i++) {
            if (allTransaction.get(i).getNumericStatus() == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    public static double getTotalSales() {
        double count = 0;
        for(int i = 0; i< allTransaction.size(); i++) {
            if (allTransaction.get(i).getNumericStatus() == 2) {
                count += allTransaction.get(i).getTotalPrice();
            }
        }
        return count;
    }
}
