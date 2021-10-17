package decorated;

/**
 * 创建实现了member接口的抽象装饰类
 */
public abstract class memberDecorator implements member{
    protected member decoratedMember;

    public memberDecorator(member decoratedMember){
        this.decoratedMember = decoratedMember;
    }

    public void build(){
        decoratedMember.build();
    }
}
