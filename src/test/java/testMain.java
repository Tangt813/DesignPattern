import AbstractFactoryPattern.AbstractFactoryPatternTest;
import Adapter.AdapterTest;
import Bridge.BridgeTest;
import Builder.BuilderTest;
import BusinessDelegate.BusinessDelegateTest;
import ChainOfResponsibility.ChainOfResponsibilityTest;
import Command.CommandTest;
import Composite.CompositeTest;
import DataAccessObject.DataAccessObjectTest;
import Decorated.DecoratedTest;
import Facade.FacadeTest;
import Factory.FactoryTest;
import Filter.FilterTest;
import FlyweightPattern.FlyweightPatternTest;
import FrontController.FrontControllerTest;
import Interpreter.InterpreterTest;
import Iterator.IteratorTest;
import MVC.MVCTest;
import Mediator.MediatorTest;
import Memento.MementoTest;
import NullObject.NullObjectTest;
import Observer.ObserverTest;
import Prototype.PrototypeTest;
import Proxy.ProxyPatternDemo;
import ServiceLocatorPattern.ServiceLocatorPatternTest;
import Singleton.SingletonPatternDemo;
import State.StateTest;
import Strategy.StrategyPatternDemo;
import Template.TemplateTest;
import Visitor.VisitorTest;
import org.junit.Test;

import java.security.KeyStore;
import java.text.ParseException;
import java.util.Scanner;


public class testMain {
    private AbstractFactoryPatternTest AbstractFactory=new AbstractFactoryPatternTest();
    private AdapterTest Adapter=new AdapterTest();
    private BridgeTest Bridge=new BridgeTest();
    private BuilderTest Builder=new BuilderTest();
    private BusinessDelegateTest BusinessDelegate=new BusinessDelegateTest();

    private ChainOfResponsibilityTest ChainOfResponsibility=new ChainOfResponsibilityTest();
    private CommandTest Command=new CommandTest();
    private CompositeTest Composite=new CompositeTest();
    private DataAccessObjectTest DataAccessObject=new DataAccessObjectTest();
    private DecoratedTest Decorated=new DecoratedTest();

    private FacadeTest Facade=new FacadeTest();
    private final FactoryTest Factory=new FactoryTest();
    private FilterTest Filter=new FilterTest();
    private FlyweightPatternTest Flyweight=new FlyweightPatternTest();
    private FrontControllerTest FrontController=new FrontControllerTest();

    private InterpreterTest Interpreter=new InterpreterTest();
    private IteratorTest Iterator=new IteratorTest();
    private MediatorTest Mediator=new MediatorTest();
    private MementoTest Memento=new MementoTest();
    private MVCTest MVC=new MVCTest();

    private NullObjectTest NullObject=new NullObjectTest();
    private ObserverTest Observer=new Observer.ObserverTest();
    private PrototypeTest Prototype=new PrototypeTest();
    private ProxyPatternDemo Proxy=new ProxyPatternDemo();
    private ServiceLocatorPatternTest ServiceLocator=new ServiceLocatorPatternTest();

    private SingletonPatternDemo Singleton=new SingletonPatternDemo();
    private StateTest State=new StateTest();
    private StrategyPatternDemo Strategy=new StrategyPatternDemo();
    private TemplateTest Template=new TemplateTest();
    private VisitorTest Visitor=new VisitorTest();

    Scanner sc=new Scanner(System.in);
    public void Pause(){
        System.out.println("按1继续...\n");
        while (!sc.nextLine().equals("1"));
        //while(sc.nextInt()!=1);
    }
    public void show(String pattern){
        System.out.format("\33[%dm%s",94,"");
        System.out.println(
                "===============\n" +
                "* "+pattern+"展示 *\n" +
                "===============\n");
        System.out.format("\33[%dm%s",0,"");
    }

    @Test

    public void Test() throws ParseException, InterruptedException {
        System.out.format("\33[%dm%s",96,"");
        System.out.println("=====================\n" +
                           "* 23个经典设计模式展示 *\n" +
                           "=====================\n");
        System.out.format("\33[%dm%s",0,"");

        Pause();
        show("工厂模式");
        this.Factory.factoryTest();

        Pause();
        show("抽象工厂模式");
        this.AbstractFactory.testAbstractFactoryPattern();

        System.out.format("\33[%dm%s",0,"");
        Pause();
        show("单例模式");
        this.Singleton.singletonTest();

        Pause();
        show("建造者模式");
        this.Builder.builderTest();

        Pause();
        show("原型模式");
        this.Prototype.prototypeTest();

        Pause();
        show("适配器模式");
        this.Adapter.adapterTest();

        Pause();
        show("桥接模式");
        this.Bridge.bridgeTest();

        Pause();
        show("过滤器模式");
        this.Filter.TestFilter();

        Pause();
        show("组合模式");
        this.Composite.testComposite();

        Pause();
        show("装饰器模式");
        this.Decorated.testDecorated();

        Pause();
        show("外观模式");
        this.Facade.facadeTest();

        Pause();
        show("享元模式");
        this.Flyweight.testFlyweightPattern();

        Pause();
        show("代理模式");
        this.Proxy.proxyTest();

        Pause();
        show("责任链模式");
        this.ChainOfResponsibility.performTest();

        Pause();
        show("命令模式");
        this.Command.commandTest();

        Pause();
        show("解释器模式");
        this.Interpreter.interpreterTest();

        Pause();
        show("迭代器模式");
        this.Iterator.iteratorTest();

        Pause();
        show("中介者模式");
        this.Mediator.TestMediator();

        Pause();
        show("备忘录模式");
        this.Memento.TestMemento();

        Pause();
        show("观察者模式");
        this.Observer.testObserver();

        Pause();
        show("状态模式");
        this.State.stateTest();

        Pause();
        show("空对象模式");
        this.NullObject.TestNullObject();

        Pause();
        show("策略模式");
        this.Strategy.strategyTest();

        System.out.format("\33[%dm%s",94,"");

        System.out.println("=====================\n" +
                "* 经典设计模式展示完毕 *\n" +
                "=====================\n");
        System.out.println("====================\n" +
                "* 7个扩展设计模式展示 *\n" +
                "====================\n");
        System.out.format("\33[%dm%s",0,"");


        Pause();
        show("模板模式");
        this.Template.templateTest();

        Pause();
        show("MVC模式");
        this.MVC.mvcTest();

        Pause();
        show("访问者模式");
        this.Visitor.visitorTest();

        Pause();
        show("业务代表模式");
        this.BusinessDelegate.businessDelegateTest();

        Pause();
        show("前端控制器模式");
        this.FrontController.testFrontController();

        Pause();
        show("服务定位器模式");
        this.ServiceLocator.testServiceLocatorPattern();

        Pause();
        show("数据访问对象模式");
        this.DataAccessObject.testDataAccessObject();

        Pause();
        System.out.format("\33[%dm%s",94,"");
        System.out.println("=====================\n" +
                "* 所有设计模式展示完毕 *\n" +
                "=====================\n");
        System.out.format("\33[%dm%s",0,"");

    }
}
