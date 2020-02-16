import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet treeSet=new TreeSet();
        try {
            treeSet.add(3);
            treeSet.add(6);
            treeSet.add(9);
            treeSet.add(7);
            treeSet.add(18);
            treeSet.add(25);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(treeSet);
    }
}
