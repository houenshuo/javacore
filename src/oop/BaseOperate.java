package oop;

public class BaseOperate {


    /**
     * 不定长的参数
     * 使用规则：
     * 1，不定长的参数必须是最后一个参数
     */
    public int add(int... x){
        int result = 0;
        for(int i = 0;i < x.length;i++){
            result += x[i];
        }
        return result;
    }
}
