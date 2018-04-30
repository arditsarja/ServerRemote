package org.zerhusen;

public class TypeOfServer {

    public static final int OTHER = 0;
    public static final int WINDOWS = 1;
    public static final int LINUX = 2;
    public static final int MAC = 3;

    public static int osType = OTHER;

    public static boolean isOther = false;
    public static boolean isWindows = false;
    public static boolean isLinux = false;
    public static boolean isMac = false;

    public static final String os = System.getProperty("os.name").toLowerCase();

    public static final void getOs() {
        if (os.startsWith("windows")) {
            osType = WINDOWS;
            isWindows = true;
        } else if (os.startsWith("nux")) {
            osType = LINUX;
            isLinux = true;
        } else if (os.startsWith("darwin")) {
            osType = MAC;
            isMac = true;
        } else {
            isOther = true;
        }
    }


}
