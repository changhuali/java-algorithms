package com.fan.剑指Offer.剑指Offer15二进制中1的个数;

public class Solution2 {
    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            n &= (n - 1);
            ret++;
        }
        return ret;
    }
}
