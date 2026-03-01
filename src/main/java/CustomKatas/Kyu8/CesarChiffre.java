package CustomKatas.Kyu8;

import java.util.HashMap;
import java.util.Map;

public class CesarChiffre {
    public static String decryption(String code, int salt) {
        char[] codeChar = code.toCharArray();
        Map<Character, Integer> cipherBigChar = new HashMap<>();
        Map<Character, Integer> cipherLittleChar = new HashMap<>();
        StringBuilder decryptionCode = new StringBuilder();
        int asciiValueBig = 65;
        int asciiValueLittle = 97;
        createMap(asciiValueBig, cipherBigChar);
        createMap(asciiValueLittle, cipherLittleChar);
        for (char c : codeChar) {
            if (c == ' ') {
                decryptionCode.append(" ");
            }
            if (cipherBigChar.containsKey(c)) {
                Integer valueToFind = cipherBigChar.get(c);
                valueToFind = descrptionKey(salt, valueToFind);
                Character key = getCharacter(cipherBigChar, valueToFind);


                decryptionCode.append(key);


            }
            if (cipherLittleChar.containsKey(c)) {
                Integer valueToFind = cipherLittleChar.get(c);
                valueToFind = descrptionKey(salt, valueToFind);
                Character key = getCharacter(cipherLittleChar, valueToFind);


                decryptionCode.append(key);


            }
        }
        return String.valueOf(decryptionCode);
    }

    private static Integer descrptionKey(int salt, Integer valueToFind) {
        for (int i1 = 0; i1 < salt; i1++) {
            valueToFind--;
            if (valueToFind < 1) {
                valueToFind = 26;
            }
            if (valueToFind > 26) {
                valueToFind = 1;
            }
        }
        return valueToFind;
    }

    private static Character getCharacter(Map<Character, Integer> cipherBigChar, Integer valueToFind) {
        return cipherBigChar.entrySet().stream()
                .filter(entry -> valueToFind.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    private static void createMap(int asciiValueBig, Map<Character, Integer> cipherBigChar) {
        for (int i = 1; i <= 26; i++) {
            char charBig = (char) asciiValueBig;
            cipherBigChar.put(charBig, i);
            asciiValueBig++;

        }
    }
    public static String mathDecryption(String code, int salt){
        StringBuilder result = new StringBuilder();

        for (char c : code.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) ('A' + (c - 'A' - salt % 26 + 26) % 26));
            } else if (Character.isLowerCase(c)) {
                result.append((char) ('a' + (c - 'a' - salt % 26 + 26) % 26));
            } else if (c == ' ') {
                result.append(' ');
            }
        }

        return result.toString();

    }


}

