package Java.random;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class BlowfishEncryption {
    public static void main(String[] args) {
        try {
            String key = "Aug@2018";
            String plainText = "password";

            // Create a key specification for Blowfish
            SecretKeySpec skeyspec = new SecretKeySpec(key.getBytes(), "Blowfish");

            // Get a Blowfish cipher instance with PKCS5Padding
            Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");

            // Initialize the cipher for encryption
            cipher.init(Cipher.ENCRYPT_MODE, skeyspec);

            // Encrypt the text
            byte[] encrypted = cipher.doFinal(plainText.getBytes());

            // Encode the bytes to base64 to get a string
            byte[] encryptedBase64 = Base64.encodeBase64(encrypted);
            System.out.println("Encrypted Text: " + new String(encryptedBase64));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
