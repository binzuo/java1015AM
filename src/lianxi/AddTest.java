package lianxi;

/**
 * Created by Administrator on 2016/10/15.
 */
public class AddTest {
    public String getAdd(int a,int b){
        return String.valueOf(a)+String.valueOf(b);
    }
    public String getAdd(double x,double y){
        return String.valueOf(x)+String.valueOf(y);
    }
    public String getAdd(boolean m,boolean n){
        return String.valueOf(m)+String.valueOf(n);
    }



    public static void main(String[] args) {
        AddTest addTest=new AddTest();
        System.out.println(addTest.getAdd(1,2));
        System.out.println(addTest.getAdd(1.5,2.8));
        System.out.println(addTest.getAdd(true,false));

    }
}
