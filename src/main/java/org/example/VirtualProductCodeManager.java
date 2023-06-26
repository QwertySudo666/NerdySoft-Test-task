package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class VirtualProductCodeManager {
    private static Set<String> usedCodes = new HashSet<>();

    public static void useCode(String code) {
        usedCodes.add(code);
    }

    public static boolean isCodeUsed(String code) {
        return usedCodes.contains(code);
    }
}
