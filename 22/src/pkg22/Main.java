/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22;

import java.util.Scanner;

/**
 *
 * @author NUBAR
 */
public class Main {

    public static void main(String[] args) {
        //17ni tap
        ededinTersi(12);
        
    }
    //8
    public static void ededinTersi(int a){
        int ters=0;
        while(a>0){
            ters*=10;
            ters=ters+a%10;
            a=a/10;
            
        }
        System.out.println(ters);
    }
            
    //5
    public static void reqemlerinSayi(int a){
        int cem=0;
        while(a>0) {         
            a=a/10;
            cem++;
        }
        System.out.println(cem);
    }
    //3
    public static void reqemlerinCemi(int a){
        int cem=0;
        while(a>0) {
            int qaliq=a%10;
            a=a/10;
            cem+=qaliq;
        }
        System.out.println(cem);
    }
    //7
    public static boolean stringinTersi(String a) {
        for (int i = 0; i < a.length(); i++) {
            char sag = a.charAt(i);
            char sol = a.charAt(a.length() - 1-i);
            System.out.println("sag="+sag);
            System.out.println("sol="+sol);
            if (sag != sol) {
                return false;
            }
        }
        return true;
    }

    //6.2 rekursiyaile
    public static int faktorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * faktorial(a - 1);
        }

    }

    //calisma 6.1 for ile
    public static void faktorial2(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    //2.1
    public static void foo14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");

        int eded = sc.nextInt();
        if (eded % 2 != 0 && eded % 3 != 0) {
            System.out.println("sade=" + eded);
        }
        if (eded == 2 || eded == 3) {
            System.out.println("sade=" + eded);
        } else {
            System.out.println("sade deyl");
        }
    }

    //2.2
    public static void foo13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");

        int eded = sc.nextInt();

        for (int i = 2; i <= eded; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                System.out.println("sade=" + i);
            }
            if (i == 2 || i == 3) {
                System.out.println("sade=" + i);
            }
        }
    }

    //calisma 1
    public static void foo12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");

        int eded = sc.nextInt();

        for (int i = 0; i < eded; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

//calisma 10
    public static void foo11(int a, int b, int c) {
        for (int i = a; i < b; i++) {
            System.out.println(Math.pow(i, c));
        }
    }
    
    
    //calisma 22
    public static void foo10() {
        String s = "  \"Salam   necesen isler   nece   gedir\"   ";
        String[] words = s.split("  ", 0);
        for (String w : words) {
            System.out.print(w);
        }
    }

    //calisma 21
    public static StringBuilder foo9() {
        String s = "Hello World";
        StringBuilder news = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                news.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            } else if (Character.isUpperCase(s.charAt(i))) {
                news.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }
        }
        return news;
    }

    //calisma 20
    public static String foo8(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        }
        return b;
    }

    //calisma 18
    public static boolean foo7(String a, String b, String c) {
        if (a.contains(c) && b.contains(c)) {
            return true;
        }
        return false;
    }

    //calisma 19
    public static char[] foo6(String s, int begin, int end) {

        String s1 = s.substring(begin, end);
        char[] ch = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(ch[i]);
        }
        return ch;

    }

    //calisma-16
    public static boolean foo5(String a, String b) {
        if (a.equals(b)) {
            return true;
        }
        return false;
    }

    //calisma 14
    public static boolean foo4(int a, int b, int c, int d) {
        if (a < b && b < c && c < d) {
            return true;
        }
        return false;
    }

    //calisma-15
    public static char foo3(String a, int b) {
        return a.charAt(b);
    }

    //calisma 13
    public static boolean foo2(int a, int b, int c, int d) {
        if (a == b || a == c || a == d) {
            return true;
        }
        if (b == c || b == d) {
            return true;
        }
        if (c == d) {
            return true;
        }
        return false;

    }
    //calisma-12

    public static int foo1(int a) {
        if (a > 0) {
            return 1;
        } else if (a < 0) {
            return -1;
        }
        return 0;

    }

    /**
     * @param args the command line arguments
     */
    //calisma-9
    public static void foo(int a, char c, boolean altAlta) {
        if (altAlta == true) {
            System.out.println("atlalta");
            for (int i = 0; i < a; i++) {
                System.out.println(c);
            }
        } else {
            System.out.println("yanyana");
            for (int i = 0; i < a; i++) {
                System.out.print(c);
            }
            System.out.println("\n");
        }
    }

}
