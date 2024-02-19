import java.util.*;

public class Main {

    //Quastion1:


// public static ArrayList<String> largest(ArrayList<String>names) {
//
//
//     for (String n:names){
//
//         if (n.length() >= 3) {
//             System.out.println(n);
//         }
//
//     }
//     return names;
// }


    //quastion2


//    public static int countocc(ArrayList<Integer>num,int n){
//        int count=0;
//        for (int i=0;i<num.size();i++)
//            if(n==num.get(i))
//                count++;
//             return count;
//
//    }


    //qustion3

//    public  static ArrayList<Integer> largest(ArrayList<Integer>num,int m) {
//        Collections.sort(num);
//        Collections.reverse(num);
//        System.out.println(num.subList(0,m));
//     return num;
//    }


    //qustion4


//    public static StringBuilder revers(ArrayList<Integer>nums){
//      nums.toString();
//      StringBuilder rev =new StringBuilder();
//      rev.append(nums);
//        StringBuilder revers = rev.reverse();
//      return rev;
//
//    }



    //qustion5

//public static String[]menu(String[]menu,int n) {
//
//    try {
//        menu[0] = "Accept element of an array";
//        menu[1] = "Display element of an array";
//        menu[2] = "Search the elements wihtin an array";
//        menu[3] = "Sort the array";
//        menu[4] = "to Stop";
//        for (int i = 0; i < menu.length; i++) {
//            System.out.println(menu[i]);
//        }
//    } catch (Exception e) {
//       System.out.println("wrong size");
//    }
//        return menu;

// }

    //qustion6

//    public static void generateRandomNumbers(int min, int max, int count) {
//        Random rand = new Random();
//        System.out.println("Random numbers within the specified range:");
//
//        for (int i = 0; i < count; i++) {
//            int randomNumber = rand.nextInt((max - min) + 1) + min;
//            System.out.print(randomNumber);
//            if (i < count - 1) {
//                System.out.print(" - ");
//            }
//        }
//
//        System.out.println();
//    }


    //quation7


//    public static int checkLength(String password) {
//        int length = password.length();
//        if (length >= 8) {
//            return 3;
//        } else if (length >= 6) {
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//    public static int checkSpecialCharacters(String password) {
//        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//
//    public static int checkUpperCaseLowerCase(String password) {
//        boolean hasUpperCase = false;
//        boolean hasLowerCase = false;
//        for (char c : password.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                hasUpperCase = true;
//            }
//            if (Character.isLowerCase(c)) {
//                hasLowerCase = true;
//            }
//        }
//        if (hasUpperCase && hasLowerCase) {
//            return 3;
//        } else {
//            return 0;
//        }
//    }



    //quastion8


//    public static int fib(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//
//    }









    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

//        ArrayList<String> names = new ArrayList<>();
//        names.add("cat");
//        names.add("dog");
//        names.add("red");
//        names.add("is");
//        names.add("am");
//        System.out.print(largest(names));

        //q2

//        ArrayList<Integer>numbers=new ArrayList<>();
//        numbers.add(1);
//        numbers.add(1);
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(3);
//        numbers.add(5);
//            System.out.println("Enter number: ");
//              int enter= input.nextInt();
//              int enter2= input.nextInt();
//              int enter3= input.nextInt();
//              System.out.println(enter+" ocurres: "+countocc(numbers,enter));
//              System.out.println(enter2+" ocurres: "+countocc(numbers,enter2));
//              System.out.println(enter3+" ocurres: "+countocc(numbers,enter3));

     //q3

//     ArrayList<Integer> numbers=new ArrayList<>();
//     numbers.add(1);
//     numbers.add(4);
//     numbers.add(17);
//     numbers.add(7);
//     numbers.add(25);
//     numbers.add(3);
//     numbers.add(100);
//        System.out.print("Enter number: ");
//        int larg= input.nextInt();
//        System.out.println(largest(numbers,larg));


        //q4


//        ArrayList<Integer>numbers=new ArrayList<>();
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(1);
//        System.out.print(revers(numbers));


        //q5

//    System.out.print("Enter number to display menu: ");
//    int chosemenue= input.nextInt();
//    String[]menu=new String[chosemenue];
//    System.out.println(menu(menu,chosemenue));

        //q6

//        System.out.print("Enter the minimum value of the range: ");
//        int min = input.nextInt();
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max = input.nextInt();
//
//        System.out.print("Enter the number of random numbers to generate: ");
//        int count = input.nextInt();
//
//        generateRandomNumbers(min, max, count);
//        input.close();


        //q7

//        System.out.print("Enter a password: ");
//        String password = input.nextLine();
//
//        int totalScore = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
//
//        if (totalScore >= 8) {
//            System.out.println("Password is strong.");
//        } else if (totalScore >= 5) {
//            System.out.println("Password is moderately strong.");
//        } else {
//            System.out.println("Password is weak.");
//        }

        //q8

//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        int num = input.nextInt();
//
//        System.out.println("Fibonacci sequence with " + num + " terms:");
//        for (int i = 0; i < num; i++) {
//            System.out.print(fib(i));
//        }
    }
}

