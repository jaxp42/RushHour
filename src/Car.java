import java.util.List;

public class Car {
    private int id, x, y, length;
    private String axis;

    public Car(int id, int x, int y, int length, String axis){
        this.id = id;
        this.x = x;
        this.y = y;
        this.length = length;
        this.axis = axis;
    }

    public boolean canMoveUp(List<Car> cars){
        for(Car car : cars){
            if(car.getY() == this.y - 1 && (this.x > car.getX() && this.x <= car.getX() + length)){
                return false;
            }
        }

        return true;
    }

    public boolean canMoveDown(List<Car> cars){
        for(Car car : cars){
            if(car.getY() == this.y + this.length && (this.x >= car.getX() && this.x <= car.getX() + length)){
                return false;
            }
        }

        return true;
    }

    public boolean canMoveRight(List<Car> cars){
        for(Car car : cars){
            if(car.getX() == this.x + this.length && (this.y >= car.getY() && this.y <= car.getY() + length)){
                return false;
            }
        }

        return true;
    }

    public boolean canMoveLeft(List<Car> cars){
        for(Car car : cars){
            if(car.getX() == this.x - 1 && (this.y >= car.getY() && this.y <= car.getY() + length)){
                return false;
            }
        }

        return true;
    }

    public boolean canGoToExit(List<Car> cars){
        for(Car car : cars){
            if(car.getX() > this.x && (this.y >= car.getY() && this.y <= car.getY() + length)){
                return false;
            }
        }

        return true;
    }

    public void moveUp(){
        System.out.println(this.id + " UP");
        this.setY(this.y - 1);
    }

    public void moveDown(){
        System.out.println(this.id + " DOWN");
        this.setY(this.y + 1);
    }

    public void moveRight(){
        System.out.println(this.id + " RIGHT");
        this.setX(this.x + 1);
    }

    public void moveLeft(){
        System.out.println(this.id + " LEFT");
        this.setX(this.x - 1);
    }

    public void goToExit(List<Car> cars){
        while(canGoToExit(cars)){
            moveRight();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis;
    }
}
