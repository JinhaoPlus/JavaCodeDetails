package com.rocking.test;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.Arrays;

public class ImageEncrytor {

    private static final String AES_ALGORITHM = "AES";
    private static final String RANDOM_ALGORITHM = "SHA1PRNG";

    public static void main(String[] args) throws Exception {
        byte[] imageBytes = Files.readAllBytes(Paths.get("/Users/jinhaoplus/Desktop/aaa.png"));
        byte[] encryptedImageBytes = encrypt(imageBytes, "ccc", "rrr");
        byte[] decryptedImageBytes = decrypt(encryptedImageBytes, "ded", "ccc");
        Files.write(Paths.get("/Users/jinhaoplus/Desktop/bbb.png"), decryptedImageBytes);
    }

    private static byte[] encrypt(byte[] bytes, String... secrets) {
        if (secrets.length == 0) {
            return bytes;
        } else {
            secrets = sortSecrets(true, secrets);
            for (String secret : secrets) {
                bytes = encryptAES(bytes, secret);
            }
        }
        return bytes;
    }

    private static byte[] decrypt(byte[] bytes, String... secrets) {
        if (secrets.length == 0) {
            return bytes;
        } else {
            secrets = sortSecrets(false, secrets);
            for (String secret : secrets) {
                bytes = decryptAES(bytes, secret);
            }
        }
        return bytes;
    }

    private static String[] sortSecrets(Boolean positive, String... secrets) {
        Arrays.sort(secrets);
        if (positive) {
            return secrets;
        } else {
            String[] descSecrets = new String[secrets.length];
            for (int i = 0; i < secrets.length; i++) {
                descSecrets[secrets.length - 1 - i] = secrets[i];
            }
            return descSecrets;
        }
    }

    private static byte[] encryptAES(byte[] inputBytes, String secretKeyBase) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance(AES_ALGORITHM);
            SecureRandom random = SecureRandom.getInstance(RANDOM_ALGORITHM);
            random.setSeed(secretKeyBase.getBytes());
            kgen.init(128, random);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, AES_ALGORITHM);
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return cipher.doFinal(inputBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static byte[] decryptAES(byte[] encryptedBytes, String secretKeyBase) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance(AES_ALGORITHM);
            SecureRandom random = SecureRandom.getInstance(RANDOM_ALGORITHM);
            random.setSeed(secretKeyBase.getBytes());
            kgen.init(128, random);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, AES_ALGORITHM);
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
