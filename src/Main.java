

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
        printInt1(10);

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



}