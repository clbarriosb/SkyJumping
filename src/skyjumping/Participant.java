/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyjumping;

import java.util.ArrayList;

/**
 *
 * @author Carmen_Lucia3
 */
public class Participant implements Print {
    
    ArrayList<Print> participant;
    String name;
    int points;
    
    Participant (String name, int points) {
        this.participant = new ArrayList<>();
        this.name = name;
        this.points = points;
    }
    
    public void addPartcipant (Print print) {
            this.participant.add(print);        
    }

    public String getName() {
        return this.name;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public String setName() {
        return this.name;
    }
    
    @Override
    public String print(){
        return this.getName() + " (" + this.getPoints() + ")";
    }
    
}
