class calculateCharges {
    public static void main(String[] args) {
        // Minimum fee for upt ot 3 hrs of parking
        double min = 2.00;
        // The charge for each hour in excess of three hours
        double excess = 0.50;
        // The maximum 24 hour charge
        double max = 10.00;

        if (args.length == 1) {
            try {
                double hours = Double.parseDouble(args[0]);
                if (hours < 3) {
                    System.out.println("Parking charge is: "+ min);
                }
                else if (hours > 3 && hours < 24) {
                    double excessCharge = hours - 3;
                    double charge = (min + (excessCharge * excess));
                    if (charge > max) {
                        System.out.println("Parking charge is: "+ max);
                    }
                    else {
                        System.out.println("Parking charge is: "+ charge);
                    }
                }
                else {
                    System.out.println("No car is to be parked for more that 24hrs");
                }
            }
            catch (NumberFormatException err) {
                System.out.println("This programme only accepts numerical parameters \nError: " +err.getMessage());
            }
        }
        else {
            System.out.println("This program only accepts one numerical parameter \n");
        }
    }
}