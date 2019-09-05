package javatest.a;

public class Test1 {
    public static boolean isChinese(char c){
        String sb = String.valueOf(c);
        return sb.getBytes().length>1 ? true : false;
    }

    public String truncateStr(String str,int len)
    {
        if(str == null || str.equals("")||len == 0)
            return "";
        char[] chrArr = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        for(char cc:chrArr){
            if(count<len){
                if(isChinese(cc))
                {
                    if(count+1 == len)
                        return sb.toString();
                    count = count + 2;
                    sb = sb.append(cc);
                }
                else
                {
                    count = count + 1;
                    sb = sb.append(cc);
                }
            }
            else{
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Test1 splitStr = new Test1();
        String sb = "人ABC们DEF";
        System.out.println(splitStr.truncateStr(sb,7));
    }
}
