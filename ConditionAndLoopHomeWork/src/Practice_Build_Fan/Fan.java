package Practice_Build_Fan;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
        speed = slow;
        on = false;
        radius = 5;
        color = "blue";
    }

    public String toString() {
        if (on) {
            return "speed: " + speed + ", color: " + color + ", radius: " + radius + ", fan is on";
        } else {
            return "color: " + color + ", radius: " + radius + ", fan is off";
        }
    }
}

