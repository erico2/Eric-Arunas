	package byu.cit260.cityOfAaron.model;
	

	/**
	 *
	 * @author Arunas Rancevas
	 */
	 //
	

	 import java.io.Serializable;
	

	 public class Location implements Serializable{
	   //attribute
	   private String description;
	   private String symbol;
	   //constructor
	   public Location(){}
	   //getter and setter
	   public String getDescription(){
	     return description;
	   }
	   public void setDescription(String description){
	     this.description = description;
	   }
	   public String getSymbol(){
	     return symbol;
	   }
	   public void setSymbol(String symbol){
	       this.symbol = symbol;
	   }
	   @Override
	   public String toString() {
	       return "You are in " + description;
	   }
	 }

