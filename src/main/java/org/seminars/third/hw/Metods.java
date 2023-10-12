package org.seminars.third.hw;

public class Metods {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        if (n > 25) {
            if (n < 100) {
                return true;
            }
        }
        return false;
    }
}
