## Keywords 关键字

### class 类

用于创建/定义一个类，类是Java最基本的组成单元

public class HelloWorld {}

### Scanner

读取输入的内容

## Literal 字面量

Integer 整数类型：不带小数点的数字

Floating-point numbers 浮点类型：带小数点的数字

Strings 字符串类型：用双引号括起来的内容

Characters 字符类型：单引号括起来的内容，内容有且仅有一个

Boolean 布尔类型：表示真假，只有两个值 true&false

Null 空类型：一个特殊的值 null

## Variable 变量

变量只能存储一个值，变量名不允许重复定义，一条语句可以定义多个变量，变量在使用前一定要进行赋值，注意变量的作用域范围

变量的定义格式：数据类型 变量名 = 数据值；

## 项目结构

- Project 项目
- Module 模块
- Package 包
- Class 类

## 原码、反码、补码

**True form 原码**：十进制数据的二进制表现形式，最左边是符号位：0为正，1为负

最大值为：0 1 1 1 1 1 1 1 （+127）

最小值为：1 1 1 1 1 1 1 1 （-127）

对正数进行计算没有错误，但对负数进行计算就会出错，实际结果与预期结果相反

-----

**One's complement code 反码**： 负数的反码在原码的基础上符号位不变，其他数值取反

为了解决原码无法计算负数的弊端而产生

原码：1 0 1 1 1 0 0 0 （-56）

反码：1 1 0 0 0 1 1 1 （-56）

但是无法对跨越0的算式进行计算，会产生1的误差，因为0有两种表现形式

-----

**Two's complement code 补码**：正数的补码不变，负数为反码+1

未来解决反码无法进行跨越0的计算而产生

最大值为：0 1 1 1 1 1 1 1 （+127）

中间值为：0 0 0 0 0 0 0 0 （0）

最小值为：1 0 0 0 0 0 0 0 （-128）（没有对应的反码和原码）

-----

计算机中的数据是以补码的形式存储的，因此一个字节存储的数字范围就是127～-128

## Java内存分配

栈：方法运行时使用的内存，比如main方法运行，进入方法栈中执行

堆：存储对象或者数组，用new来创建的，都存储在堆内存

方法区：存储可以运行的class文件

本地方法栈：JVM在自用操作系统功能的时候使用，与开发无关

寄存器：给CPU使用，与开发无关

## IDEA快捷键

```
command + option + M
自动抽取方法
```

```
command + P
查看方法的变量
```

```
shift + fn + F6
修改全部该变量的名称
```

```
command + option + L
自动格式化
```

```
command + N
快速生成Javabean
```



## 面向对象编程_类

Encapsulation (封装): Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data within a single unit, or object. It provides a secure mechanism for protecting data from accidental modification or unauthorized access, while also making it easier to maintain and update the code.

Inheritance (继承): Inheritance is a mechanism that allows you to create a new class based on an existing class. The new class is called a subclass, while the existing class is called the superclass. The subclass inherits all the attributes and behaviors of the superclass, and can add new attributes and behaviors, or override existing ones. Inheritance provides a way to reuse code and promote code reuse, reducing development time and maintenance costs.

Polymorphism (多态): Polymorphism refers to the ability of an object to take on many forms. It enables you to write a single piece of code that can work with objects of different classes. This allows you to write generic code that can handle different cases dynamically, depending on the type of object being processed. Polymorphism is achieved through the use of method overriding and method overloading. It enables objects of different classes to be treated as objects of a common type, reducing the amount of code you need to write, and making it easier to maintain.
