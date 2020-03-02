package ch.zhaw.prog2.fxmlcalculator;

/**
 * Handles the values from the input form.
 * @author bles
 * @version 1.0
 */
public class ValueHandler {

	private double initialAmount;
	private double returnInPercent;
	private double annualCost;
	private int numberOfYears;
	private String result = "";
	private boolean valuesOk = false;

	/**
	 * After construction, the result (read with getResult()) contains either an error message
	 * or the result of the calculation, depending on valuesOk (read with getValuesOk())
	 * @param initialAmount		String with start amount
	 * @param returnInPercent	String with annual return in %
	 * @param annualCost		String with annual costs
	 * @param numberOfYears		String
	 */
	public ValueHandler(String initialAmount, String returnInPercent, String annualCost, String numberOfYears) {
		valuesOk = checkValues(initialAmount, returnInPercent, annualCost, numberOfYears);
		if(valuesOk) {
			result = calculateResult();
		}
	}

	/*
	 * Check the input values are valid (can be improved)
	 * If not ok, fill error message to the results and return false
	 * If ok, set the date fields and return true
	 */
	private boolean checkValues(String initialAmount, String returnInPercent, String annualCost, String numberOfYears) {
		StringBuilder sb = new StringBuilder();
		if ("".equals(initialAmount) || Double.parseDouble(initialAmount)==0) {
			sb.append("Please specify an initial amount!\n");
		} else {
			this.initialAmount = Double.parseDouble(initialAmount);
		}
		if ("".equals(returnInPercent)) {
			sb.append("Please specify the annual return rate in %!\n");
		} else {
			this.returnInPercent = Double.parseDouble(returnInPercent)/100;
		}
		if ("".equals(annualCost) || Double.parseDouble(annualCost)<0) {
			sb.append("Please specify the annual cost!\n");
		} else {
			this.annualCost = Double.parseDouble(annualCost);
		}
		if ("".equals(numberOfYears) ||
				Double.parseDouble(numberOfYears) < 1 ||
				Double.parseDouble(numberOfYears) > 99 ||
				Math.round(Double.parseDouble(numberOfYears))!=Double.parseDouble(numberOfYears)) {

			sb.append("Please enter a time period in years!");
		} else {
			this.numberOfYears = Integer.parseInt(numberOfYears);
		}
		result = sb.toString();
		return "".equals(result);
	}

	/*
	 * Calculates the result
	 * Return the result as a String
	 */
	private String calculateResult() {
		StringBuilder result = new StringBuilder();
		double val = initialAmount;
		for(int i = 1; i <= numberOfYears; i++) {
			result.append("After ");
			result.append(i).append(" year(s): ");
			val = val * (1 + returnInPercent) - annualCost;
			result.append(Math.round(val)).append("\n");
		}
		return result.toString();
	}

	/**
	 * Result String is != "" in every case
	 * @return	String with the result of the value checking or the calculation
	 */
	public String getResult() {
		return result;
	}

	/**
	 * If the values in the constructor where ok, the return is true
	 * @return	true, if ok
	 */
	public boolean areValuesOk() {
		return valuesOk;
	}

}
