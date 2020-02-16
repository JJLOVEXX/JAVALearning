package generic;

import java.util.ArrayList;

class ADHero extends Hero{
    ADHero(String name) {
        super(name);
    }
}
class APHero extends Hero{
    APHero(String name) {
        super(name);
    }
}
class Hero{
    String name;
    Hero (String name){
        this.name=name;
    }
}

public class TestGeneric {

    public static void iterate(ArrayList<? extends Hero> list) {
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).name);
        }
    }

//    public static void iterateAP(ArrayList<APHero> list) {
//        for (Hero hero : list) {
//            System.out.println(hero.name);
//        }
//    }
//
//    public static void iterateAD(ArrayList<ADHero> list) {
//        for (Hero hero : list) {
//            System.out.println(hero.name);
//        }
//    }

    public static void main(String[] args) {
//        ArrayList<Hero> heroes = new ArrayList<>();
//        ArrayList<APHero> apHeroes = new ArrayList<>();
//        ArrayList<ADHero> adHeroes = new ArrayList<>();

        ArrayList<Hero> heroList=new ArrayList<>();

        heroList.add(new Hero("Hero"));
        heroList.add(new ADHero("ADHero"));
        heroList.add(new APHero("APHero"));

        iterate(heroList);
    }

}

