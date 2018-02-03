/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author LocalClerk
 */
// class instance varables
public class Game implements Serializable{
    private String theMap;
    private String thePlayer;
    private String cropData;
    private String team[];
    private ArrayList animals;
    private ArrayList tools;
    private String ListItem;

    public Game() {
    }
  
    
    public String getTheMap() {
        return theMap;
    }

    public void setTheMap(String theMap) {
        this.theMap = theMap;
    }

    public String getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(String thePlayer) {
        this.thePlayer = thePlayer;
    }

    public String getCropData() {
        return cropData;
    }

    public void setCropData(String cropData) {
        this.cropData = cropData;
    }

    public String[] getTeam() {
        return team;
    }

    public void setTeam(String[] team) {
        this.team = team;
    }

    public ArrayList getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList animals) {
        this.animals = animals;
    }

    public ArrayList getTools() {
        return tools;
    }

    public void setTools(ArrayList tools) {
        this.tools = tools;
    }

    public String getListItem() {
        return ListItem;
    }

    public void setListItem(String ListItem) {
        this.ListItem = ListItem;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.theMap);
        hash = 79 * hash + Objects.hashCode(this.thePlayer);
        hash = 79 * hash + Objects.hashCode(this.cropData);
        hash = 79 * hash + Arrays.deepHashCode(this.team);
        hash = 79 * hash + Objects.hashCode(this.animals);
        hash = 79 * hash + Objects.hashCode(this.tools);
        hash = 79 * hash + Objects.hashCode(this.ListItem);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "theMap=" + theMap + ", thePlayer=" + thePlayer + ", cropData=" + cropData + ", team=" + team + ", animals=" + animals + ", tools=" + tools + ", ListItem=" + ListItem + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.theMap, other.theMap)) {
            return false;
        }
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        if (!Objects.equals(this.cropData, other.cropData)) {
            return false;
        }
        if (!Objects.equals(this.ListItem, other.ListItem)) {
            return false;
        }
        if (!Arrays.deepEquals(this.team, other.team)) {
            return false;
        }
        if (!Objects.equals(this.animals, other.animals)) {
            return false;
        }
        if (!Objects.equals(this.tools, other.tools)) {
            return false;
        }
        return true;
    }
    
    
    
}
