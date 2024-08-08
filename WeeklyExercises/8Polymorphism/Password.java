package Week7;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Password implements Encryptable {
    @Override
    public String encrypt(String text) {
        try {
            // Using SHA-256 hashing algorithm for encryption
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(text.getBytes());

            // Converting byte array to hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String decrypt(String text) {
        // Asymmetric encryption like hashing cannot be decrypted
        throw new UnsupportedOperationException("Decryption is not supported for Password encryption");
    }
}
