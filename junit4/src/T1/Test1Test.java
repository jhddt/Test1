package T1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

//        Assert.assertTrue(true);//判断为真的断言
//        Assert.assertFalse(false);//判断为假的断言
//        Assert.assertNull(null);//空
//        Assert.assertNotNull("question");//非空
//        Assert.assertEquals(2,2);//相等
//        Assert.assertNotSame(2,1);//不相等


public class Test1Test {


    @Test
    public void main() {
        Test1 test1 = new Test1();
        //测试程序数据是否存入固定地址的.txt文件中(默认为true)
        File f=new File("D:\\qq文件\\1876990651\\FileRecv\\大数据相关软件\\idea2020.1\\junit4\\runoob.txt");
        Boolean a=f.exists();
        String s1=String.valueOf(a);//将Blooean的a的值转换为String
        //如果a为true则文件存在，否则不存在
        Assert.assertEquals("true",s1);
        Assert.assertTrue(a);
}

    @Test
    public void makeFormula() {
        Test1 test1 = new Test1();
        Assert.assertNotNull(Test1.MakeFormula());//测试是否生成随机式子
    }



    @Test
    public void solve() {
        Test1 test1 = new Test1();
        //测试计算
        String sz=Test1.Solve("52+48");
        Assert.assertEquals("52+48=100",sz);//相等
    }
}