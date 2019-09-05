public class DisplayingShapes{
	public static void main (String[] args){
		System.out.println("\nA program to Displaying Shapes with Asterisks\n");
		System.out.println(" *********     ***       *        *     ");
		System.out.println(" *       *   *     *    ***      * *    ");
		System.out.println(" *       *  *       *  *****    *   *   ");
		System.out.println(" *       *  *       *    *     *     *  ");
		System.out.println(" *       *  *       *    *    *       * ");
		System.out.println(" *       *  *       *    *     *     *  ");
		System.out.println(" *       *  *       *    *      *   *   ");
		System.out.println(" *       *   *     *     *       * *    ");
		System.out.println(" *********     ***       *        *     ");
		
		System.out.println("\n");
		
		String space = "  ";
		System.out.printf("%s%s%s%s%s%n", "*********", space, "   ***   ", "    *    ", "    *    ");
		System.out.printf("%s%s%s%s%s%n", "*       *", space, " *     * ", "   ***   ", "   * *   ");
		System.out.printf("%s%s%s%s%s%n", "*       *", space, "*       *", "  *****  ", "  *   *  ");
		System.out.printf("%s%s%s%s%s%n", "*       *", space, "*       *", "    *    ", " *     * ");
		System.out.printf("%s%s%s%s%s%n", "*       *", space, "*       *", "    *    ", "*       *");
		System.out.printf("%s%s%s%s%s%n", "*       *", space, "*       *", "    *    ", " *     * ");
		System.out.printf("%s%s%s%s%s%n", "*       *", space, "*       *", "    *    ", "  *   *  ");
		System.out.printf("%s%s%s%s%s%n", "*       *", space, " *     * ", "    *    ", "   * *   ");
		System.out.printf("%s%s%s%s%s%n", "*********", space, "   ***   ", "    *    ", "    *    ");
	}
}