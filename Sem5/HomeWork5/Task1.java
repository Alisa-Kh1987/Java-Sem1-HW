package Sem5.HomeWork5;

/// Написать метод, который переведет число из римского формата записи в арабский. 
// Например, MMXXII = 2022

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите римское число: ");
    String romNum = sc.nextLine();
    System.out.println(romanNumToArab(romNum));

    sc.close();
  }

  public static int romanNumToArab(String romanNum) {

    Map<Character, Integer> rom_Map = new HashMap<>();

    rom_Map.put('M', 1000);
    rom_Map.put('D', 500);
    rom_Map.put('C', 100);
    rom_Map.put('L', 50);
    rom_Map.put('X', 10);
    rom_Map.put('V', 5);
    rom_Map.put('I', 1);

    int arabian_num = 0;
    char[] charArray = romanNum.toCharArray();

    for (int i = 0; i < charArray.length;i++) {
      if(i == charArray.length - 1) {
        arabian_num = arabian_num + rom_Map.get(charArray[i]);
        } 
      else if (rom_Map.get(charArray[i]) >= rom_Map.get(charArray[i + 1])) {
        arabian_num = arabian_num + rom_Map.get(charArray[i]);
        }
      else{
        arabian_num = arabian_num + (rom_Map.get(charArray[i + 1]) - rom_Map.get(charArray[i]));
        i++;
        }
    }
  return arabian_num;
}
}
