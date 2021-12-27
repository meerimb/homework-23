package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    /**ArrayList тузунуз
     1ден 100го чейинки 50 сан менен толтурунуз
     Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
     Аларды консольго чыгарыныз*/

    public static void main(String[] args) {
        Random random1 = new Random();
        ArrayList<Integer> random = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            random.add(random1.nextInt(100));
            System.out.println(random.get(i));
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for(int i = 0; i < random.get(i); i++){
            if(random.get(i) % 2 == 0){
                evenNumbers.add(random.get(i));
            }
            else {
                oddNumbers.add(random.get(i));
            }
        }
        System.out.print("Жуп сандар: ");
        for(int i : evenNumbers){
            System.out.print(" "+i);
        }

        System.out.print("\n--------------------------");

        System.out.print("\nТак сандар: ");
        for(int i : oddNumbers){
            System.out.print(" "+i);
        }
    }
}

