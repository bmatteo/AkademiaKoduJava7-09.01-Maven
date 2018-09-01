package pl.kodu.akademia;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dziala!!");

        Gson gson = new Gson();
        Car c = new Car();
        c.a=3;
        c.b="bla";

        String json = gson.toJson(c);
        System.out.println(json);
    }
}
