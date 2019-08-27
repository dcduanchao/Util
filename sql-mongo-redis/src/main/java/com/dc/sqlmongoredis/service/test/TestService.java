package com.dc.sqlmongoredis.service.test;

import java.util.*;

/**
 * @author duanchao
 * @CreateDate: 2019/8/14 0014 13:38
 */
public class TestService  {

    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5,6,7,8,9};
//        int[] ints = twoSum(a, 10);
//        for (int anInt : ints) {
//            System.out.println(anInt);
//
//        }
//*****************
//        System.out.println(reverse(123456));
        //**************************
//            int[][] a = {{0,1,1},{1,1,1},{0,1,1}};
//            int[][] ints = updateMatrix(a);
//
//        System.out.println("*********");
//        for (int i=0;i<ints.length;i++){
//            for (int j = 0;j<ints[0].length;j++){
//                System.out.print(ints[i][j]  );
//            }
//            System.out.println();
//        }

//        System.out.println(isHappy1(123));
        //**************************
//        int[] b ={1,1,1,0,0,1,1,1,1,0};
//        System.out.println(isOneBitCharacter(b));
        //*************************
//        int[] a ={5,14,53,80,48};
//        int[] b ={50,47,3,80,83};
//        int length = findLength(a, b);
//        System.out.println(length);

//
//        int[] a ={5,1,3,2};
//        System.out.println(l456(a));

