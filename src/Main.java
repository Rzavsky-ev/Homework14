public class Main {
    public static void main(String[] args) {
        //Задача 5
        System.out.println("Задача 5");
        int value5 = 33;
        changeValue(value5);
        System.out.println("value5 = " + value5);
        /*
        Значение переменной осталось 33, так как в метод примитивы передается в качестве параметра т.е.
        в методе находится не сама переменная, а ее копия.
        */

        //Задача 6
        System.out.println("Задача 6");
        Integer value6 = 33;
        changeInteger(value6);
        System.out.println("value6 = " + value6);
        /*
        Значение переменной осталось 33.
        Переменная value6 является объектного типа, в ней находится не сам объект, а ссылка на него.
        При попадании в метод ссылка копируется и является самостоятельной единицей, ее изменение
        никак не повлияет на первоначальную переменную.
         */

        //Задача 7
        System.out.println("Задача 7");
        Integer[] arr = {3, 4};
        changeArr(arr);
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        /*
        Значения в массиве не поменялись, так как в переменной arr находится ссылка на массив и дальше
        в методе создается новый объект, который уже является самостоятельной единицей.
         */

        //Задача 8
        System.out.println("Задача 8");
        Integer[] arr8 = {3, 4};
        changeArr8(arr8);
        for (Integer num : arr8) {
            System.out.print(num + " ");
        }
        /*
        Значение первого элемента поменялось, так как в методе не создался новый объект, а лишь поменялся текущий.
        */

        //Задача 9
        System.out.println("Задача 9");
        Person person = new Person();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        changePerson(person);
        System.out.println(person.toString());
        /*
         Значение переменных не поменялось, так как внутри метода создался новый самостоятельный объект.
         */

        //Задача 10
        System.out.println("Задача 10");
        Person person10 = new Person();
        person10.name = "Lyapis";
        person10.surname = "Trubetskoy";
        changePerson10(person10);
        System.out.println(person10.toString());
        /*
         Значение переменных поменялось, так как внутри метода не создавался новый объект новый объект.
         */
    }

    ////////////////////////////////////////////////Методы///////////////////////////////////////////////////////

    //Задача 5
    public static void changeValue(int value) {
        value = 22;
    }

    //Задача 6
    public static void changeInteger(Integer value) {
        value = 22;
    }

    //Задача 7
    public static void changeArr(Integer[] arr) {
        arr = new Integer[]{1, 2};
    }

    //Задача 8
    public static void changeArr8(Integer[] arr) {
        arr[0] = 99;
    }

    //Задача 9
    public static class Person {
        String name;
        String surname;

        public String toString() {
            return "Фамилия:" + surname + ". Имя:" + name + ".";
        }
    }

    public static void changePerson(Person person) {
        person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

    public static void changePerson10(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
}


