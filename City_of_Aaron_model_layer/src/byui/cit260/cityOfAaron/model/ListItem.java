  /*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package byu.cit260.cityOfAaron.model;
	

	/**
	 *
	 * @author Arunas Rancevas
	 */
	 //
	

	 import java.io.Serializable;
	

	 public class ListItem implements Serializable{
	

	   private String name;
	   private int number;
	

	   public ListItem(){}
	

	   public String getName(){
	     return name;
	   }
	   public void setName(String name){
	     this.name = name;
	   }
	   public int getNumber(){
	     return number;
	   }
	   public void setNumber(int number){
	     this.number = number;
	   }

	 @Override
	 public String toString() {
	     return "ListItem{" + "name=" + name + ",number=" + number + '}';
	 }
	 }
