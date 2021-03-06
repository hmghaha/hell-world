# Learning Java
## 对象交互
### 对象属性
- private  
1. 只有这个类内部可以访问
2. 类的内部指 类的成员函数和初始化  
3. 这个限制是对类的不是对对象的（既对象A的成员函数可以访问同一类的对象B的私有变量） 

- public  
  public class必须定义在自己的文件里 既类名跟文件名必须相同  
  一个编译单元（java文件）最多有一个public class，其他的class只能在当前package里使用  
### 包
- 包是Java的类库管理机制，它借助文件系统的目录来管理类库，一个包就是一个目录，该包内所有类必须放到该目录下，目录名就是包名。

### 类变量
- 类有成员变量和成员函数；
- 类的static成员不再属于某个对象而是属于整个类；
- static函数不能访问非static成员变量和成员函数；
- 类函数（static函数）没有this，因为this是指向当前对象的引用，而类函数是无关对象的。

### 对象容器
- 容器（collection/container）就是具有自动增长容量的存放数据的一种数据结构。
- 对象数组中每个元素都是对象的管理者（引用）而不是对象本身；
- 1. java方法基本数据类型传值，对象类型传引用；
  2. 当参数是对象时，无论方法体内进行了何种操作，都不会改变实参 对 对象的引用。
  3. 当参数是对象时，只有在方法内部改变了对象的内容时，才会改变实参对象内容。
  4. 三个点“...”表示不定长参数如（int ... nums）。
### 散列表（Hash）
- 传统意义上的Hash表，是以int做值，将数据存放起来的数据结构。Java的Hash表可以以任何实现了Hash()函数的类的对象做值来存放对象。
# 对象
## 初始化
- Person p = new Person（a，b）
1. 找到Person.class文件加载到内存
2. 执行该类中的static代码块，对Person.class进行初始化
3. 在堆内存中开辟空间，分配内存地址
4. 在堆内存中建立对象的特有属性，并进行默认初始化。
5. 属性显示初始化
6. 构造代码块初始化
7. 构造函数初始化
8. 内存地址赋给栈内存中的p变量

# 继承与多态
## 子类与父类关系
1. 子类继承了父类的所有东西包括变量和方法，除了构造方法。
2. 但不同的访问属性决定了子类如何使用这些成员，无法直接使用父类private的成员，但可以通过父类的方法调用父类的private成员。
3. super()方法用来向父类构造函数传递参数，只能位于子类构造函数第一行，且只能调用一次。
## 多态变量和向上造型
1. 子类的对象可以赋值给父类的对象。
2. Java 的对象变量是多态的它可以保存声明类型或者声明类型子类的对象

# 设计原则
- 消除代码复制，一个方法只负责一个特定意义明确的操作
- 可扩展性，使封装降低耦合度。
- 框架和数据可增加扩展性。

# 异常处理与输入输出
## 异常机制
- 异常机制可以把正常的业务逻辑代码跟异常处理代码分离。
- 异常声明
  1. 如果你的函数可能抛出异常，就必须在函数头部加以声明
  void f() throws TooBig, TooSmall, ...{...}
  2. 如果你调用一个声明会抛出异常的函数，你必须把函数的调用放到try块中，并设置catch来捕捉所有可能抛出的异常；或者声明自己会抛出无法处理的异常。
  3. 当覆盖一个函数的时候，子类不能声明抛出比父类的版本更多的异常。
  4. 在子类的构造函数中必须声明父类可能抛出的全部异常。
## 断言
- 断言机制允许在测试期间向代码中插入一些检查语句。代码发布时这些插入的检测语句将会被自动地移走。
- 断言默认禁用 运行时加 -ea 启用
- 断言失败是致命的。不可恢复的错误。断言检查只用于开发和测试。
## 记录日志
- 记录日志API优点
  1. 可以轻易取消全部或个某个级别的日志。
  2. 可以简单地禁止日志记录的输出。
  3. 可以对日志进行过滤。
  4. 可以用不同的方式格式化。

## 处理异常
- 抛出异常
  1. 找到一个合适的异常类
  2. 创建这个类的一个对象
  3. 将对象抛出
- 自定义异常类
  1. extends Exception或其子类
  2. 包含两个构造器，默认构造器和带有详细描述信息的构造器

## 捕获异常
- 再次抛出异常
  1. 将原始异常设置为新异常的“原因” e2.initCause(e1)


# 多线程
## 线程间通讯
- 线程间通讯就是多个线程操作同一数据，但是操作动作不同。
- 线程安全 synchronized()

# String
1. 
2. 判断
3. 转换
4. 替换  
  String replace(oldchar, newChar)
5. 切割  
  String[] split(regex)
6. 子串  
  String substring(begin)  
  String substring(begin, end) 包头不包尾
7. 转换，去除空格，比较
  - 大小写转换  
  String toUpperCase()  
  String toLowerCase()
  - 去除两端空格  
  String trim()
## 应用
1. 字符串反转
- 转成数组，数组反转，转成字符串
2. 判断字符串A在B里出现了几次  
  while（B.indexOf(A, pos+A.length()) ！= -1）{
  pos = B.indexOf(A, pos+A.length()；
  }
3. 获取两个字符串最大的公共子串
- 获取一个字符串的所有子串，判断子串是否是另一个字符串的子串
## StringBuffer 
- StringBuffer 线程同步 效率低
- StringBuilder 线程不同步 效率高

# 集合 Collection
- List 元素有序，可重复
  - ArrayList 底层使用数组，查询快，增删稍慢；线程不同步
  - LinkedList 底层使用链表，增删快，查询慢
  - Vector 底层使用数组，历史遗留，增删查询慢；线程同步
- Set 元素无序，不可重复
  - HashSet 底层哈希表，根据HashCode和equals判断元素是否相同

# 设计模式
- 解决某一类问题的最佳解决方案
- java 有23种设计模式
## 单例设计模式
- 一个类在内存中只存在一个对象
- 如何保证对象唯一
1. 禁止其他程序建立该对象，避免其他程序过多建立该对象
2. 本类中自定义一个对象， 供其他程序访问
3. 对外提供一些访问方式
- 代码体现
1. 构造函数私有化
2. 在类中建立一个本类对象
3. 提供访问方式
- 先初始化对象（饿汉式）(定义时 优先考虑)
```java
class Single{
  private Single();
  private static Single s = new Single();
  public static Single getTnstance(){
    return s;
  }
}
```
- 调用方法时 才初始化对象 对象的延时加载（懒汉式）
```java
class Single{
  private static Single s = null;
  private Single();
  public static Single getTnstance(){
    if(s == null)
      s = new Single();
    return s;
  }
}
```
- 饿汉式 加锁 
```java
class Single{
  private static Single s = null;
  private Single();
  public static Single getTnstance(){
    if(s == null){
      synchronized(Single.class){
        if(s == null)
          s = new Single();
      }
    } 
    return s;
  }
}
```