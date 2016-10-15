package lianxi;

import java.awt.geom.Arc2D;

/**
 * Created by Administrator on 2016/10/15.
 */
public class FanXingClass<T,S> {
    public String add(T t ,S s){
        return String.valueOf(t)+String.valueOf(s);


    }
    public static void main(String[] args) {
        FanXingClass<Integer,Integer> fanXingClass=new FanXingClass<>();
        String s=fanXingClass.add(1,10);
        System.out.println(s);
        FanXingClass<Integer,Double> fanXingClass1=new FanXingClass<>();
        String s1=fanXingClass1.add(1,1.6);
        System.out.println(s1);

    }
}
