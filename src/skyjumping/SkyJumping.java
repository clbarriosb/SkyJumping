/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyjumping;

import java.util.Scanner;

/**
 *
 * @author Carmen_Lucia3
 */
public class SkyJumping implements Print {
    
    String name;
    String nameTwo;
    String nameThree;
    Participant participant;
    
    public String setParticipantName(String name) {
        return participant.setName();      
    }
    
    public void add(){
        return participant.addPartcipant(this);
    }
    
    @Override
    public String print(){
        return name;
    }

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Write the names of the participants one "
                + "at a time; an empty string brings you to the jumping phase.");
        for (int number=4; number<=20; number++){
        System.out.print("  Participant name: ");
        
        String name =  reader.nextLine();
        
        Participant  
        if (name == null){
            System.out.println("");
            System.out.println("The tournament begins!");
            break;
        }
        add.participant(name, 0);
        }

        
       
    }
    
}
