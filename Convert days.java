public class ConvertDays {
    public static void main(String[] args) {
        int totalDays = 500;

        int years = totalDays / 365;
        int weeks = (totalDays % 365) / 7;
        int days = (totalDays % 365) % 7;

        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}
output:
  Years: 1
Weeks: 6
Days: 1
