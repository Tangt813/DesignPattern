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
import Strategy.StrategyPatternDemo;
import State.StateTest;
import Template.TemplateTest;
import Visitor.VisitorTest;
import org.junit.Test;

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
    private FactoryTest Factory=new FactoryTest();
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

        int exit=1;
        String order;
        while(exit==1){

            System.out.format("\33[%dm%s",96,"");
            System.out.println("====Menu====\n"+
                    "0.退出\n" +
                    "1.工厂模式\n" +
                    "2.抽象工厂模式\n" +
                    "3.单例模式\n" +
                    "4.建造者模式\n"+
                    "5.原型模式\n" +
                    "6.适配器模式\n" +
                    "7.桥接模式\n" +
                    "8.过滤器模式\n" +
                    "9.组合模式\n" +
                    "10.装饰器模式\n" +
                    "11.外观模式\n" +
                    "12.享元模式\n" +
                    "13.代理模式\n" +
                    "14.责任链模式\n" +
                    "15.命令模式\n" +
                    "16.解释器模式\n" +
                    "17.迭代器模式\n" +
                    "18.中介者模式\n" +
                    "19.备忘录模式\n" +
                    "20.观察者模式\n" +
                    "21.状态模式\n" +
                    "22.模板模式\n" +
                    "23.策略模式\n" +
                    "24.空对象模式\n" +
                    "25.访问者模式\n" +
                    "26.MVC模式\n" +
                    "27.业务代表模式\n" +
                    "28.数据访问对象模式\n" +
                    "29.前端控制器模式\n" +
                    "30.服务定位器模式\n"+
                    "====Menu====\n");
            System.out.format("\33[%dm%s",0,"");
            System.out.println("请输入选择：");
            order=this.sc.nextLine();

            switch(order){
                case "0":
                    exit=0;
                    break;
                case "1":
                    this.Factory.factoryTest();
                    break;
                case "2":
                    this.AbstractFactory.testAbstractFactoryPattern();
                    break;
                case"3":
                    this.Singleton.singletonTest();
                    break;
                case"4":
                    this.Builder.builderTest();
                    break;
                case"5":
                    this.Prototype.prototypeTest();
                    break;
                case"6":
                    this.Adapter.adapterTest();
                    break;
                case"7":
                    this.Bridge.bridgeTest();
                    break;
                case"8":
                    this.Filter.TestFilter();
                    break;
                case"9":
                    this.Composite.testComposite();
                    break;
                case"10":
                    this.Decorated.testDecorated();
                    break;

                case "11":
                    this.Facade.facadeTest();
                    break;
                case "12":
                    this.Flyweight.testFlyweightPattern();
                    break;
                case"13":
                    this.Proxy.proxyTest();
                    break;
                case"14":
                    this.ChainOfResponsibility.performTest();
                    break;
                case"15":
                    this.Command.commandTest();
                    break;
                case"16":
                    this.Interpreter.interpreterTest();
                    break;
                case"17":
                    this.Iterator.iteratorTest();
                    break;
                case"18":
                    this.Mediator.TestMediator();
                    break;
                case"19":
                    this.Memento.TestMemento();
                    break;
                case"20":
                    this.Observer.testObserver();
                    break;

                case "21":
                    this.State.stateTest();
                    break;
                case "22":
                    this.Template.templateTest();
                    break;
                case"23":
                    this.Strategy.strategyTest();
                    break;
                case"24":
                    this.NullObject.TestNullObject();
                    break;
                case"25":
                   this.Visitor.visitorTest();
                    break;
                case"26":
                    this.MVC.mvcTest();
                    break;
                case"27":
                    this.BusinessDelegate.businessDelegateTest();
                    break;
                case"28":
                    this.DataAccessObject.testDataAccessObject();
                    break;
                case"29":
                    this.FrontController.testFrontController();
                    break;
                case"30":
                    this.ServiceLocator.testServiceLocatorPattern();
                    break;

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //        System.out.println("=====================\n" +
//                           "* 23个经典设计模式展示 *\n" +
//                           "=====================\n");
/*
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
        show("模板模式");
        this.Template.templateTest();

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
        show("空对象模式");
        this.NullObject.TestNullObject();

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
*/
    }
}
