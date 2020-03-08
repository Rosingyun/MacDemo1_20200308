package com.jettech;

import javax.sound.midi.Soundbank;
import java.net.InterfaceAddress;

public class JavaDefault {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}
interface Vehicle{
    default void print(){
        System.out.println("我是一辆车");
    }
    static void blowHorn(){
        System.out.println("按喇叭");
    }
        }
interface fourwheeler{
    default void print(){
        System.out.println("我是一辆四轮车");
    }
        }
class Car implements Vehicle,fourwheeler{
    public void print(){
        Vehicle.super.print();
        fourwheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆车");
    }
}


