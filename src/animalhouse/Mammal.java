/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalhouse;

public class Mammal {
  private int age;

  public Mammal() {
    age = 1;
  }

  public void move() {
    System.out.println("Mammal move one step");
  }

  public void speak(){
    System.out.println("Mammal speak! ");
  }
}
