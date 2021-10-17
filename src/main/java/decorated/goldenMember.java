package decorated;

import java.lang.reflect.Member;

/**
 * 创建扩展了simpleMember类的goldenMember实体装饰类
 */
public class goldenMember extends memberDecorator{
    public goldenMember(member decoratedMember){
        /**
         * 调用抽象类的构造函数
         */
        super(decoratedMember);
    }
    /**
     * 创建黄金会员
     */
    @Override
    public void build() {
        decoratedMember.build();
        setGoldenMem(decoratedMember);
    }
    /**
     * 创建黄金会员
     */
    private void setGoldenMem(member decoratedMember){
        System.out.println("Member Kind: Golden");
    }
}
