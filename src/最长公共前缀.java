public class 最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null){
            return "无";
        }
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            prefix = longPrefix(prefix,strs[i]);
            if(prefix.length() == 0){
                return "无";
            }
        }
        return prefix;
    }
    public static String longPrefix(String str1,String str2){
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
}
