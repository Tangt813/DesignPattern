package decorated;

/**
 * demo
 */
public class demo {
    public static void main(String[] args) {

        member simpleMember = new simpleMember();
        memberDecorator goldenMember = new goldenMember(new simpleMember());
        memberDecorator diamondMember = new diamondMember(new simpleMember());


        System.out.println("This is a simple member.");
        simpleMember.build();

        System.out.println("\nThis is a golden member.");
        goldenMember.build();

        System.out.println("\nThis is a diamond member.");
        diamondMember.build();
    }
}
