package lianxi;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/10/15.
 */
public class ExceptionClassTest {
    public ExceptionClassTest()
        throws FileNotFoundException{

    }


    public static void main(String[] args) {

        try {
            int x=1;
            int y=0;
//
        System.out.println(x/y);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("发生了ArrayIndexOutOfBoundsException异常");
//
        }catch (ArithmeticException e){
            System.out.println("发生了ArithmeticException异常");
        }catch (Exception e){
            System.out.println("发生了Exception异常");
        }
        finally {
            System.out.println("南无阿弥陀佛");
        }
        System.out.println("南无地藏菩萨摩诃萨");
        try {
//
        String s="zuo";
        System.out.println(s.charAt(3));
        System.out.println("南无观世音菩萨摩诃萨");
        System.out.println("南无药师琉璃光如来");
        System.out.println("南无月光遍照菩萨");
//
        }catch (StringIndexOutOfBoundsException e){
            System.out.println();
//
        }finally {
            System.exit(0);
        }
//
        System.out.println("南无本师释迦牟尼佛");
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile("","");//受检异常
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IllegalArgumentException e){//非受检异常。

        }
        try {
            ExceptionClassTest exceptionClassTest=new ExceptionClassTest();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
