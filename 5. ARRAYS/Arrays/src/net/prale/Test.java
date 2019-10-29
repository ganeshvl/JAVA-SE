package net.prale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

    }

    public void moreA(int... nums) {}

    public void moreB(String values, int... nums) {}

    public void moreC(int... nums, String values) {}

    public void moreD(String... values, int... nums) {}

    public void moreE(String[] values, ...int nums) {}

    public void moreF(String... values, int[] nums) {}

    public void moreG(String[] values, int[] nums) {}
}
