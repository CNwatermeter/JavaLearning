## 字符串拼接的底层原理

拼接的时候没有变量，都是字符串，会触发字符串的优化机制，在编译的时候就是最终的结果了

```java
public class Test {
  public static void main(String[] args){
    String s = "a" + "b" + "c";
    System.out.println(s);
  }
}
```

```java
public class Test {
  public static void main(String[] args){
    String s = "abc"; //优化后的结果
    System.out.println(s);
  }
}
```

拼接的过程中有变量参与

在JDK8-：在底层使用StringBuilder，每次进行拼接都创建了一个StringBuilder对象，实际上并没有提高效率

在JDK8+：在底层会进行预估字符串拼接后的总大小，把要拼接的内容都放在数组中，此时也是产生了一个新的字符串

```java
public class Test {
  public static void main(String[] args){
    String s1 = "a";
    String s2 = s1 + "b"; 
    String s3 = s2 + "c";
    System.out.println(s3);
  }
}
```

```java
public class Test {
  public static void main(String[] args){
    String s1 = "abc";
    String s2 = "ab"; 
    String s3 = s2 + "c"; //有变量参与，new StringBuilder
    System.out.println(s1 == s3); //false
  }
}
```

```java
public class Test {
  public static void main(String[] args){
    String s1 = "abc";
    String s2 = "a" + "b" + "c"; //拼接时没有变量参与
    System.out.println(s1 == s2); //true
  }
}
```

StringBuilder的默认容量：16

默认扩容：原本容量 * 2 + 2 = 34

超出默认扩容：容量以实际需要容量为准