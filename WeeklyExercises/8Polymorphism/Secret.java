package Week7;

public class Secret implements Encryptable {
    private static final int SHIFT = 3; // Caesar cipher shift

    @Override
    public String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + SHIFT);
                if ((Character.isLowerCase(c) && shifted > 'z') || (Character.isUpperCase(c) && shifted > 'Z')) {
                    encrypted.append((char) (c - (26 - SHIFT)));
                } else {
                    encrypted.append(shifted);
                }
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String text) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c - SHIFT);
                if ((Character.isLowerCase(c) && shifted < 'a') || (Character.isUpperCase(c) && shifted < 'A')) {
                    decrypted.append((char) (c + (26 - SHIFT)));
                } else {
                    decrypted.append(shifted);
                }
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
