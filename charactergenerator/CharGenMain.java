/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.util.Scanner;

/**
 * The program aims to help the user in creating a character loosely based
 * on dungeons and dragons 5e rule set. They will be given an option to choose
 * different parameters and distribute stat points that will be 
 * displayed on a final character sheet.
 * @author Greg
 */
public class CharGenMain {
    //scanner initiated
    public static final Scanner USCAN = new Scanner(System.in);
    
    public static int totalStats = 15;
    //initiate char1 variable to store information of the character
    //we are going to make
    public static Character char1 = new Character();
    
    public static void main(String[] args) {
        
        
        //display title screen
        printTitleScreen();
        //display main menu
        printMainMenu();
        //main menu for character generator
        mainMenu();
        //display race options
        displayRace();
        //select race options
        selectRace();
        //set variables so they are able to modified during attribute distro
        char1.str = char1.race.strength;
        char1.dex = char1.race.dexterity;
        char1.con = char1.race.constitution;
        char1.inl = char1.race.intelligence;
        char1.wis = char1.race.wisdom;
        char1.cha = char1.race.charisma;
        //select character class
        selectCharacterClass();
        //select gender
        selectGender();
        
        //distribute stats
        distributeStr();
        distributeDex();
        distributeCon();
        distributeInt();
        distributeWis();
        distributeCha();
        
        //enter name
        enterName();
        
        //display final character sheet
        displayCharacterSheet();
        
        
        


        
        
        
    }
    
    private static void printTitleScreen(){
        //print title screen 
        System.out.println("                                             __----~~~~~~~~~~~------___");
        System.out.println("                                  .  .   ~~//====......          __--~ ~~");
        System.out.println("                  -.            \\_|//     |||\\\\  ~~~~~~::::... /~");
        System.out.println("               ___-==_       _-~o~  \\/    |||  \\\\            _/~~-");
        System.out.println("       __---~~~.==~||\\=_    -_--~/_-~|-   |\\\\   \\\\        _/~");
        System.out.println("   _-~~     .=~    |  \\\\-_    '-~7  /-   /  ||    \\      /");
        System.out.println(" .~       .~       |   \\\\ -_    /  /-   /   ||      \\   /");
        System.out.println("/  ____  /         |     \\\\ ~-_/  /|- _/   .||       \\ /");
        System.out.println("|~~    ~~|--~~~~--_ \\     ~==-/   | \\~--===~~        .\\");
        System.out.println("         '         ~-|      /|    |-~\\~~       __--~~");
        System.out.println("                     |-~~-_/ |    |   ~\\_   _-~            /\\");
        System.out.println("                          /  \\     \\__   \\/~                \\__");
        System.out.println("                      _--~ _/ | .-~~____--~-/                  ~~==.");
        System.out.println("                     ((->/~   '.|||' -_|    ~~-/ ,              . _||");
        System.out.println("    Dungeons &                  -_     ~\\      ~~---l__i__i__i--~~_/");
        System.out.println("       Dragons                  _-~-__   ~)  \\--______________--~~");
        System.out.println("         Character            //.-~~~-~_--~- |-------~~~~~~~~");
        System.out.println("            Generator                //.-~~~--\\");
    } // end printTitleScreen()
    
    private static void printMainMenu(){
        //print main options for program
        System.out.println("-------------------------------------------------------------");
        System.out.println("----              Please enter your selection            ----");
        System.out.println("--                1 - Create a new character               --");
        System.out.println("----              2 - Exit Program                       ----");
        System.out.println("-------------------------------------------------------------");
    } // end printMainMenu()
    
    public static void mainMenu(){
        //variable for user selection
        int userStart;
        //save user input to variable
        userStart = USCAN.nextInt();
        // user selects 1 move to race stat display
        if(userStart == 1){
            System.out.println("---------------------------------------------------------");
            System.out.println("----         Please select the race you wish         ----");
            System.out.println("--                you wish to be for your              --");
            System.out.println("----                  New Character                  ----");
            System.out.println("---------------------------------------------------------");
            System.out.println("");
            System.out.println("*********************************************************");
            System.out.println("");
        } else {
            // system exists and program closes if 1 is not selected
            System.exit(0);
        } // end if/else user
    } //end mainMenu() 
    
