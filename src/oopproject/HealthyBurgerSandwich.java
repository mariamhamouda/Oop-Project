package oopproject;
class HealthyBurgerSandwich extends NormalBurgerSandwich
{
    private String type_of_additions;
    public HealthyBurgerSandwich(String name, String bread, String meat)
    {
        super(name, bread, meat);
        System.out.println("You'll get a brown bread");
        type_of_additions="No additions";
    }
    public void setAddition(String addition1, double FirstAddPrice,String addition2, double SecondAddPrice)
    {
        super.setAddition1(addition1 , FirstAddPrice);
        super.setAddition2(addition2 , SecondAddPrice);
    }
    @Override
    public void AskingForAdditions()
    {
        System.out.println("for this sandwich, there are 2 avilable additions:");
        System.out.println("1- "+ super.getAddition1()+"\n2- "+super.getAddition2());
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
                type_of_additions+=super.getAddition1()+"\n";
                super.TotalBillCalc(super.getFirstAddPrice());
            }
            else if(type==2)
            {
                type_of_additions+="- ";
                type_of_additions+=super.getAddition2()+"\n";
                super.TotalBillCalc(super.getSecondAddPrice());
            }
            else
            {
                 System.out.println("Your choice isn't in the list\nplease, choose again");
                 num++;
            }
        }
        super.setType_of_additions(type_of_additions);
    }
}
