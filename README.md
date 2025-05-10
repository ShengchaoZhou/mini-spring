# mini-spring
项目源地址：https://github.com/DerekYRC/mini-spring

#### 项目描述：复现了Spring核心的IoC和AOP功能，并解决循环依赖、横切关注点处理问题。

#### 项目细节：

- IoC部分支持Bean的定义、注册和依赖注入，Singleton和Prototype作用域，生命周期管理（初始化/销毁方法回调），基于注解配置（@Autowired、@Value）和包扫描。

- 提供FactoryBean、自定义BeanPostProcessor、BeanFactoryPostProcessor等扩展点，解决了循环依赖问题，并实现了统一的资源加载和灵活的类型转换。

- AOP部分实现了基于AspectJ表达式的切点匹配。提供JDK和CGLIB两种动态代理机制，构建了Advice拦截器链及ProxyFactory、PointcutAdvisor体系。

- 通过DefaultAdvisorAutoProxyCreator对符合条件的Bean自动创建代理，支持多切面的叠加织入。

- 项目过程中运用了工厂、策略、模板方法、代理、观察者、适配器等设计模式，注重模块化与扩展性设计。 
