public class ThingRunner {
    public static void main(String[] args) {
        Thing thing1 = new Thing("thing1!");
        System.out.println(thing1.getName());
        System.out.println(Thing.getSharedName());
        Thing thing2 = new Thing("thing2!");
        System.out.println(thing2.getName());
        System.out.println(Thing.getSharedName());
        Thing thing3 = new Thing("thing3!");
        System.out.println(thing3.getName());
        System.out.println(Thing.getSharedName());
        System.out.println("------------------");

        Thing.setSharedName("hoopla!");
        System.out.println(thing1.getName());   System.out.println(Thing.getSharedName());
        System.out.println(thing2.getName());       System.out.println(Thing.getSharedName());
        System.out.println(thing3.getName());
        System.out.println(Thing.getSharedName());
        System.out.println("------------------");

        thing1.addLetters("blah!");
        System.out.println(thing1.getName());
        System.out.println(Thing.getSharedName());
        System.out.println("------------------"); 
        thing2.addLetters("what!");
        System.out.println(thing2.getName());
        System.out.println(Thing.getSharedName());
        System.out.println("------------------"); 
        thing3.addLetters("dude!");
        System.out.println(thing3.getName());
        System.out.println(Thing.getSharedName());
        System.out.println("------------------"); 
        thing1.addLetters("hello!");
        System.out.println(thing1.getName());
        System.out.println(Thing.getSharedName());
    }
}