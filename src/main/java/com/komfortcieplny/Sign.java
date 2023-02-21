package com.komfortcieplny;

public class Sign {
    private String sign;
    private int counter;

    public Sign(String sign, int counter) {
        this.sign = sign;
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "sign='" + sign + '\'' +
                ", counter=" + counter +
                '}';
    }

    public String getSign() {
        return sign;
    }

    public int getCounter() {
        return counter;
    }
}