//        System.out.println(minSteps(7));
        System.out.println(addBinary("1010","1011"));
    }




    private static int[] twoSum(int[] nums, int target) {


        for (int i=0;i<nums.length-1;i++) {
            for (int j=i+1;j<nums.length;j++) {
                int sum = nums[i]+nums[j];
                if(sum==target){
                   return new int[]{i,j};

                }
            }

        }
        return null;
    }

    private static  int reverse(int x) {
        int result = 0;
        while (x!=0){
            int la = x%10;
            x= x/10;
            if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE&&la>0)){
                result = 0;
                return result;
            }
            if(result<Integer.MIN_VALUE/10||(result==Integer.MIN_VALUE&&la>0)){
                result = 0;
                return result;
            }

            result = result*10+la;
        }
        return result;


    }


    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
      int c = 0;
      while (l1!=null|| l2!=null){
          int x = l1==null?0:l1.val;
          int y = l2==null?0:l2.val;
          int sum = x+y+c;

          c = sum/10;
          sum =sum%10;
          cur.next = new ListNode(sum);
          cur = cur.next;
          if(l1 != null){
              l1 = l1.next;
          }
          if(l2 != null){
              l2 = l2.next;

          }
      }
        if(c == 1) {
            cur.next = new ListNode(c);
        }
        return pre.next;

    }

    static int[][] updateMatrix(int[][] matrix) {
         int x = matrix.length;
         int y = matrix[0].length;
        int[][] r = new int[x][y];
        for (int i=0;i<x;i++){
            for (int j = 0;j<y;j++){
                if(matrix[i][j]==0){
                    r[i][j]=0;
                }else{
                    boolean flag = true;
                    for (int m = x-1; m >= 0; m--) {
                        for (int n = y-1; n >= 0; n--) {
                            if (m != x && n != y && 0 == matrix[m][n]) {
                                int m1 = m - i;
                                int m2 = n - j;
                               int v =  (m1 > 0 ? m1 : m1 * -1) + (m2 > 0 ? m2 : m2 * -1);
                                r[i][j] = v;
                                flag=flag;
                                break;
                            }
                        }

                    }
                    if(flag){
                        r[i][j] =1;
                    }
                }
            }
        }


        return r;
    }

    static boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
      while (true){
          while (n!=0){
              sum+=Math.pow(n%10,2);
              n=n/10;
          }
          if(sum==1){
              return true;
          }else{
              n=sum;
              sum=0;
              if(set.contains(n)){
                  return  false;
              }else {
                  set.add(n);
              }
          }
      }
    }


    static boolean isHappy1(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=squareSum(slow);
            fast=squareSum(fast);
            fast=squareSum(fast);
        }while(slow!=fast);
        if(fast==1)
        {return true;}
        else{ return false;}
    }

    static int squareSum(int m){
        int squaresum=0;
        while(m!=0){
            squaresum+=(m%10)*(m%10);
            m/=10;
        }
        return squaresum;
    }

    static boolean isOneBitCharacter(int[] bits) {
        int length = bits.length;
        if(length==1){
            return true;
        }
        int i =0;

        while (true){
            if(bits[i]==0){
                i++;
                if(i>=length){
                    return true;

                }
            }else{
                i=i+2;
                if(i>=length){
                    return false;
                }
            }
        }

    }

    static int findLength(int[] A, int[] B) {
        int al = A.length;
        int bl = B.length;
        int max = 0;
        int[][] p = new int[al][bl];
        for(int i = 0;i<al;i++){
            for (int j=0;j<bl;j++){
                if(i==0||j==0){
                    if(A[i]==B[j]){
                        p[i][j]=1;
                    }else {
                        p[i][j]=0;
                    }
                }else{
                        if(A[i]==B[j]){
                            int p1 = p[i-1][j-1];
                            if(p1!=0){
                                p[i][j]=p1+1;
                                max = max<p1+1?p1+1:max;
                            }else{
                                p[i][j]=1;
                                max = max<1?1:max;
                            }

                        }else {
                            p[i][j] = 0;
                        }
                }
            }
        }

       return max;

    }

    static boolean find132pattern(int[] nums) {
       int le =  nums.length;
        for (int i =0;i<le-2;i++){
            for (int j= i+1;j<le-1;j++){
                if(nums[i]<nums[j]){
                    for (int k=j+1;k<le;k++){
                        if(nums[i]<nums[k]&&nums[k]<nums[j]) {
                       return true;
                        }
                    }
                }
            }

        }
        return false;

    }

    public static boolean l456(int[] nums) {
        //如果数组长度小于三，返回false
        if (nums.length < 3) {
            return false;
        }
        //定义递增区间的头和尾
        int head = 0;
        int tail = 0;
        //当前得到的数组的最小值,最大值
        int min = nums[0];
        int max = nums[0];
        //是否是递增趋势
        boolean up = false;
        //定义一个储存区间的数据结构
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {


            if (nums[i] > nums[i - 1]) {
                //如果是后一个比前一个大，更新尾
                tail = i;
                if (!up){
                    //更新头为第一个，确定当前是递增趋势（至少需要两个数才能判断是否为递增趋势）
                    head = i - 1;
                    //确定递增趋势，不再更新头。
                    up = true;
                }
            }
            if (nums[i] < nums[i - 1]) {
                //递增趋势结束
                up = false;
                //存放区间
                map.put(head, tail);
                //更新最小值和最大值
                min = Math.min(nums[head], min);
                max = Math.max(max, nums[tail]);
            }
            //判断是否应该进行与区间两端进行比较
            if (nums[i] > min && nums[i] < max) {
                for (Integer integer : map.keySet()) {
                    //判断132模式
                    if (nums[i] > nums[integer] && nums[i] < nums[map.get(integer)]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static  int minSteps(int n) {


        int res = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                res += i;
                n /= i;
            }
        }
        return res;

    }


    public static String addBinary(String a, String b) {
        int al = a.length();
        int bl = b.length();
        String s = "";
        int i = 0;
        while (true) {
            al = al - 1;
            bl = bl - 1;
            int ac = 0;
            int bc = 0;

            if (al >= 0) {
                ac = a.charAt(al) - '0' == 0 ? 0 : 1;
            }
            if (bl >= 0) {
                bc = b.charAt(bl) - '0' == 0 ? 0 : 1;
            }

            if(al<0&&bl<0){
                if(i==1){
                    return 1+s;
                }
                return s;
            }
            int k = ac + bc + i;
            if (k == 3) {
                i = 1;
                s = 1 + s;
            } else if (k == 2) {
                i = 1;
                s = 0 + s;
            } else {
                i = 0;
                s = k + s;
            }

        }
    }



    static int arrayNesting(int[] nums) {
       int l = nums.length;
        List<Integer> list = new ArrayList<>();

        int count = 0;



        return 0;
//
    }


}
