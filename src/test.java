/**
 * Created by xinhongru on 2019/1/24.
 */
public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.print(t.replaceSpace(new StringBuffer("we are jue")));
    }
    public String replaceSpace(StringBuffer str) {
        StringBuffer s = new StringBuffer();
        int from = 0;
        int i = 0;
        for (i = 0;i < str.length() ;i++){

            if(str.charAt(i) == ' '){
                if(from < i){
                    s.append(str.substring(from,i));
                }
                s.append("%20");
                from = i+1;
            }
        }
        if(from != str.length()){
            s.append(str.substring(from,i));
        }
        return s.toString();
    }
}
