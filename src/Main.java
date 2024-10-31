

public class Main {
    public static void main(String[] args) {


//        System.out.println(sum(0));
//
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        Animal animal = new Animal();
//        getSound(dog);
//        getSound(cat);
//        getSound(animal);
//
//        Dog.soundSo();
//
//        Animal.salam();
//
//        Dog.salam();


        //System.out.println(sum(5));

        int[] arr = {1,2,3,4};

        //printArr(arr, arr.length - 1);
        //printInt1(10);


        m1(1);

    }

    public static void printArr(int[] arr, int index){
        if(index > 0){
            printArr(arr, index - 1);
        }
        System.out.println(arr[index]);
    }

    public static void printInt1(int index){

        if(index > 0){
            printInt1(index - 1);
        }

        System.out.println(index);
    }
    public static void printInt2(int index){

        System.out.println(index);

        if(index > 0){
            printInt1(index - 1);
        }
    }




    public static int sum(int point){
        if(point == 1){
            return 1;
        }
        return point * sum(point - 1);
    }

    public static void salam(int start, int end){
        System.out.println(start);

        if(end > start){
            salam(start + 1, end);
        }

    }





//    public static void getSound(Animal animal){
//        animal.sound();
//    }


    public static void m1(int n){

        m2(n + 1);
        System.out.println(n);
    }

    public static void m2(int n){

        m3(n + 1);
        System.out.println(n);
    }
    public static void m3(int n){

        m4(n + 1);
        System.out.println(n);
    }
    public static void m4(int n){

        m5(n + 1);
        System.out.println(n);
    }
    public static void m5(int n){
        System.out.println(n);
    }



}