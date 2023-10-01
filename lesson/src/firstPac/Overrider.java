package firstPac;

public  class Overrider extends Polymorph{

    //override динамічний поліморфізм
//    @Override
//    public Polymorph writeSmth(String msg){
//        System.out.println(String.format(msg + "%s", Overrider.class.getName()));
//        return new Polymorph();
//    }

    //overload статичний поліморфізм
    public Polymorph writeSmth(int num){
        System.out.println(String.format(String.valueOf(num) + "%s", Overrider.class.getName()));
        return new Polymorph();
    }

    public Polymorph writeSmth(int num, String msg){
        System.out.println(String.format(String.valueOf(num) + "%s", Overrider.class.getName()));
        System.out.println(x);
        return new Polymorph();
    }

}
