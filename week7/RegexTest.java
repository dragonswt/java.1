package week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main( String args[] ){

        // ��ָ��ģʽ���ַ�������
        String line = "My name is Jianguotang��I am a Android programmer.I am 21 years old";
        String pattern = "(\\D*)(\\d+)(.*)";

        // ���� Pattern ����
        Pattern r = Pattern.compile(pattern);

        // ���ڴ��� matcher ����
        Matcher m = r.matcher(line);
        if (m.find( )) {
           System.out.println("Found value: " + m.group(0) );
           System.out.println("Found value: " + m.group(1) );
           System.out.println("Found value: " + m.group(2) );
           System.out.println("Found value: " + m.group(3) ); 
        } else {
           System.out.println("NO MATCH");
        }
     }
}
