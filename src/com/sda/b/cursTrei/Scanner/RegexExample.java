package com.sda.b.cursTrei.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

        String s = "Test test test1 test2";
        System.out.println(s.replaceAll("e", "a"));

        String a = "Abc abc abcd asdf qwretfa";
        System.out.println(a.replaceAll("a*b", "m"));
        System.out.println("-------------");

        String patternString = "abcde";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher("abcde");
        System.out.println(matcher.matches());
        System.out.println("-------------");

        String patternString1 = "a*b";
        Pattern pattern1 = Pattern.compile(patternString);
        Matcher matcher1 = pattern.matcher("ab");
        System.out.println(matcher.matches());
        System.out.println("-------------");

        String patternString2 = "a*b";
        Pattern pattern2 = Pattern.compile(patternString);
        Matcher matcher2 = pattern.matcher("aaaab");
        System.out.println(matcher.matches());
        System.out.println("-------------");

        String patternString3 = "a*b";
        Pattern pattern3 = Pattern.compile(patternString);
        Matcher matcher3 = pattern.matcher("aaabc");
        System.out.println(matcher.matches());
        System.out.println("-------------");

        String patternString4 = "a*b*c";
        Pattern pattern4 = Pattern.compile(patternString);
        Matcher matcher4 = pattern.matcher("aaabbbc");
        System.out.println(matcher.matches());
        System.out.println("-------------");

        String patternString5 = "a+b";
        Pattern pattern5 = Pattern.compile(patternString);
        Matcher matcher5 = pattern.matcher("abbb");
        System.out.println(matcher.matches());
        System.out.println("-------------");

        String patternString6 = "a+b";
        Pattern pattern6 = Pattern.compile(patternString);
        Matcher matcher6 = pattern.matcher("aaa");
        System.out.println(matcher.matches());
        System.out.println("-------------");

        String patternString7 = "a+b";
        Pattern pattern7 = Pattern.compile(patternString);
        Matcher matcher7 = pattern.matcher("bbb");
        System.out.println(matcher.matches());
        System.out.println("-------------");

        String patternString8 = "a?b";
        Pattern pattern8 = Pattern.compile(patternString);
        Matcher matcher8 = pattern.matcher("aaa");
        System.out.println(matcher.matches());

    }
}
