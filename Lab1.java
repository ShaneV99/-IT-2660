//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Shane Von Alt
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");
    int [] numbers = {5, 9, 3, 12, 7, 3, 11, 5};
    int i = 0;
    System.out.println("Array in order:");
    while (i < numbers.length) {
        System.out.print(numbers[i] + " ");
        i++;
    }
    System.out.println();
    i=0;
    System.out.println("Array in reverse:");
    for (i = numbers.length - 1; i >= 0; i--) {
        System.out.print(numbers[i] + " ");
    }
    System.out.println(); 
    System.out.println("First value: " + numbers[0]);
    System.out.println("Last value: " + numbers[numbers.length - 1]);

    Lab1 lab = new Lab1();
    System.out.println("Increment: " +lab.increment(1));
    System.out.println("Max: " +lab.max(1,2));
    System.out.println("Min: " +lab.min(1,2));
    System.out.println("Sum: " +lab.sum(new int[]{1, 2}));
    System.out.println("Average: " +lab.average(new int[]{1,2,3}));
    System.out.println("Max: " +lab.max(new int[]{1,2,3}));
    System.out.println("Min: " +lab.min(new int[]{1,2,3}));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int max(int a, int b){
    int num;
    if (a>b){
      num = a; 
    }
    else 
      num = b;
    return num;
  }
  public int min(int a, int b){
    int num;
    if (a<b){
      num = a; 
    }
    else 
      num = b;
    return num;
  }
  public int sum(int[] nums){
    int num=0;
    for(int i=0; i<nums.length; i++){
      num+=nums[i];
    }
    return num;
  }
  public int average(int[] nums){
    int num=0;
    for (int i : nums) {
      num+=i;
    }
    num/=nums.length;
    return num;
  }
  public int max(int[] nums){
    int num=nums[0];
    for(int i=0; i<nums.length; i++){
      if (nums[i]>num){
        num = nums[i];
      }
    }
    return num;
  }
  public int min(int[] nums){
    int num=nums[0];
    for(int i=0; i<nums.length; i++){
      if (nums[i]<num){
        num = nums[i];
      }
    }
    return num;
  }
}