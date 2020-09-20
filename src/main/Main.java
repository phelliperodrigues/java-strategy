package main;

import calculator.CalculatorTax;
import tax.imp.ICMS;
import tax.imp.ISS;
import tax.Tax;
import model.Budget;

public class Main {
    public static void main(String[] args) {
        Tax iss = new ISS();
        Tax icms = new ICMS();

        Budget budget = new Budget(500.0);

        CalculatorTax calculator = new CalculatorTax();

        // We calculator receives a strategy for calculate the tax
        // This strategy are the tax ICMS and ISS in your constructor
        calculator.calculate(budget, icms);
        calculator.calculate(budget, iss);
    }
}
