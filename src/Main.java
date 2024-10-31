public class Main {
    public static void main(String[] args) {
        salam(5);

        System.out.println(sum(0));
    }

    public static void salam(int point){
        System.out.println("Hello World!");

        if(point < 5){
            salam(point + 1);
        }

    }

    public static int sum(int point){
        if(point > 10){
            return 0;
        }
        return point + sum(point + 1);
    }

}