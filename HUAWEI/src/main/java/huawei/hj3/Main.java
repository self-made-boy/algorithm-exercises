package org.jwy.huawei.hj3;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 描述
 * 明明生成了 N 个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 *
 * 数据范围： 1≤n≤1000  ，输入的数字大小满足 1≤val≤500
 * 输入描述：
 * 第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。 具体格式可以参考下面的"示例"。
 * 输出描述：
 * 输出多行，表示输入数据处理后的结果
 *
 * 示例1
 * 输入：
 * 3
 * 2
 * 2
 * 1
 *
 * 输出：
 * 1
 * 2
 *
 * 说明：
 * 输入解释：
 * 第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到500之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
 * 2
 * 2
 * 1
 * 所以样例的输出为：
 * 1
 * 2      
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // treeSet天生适合这个场景,去重排序
        TreeSet<Integer> ret = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            ret.add(scanner.nextInt());
        }
        for (Integer integer : ret) {
            System.out.println(integer);
        }
    }
}
