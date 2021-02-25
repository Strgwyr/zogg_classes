package com.example.zogg_classes;

public class Monster {

    String monsterName = "";
    int health = 0;
    int mana = 0;
    int damage = 0;
    Double armor = 0.0;
    Double magicResistance = 0.0;
    Double physicalResistance = 0.0;
    boolean outCamp;
    double regenRate = 0.0;
    int vision = 0;
    int truesight = 0;


    public Monster(int trsght) {
        truesight = trsght;
    }


    public void regen(){
        outCamp = true;
        regenRate = regenRate*2;
    }
    public void regen(int i){
        regenRate++;
        }

        public Monster(int hp, int mp, int dmg){
        health = hp;
        mana = mp;
        damage = dmg;

        }

        public Monster(){
    }




    }

//3 Constructors
//2 overloading methods