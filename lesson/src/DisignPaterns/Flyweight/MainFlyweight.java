//package DisignPaterns.Flyweight;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainFlyweight {
//    public static void main(String[] args) {
//        DeveloperFactory developerFactory = new DeveloperFactory();
//
//        List<Developer> developers = new ArrayList<>();
//
//
//        developers.add(developerFactory.getDeveloperBySpecialty("java"));
//        developers.add(developerFactory.getDeveloperBySpecialty("java"));
//        developers.add(developerFactory.getDeveloperBySpecialty("java"));
//        developers.add(developerFactory.getDeveloperBySpecialty("java"));
//        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
//        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
//
//
//        for (Developer developer : developers) {
//            developer.writeCode();
//        }
//
//    }
//
//
//}
