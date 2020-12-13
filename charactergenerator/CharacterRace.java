/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

/**
 *
 * @author Greg
 */
public enum CharacterRace {
  //set enum up to contain initial character stat values

  HUMAN(10, 10, 10, 10, 10, 10), 
  ELF(8, 12, 8, 13, 9, 9), 
  DWARF(11, 11, 13, 8, 10, 8), 
  ORC(13, 10, 13, 8, 11, 7);
  
  //assign variables for stats

  final int strength;
  final int dexterity;
  final int constitution;
  final int intelligence;
  final int wisdom;
  final int charisma;

  CharacterRace(int str, int dex, int con, int inl, int wis, int cha){
    //method for assigning stat values for Character Race
    strength = str;
    dexterity = dex;
    constitution = con;
    intelligence = inl;
    wisdom = wis;
    charisma = cha; 

  }//close CharacterRace()
  
}//close enum CharacterRace()

