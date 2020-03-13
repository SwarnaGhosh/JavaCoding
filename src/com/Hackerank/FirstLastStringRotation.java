package com.Hackerank;

public class FirstLastStringRotation {
    public static void main(String[] args) {
        String str="Hackerrank is Awesome";
        System.out.println(reverse(str));
    }
    private static String reverse(String str){

        char ch[]=str.toCharArray();
        int n=ch.length;
        int k=0;

        for (int i=0;i<n;i++){
            k=i;

            while(i<n && ch[i]!=' '){
                i++;
            }
            char temp=ch[k];
            ch[k]=ch[i-1];
            ch[i-1]=temp;

        }
        return new String(ch);
    }

}
