package Week7;
public class Mains {
    public static void main(String[] args) {
        Encryptable secret = new Secret(); // Using Caesar cipher for Secret
        Encryptable password = new Password(); // Using SHA-256 hashing for Password

        // Encrypt and decrypt with Secret
        String secretText = "Hello";
        String encryptedSecret = secret.encrypt(secretText);
        String decryptedSecret = secret.decrypt(encryptedSecret);
        System.out.println("Secret:");
        System.out.println("Original: " + secretText);
        System.out.println("Encrypted: " + encryptedSecret);
        System.out.println("Decrypted: " + decryptedSecret);

        // Encrypt with Password (hashing)
        String passwordText = "MyPassword123";
        String encryptedPassword = password.encrypt(passwordText);
        System.out.println("\nPassword:");
        System.out.println("Original: " + passwordText);
        System.out.println("Encrypted: " + encryptedPassword);
    }
}
