package com.aihqx.mytest;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 *
 * @author huqingxiang
 * @date 2018/1/30 下午3:02
 */
public class BallFall {
    public static void ballFlip(double m, double n){

        StringBuilder sb = new StringBuilder();
        //从m米开始落下来
        double height = m;
        //第一次落下到弹上来 ，所走的米数 = 本身的高度 + 本身的高度 / 2
        double sum = m + m/2;

        System.out.println("第0次所在高度：" + height + " ");
        sb.append(m +" + " + m/2 + " + ");

        for(int i=0; i<n-1; i++){
            //第i次，落下后反弹的高度
            height = m/2;
            m = height;

            System.out.println("第"+ (i+1) +"次所在高度："+height + " ");

            if(i+1 >= n){
                //最后一次没有 ： 本身的高度 / 2
                sum += height;
                continue;
            }
            //第i次落下到弹上来 ，所走的米数 = 本身的高度 + 本身的高度 / 2
            sum += height + height/2;
            sb.append(height +" + " + height/2 + " + ");
            if(i%5 == 0){
                sb.append("\n");
            }
        }

        sb.insert(0, sum + "=");
        String s = sb.substring(0, sb.length()-2);
        System.out.println("第10次所在高度：" + height/2 + " ");
        System.out.println();

        System.out.println(s);

    }

    public static void main(String[] args) {

        ballFlip(100, 10);

    }
}
