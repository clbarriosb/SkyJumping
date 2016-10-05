/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyjumping;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carmen_Lucia3
 */
public class SkyJumping extends Participant{
    
    Participant participants;
    Scanner reader;
    
   public SkyJumping(){
        this.reader = new Scanner(System.in);
        this.participants = new Participant();
    }
    
    public void launch(){
        this.getParticipants();
        this.round();
        this.results();
    }
    
    public void getParticipants(){
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            Jumper jumper = new Jumper(name);
            this.participants.add(jumper);
        }
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
    }
    
    public void round(){
        int roundNumber = 1;
        while(true){
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();
            if(input.equals("jump")){
                System.out.println();
                System.out.println("Round " + roundNumber);
                System.out.println();
                participants.sort();
                participants.reverse();
                System.out.println("Jumping order:");
                participants.printInOrder();
                System.out.println();
                System.out.println("Results of round " + roundNumber);
                participants.play();
                System.out.println();
                roundNumber++;
            }
            else{
                break;
            }
        }
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
    }
    
    public void results(){
        participants.sort();
        System.out.println("Tournament results: ");
        participants.printResults();
    }
    
    public static void main(String[] args) {
        
        SkyJumping skyJumping = new SkyJumping();
        skyJumping.launch();
        
        
    }
}
