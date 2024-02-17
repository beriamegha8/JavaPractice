interface Movable {
    //abstraction is incomplete without polymorphism
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Movable Point: (" + x + ", " + y + "), xSpeed: " + xSpeed + ", ySpeed: " + ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}

class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Movable Circle - Center: (" + center.x + ", " + center.y + "), xSpeed: " + center.xSpeed
                + ", ySpeed: " + center.ySpeed + ", Radius: " + radius;
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}

public class MovableTest {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        m1.moveUp();
        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 1, 2, 20, 10);
        m2.moveRight();
        System.out.println(m2);
    }
}
