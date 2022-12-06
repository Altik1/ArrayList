import java.util.*;

        public class Main {
            public static void main(String[] args) {
// Практическое задание для Java 8
//
//1. Напишите программу на Java, чтобы создать новый список массивов,
//   добавить несколько городов, вывести их в консоль.

                ArrayList<String> cityes = new ArrayList<>();
                cityes.add("Bishkek");
                cityes.add("Karakol");
                cityes.add("Balykchy");

                System.out.println("Задача №1");
                System.out.println(cityes);

                System.out.println("...............................");
//2. Напишите программу Java для вставки элемента в список массивов в первую позицию.


                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList2.add("Python");
                arrayList2.add("C++");
                arrayList2.add("C#");
                arrayList2.add("HTML");
                arrayList2.add(0, "Java");

                System.out.println("Задача №2 ");
                System.out.println(arrayList2);


//3. Напишите программу Java для извлечения элемента (по указанному индексу) из заданного списка массивов.
                System.out.println("...............................");


                ArrayList<String> arrayList3 = new ArrayList<>();
                arrayList3.add("Abu-Ali");
                arrayList3.add("Kutman");
                arrayList3.add("Yntymak");
                arrayList3.add("Jenish");

                arrayList3.remove(1);

                System.out.println("Задача №3");
                System.out.println(arrayList3);




                System.out.println("...............................");
//4. Напишите программу Java для обновления определенного элемента массива заданным элементом.

                ArrayList<String> arrayList4 = new ArrayList<>();
                arrayList4.add("0");
                arrayList4.add("4");
                arrayList4.add("2");
                arrayList4.add("3");

                arrayList4.set(1, "1");

                System.out.println("Задача №4");
                System.out.println(arrayList4);



                System.out.println("...............................");


//5. Напишите программу на Java для удаления третьего элемента из списка массивов.

                ArrayList<String> arrayList5 = new ArrayList<>();
                arrayList5.add("0элемент");
                arrayList5.add("1элемент");
                arrayList5.add("2элемент");
                arrayList5.add("3элемент");

                arrayList5.remove(3);

                System.out.println("Задача №5");
                System.out.println(arrayList5);



                System.out.println("...............................");
//6. Напишите программу Java для поиска элемента в списке массивов.

                ArrayList<String> arrayList6 = new ArrayList<>();
                arrayList6.add("Google");
                arrayList6.add("Telegramm");
                arrayList6.add("Whatsapp");
                arrayList6.add("Instagram");


                System.out.println("Задача №6");
                System.out.println(arrayList6.contains("Instagram"));



                System.out.println("...............................");
//7. Напишите программу на Java для сортировки заданного списка массивов.

                ArrayList<String> arrayList7 = new ArrayList<>();
                arrayList7.add("Z");
                arrayList7.add("Y");
                arrayList7.add("A");
                arrayList7.add("G");

                Collections.sort(arrayList7);

                System.out.println("Задача №7");
                System.out.println(arrayList7);



                System.out.println("...............................");

//8. Напишите программу на Java для копирования одного списка массивов в другой.

                ArrayList<String> arrayList8 = new ArrayList<>();
                arrayList8.add("Toyota");
                arrayList8.add("Lexus");
                arrayList8.add("Honda");

                System.out.println("Задача №8");

                System.out.println(arrayList8);

                ArrayList<String> cloneArray8 = new ArrayList<>();
                cloneArray8.add(new String(arrayList8.get(0)));
                cloneArray8.add(new String(arrayList8.get(1)));
                cloneArray8.add(new String(arrayList8.get(2)));


                System.out.println(cloneArray8);

                System.out.println("...............................");
//9. Напишите программу на Java для перемешивания элементов в списке массивов.

                ArrayList<String> arrayList9 = new ArrayList<>();
                arrayList9.add("Lagman");
                arrayList9.add("Chymchyma");
                arrayList9.add("Oromo");
                arrayList9.add("Manty");

                System.out.println(arrayList9);


                Collections.shuffle(arrayList9);


                System.out.println("Задача №9");
                System.out.println(arrayList9);




                System.out.println("...............................");



//11. Напишите программу Java для извлечения части массива
                Random random=new Random();
                int z= random.nextInt(0,6);


                ArrayList<String>arrayList11=new ArrayList<>();
                arrayList11.add("Altezza");
                arrayList11.add("Alphard");
                arrayList11.add("4Runner");
                arrayList11.add("Land Cruiser");
                arrayList11.add("Camry70");
                arrayList11.add("SupraA80");
                arrayList11.add("GT86");

                arrayList11.remove(z);


                System.out.println("Задача №11");
                System.out.println(arrayList11);



                System.out.println("...............................");
// 10. Напишите программу на Java, чтобы поменять местами элементы в списке массивов.

                Scanner scanner = new Scanner(System.in);
                System.out.println("Задайте 2 числа индекса от 0 до 6!  ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                ArrayList<String> arrayList10 = new ArrayList<>();
                arrayList10.add("Bishkek");
                arrayList10.add("Balykchy");
                arrayList10.add("Naryn");
                arrayList10.add("Osh");
                arrayList10.add("Batken");
                arrayList10.add("Djalal-Abad");
                arrayList10.add("Talas");


                System.out.println("Задача №10");
                System.out.println("Было: " + arrayList10);


                Collections.swap(arrayList10, a, b);


                System.out.println("Стало: "+arrayList10);


            }
        }

