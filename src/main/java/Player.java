/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephensmac
 */
public class Player {
    //following fields
    private String name;
    private int totalPoints;
    private int ftMake;
    private int ftMiss;
    private int ftAtt;
    private double ftPerc;
    private int twoMake;
    private int twoMiss;
    private int twoAtt;
    private double twoPerc;
    private int threeMake;
    private int threeMiss;
    private int threeAtt;
    private double threePerc;
    private int offRebound;
    private int defRebound;
    private int totalRebound;
    private int assists;
    private int turnovers;
    private int steals;
    private int blocks;
    private int fouls;
    
    //following constructors
    //A constructor that accepts the following values as arguments and assigns 
    //them to the appropriate fields: employee's name, employee's ID number, department, and position
    public Player(String name){
        this.name = name;

    }
    
    //A no-arg constructor that assigns empty strings ("") to the name, department,
    //and position fields, and 0 to the idNumber field;
    public Player(){
        name = "";
        totalPoints = 0;
        ftMake = 0;
        ftMiss = 0;
        twoMake = 0;
        twoMiss = 0;
        threeMake = 0;
        threeMiss = 0;
        offRebound = 0;
        defRebound = 0;
        assists = 0;
        turnovers = 0;
        steals = 0;
        blocks = 0;
        fouls = 0;
    } 
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }  
    public void settotalPoints(int score){
        this.totalPoints = score;
    }
    public int gettotalPoints(){
        return totalPoints;
    }
    public void addftMake(){
        this.ftMake = ftMake + 1;
        this.totalPoints += 1;
    }
    public void subftMake(){
        this.ftMake -= 1;
        this.totalPoints -= 1;
    }
    public int getftMake(){
        return ftMake;
    }
    public void addftMiss(){
        this.ftMiss += 1;
    }
    public void subftMiss(){
        this.ftMiss -= 1;
    }
    public int getftMiss(){
        return ftMiss;
    }
    public int getftAtt(){
        ftAtt = this.ftMiss + this.ftMake;
        return ftAtt;
    }
    public double getftPerc(){
        double num1 = this.ftMake;
        double num2 = this.ftAtt;
        ftPerc = (num1 / num2) * 100;     
        return ftPerc;
    }
    public void addtwoMake(){
        this.twoMake += 1;
        this.totalPoints += 2; 
    }
    public void subtwoMake(){
        this.twoMake -= 1;
        this.totalPoints -= 2; 
    }
    public int gettwoMake(){
        return twoMake;
    }
    public void addtwoMiss(){
        this.twoMiss += 1;
    }
    public void subtwoMiss(){
        this.twoMiss -= 1;
        this.twoMiss -= 1;
    }
    public int gettwoMiss(){
        return twoMiss;
    }
    public int gettwoAtt(){
        twoAtt = this.twoMiss + this.twoMake;
        return twoAtt;
    }
    public double gettwoPerc(){
        double num1 = this.twoMake;
        double num2 = this.twoAtt;
        twoPerc = (num1 / num2) * 100;
        return twoPerc;
    }
    public void addthreeMake(){
        this.threeMake += 1;
        this.totalPoints += 3;
    }
    public void subthreeMake(){
        this.threeMake -= 1;
        this.totalPoints -= 3;
    }
    public int getthreeMake(){
        return threeMake;
    }
    public void addthreeMiss(){
        this.threeMiss += 1;
    }
    public void subthreeMiss(){
        this.threeMiss -= 1;
    }
    public int getthreeMiss(){
        return threeMiss;
    }
    public int getthreeAtt(){
        threeAtt = this.threeMiss + this.threeMake;
        return threeAtt;
    }
    public double getthreePerc(){
        System.out.println(this.threeMake + "    " + this.threeAtt);
        double num1 = this.threeMake;
        double num2 = this.threeAtt;
        threePerc = ( num1 / num2) * 100;
        return threePerc;
    }
    public void addoffRebound(){
        this.offRebound += 1;
    }
    public void suboffRebound(){
        this.offRebound -= 1;
    }
    public int getoffRebound(){
        return offRebound;
    }
    public void adddefRebound(){
        this.defRebound += 1;
    }
    public void subdefRebound(){
        this.defRebound -= 1;
    }
    public int getdefRebound(){
        return defRebound;
    }
    public int gettotalRebound(){
        totalRebound = this.offRebound + this.defRebound;
        return totalRebound;
    }
    public void addAssist(){
        this.assists += 1;
    }
    public void subAssist(){
        this.assists -= 1;
    }
    public int getAssist(){
        return assists;
    }
    public void addTurnover(){
        this.turnovers += 1;
    }
    public void subTurnover(){
        this.turnovers -= 1;
    }
    public int getTurnover(){
        return turnovers;
    }
    public void addSteal(){
        this.steals += 1;
    }
    public void subSteal(){
        this.steals -= 1;
    }
    public int getSteal(){
        return steals;
    }
    public void addBlock(){
        this.blocks += 1;
    }
    public void subBlock(){
        this.blocks -= 1;
    }
    public int getBlock(){
        return blocks;
    }
    public void addFoul(){
        this.fouls += 1;
    }
    public void subFoul(){
        this.fouls -= 1;
    }
    public int getFoul(){
        return fouls;
    }
}
