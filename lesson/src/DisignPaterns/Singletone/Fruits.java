//package Singleton;
//
//public class Fruits {
//    private static Fruits fruits;
//    private static  String fruitsMenu = "Fruits menu :\n \n";
//
//    public static synchronized Fruits getFruits(){
//        if(fruits == null){
//            fruits = new Fruits();
//        }
//        return fruits;
//    }
//
//    private Fruits(){
//
//    }
//
//    public void addLog(String fruitsInfo){
//        fruitsMenu += fruitsInfo + "\n";
//    }
//
//    public void showFruits(){
//        System.out.println(fruitsMenu);
//    }
//
//}
