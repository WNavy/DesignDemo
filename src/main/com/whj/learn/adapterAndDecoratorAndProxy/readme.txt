适配模式，装饰模式，代理模式对比：

适配模式：目的就是让两个不兼容的组件能一起工作。
    从代码层面上，适配模式有一下几个角色：
    标准接口
    实现标准接口的普通类
    适配者(adaptee),要适配的类
    适配器(adapter),适配器要实现标准接口，同时要持有适配者对象或者继承适配者对象,一般不推荐继承


装饰模式：主要目的在于给被装饰者增加新的职责。

    特点在于增强，代码层面被装饰类和所有的装饰类必须实现同一接口，
    装饰类必须持有被装饰类。


代理模式：同一个类，不直接操作目标，而是通过一个中介去操作目标类，同时还可以对目标类进行增强操作。

    特点在于隔离，不直接操纵目标对象.

    ①静态代理：代理类和目标类实现了相同的接口，同时代理类持有目标类的引用

    ②JDK代理：使用JDK提供的Proxy(java.lang.reflect)Proxy.newProxyInstance(classLoader,interface,invocation)
              返回值就是生成的代理对象
        代理类也不用实现接口，但是目标对象必须要实现接口，否则不能实动态代理

    ③Cglib代理：目标对象不用实现接口，但是代理对象需要实现MethodInterceptor接口，需要重写intercept()方法
            Cglib代理实现一般使用Enhancer来生成代理对象，代理对象在调用方法时，自动被intercept()方法拦截

            通过Enhancer类，
            enhancer.setSuperClass()  设置父类
            enhancer.setCallback(this) 设置回调对象
            如果需要设置拦截限制，可以使用enhancer.setCallbackFilter()，
            根据返回的值，可以选择回调对象
            eg:enhancer.setCallBack(new CallBank[]{this,NoOp.INSTANCE})



