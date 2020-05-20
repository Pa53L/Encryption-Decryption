package encryptdecrypt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "we found a treasure!";
        char[] strArray = str.toCharArray();
        char[] codeTable = new char[26];
        char[] decodeTable = new char[26];
        codeTable[0] = 'a';
        for (int i = 1; i < codeTable.length; i++) {
            codeTable[i] = (char)(codeTable[i - 1] + 1);
        }
        decodeTable[0] = 'z';
        for (int i = 1; i < codeTable.length; i++) {
            decodeTable[i] = (char)(decodeTable[i - 1] - 1);
        }
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < codeTable.length; j++) {
                if (strArray[i] == codeTable[j]) {
                    strArray[i] = decodeTable[j];
                    break;
                }
            }
        }
        String finalStr = new String(strArray);
        System.out.println(finalStr);
    }
}
