package trainappPrograms;

/*
 * Program: Safe Cargo Assignment
 * Purpose: Demonstrates runtime exception handling for
 *          validating safe cargo assignment to goods bogies.
 */

class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {

    String shape;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {

            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            System.out.println("Cargo assigned successfully -> " + cargo);

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Cargo validation completed for " + shape + " bogie");
        }
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("======================================\n");

        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");
    }
}