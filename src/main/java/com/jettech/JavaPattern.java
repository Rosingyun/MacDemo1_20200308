package com.jettech;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaPattern {
    public static void main(String[] args) {
    JavaPattern.patternGroup();
    JavaPattern.patternStarEnd();
    JavaPattern.patternLookingAt();
    JavaPattern.patternReplace();
    JavaPattern.patternAppendReplacement();

    }
    public static void patternGroup(){
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        //创建pattern对象
        Pattern p = Pattern.compile(pattern);

        //创建matcher对象
        Matcher m = p.matcher(line);
        if (m.find()){
            System.out.println("Found value:"+m.group(0));
            System.out.println("Found value:"+m.group(1));
            System.out.println("Found value:"+m.group(2));
            System.out.println("Found value:"+m.group(3));
        }else{
            System.out.println("Not Found");
        }
    }
    public static void patternStarEnd(){
        String regex = "\\bcat\\b";
        String Input = "cat cat cat cattie cat";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(Input);
        int count = 0;
        while(m.find()){
            count++;
            System.out.println("Matcher Number:"+count);
            System.out.println("start():"+m.start());
            System.out.println("end():"+m.end());
        }
    }
    public static void patternLookingAt(){
        String regex = "foo";
        String input = "fooooooooooooooooo";
        String input1 = "ooooofoooooooooooo";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(input);
        Matcher matcher1 = p.matcher(input1);

        System.out.println("Current Regex is:"+regex);
        System.out.println("Current input is:"+input);
        System.out.println("Current input1 is:"+input1);

        System.out.println("looking at():"+matcher.lookingAt());
        System.out.println("matches():"+matcher.matches());
        System.out.println("looking at():"+matcher1.lookingAt());
    }
    public static void patternReplace(){
        String regex = "dog";
        String input = "The dog says meow. " +
                       "All dogs say meow.";
        String replace = "cat";

        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(input);
        input = matcher.replaceAll(replace);
        System.out.println(input);

    }
    public static void patternAppendReplacement(){
        String regex = "a*b";
        String input = "aabfooaabfooabfoobkkk";
        String replace = "-";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(sb,replace);
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());

    }
}
