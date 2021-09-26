/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import java.util.Scanner;

/**
 *
 * @author Hemant
 */
public class missing {
    public static void main(String[] args) {
        String obj = "public class missing {\n" +
"    public static void main(String[] args) {\n" +
"        String obj = \"\";\n" +
"        Scanner sc = new Scanner(System.in);\n" +
"        if(match(obj)){\n" +
"            \n" +
"        }\n" +
"        System.out.println(\"hello \");\n" +
"    }";
        Scanner sc = new Scanner(System.in);
        if(match(obj)){
            System.out.println("Complie ");
        }
        else{
            System.out.println("error");
        }
    }

    private static boolean match(String obj) {
        
                int openc=0;int closec=0;
        for (int i = 0; i < obj.length(); i++) {
            if(obj.charAt(i)=='{'){
                openc++;
            }if(obj.charAt(i)=='}'){
                closec++;
            }
        }
       return openc==closec;
    }
}
