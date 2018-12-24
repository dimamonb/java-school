package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {

    private static long nextSerial = 0;
    private final long serial = 2;

    public long getSerial() {
        return serial;
    }

    public String color;
    private int roundsLeft;
    private Double power;

    public Double getPower() {
        return power;
    }

    public void setPower(Double power){
        this.power = power;
    }

    public void reload(int z){
        roundsLeft += z;
    }

    public void pewPew(){
        roundsLeft -= 2;
    }

    public LethalWeapon(){}

    public LethalWeapon(String color, Double power, int roundsLeft){
        this.color = color;
        this.power = power;
        this.roundsLeft = roundsLeft;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;

        LethalWeapon lw = (LethalWeapon) obj;

        return Objects.equals(color, lw.color) && Objects.equals(power, lw.getPower()) && (lw.roundsLeft == roundsLeft) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, power, roundsLeft);
    }
}
