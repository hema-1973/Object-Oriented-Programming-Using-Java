import java.util.*;
class Operation {
    ArrayList<String> cities = new ArrayList<>();
    void addCity(String city) {
        cities.add(city);
    }
    void addCityAt(int index, String city) {
        if (index >= 0 && index <= cities.size())
            cities.add(index, city);
        else
            System.out.println("Invalid Position");
    }
    boolean findCity(String city) {
        for (String c : cities) {
            if (c.equalsIgnoreCase(city))
                return true;
        }
        return false;
    }
    void showCities() {
        System.out.println("City List: " + cities);
    }
    void showCitiesByLetter(char letter) {
        boolean flag = false;

        System.out.println("Cities starting with '" + letter + "' :");

        for (String city : cities) {
            if (city.toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                System.out.println(city);
                flag = true;
            }
        }
        if (!flag)
            System.out.println("No matching cities found.");
    }

    public static void main(String[] args) {

        Operation obj = new Operation();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add City");
            System.out.println("2. Insert City");
            System.out.println("3. Search City");
            System.out.println("4. Display All Cities");
            System.out.println("5. Display Cities by First Letter");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter City: ");
                    obj.addCity(sc.next());
                    break;

                case 2:
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter City: ");
                    obj.addCityAt(pos, sc.next());
                    break;

                case 3:
                    System.out.print("Enter City to Search: ");
                    if (obj.findCity(sc.next()))
                        System.out.println("City Exists");
                    else
                        System.out.println("City Not Found");
                    break;

                case 4:
                    obj.showCities();
                    break;

                case 5:
                    System.out.print("Enter Starting Letter: ");
                    char ch = sc.next().charAt(0);
                    obj.showCitiesByLetter(ch);
                    break;

                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);
        sc.close();
    }
}