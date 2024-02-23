public class PracticalNo4 {
    public static void printName(String name) {
        // Trim leading and trailing spaces
        name = name.trim();
       
        // Split the name into first and last names
        String[] names = name.split("\\s+");
       
        // Extract first and last names
        String firstName = names[0];
        String lastName = names[names.length - 1];
       
        // Print the formatted name
        System.out.println(lastName + ", " + firstName);
    }
   
    public static void main(String[] args) {
        // Example usage
        printName("Bill Joy");
    }
}

