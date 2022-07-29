package com.bcinfo.umap.utils;

public class CryptoUtil {
    public static String getMD5String(String str) {
        try {
            byte[] res = str.getBytes();
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5".toUpperCase());
            byte[] digest = md.digest(res);
            return bytesToString(digest);
        } catch (Exception e) {
            return null;
        }
    }

    public static String bytesToString(byte[] data) {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };
        char[] temp = new char[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            byte b = data[i];
            temp[i * 2] = hexDigits[b >>> 4 & 0x0f];
            temp[i * 2 + 1] = hexDigits[b & 0x0f];
        }
        return new String(temp).toUpperCase();

    }

}
