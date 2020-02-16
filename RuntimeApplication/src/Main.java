public class Main {

    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();

        try{
            runtime.exec("D:/KGMusic/KuGou.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
