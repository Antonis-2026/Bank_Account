//TSIGGERIS ANTWNHS AM:604-2026

package accounttest;
import java.util.Scanner;                                                       //EISAGWGH KLASHS SCANNER APO TO PAKETO JAVA.UTIL
public class AccountTest {                                                     //ARXH THS MAIN KLASHS AccountTest

    public static void main(String[] args)                                      //ARXH THS MAIN
    {
        final int M=5;                                                          //DHLWSH STATHERAS M=5 GIA TO MEGETHOS TOU PINAKA        
        Account accounts[] = new Account[M];                                    //DHLWSH KAI ARXIKOPOIHSH PINAKA
        accounts[0] = new Account("Mike Wazowski",100);
        accounts[1] = new Account("King Julien",200);
        accounts[2] = new Account("Baby Yoda",400);
        accounts[3] = new Account("Bugs Bunny",800);
        accounts[4] = new Account("Peppa Pig",1600);
        
        int choice=0,acc=0,i=0,j=0;                                             //DHLWSH METAVLITWN INTEGER,DOUBLE KAI SCANNER
        double amount=0,max=-1000;
        Scanner input= new Scanner(System.in);              
        
        do                                                                      //ARXH EPANALIPSIS DO-WHILE GIA TON ELEGXO THS EPILOGHS TOY XRHSTH    
        {                                                                       //KAI GIA TON TERMATISO TOU PROGRAMMATOS OTAN O XRHSTHS EISAGEI 7
                max=0;                                                         
                System.out.println(" \n DIALEJE MIA APO TIS 7 EPILOGES:");         //TYPWSH MENOU STO XRHSTH ME TH XRHSH THS PRINTLN                               
        
                System.out.println("""
                                    1.KATATHESH SE LOGARIASMO 
                                    2.ANALHPSH APO LOGARIASMO 
                                    3.AGORA ME XREWSTIKH 
                                    4.ANALHPSH EPAGGELMATIA APO DESMEUMENO UPOLOIPO LOGARIASMOU 
                                    5.EMFANISH STOIXEIWN LOGARIASMOU 
                                    6.EMFANISH STOIXEIWN LOGARIASMOU ME TO MEGALUTERO DIATHESIMO YPOLOIPO 
                                    7.EKSODOS""");
               
                choice = input.nextInt();                                       //EISAGWGH TIMHS APO TO PLHKTROLOGIO
                
                if(choice<1||choice>7)                                        //ELEGXOS KAI EKTYPWSH KATALLHLOY MHNYMATOS SE PERIPTWSH WISAGWGHS LATHOUS ARITHMOU
                {
                    System.out.println("!!ERROR!! DIALEJE APO 1 EWS 7 \n");
                }
                
                                                                                //ELEGXOS SWITCH-CASE WSTE NA EKTELESTOUN OI KATALLHLES                    
                                                                                //ENTOLES ANALOGA ME THN EPILOGH TOY XRHSTH
            switch (choice)                                                      
            {                                                                                    
                case 1:                                                         //EPILOGH 1
                    do{
                        System.out.println("GIA POIO LOGARIASMO? ");                    //MHNYMA PROS TON XRHSTH NA EPILEJEI LOGARIASMO
                        acc = input.nextInt();                                          //EISAGWGH TIMHS APO PLHKTROLOGIO
                        if(acc<=0||acc>5)
                            System.out.println("!!ERROR!! O LOGARIASMOS AUTOS DEN YPARXEI");
                    }while(acc<=0||acc>5);
                    System.out.println("DWSE TO POSO KATATHESIS: ");            
                    amount = input.nextDouble();                                
                    accounts[acc-1].deposit(amount);                            //XRHSH THS METHODOU KATATHESIS GIA TON ANTISTOIXO LOGARIASMO KAI TYPWSH YPOLOIPOU
                    System.out.println("EPITYXHS KATATHESI \nTO YPOLOIPO EINAI: " +accounts[acc-1].getBalance());
                    break;
                
                case 2:                                                             //EPILOGH 2                
                    do {
                        System.out.println("GIA POIO LOGARIASMO? ");                    //MHNYMA PROS TON XRHSTH NA EPILEJEI LOGARIASMO
                        acc = input.nextInt();                                          //EISAGWGH TIMHS APO PLHKTROLOGIO
                        if (acc <= 0 || acc > 5) {
                            System.out.println("!!ERROR!! O LOGARIASMOS AUTOS DEN YPARXEI");
                        }
                    } while (acc <= 0 || acc > 5);
                    System.out.println("DWSE TO POSO ANALIPSIS: ");
                    amount = input.nextDouble();
                    accounts[acc-1].withdraw(amount);                               //XRHSH THS METHODOU ANALIPSIS APO TH KLASH ACCOUNT GIA TON ANTISTOIXO LOGARIASMO
                    System.out.println(" TO YPOLOIPO EINAI: " + accounts[acc-1].getBalance()); //TYPWSH YPOLOIPOY
                    break;
                case 3:                                                             //EPILOGH 3
                    do{
                        System.out.println("GIA POIO LOGARIASMO? ");                    //MHNYMA PROS TON XRHSTH NA EPILEJEI LOGARIASMO
                        acc = input.nextInt();                                          //EISAGWGH TIMHS APO PLHKTROLOGIO
                        if(acc<=0||acc>5)
                            System.out.println("!!ERROR!! O LOGARIASMOS AUTOS DEN YPARXEI");
                    }while(acc<=0||acc>5);                                          
                    System.out.println("DWSE TO POSO AGORAS: ");
                    amount = input.nextDouble();
                    accounts[acc-1].cardPucharase(amount);                          //XRHSTH THS METHODOU AGORAS ME KARTA GIA TON ANTISTOIXO LOGARIASMO KAI TYPWSH YPOLOIPOY
                    System.out.println(" TO YPOLOIPO EINAI: " + accounts[acc-1].getBalance()+ " \n TO DIATHESIMO YPOLOIPO EINAI: " +accounts[acc-1].getAvailableBalance());
                    break;
                
                case 4:
                    do{
                        System.out.println("GIA POIO LOGARIASMO? ");                    //MHNYMA PROS TON XRHSTH NA EPILEJEI LOGARIASMO
                        acc = input.nextInt();                                          //EISAGWGH TIMHS APO PLHKTROLOGIO
                        if(acc<=0||acc>5)
                            System.out.println("!!ERROR!! O LOGARIASMOS AUTOS DEN YPARXEI");
                    }while(acc<=0||acc>5);                                          
                    System.out.println("DWSE TO POSO ANALIPSIS: ");                 
                    amount = input.nextDouble();
                    accounts[acc-1].withdrawBlockedAmount(amount);                  //XRHSTH THS METHODOU ANALIPSI APO DESMEUMENO POSO GIA TON ANTISTOIXO LOGARIASMO
                    
                    break;
                
                case 5:                                                             //EPILOGH 5
                    do{
                        System.out.println("GIA POIO LOGARIASMO? ");                    //MHNYMA PROS TON XRHSTH NA EPILEJEI LOGARIASMO
                        acc = input.nextInt();                                          //EISAGWGH TIMHS APO PLHKTROLOGIO
                        if(acc<=0||acc>5)
                            System.out.println("!!ERROR!! O LOGARIASMOS AUTOS DEN YPARXEI");
                    }while(acc<=0||acc>5);
                    accounts[acc-1].print();                                        //XRHSH THS METHODOU PRINT        
                    break;
                
                case 6:                                                             //EPILOGH 6
                    for(i=0;i<M;i++)                                                //ANAZHTHSH STON PINAKA ME EPANALIPSI FOR GIA NA BREI 
                    {                                                               //POIOS LOGARIASMOS EXEI MEGALYTERO YPOLOIPO        
                        if(max<accounts[i].getBalance())
                        {
                            max = accounts[i].getBalance();
                            j=i;
                        }
                    }
                    System.out.println("TA STOIXEIA TOU LOGARIASMOU ME TO MEGALYTERO YPOLOIPO EINAI:\n");
                    accounts[j].print();                                            //EKTYPWSH OLWN TWN STOIXEIWN TOY LOGARIASMOU ME TO MEGALYTERO YPOLOIPO
                    break;
                    
            }
        }while(choice!=7);                                                          //TELOS DO-WHILE
        System.out.println("GOODBYE!!");
    }                                                                               //TELOS THS MAIN

}                                                                                   //TELOS THS MAIN KLASHS
