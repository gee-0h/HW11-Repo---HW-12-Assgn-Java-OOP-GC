/* This program creates a Menu program that displays different types of Data Inputs Name, Phone Number, Date of Birth, Email Address  
 * Assignment: 11
 * Name: Gio Cisneros
 * 11/14/2022
 */
import java.io.Serializable;
import java.io.*;
import java.util.Scanner;
class Information implements Serializable{
    String name;
    String phoneNum;
    String DOB;
    String emailAdd;

    public Information(String name, String phoneNum, String DOB, String emailAdd) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.DOB = DOB;
        this.emailAdd = emailAdd;
    }

    public static void printdata(Information object){

        System.out.println("Name: " + object.name);
        System.out.println("Phone Number: " + object.phoneNum);
        System.out.println("Date of Birth: " + object.DOB);
        System.out.println("Email Address: " + object.emailAdd);
    }

}

public class Serialization{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chz;

        System.out.println("Welcome! Choose from the following options? " + "\n");
        System.out.println("1. Add information into a file.");
        System.out.println("2. Retrieve information from a file and display them.");
        System.out.println("3. Delete Information");
        System.out.println("4. Update Information");
        System.out.println("5. Exit.");

        System.out.println("Input a following number from the choices");
        String fn = "Ser.txt";
        while (true) {
            
            chz = scan.nextInt();

            switch (chz) {
                case 1:
                Information obj1 = new Information("Giovanni", "847-429-0201", "06/02/2001", "giovannicisneros@lewisu.edu");
                
                try {
                    ObjectOutputStream oOs = new ObjectOutputStream(new FileOutputStream(fn));

                    oOs.writeObject(obj1);
                }
                catch (Exception e) {
                    System.out.println("File not acceptable.");
                }
                break;

                case 3:
                Information obj3 = new Information("", "", "", "");
        
                try {
                    ObjectOutputStream oOs = new ObjectOutputStream(new FileOutputStream(fn));

                    oOs.writeObject(obj3);
                }
                catch (Exception e) {
                    System.out.println("File not acceptable.");
                }
                break;
                case 4:
                Information obj4 = new Information("Michael Jordan", "224-555-2424", "02/17/1963", "mjordan@bulls.com");
        
                try {
                    ObjectOutputStream oOs = new ObjectOutputStream(new FileOutputStream(fn));

                    oOs.writeObject(obj4);
                }
                catch (Exception e) {
                    System.out.println("File not acceptable.");
                }
                break;

                case 5:
                System.out.println("Exiting Program!");
                break;
            }
        
          
        }
        
    }
}
