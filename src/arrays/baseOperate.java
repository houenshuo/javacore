package arrays;

/**
 * Created by xinhongru on 2019/1/24.
 */
public class baseOperate {
    public static void main(String args[]){
        baseOperate b = new baseOperate();
        b.twoArray_Use();

    }

    // 基础的说明
    public void info(){
        // 数组 声明 创建 初始化

        /** 初始化的三种方式
         * 1 同理二维数组
         * 2 java支持高维数组 但是不建议使用 而是使用集合类和自定义类
         * **/
        int a[] = {1,2,3};// 第一种
        int b[] = new int[]{4,5,6};// 第二种
        int c[] = new int[3];
        c[0] = 7;
        c[1] = 8;
        c[2] = 9;
        // 不规则的二维数组
        int d[][] = new int[3][];// 指定行数 不指定列数  但是 规则的二维数组中不用指定
        d[0] = new int[]{1,2,3};
        d[1] = new int[]{4,5};
        d[2] = new int[]{6};
    }

    public void twoArray_Use(){
        char arr[][] =new char[4][];
        arr[0] = new char[]{'春','眠','不','觉','晓'};
        arr[1] = new char[]{'处','处','闻','啼','鸟'};
        arr[2] = new char[]{'夜','来','风','雨','声'};
        arr[3] = new char[]{'花','落','知','多','少'};

        // 输出横版

        // 重点 ： 二维数组的输出方式
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            // 输出逗号
            if(i % 2 == 0){
                System.out.println("，");
            }else{
                System.out.println("。");
            }
        }
        System.out.println("----------------------");
        // 输出竖版
        for(int i = 0;i < arr[0].length;i++){
            for(int j =0;j < arr.length;j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }


}
