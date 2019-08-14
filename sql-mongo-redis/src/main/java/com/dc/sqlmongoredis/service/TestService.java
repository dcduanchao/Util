package com.dc.sqlmongoredis.service;

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

        System.out.println(reverse(123456));
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


    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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


}
