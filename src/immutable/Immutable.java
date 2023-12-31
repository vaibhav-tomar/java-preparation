package immutable;

public final class Immutable {
    private final int x;
    private final Temp temp;

    public Immutable(int x, Temp temp) {
        this.x = x;
        this.temp = temp;
    }

    public static void main(String[] args) {
        Temp t = new Temp(10);
        Immutable i = new Immutable(5, t);

        System.out.println(i.getX() + " " + i.getTemp().getT());
        t.setT(15);
        System.out.println(i.getX() + " " + i.getTemp().getT());


    }

    public int getX() {
        return x;
    }

    public Temp getTemp() {
        Temp temp = new Temp(10);
        temp.setT(temp.getT());
        return temp;
    }
}


class Temp {
    private int t;

    public Temp(int t) {
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
}


