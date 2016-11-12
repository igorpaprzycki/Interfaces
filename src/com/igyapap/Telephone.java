package com.igyapap;

/**
 * Created by igypap on 11.11.16.
 */
public interface Telephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