    public static void displayRace(){
        //display the stats used for each race
        System.out.println("------------- HUMAN --- ELF --- DWARF --- ORC ----");
        //call from CharacterRace enum
        //strength display
        System.out.println("Strength        " + CharacterRace.HUMAN.strength + "       " +
                CharacterRace.ELF.strength + "        " + CharacterRace.DWARF.strength +
                "      " + CharacterRace.ORC.strength);
        //dex
        System.out.println("Dexterity       " + CharacterRace.HUMAN.dexterity + "       " +
                CharacterRace.ELF.dexterity + "       " + CharacterRace.DWARF.dexterity +
                "      " + CharacterRace.ORC.dexterity);
        //con
        System.out.println("Constitution    " + CharacterRace.HUMAN.constitution + "       " +
                CharacterRace.ELF.constitution + "        " + CharacterRace.DWARF.constitution +
                "      " + CharacterRace.ORC.constitution); 
        //int
        System.out.println("Intelligence    " + CharacterRace.HUMAN.intelligence + "       " +
                CharacterRace.ELF.intelligence + "       " + CharacterRace.DWARF.intelligence +
                "       " + CharacterRace.ORC.intelligence); 
        //wis
        System.out.println("Wisdom          " + CharacterRace.HUMAN.wisdom + "       " +
                CharacterRace.ELF.wisdom + "        " + CharacterRace.DWARF.wisdom +
                "      " + CharacterRace.ORC.wisdom);
        //cha
        System.out.println("Charisma        " + CharacterRace.HUMAN.charisma + "       " +
                CharacterRace.ELF.charisma + "        " + CharacterRace.DWARF.charisma +
                "       " + CharacterRace.ORC.charisma);
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("*********************************************************");
        System.out.println("");
    } // end displayRace()
    
    public static void selectRace(){
            System.out.println("---------------------------------------------------------");
            System.out.println("----     Enter the # of the Race you wish to be      ----");
            System.out.println("--         1 - HUMAN               2 - ELF             --");
            System.out.println("----       3 - DWARF               4 - ORC           ----");
            System.out.println("---------------------------------------------------------");
            
            int userRace = USCAN.nextInt();
            
            switch(userRace){
                case 1:
                    char1.race = CharacterRace.HUMAN;
                    break;
                case 2:
                    char1.race = CharacterRace.ELF;
                    break;
                case 3:
                    char1.race = CharacterRace.DWARF;
                    break;
                case 4:
                    char1.race = CharacterRace.ORC;
                    break;
                default:
                    System.exit(0);
                    
            } //end switch()
            
            System.out.println("");

    } // selectRace()
    
    
    public static void selectCharacterClass(){
            System.out.println("---------------------------------------------------------");
            System.out.println("----     Enter the # of the Class you wish to be     ----");
            System.out.println("--       1 - FIGHTER    2 - CLERIC    3 - WIZARD       --");
            System.out.println("----     4 - MONK       5 - ROGUE     6 - BARD       ----");
            System.out.println("---------------------------------------------------------");
            
            int userClass = USCAN.nextInt();
            
            switch(userClass){
                case 1:
                    //Fighter
                    System.out.println("******************************************");
                    System.out.println("**Fighters' Primary Attribute : Strength**");
                    System.out.println("******************************************");
                    char1.characterClass = CharacterClass.FIGHTER;
                    break;
                case 2:
                    //Cleric
                    System.out.println("***************************************");
                    System.out.println("**Clerics' Primary Attribute : Wisdom**");
                    System.out.println("***************************************");
                    char1.characterClass = CharacterClass.CLERIC;
                    break;
                case 3:
                    //Wizard
                    System.out.println("*********************************************");
                    System.out.println("**Wizards' Primary Attribute : Intelligence**");
                    System.out.println("*********************************************");
                    char1.characterClass = CharacterClass.WIZARD;
                    break;
                case 4:
                    //Monk
                    System.out.println("*****************************************************");
                    System.out.println("**Paladins' Primary Attributes : Dexterity & Wisdom**");
                    System.out.println("*****************************************************");
                    char1.characterClass = CharacterClass.MONK;
                    break;
                case 5:
                    //Rogue
                    System.out.println("*****************************************");
                    System.out.println("**Rogues' Primary Attribute : Dexterity**");
                    System.out.println("*****************************************");
                    char1.characterClass = CharacterClass.ROGUE;
                    break;
                case 6:
                    //Bard
                    System.out.println("***************************************");
                    System.out.println("**Bards' Primary Attribute : Charisma**");
                    System.out.println("***************************************");
                    char1.characterClass = CharacterClass.BARD;
                    break;
                default:
                    //Any other option and program quits
                    System.exit(0);
                    
            } //end userClass switch
    }// end selectCharacterClass()
    
