package com.igyapap;

/**
 * Created by igypap on 11.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Telephone igorsPhone = new DeskPhone(12345678);
        igorsPhone.powerOn();
        igorsPhone.callPhone(12345678);
        igorsPhone.answer();
    }
}
