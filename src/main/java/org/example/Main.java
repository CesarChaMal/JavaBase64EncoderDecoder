package org.example;

import static org.example.Base64.*;

public final class Main {
    public static void main(String[] args) throws Exception {
        String encode = encode("Hello World!");
        System.out.println(encode);
        String decode = decode(encode);
        System.out.println(decode);
    }
}

