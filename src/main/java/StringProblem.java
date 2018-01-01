/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */
public class StringProblem {
    /**
     * 判断字符串str1，str2，是否为变形词
     * @param str1
     * @param str2
     * @return
     */
    public boolean  isDeformation(String str1,String str2){
        if(str1==null||str1.length()!=str2.length()){
        return false;
        }
        char[] chas1= str1.toCharArray();
        char[] chas2= str2.toCharArray();
        int[] map=new int[256];
        for (int i=0;i<chas1.length;i++){
            map[chas1[i]]++;
        }
        for (int i = 0; i <chas2.length; i++) {
            if (map[chas2[i]]-- == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 返回一组字符串中数字的和
     * @param str
     * @return
     */
    public int numSum(String  str){
        if(str == null){
            return 0;
        }
        char[] charArr=str.toCharArray();
        int res=0;
        int num=0;
        boolean posi=true;
        int cur=0;
        for (int i = 0; i <charArr.length; i++) {
            cur=charArr[i]-'0';
            if(cur<0||cur>9){
                res+=num;
                num=0;
                if(charArr[i]=='-'){
                    if(i-1>-1&charArr[i-1]=='-'){
                        posi=!posi;
                    }else {
                        posi=false;
                    }
                }else {
                    posi=true;
                }
            }else {
                num=num*10+(posi?cur:-cur);
            }
        }
        res+=num;
        return res;
    }


}
