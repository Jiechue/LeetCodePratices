import java.util.*;

public class 电话号码的字母组合 {
    // 数字对应字母
    private static Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    // 结果
    private static List<String> res = new ArrayList<String>();
    private static String digits = new String();

    public static void backtrack(List<String> res, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()){
            res.add(combination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);
        for (int i = 0 ; i<letters.length();i++){
            combination.append(letters.charAt(i));
            backtrack(res,phoneMap,digits,index+1,combination);
            System.out.println(combination.charAt(index));
            combination.deleteCharAt(index);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入数字:");
        Scanner input = new Scanner(System.in);
        digits = input.next();
        backtrack(res,phoneMap,digits,0,new StringBuffer());
        System.out.println(res);
    }
}
