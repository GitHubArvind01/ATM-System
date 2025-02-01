package myOwnFrame;
import java.util.*;

public class application {
    static int amountMoney = 10000;
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("______________Welcome to the ATM______________");
        System.out.println("----------------------------------------------");
        
        System.out.println("\n"+"Select the Option:");
        System.out.println("----------------------------------------------");
        System.out.println("1-Cash Withdrawal          2-Blance Enquary");
        System.out.println("3-Change ATM PIN           4-Mini Statement");
        System.out.println("5-Exit");
        System.out.println("----------------------------------------------");

        //option input
        int Option = sc.nextInt();

        //This will check to give option are correct or not 
        while(true){
             if(Option==1 || Option==2 || Option==3 || Option==4 || Option==5){
                break;
            }else{
                System.out.println("Please Enter Correct Option______?");
                Option = sc.nextInt();
            }
        }
       
        //switch case handle the option class case
        switch (Option) {
            case 1:
                //calling Cash_Withdrawal function
                Cash_Withdrawal();
                break;
            case 2:
                //calling Blance_Enquary function
                Blance_Enquary();
                break;
            case 3:
                //calling Change_ATM_PIN function
                Change_ATM_PIN();
                break;
            case 4:
                //calling Mini_Statement function
                Mini_Statement();
                break;
            case 5:
                //calling Exit function
                Exit();
                break;
            default:
                break;
        }

    }

    // Here the CashWithdrawal function
    public static void Cash_Withdrawal(){
        try (//here code will update
        Scanner sc = new Scanner(System.in)) {
            System.out.println("----------------------------------------------");
            System.out.println("Enter your ATM number:");
            String atmNumber = sc.nextLine();
            @SuppressWarnings("unused")
            String New_atmNumber = checkNum(atmNumber);
           
            System.out.println("----------------------------------------------");
            System.out.println("Enter your PIN:");
            int atmPIN = sc.nextInt();
            @SuppressWarnings("unused")
            int New_atmPIN = checkPIN(atmPIN);
            
            
            //How much money you want to withdrawal
            System.out.println("----------------------------------------------");
            System.out.println("Enter Withdrawal Amount:");
            int enterdAmount = sc.nextInt();
            if(enterdAmount>amountMoney){
                System.out.println("Insufficient Balance! try again?");
            }
            else if(enterdAmount<=amountMoney){
                System.out.println((enterdAmount)+" Withdrawn Successfully!");
                System.out.println("Balance Amount: " + (amountMoney-enterdAmount));
            }
        }
    }


    // Here the Blance_Enquary function
    public static void Blance_Enquary(){
        //here code will update
        try (//here code will update
        Scanner sc = new Scanner(System.in)) {
            System.out.println("----------------------------------------------");
            System.out.println("Enter your ATM number:");
            String atmNumber = sc.nextLine();
            @SuppressWarnings("unused")
            String New_atmNumber = checkNum(atmNumber);

            System.out.println("----------------------------------------------");
            System.out.println("Enter your PIN:");
            int atmPIN = sc.nextInt();
            @SuppressWarnings("unused")
            int New_atmPIN = checkPIN(atmPIN);
            System.out.println("Balance Amount: " + amountMoney);
        }
    }


    // // Here the Change_ATM_PIN function
    public static void Change_ATM_PIN(){
        //here code will update
        try (//here code will update
        Scanner sc = new Scanner(System.in)) {
            System.out.println("----------------------------------------------");
            System.out.println("Enter your ATM number:");
            String atmNumber = sc.nextLine();
            @SuppressWarnings("unused")
            String New_atmNumber = checkNum(atmNumber);

            System.out.println("----------------------------------------------");
            System.out.println("Enter your Old PIN:");
            int atmPIN = sc.nextInt();
            @SuppressWarnings("unused")
            int New_atmPIN = checkPIN(atmPIN);
            
            System.out.println("_________________Enter New PIN________________");
            int newPINx = sc.nextInt();
            System.out.println("_____________Enter Again New PIN______________");
            int newPINy = sc.nextInt();
            //This will handle the wrong new pin match case
            while(true){
                if(newPINx==newPINy){
                    break;
                }
                System.out.println("PIN Not Match!");
                System.out.println("?________________Enter New PIN_______________?");
                newPINx = sc.nextInt();
                System.out.println("?____________Enter Again New PIN_____________?");
                newPINy = sc.nextInt();
            }
            System.out.println("PIN Changed successfully!");
        }
    }


     // Here the Mini_Statement function
    public static void Mini_Statement(){
        //here code will update
        try (//here code will update
        Scanner sc = new Scanner(System.in)) {
            System.out.println("----------------------------------------------");
            System.out.println("Enter your ATM number:");
            String atmNumber = sc.nextLine();
            @SuppressWarnings("unused")
            String New_atmNumber = checkNum(atmNumber);

            System.out.println("----------------------------------------------");
            System.out.println("Enter your PIN:");
            int atmPIN = sc.nextInt();
            @SuppressWarnings("unused")
            int New_atmPIN = checkPIN(atmPIN);
            

            // Its print the User Statement 
            System.out.println("----------------------------------");
            System.out.println("|        Name : Alex Devid       |");
            System.out.println("|        Amount: 1,500/-         |");
            System.out.println("|      Transaction Details       |");
            System.out.println("| Date                    Amount |");
            System.out.println("|--------------------------------|");
            System.out.println("| 2025-02-01              1,200/-|");
            System.out.println("| 2025-02-02              300/-  |");
            System.out.println("| 2025-02-03              500/-  |");
            System.out.println("|--------------------------------|");

        }
    }


     // Here the Exit function
    public static void Exit(){
        //here code will update
        System.out.println("Thankyou!");
    }




    // This function check the ATM Number is case like : 
    //12 digit or not, in future it check throw the data base
    public static String checkNum( String atmNumber){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (atmNumber.length() == 12) {
                break;
            } else {
                System.out.println("!OOPs: Please Enter 12 digit ATM Number");
                atmNumber = sc.nextLine();
            }
        }
        return atmNumber;
    }


     // This function check the ATM PIN Number is case like : 
    //4 digit or not, in future it check throw the data base
    public static int checkPIN(int pin){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
            // Loop to ensure the PIN is 4 digits
            while (true) {
                String pinLen = String.valueOf(pin);
                if (pinLen.length() == 4) { 
                    break;
                } else {
                    System.out.println("!OOPs: Please Enter 4 digit ATM PIN");
                    pin = sc.nextInt(); 
                }
            }
            return pin;
    }
}
