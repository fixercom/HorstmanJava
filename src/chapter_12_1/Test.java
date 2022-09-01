package chapter_12_1;

import jdk.jfr.SettingControl;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(10,20));
    }
}
