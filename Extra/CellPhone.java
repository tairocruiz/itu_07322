/*Write a Java program that computes a customer’s monthly cell phone bill given the number of minutes
used. The program should take in two integer command-line arguments—one for the number of peak
minutes used, and one for the number of weekend and night minutes used. Each customer pays
TSh.10000/= a month, which includes 400 peak minutes and 750 weekend and night minutes. The price
for going over the allotted time is TSh.150/= per minute for both peak and weekend/night calls.*/

import java.util.Scanner;
import java.text.NumberFormat;

public class CellPhone{
   
    // 1 min = 8.695652
    private int  peakMin;
    private int  nightMin;
    private double package_bill = 10000.00;
    
    public CellPhone(int pMin, int nMin)
    {
        this.peakMin = pMin;
        this.nightMin = nMin;
    }

   
    public double getBill(){
        if(peakMin > 400 || nightMin > 750){
            if(peakMin > 400){
                this.package_bill += (peakMin-400)*150;
            }
            if(nightMin > 750){
                this.package_bill += (nightMin-750)*150;
            }
        }
        
        return this.package_bill;
    }

    public static void main(String[] args)   
    {  
        int dayCall, nightCall;
        double matumizi;
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter peak Min : ");
            dayCall = input.nextInt();
            System.out.print("Enter Night Min : ");
            nightCall = input.nextInt();
        }
        CellPhone objcPhone = new CellPhone(dayCall, nightCall);
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        matumizi = objcPhone.getBill();

        System.out.print("The Monthly phone call bill is : " + defaultFormat.format(matumizi) + "/=");
        
    }  
}