package decorated;

import java.lang.reflect.Member;

/**
 * 创建扩展了simpleMember类的diamondMember实体装饰类
 */
public class diamondMember extends memberDecorator{
    public diamondMember(member decoratedMember){
        /**
         * 调用抽象类的构造函数
         */
        super(decoratedMember);
    }

    /**
     * 创建钻石会员
     */
    @Override
    public void build() {
        decoratedMember.build();
        setDiamondMem(decoratedMember);
    }
    /**
     * 创建钻石会员
     */
    private void setDiamondMem(member decoratedMember){
        System.out.println("Member Kind: Diamond");
    }
}
