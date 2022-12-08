/*
 * Decompiled with CFR 0.152.
 */
public class SumOf200 {
    public static void main(String[] stringArray) {
        int n = 0;
        for (int i = 1; i <= 200; ++i) {
            n += i;
        }
        System.out.print("The sum of first 200 counting integers is : " + n);
    }
}
