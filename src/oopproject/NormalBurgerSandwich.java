package oopproject;
import java.util.Scanner;
class NormalBurgerSandwich
{
    private String sandwich_name, type_of_bread, type_of_meat, type_of_additions, addition1, addition2;
    private int num_of_additions;
    private double total_bill, FirstAddPrice,SecondAddPrice,ThirdAddPrice,FourthAddPrice;
    private String addition3, addition4, meat1,meat2,bread1,bread2; 
    public NormalBurgerSandwich(String name, String bread, String meat)
    {
        sandwich_name =name;
        total_bill = 60.00;
        type_of_bread=bread;
        type_of_meat=meat;
        type_of_additions="No additions";
    }
    Scanner sc=new Scanner(System.in);
    //*******************************************************************************setters and getters
    public void setAddition(String addition1, double FirstAddPrice,String addition2, double SecondAddPrice,String addition3, double ThirdAddPrice,String addition4, double FourthAddPrice)
    {
        this.addition1 = addition1;
        this.FirstAddPrice=FirstAddPrice;
        this.addition2 = addition2;
        this.SecondAddPrice=SecondAddPrice;
        this.addition3 = addition3;
        this.ThirdAddPrice=ThirdAddPrice;
        this.addition4 = addition4;
        this.FourthAddPrice=FourthAddPrice;
    }
    public String getAddition1()
    {
        return addition1+ " : "+ FirstAddPrice+ " LE";
    }
    public String getAddition2()
    {
        return addition2 + " : " + SecondAddPrice + " LE";
    }
    public String getAddition3()
    {
        return addition3 + " : " + ThirdAddPrice+ " LE";
    }
    public String getAddition4()
    {
        return addition4 + " : " + FourthAddPrice+ " LE";
    }
    public void setMeat(String meat1,String meat2)
    {
        this.meat1 = meat1;
        this.meat2 = meat2;
    }
    public void setBread(String bread1,String bread2)
    {
        this.bread1 = bread1;
        this.bread2 = bread2;
    }
    public double getFirstAddPrice()
    {
        return FirstAddPrice;
    }
    public double getSecondAddPrice()
    {
        return SecondAddPrice;
    }
    public void setType_of_additions(String type_of_additions)
    {
        this.type_of_additions = type_of_additions;
    }

    public void setAddition1(String addition1, double FirstAddPrice)
    {
        this.addition1 = addition1;
        this.FirstAddPrice=FirstAddPrice;
    }

    public void setAddition2(String addition2, double SecondAddPrice)
    {
        this.addition2 = addition2;
        this.SecondAddPrice=SecondAddPrice;
    }
    //***********************************************************************************
    public void TotalBillCalc(double x)
    {
        total_bill+=x;
    }
    public void AskingForAdditions()
    {
        System.out.println("for this sandwich, there are 4 avilable additions:");
        System.out.println("1- "+getAddition1()+"\n2- "+getAddition2()+"\n3- "+getAddition3()+"\n4- "+getAddition4());
        System.out.println("How many addition do you need?");
        int num=sc.nextInt();
        while (num<0)
        {            
            System.out.println("you're input is invaild, please try again");
            num=sc.nextInt();
        }
        if(num>0)
        {
            System.out.println("Please, enter the number of the addition in the list");
            type_of_additions="";
        }
        for (int i=0;i<num;i++)
        {
            int type=sc.nextInt();
            if(type==1)
            {
                type_of_additions+="- ";
                type_of_additions+=getAddition1()+"\n";
                TotalBillCalc(FirstAddPrice);
            }
            else if(type==2)
            {
                type_of_additions+="- ";
                type_of_additions+=getAddition2()+"\n";
                TotalBillCalc(SecondAddPrice);
            }
            else if (type==3)
            {
                type_of_additions+="- ";
                type_of_additions+=getAddition3()+"\n";
                TotalBillCalc(ThirdAddPrice);
            }
            else if (type==4)
            {
                type_of_additions+="- ";
                type_of_additions+=getAddition4()+"\n";
                TotalBillCalc(FourthAddPrice);
            }
            else
            {
                 System.out.println("Your choice isn't in the list\nplease, choose again");
                 num++;
            }
        }
    }
    public void TypeOfMeat()
    {
        System.out.println("for this sandwich, there are 2 avilable types of meat:");
        System.out.println("1- "+ meat1+"\n2- "+meat2);
        int x=1;
        for(int i=0;i<x;i++)
        {
            int y=sc.nextInt();
            if(y==1)
               type_of_meat= meat1;
            else if(y==2)
               type_of_meat= meat2;
            else
            {
                System.out.println("Your choice isn't in the list\nplease, choose again");
                x++;
            }
        }
    }
    public void TypeOfBread()
    {
        System.out.println("for this sandwich, there are 2 avilable types of bread:");
        System.out.println("1- "+ bread1+"\n2- "+bread2);
        int x=1;
        for(int i=0;i<x;i++)
        {
            int y=sc.nextInt();
            if(y==1)
               type_of_bread=bread1;
            else if(y==2)
               type_of_bread=bread2;
            else
            {
                System.out.println("Your choice isn't in the list\nplease, choose again");
                x++;
            }
        }
    }
    @Override
    public String toString()
    {
        return "the order is..\n" + "Name of sandwich : " + sandwich_name + "\nType of meat : " + type_of_meat + "\nType of Bread : " + type_of_bread +"\nadditions : \n"+type_of_additions+ "\nTotal bill : " + total_bill + " LE";
    }
}
