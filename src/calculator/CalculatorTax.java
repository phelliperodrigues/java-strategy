package calculator;

import tax.Tax;
import model.Budget;

public class CalculatorTax {

    public void calculate(Budget budget, Tax tax){
            double valueTax = tax.calculate(budget);
            System.out.println("TAX VALUE: " + valueTax);
    }


}
