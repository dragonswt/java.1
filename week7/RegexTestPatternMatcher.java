package week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestPatternMatcher {

	   public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

       public static void main(String[] args) {
               Pattern pattern = Pattern.compile("\\w+");
               // 如果您想忽略大小写敏感度,
               // 你可以使用这个语句:
               // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
               Matcher matcher = pattern.matcher(EXAMPLE_TEST);
               // 检查所有的结果
               while (matcher.find()) {
                       System.out.print("Start index: " + matcher.start());
                       System.out.print(" End index: " + matcher.end() + " ");
                       System.out.println(matcher.group());
               }
               // 现在创建一个新的pattern和Matcher 以用选项卡替换空格s
               Pattern replace = Pattern.compile("\\s+");
               Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
               System.out.println(matcher2.replaceAll("\t"));
       }
}
