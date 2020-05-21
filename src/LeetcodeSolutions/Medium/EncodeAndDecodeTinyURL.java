package LeetcodeSolutions.Medium;

/*
535. Encode and Decode TinyURL
Link: https://leetcode.com/problems/encode-and-decode-tinyurl/
Topics: Hash Table, Math
 */

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL {
    Map<String,String> map = new HashMap<>();
    String letters =
            "abcdefghijklmnopqrstuvwxyz"+
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+
                    "0123456789";

    String shrink(int h) {
        StringBuilder sb = new StringBuilder();
        if (h < 0) h = -h;
        while (h > 0) {
            sb.append(letters.charAt(h % letters.length()));
            h /= letters.length();
        }
        return sb.toString();
    }


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key;
        int h = longUrl.hashCode();
        while (map.containsKey(key=shrink(h))) {
            h = (h * h) + h;
        }
        map.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String[] args) {
        EncodeAndDecodeTinyURL solution = new EncodeAndDecodeTinyURL();
        String link = "https://leetcode.com/problems/design-tinyurl";
        String shortened = solution.encode(link);
        System.out.println(solution.decode(shortened));
    }

}
