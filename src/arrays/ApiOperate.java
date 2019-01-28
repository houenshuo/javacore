package arrays;

import java.util.Arrays;

public class ApiOperate {
    public static void main(String[] args) {
        int a[] ={1,2,34,2,1};
        int b[] ={1,2,34,2,1};
        /**
         * 二分查找 binarySearch
         */

        /**
         * 多位数组相等deepEquals
         * 实现思想：递归，分为object类型的数组和基本类型的数组，前者比较引用等后者还要比较对应的元素相同
         * 使用场景：
         * 1，多维数组
         * 使用规则：
         * 1，参数是object类型的
         */

        /**
         *多维数组的个数输出 格式[]  deepToString
         * 使用规则：
         * 1，参数是object类型的
         */
        Object aa[][] ={{1,2},{3,4},{5}};
        System.out.printf(Arrays.deepToString(aa));

        /**
         * 填充数组
         *
         * 应用场景：
         * 1，电话号码15762186638 变成157****6638
         * 使用规则：
         * 1，fromIdex下标是0开始的
         * 2，如果指定的索引范围大于原数组的长度 则会抛出异常ArrayIndexOutOfBoundsException
         * **/
        int arr[] = new int[] {23,23,234,23,4,56,1};
        Arrays.fill(arr,0,1,0);// 开始位置包括  结束位置不包括
        /**
         * 复制数组 copyof() copyofrange()
         *
         * 使用场景：
         * 1，获取 一串数据的某部分
         * 使用规则：
         * 1，如果长度大于原数组的长度 则会填充0（数字）或者null(字符)
         * 2，如果长度小于原数组的长度 则默认从原数组的开始一直截取指定的长度
         */
        /**
         *
         */
    }
}
