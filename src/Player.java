import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of vehicles
        List<Car> cars = new ArrayList<>();
        Car redCar;

        // game loop
        while (true) {
            for (int i = 0; i < n; i++) {
                int id = in.nextInt(); // Id of the vehicle
                int x = in.nextInt(); // Horizontal coordinate of the vehicle
                int y = in.nextInt(); // Vertical coordinate of the vehicle
                int length = in.nextInt(); // Length of the vehicle, in cells
                String axis = in.next(); // Axis of the vehicle : H (horizontal) or V (vertical)

                if(id == 0){
                    redCar = new Car(id, x, y, length, axis);
                }
                else{
                    cars.add(new Car(id, x, y, length, axis));
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println("0 RIGHT"); // ID DIRECTION
        }
    }
}