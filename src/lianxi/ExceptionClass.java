package lianxi;

/**
 * Created by Administrator on 2016/10/15.
 */
public class ExceptionClass {
    //private static void string(){
    //    String[]strings=new String[1];
    //    System.out.println(strings[1]);
    //}
    public static void main(String[] args) {
        //string();

        try {
            System.out.println(args[0]);
        }finally {
            System.out.println("zuobin");
        }
        System.out.println("南无地藏菩萨摩诃萨！");
        //try {
        //    System.out.println(args[0]); // ArrayIndexOutOfBoundsException
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    e.printStackTrace();
        //}

        //System.out.println("test...");
        //String s="zuo";
        //try {
        //System.out.println(s.charAt(3));
        //}catch (StringIndexOutOfBoundsException e){
        //    e.printStackTrace();
        //}
        //System.out.println("南无阿弥陀佛");



    }
}
