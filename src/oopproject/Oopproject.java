package oopproject;
import java.util.*;

public class Oopproject
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean found=true;
        int num_of_sandwich_in_list=0;
 
        System.out.println("Inter the number of sandwiche..\n1-Normal burger sandwich.\n2-Healthy Burger.\n3-Deluxe Burger.");
        
        while (found)
        {            
            num_of_sandwich_in_list=sc.nextInt();
            if(num_of_sandwich_in_list>3||num_of_sandwich_in_list<1)
            {
                System.out.println("Your choice isn't in the list\nPlease, reinter your choice");
                continue;
            }
            break;
        }
        if(num_of_sandwich_in_list==1)
        {
            NormalBurgerSandwich sandwich = new NormalBurgerSandwich("Normal Burger Sandwich","","");
            sandwich.setAddition("Tomato", 5,"Mayonnaise", 3,"Cheese", 7.5,"Lettuce", 4);
            sandwich.setMeat("Beef","Chicken");
            sandwich.setBread("White","brown");
            sandwich.TypeOfMeat();
            sandwich.TypeOfBread();
            sandwich.AskingForAdditions();
            System.out.println(sandwich);
        }
        else if(num_of_sandwich_in_list==2)
        {
            HealthyBurgerSandwich sandwich = new HealthyBurgerSandwich("Healthy Burger Sandwich","Brown","");
            sandwich.setAddition("Tomato", 5,"Lettuce", 4);
            sandwich.setMeat("Beef","Chicken");
            sandwich.TypeOfMeat();
            sandwich.AskingForAdditions();
            System.out.println(sandwich);
        }
        else
        {
            DeluxeBurgerSandwich sandwich = new DeluxeBurgerSandwich("Deluxe Burger Sandwich","white","Beaf");
            sandwich.setAddition("Chips", 15,"Pipsi", 4);
            sandwich.AskingForAdditions();
            System.out.println(sandwich);
        }
        
    }
    
}
