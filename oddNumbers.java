class oddNumbers {
    public static void main(String[] args) {
        if ( args.length == 1) {
            
            try {
                int product = 1;
                int n = Integer.parseInt(args[0]);
                for (int i = 1; i <= n; i++) {
                   if ( (i%2) != 0) {
                        product = product * i;
                   }
                }
                System.out.println("The product is: "+ product);
            }
            catch (NumberFormatException err) {
                System.out.println("You can only use integers as arguments. \nError: "+ err.getMessage());
            }
        }
        else {
            System.out.println("You need to pass atleast one integer as an argument");
        }
    }
}