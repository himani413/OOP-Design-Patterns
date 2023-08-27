package com.company.sigleton;

//LETS TRY TO MAKE THIS CLASS SINGLETON
public class ClipBoard {

  private String content;
  private static ClipBoard instance;

  //create a private constructor to this class
  private ClipBoard() {

  }

  //create a method to get an object of this class
  public static ClipBoard getInstance() {
    if (instance == null) {
      instance = new ClipBoard();
    }
    return instance;
  }


  //how do you implement copy function in this clipboard class
  public void copy(String newContent) {
    this.content = newContent;
  }

  public String paste() {
    return this.content;
  }

}
