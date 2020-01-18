#*Hello World*

你好，我开始学习**Java**了。

+ 2020年1月14日
    
    我理解了[泛型的相关概念](https://baike.baidu.com/item/%E6%B3%9B%E5%9E%8B/4475207?fr=aladdin)
    
+ 2020年1月16日

    1. 了解了**Git**
    
    2. 注册了第一个**GitHub**账号
 并且创建了第一个Repository
 
 
 ![Image text](https://raw.githubusercontent.com/BangBangLaoDa/Test1/master/Picture/123.png)
 
 + 2020年1月18日
 
    了解了[`并发与并行的概念`](https://www.jianshu.com/p/cbf9588b2afb)
    
    完成了一个小型线程程序:
    
   
        public class BasicThread extends Thread{
            @Override
            public void run() {
                System.out.println("Thread Start "+ Thread.currentThread().getName());
        
                try {
                    Thread.sleep(1000);
                    Processing();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        
                System.out.println("Thread End "+ Thread.currentThread().getName());
            }
        
            private void Processing() throws InterruptedException {
                System.out.println("Processing...");
                Thread.sleep(5000);
                
如果你觉得还不错，欢迎和我交朋友：

|   QQ:  |   286653555   |
|----|----|           
|   Tel:    |12345678900    |     
