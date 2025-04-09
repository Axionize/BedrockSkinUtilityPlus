package net.camotoy.bedrockskinutility.client;

public class ColorUtil {
    public static class ARGB32 {
        public ARGB32() {
        }

        public static int color(int i, int j, int k, int l) {
            return i << 24 | j << 16 | k << 8 | l;
        }
    }
}
