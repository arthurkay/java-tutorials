class oddNumbers {
    public static void main(String[] args) {
        // Check to make sure only one argument is given
        if ( args.length == 1) {
            // Make sure the argument is an integer
            try {
                int product = 1;
                int n = Integer.parseInt(args[0]);
                // Loop through all numbers from 1 to n
                for (int i = 1; i <= n; i++) {
    
                   if ( (i%2) != 0) {
                       // Multiply on the odd numbers
                        product = product * i;
                   }
                }
                System.out.println("The product is: "+ product);
            }
            // If the argument is not an integer, throw an error.
            catch (NumberFormatException err) {
                System.out.println("You can only use integers as arguments. \nError: "+ err.getMessage());
            }
        }
        // If the user passes more or less than one argument, show below error response
        else {
            System.out.println("You need to pass atleast one integer as an argument");
        }
    }
}