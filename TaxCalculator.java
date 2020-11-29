import java.util.Scanner;
public class TaxCalculator 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double income, taxPercent = 0, grossTax = 0, chargeableIncome = 0, tax = 0;
        String msg = "";
        
        System.out.println("Enter the income: $");
        income = keyboard.nextInt();
 
        do
        {       
            if (income < 0)
            {
                msg = "Invalid Tax";
            }
            else if (income > 0 && income <= 20000)
            {
                tax = 0;
            }
            else if (income > 20000 && income <= 30000)
            {
                taxPercent = 0.02;
                chargeableIncome = (income - 20000);
                grossTax = 0;
            }
            else if (income > 30000 && income <= 40000)
            {
                taxPercent = 0.035;
                chargeableIncome = (income - 30000);
                grossTax = 200;
            }
            else if (income > 40000 && income <= 80000)
            {
                taxPercent = 0.07;
                chargeableIncome = (income - 40000);
                grossTax = 550;
            }
            else if (income > 80000 && income <= 120000)
            {
                taxPercent = 0.115;
                chargeableIncome = (income-80000);
                grossTax = 3350;
            }
            else if (income > 120000 && income <=160000)
            {
                taxPercent = 0.15;
                chargeableIncome = (income-120000);
                grossTax = 7950;
            }
            else if (income > 160000 && income <= 200000)
            {
                taxPercent = 0.18;
                chargeableIncome = (income - 160000);
                grossTax = 13950;
            }
            else if (income > 200000 && income <= 240000)
            {
                taxPercent = 0.19;
                chargeableIncome = (income - 200000);
                grossTax = 21150;
            }
            else if (income > 240000 && income <= 280000)
            {
                taxPercent = 0.195;
                chargeableIncome = (income - 240000);
                grossTax = 28750;
            }
            else if (income > 280000 && income <= 320000)
            {
                taxPercent = 0.2;
                chargeableIncome = (income-280000);
                grossTax = 36550;
            }
            else
            {
                taxPercent = 0.22;
                chargeableIncome = (income-320000);
                grossTax = 44550;
            }

            if (msg == "")
            {
                tax = (chargeableIncome * taxPercent) + grossTax;
                System.out.printf("Tax for $%.2f is $%.2f\n", income, tax);
                System.out.println("Enter income again, (-1 to stop the program):");
                income = keyboard.nextInt();
                taxPercent = 0;
                grossTax = 0;
                chargeableIncome = 0;
                tax = 0;        
            }
            else
            {
                System.out.println(msg);
                break;
            }
        
        } while (income != -1);
    }
}
