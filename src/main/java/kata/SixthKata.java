package kata;

public interface SixthKata {

	/**
	 * The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3
	 * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
	 * @param m 
	 * @return
	 */
	long findNb(long m);

	/**
	 * 
	 * @param book  The first line shows the original balance. Each other line (when not blank) gives information: check number, category, check amount. (Input form may change depending on the language).
	 * @return On each line of the report you have to add the new balance and then in the last two lines the total expense and the average expense.
	 */
	String balance(String book);

	/**
	 * 
	 * @param x
	 * @return
	 */
	double f(double x);

	/**
	 * function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R and Julia this function is called avg).
	 * @param town
	 * @param strng
	 * @return
	 */
	double mean(String town, String strng);

	/**
	 * function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.
	 * @param town
	 * @param strng
	 * @return
	 */
	double variance(String town, String strng);

	/**
	 * 
	 * @param resultSheet  You are given a string with results of NBA teams separated by commas
	 * @param toFind  The team statistics we are looking for
	 * @return Statistics of draws and losses of the selected team
	 */
	String nbaCup(String resultSheet, String toFind);

	/**
	 * 
	 * @param lstOfArt number of books in encrypted format
	 * @param lstOf1stLetter Names of categories 1 letter
	 * @return Number of books for each category
	 */
	String stockSummary(String[] lstOfArt, String[] lstOf1stLetter);

}
