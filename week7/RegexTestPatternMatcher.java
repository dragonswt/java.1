package week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestPatternMatcher {

	   public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

       public static void main(String[] args) {
               Pattern pattern = Pattern.compile("\\w+");
               // ���������Դ�Сд���ж�,
               // �����ʹ��������:
               // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
               Matcher matcher = pattern.matcher(EXAMPLE_TEST);
               // ������еĽ��
               while (matcher.find()) {
                       System.out.print("Start index: " + matcher.start());
                       System.out.print(" End index: " + matcher.end() + " ");
                       System.out.println(matcher.group());
               }
               // ���ڴ���һ���µ�pattern��Matcher ����ѡ��滻�ո�s
               Pattern replace = Pattern.compile("\\s+");
               Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
               System.out.println(matcher2.replaceAll("\t"));
       }
}
