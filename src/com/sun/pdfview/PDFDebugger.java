package com.sun.pdfview;

public class PDFDebugger {

    public static void debug(String msg) {
        System.out.println(escape(msg));
    }

    public static String escape(String msg) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c != '\n' && (c < 32 || c >= 127)) {
                c = '?';
            }
            sb.append(c);
        }
        return sb.toString();
    }

}
