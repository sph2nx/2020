/* Java SE：标准版
   Java EE：企业版
   Java ME：微型版

   源代码 -> （javac）-> 字节码 -> JVM(java) -> 运行软件
   java命令后面 无文件后缀

   JVM,JRE,JVM 从小到大

*/

public class qiuzhi2020 { //类名必须与文件名相同
    public static void main(final String[] args) {
        //标识符 可以包含字母、数字、下划线、美元号,不能数字开头
        //java 语言大小写敏感
        // int 1a = 1;  //错误
        int _a1$ = 1;
        _a1$ = _a1$ + 1; //可以是美元号
        System.out.println("Hello,world");
        //变量字符串
        String a = "aa";//双引号
        System.out.println(a);
/* 变量名由多单词组成时，
第一个单词的首字母小写，其后单词的首字母大写，
俗称骆驼式命名法（也称驼峰命名法）

java是强类型语言，必须变量由类型
*/
        byte byteA = 1; // short int long float double char boolean class interface
        System.out.println(byteA);
        float floatB = 2.0f; // char level = 'A'; char 单引号 string双引号
        floatB = floatB + 1;
        // String 是一种引用类型，不是基础类型
        // 变量先声明 后使用
        // 自动类型转换 从位数上考虑 如double 和 int可以转换 int ->char不可以
        // double a = 1.0；double转int 需要进行数据截断 会有精度丢失
        double aa = 1.1;
        int bb = (int) aa;
        bb = bb + 1;
        // 单行注释
        /**文档注释
         */
        /*多行注释 javadoc
         */
        final double PI = 3.14;
        System.out.println(PI);
    }
}
