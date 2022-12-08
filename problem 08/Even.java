/*
 * Decompiled with CFR 0.152.
 */
public class Even {
    public static void main(String[] stringArray) {
        System.out.print("The even Numbers btn 1 nd 100 are : ");
        for (int i = 1; i < 100; ++i) {
            if (i % 2 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
