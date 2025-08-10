package org.springframework.test.aop;

import org.junit.Test;
import org.springframework.aop.TargetSource;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.springframework.test.common.WorldServiceAfterAfterReturnAdvice;
import org.springframework.test.common.WorldServiceAfterReturnAdvice;
import org.springframework.test.common.WorldServiceBeforeAdvice;
import org.springframework.test.common.WorldServiceBeforeBeforeAdvice;
import org.springframework.test.service.WorldService;
import org.springframework.test.service.WorldServiceImpl;

/**
 * @author Shengchao Zhou
 * @date 2025/5/19 20:23
 */
public class ProxyFactoryTest {
    @Test
    public void testAdvisor() throws Exception {
        WorldService worldService = new WorldServiceImpl();

        //Advisor是Pointcut和Advice的组合
        String expression = "execution(* org.springframework.test.service.WorldService.explode(..))";
        //第一个切面
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression(expression);
        MethodBeforeAdviceInterceptor methodInterceptor = new MethodBeforeAdviceInterceptor(new WorldServiceBeforeAdvice());
        advisor.setAdvice(methodInterceptor);
        //第二个切面
        AspectJExpressionPointcutAdvisor advisor1 = new AspectJExpressionPointcutAdvisor();
        advisor1.setExpression(expression);
        AfterReturningAdviceInterceptor afterReturningAdviceInterceptor = new AfterReturningAdviceInterceptor(new WorldServiceAfterReturnAdvice());
        advisor1.setAdvice(afterReturningAdviceInterceptor);
        //通过ProxyFactory来获得代理
        ProxyFactory factory = new ProxyFactory();
        TargetSource targetSource = new TargetSource(worldService);
        factory.setTargetSource(targetSource);
        factory.setProxyTargetClass(true);
        factory.addAdvisor(advisor);
        factory.addAdvisor(advisor1);
        WorldService proxy = (WorldService) factory.getProxy();
        proxy.explode();
    }

    @Test
    public void testMultiBeforeAdvisor() throws Exception {
        WorldService worldService = new WorldServiceImpl();
        worldService.setName("earth");

        //Advisor是Pointcut和Advice的组合
        String expression = "execution(* org.springframework.test.service.WorldService.explode(..))";
        //第一个Before切面
        AspectJExpressionPointcutAdvisor advisor1 = new AspectJExpressionPointcutAdvisor();
        advisor1.setExpression(expression);
        MethodBeforeAdviceInterceptor before1 = new MethodBeforeAdviceInterceptor(new WorldServiceBeforeBeforeAdvice());
        advisor1.setAdvice(before1);
        //第二个Before切面
        AspectJExpressionPointcutAdvisor advisor2 = new AspectJExpressionPointcutAdvisor();
        advisor2.setExpression(expression);
        MethodBeforeAdviceInterceptor before2 = new MethodBeforeAdviceInterceptor(new WorldServiceBeforeAdvice());
        advisor2.setAdvice(before2);
        //通过ProxyFactory来获得代理
        ProxyFactory factory = new ProxyFactory();
        TargetSource targetSource = new TargetSource(worldService);
        factory.setTargetSource(targetSource);
        factory.setProxyTargetClass(true);
        factory.addAdvisor(advisor1);
        factory.addAdvisor(advisor2);
        WorldService proxy = (WorldService) factory.getProxy();
        proxy.explode();
    }

    @Test
    public void testMultiAfterAdvisor() throws Exception {
        WorldService worldService = new WorldServiceImpl();
        worldService.setName("earth");

        //Advisor是Pointcut和Advice的组合
        String expression = "execution(* org.springframework.test.service.WorldService.explode(..))";
        //第一个After切面，先设置后调用
        AspectJExpressionPointcutAdvisor advisor1 = new AspectJExpressionPointcutAdvisor();
        advisor1.setExpression(expression);
        AfterReturningAdviceInterceptor after1 = new AfterReturningAdviceInterceptor(new WorldServiceAfterAfterReturnAdvice());
        advisor1.setAdvice(after1);
        //第二个After切面
        AspectJExpressionPointcutAdvisor advisor2 = new AspectJExpressionPointcutAdvisor();
        advisor2.setExpression(expression);
        AfterReturningAdviceInterceptor after2 = new AfterReturningAdviceInterceptor(new WorldServiceAfterReturnAdvice());
        advisor2.setAdvice(after2);
        //通过ProxyFactory来获得代理
        ProxyFactory factory = new ProxyFactory();
        TargetSource targetSource = new TargetSource(worldService);
        factory.setTargetSource(targetSource);
        factory.setProxyTargetClass(true);
        factory.addAdvisor(advisor1);
        factory.addAdvisor(advisor2);
        WorldService proxy = (WorldService) factory.getProxy();
        proxy.explode();
    }
}