    public static void selectGender(){
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("----     Please type in all capital letters          ----");
        System.out.println("--               the gender you wish                   --");
        System.out.println("----                   to be                         ----");
        System.out.println("---------------------------------------------------------");
        
        
        char1.gender = USCAN.next();
        
        System.out.println("");
        
        
    }// end selectGender()
    /*
    *The next 6 classes all serve similar purpose. They are to allow the user to modify their 
    *attribute to suit their needs. 
    *User will first be shown how many stat points they have left to distribute and then asked to distribute
    *them into that particular attribute if they wish. We add the userStat to the char1 attribute and 
    *subtract that stat from the totals
    */
    public static void distributeStr(){
        System.out.println("*************************************************************************");
        System.out.println("  You have " + totalStats + " points left to distribute amongst "
                + "your current character**");
        System.out.println("*************************************************************************");
        System.out.println("  Please enter the amount you wish to add to your Strength attribute");
        System.out.println("*************************************************************************");
        
        int userStat = USCAN.nextInt();
        
        char1.str = char1.str + userStat;
        
        totalStats = totalStats - userStat;
        
        
        
    }//end distributeStr()
    
    public static void distributeDex(){
        System.out.println("*************************************************************************");
        System.out.println("  You have " + totalStats + " points left to distribute amongst "
                + "your current character**");
        System.out.println("*************************************************************************");
        System.out.println("  Please enter the amount you wish to add to your Dexterity attribute");
        System.out.println("*************************************************************************");
        
        int userStat = USCAN.nextInt();
        
        char1.dex = char1.dex + userStat;
        
        totalStats = totalStats - userStat;
    }//end distributeDex()
    
    public static void distributeCon(){
        System.out.println("*************************************************************************");
        System.out.println("  You have " + totalStats + " points left to distribute amongst "
                + "your current character**");
        System.out.println("*************************************************************************");
        System.out.println("  Please enter the amount you wish to add to your Constitution attribute");
        System.out.println("*************************************************************************");
        
        int userStat = USCAN.nextInt();
        
        char1.con = char1.con + userStat;
        
        totalStats = totalStats - userStat;
    }//end distributeCon()
    
    public static void distributeInt(){
        System.out.println("*************************************************************************");
        System.out.println("  You have " + totalStats + " points left to distribute amongst "
                + "your current character**");
        System.out.println("*************************************************************************");
        System.out.println("  Please enter the amount you wish to add to your Intelligence attribute");
        System.out.println("*************************************************************************");
        
        int userStat = USCAN.nextInt();
        
        char1.inl = char1.inl + userStat;
        
        totalStats = totalStats - userStat;
    }//end distributeInt()
    
    public static void distributeWis(){
        System.out.println("*************************************************************************");
        System.out.println("  You have " + totalStats + " points left to distribute amongst "
                + "your current character**");
        System.out.println("*************************************************************************");
        System.out.println("  Please enter the amount you wish to add to your Wisdom attribute");
        System.out.println("*************************************************************************");
        
        int userStat = USCAN.nextInt();
        
        char1.wis = char1.wis + userStat;
        
        totalStats = totalStats - userStat;
    }//end distributeWis()
    
    public static void distributeCha(){
        System.out.println("*************************************************************************");
        System.out.println("  You have " + totalStats + " points left to distribute amongst "
                + "your current character**");
        System.out.println("*************************************************************************");
        System.out.println("  Please enter the amount you wish to add to your Charisma attribute");
        System.out.println("*************************************************************************");
        
        int userStat = USCAN.nextInt();
        
        char1.cha = char1.cha + userStat;
        
        totalStats = totalStats - userStat;
    }//end distributeCha()
    /*
    *This is the end of the classes created to modify and display the remaining stats for distribution
    */
    
    public static void enterName() {
        //enter the name of your character
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("----       Enter the name you wish to give           ----");
        System.out.println("--               your character and                    --");
        System.out.println("----                 hit enter                       ----");
        System.out.println("---------------------------------------------------------");
        
        char1.name = USCAN.next();
    }//end enterName()
    
    public static void displayCharacterSheet(){
        //final character sheet display
        System.out.println("");
        System.out.println("****************************************");
        System.out.println("Name********** " + char1.name);
        System.out.println("Race********** " + char1.race);
        System.out.println("Gender******** " + char1.gender);
        System.out.println("Class********* " + char1.characterClass);
        System.out.println("Attributes -----------------------------");
        System.out.println("Strength     - " + char1.str);
        System.out.println("Dexterity    - " + char1.dex);
        System.out.println("Constitution - " + char1.con);
        System.out.println("Intelligence - " + char1.inl);
        System.out.println("Wisdom       - " + char1.wis);
        System.out.println("Charisma     - " + char1.cha);
        System.out.println("----------------------------------------");
        
        
    }//end displayCharacterSheet()
} // end main 
