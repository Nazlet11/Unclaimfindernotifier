package org.example.Nazlet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class boucleAm {

    private static Robot bot;
    static int smcalibration = 22;
    static int pmcalibration = 26;
    static boolean state = false; // etat on ou off

    //Initialisation
    static {
        try {
            bot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }


    public static void main(String[] args) throws InterruptedException {


    }

    public static void click() throws InterruptedException {
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        System.out.println("clic");
        Thread.sleep(40);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        System.out.println("relache");
    }

    public static void moveMouse(int x, int y) throws InterruptedException {
        bot.mouseMove(x, y);
        Thread.sleep(60);
    }

    public static void changeState(JButton bouton){
        if (state == true){
            state = false;
            bouton.setText("Activer");
        } else {
            state = true;
            bouton.setText("Désactiver");
        }
    }


    public static void zdclick() throws InterruptedException {
        //bot.keyPress(KeyEvent.VK_Z);
        bot.keyPress(KeyEvent.VK_D);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        //bot.keyRelease(KeyEvent.VK_Z);
        bot.keyRelease(KeyEvent.VK_D);
        bot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        bot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        bot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        bot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        bot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        bot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        //bot.keyPress(KeyEvent.VK_Z);
        bot.keyPress(KeyEvent.VK_D);
        Thread.sleep(5000);
        //bot.keyRelease(KeyEvent.VK_Z);
        bot.keyRelease(KeyEvent.VK_D);
        Thread.sleep(500);
    }

    public static void jumpblock() throws InterruptedException {
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(50);
        bot.keyPress(KeyEvent.VK_C);
        Thread.sleep(30);
        bot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(30);
        //regarde bas
        for(int i = 0; i<10;i++){
            moveMouse(960,800);
            Thread.sleep(5);
        }
        Thread.sleep(300);
        System.out.println("saut");
        bot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(50);
        bot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(110);



        System.out.println("pose bloc en dessous de soi");
        bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(30);
        bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(30);
        bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(30);
        bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        bot.keyPress(KeyEvent.VK_8);
        Thread.sleep(30);
        bot.keyRelease(KeyEvent.VK_8);
        //regarde vers le haut
        for(int i = 0; i<smcalibration;i++){
            moveMouse(960,490);
            Thread.sleep(4);
        }

        click();
    }

    public static void casseblochaut() throws InterruptedException {
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(50);
        //regarde vers le haut
        for(int i = 0; i<10;i++){
            moveMouse(960,200);
            Thread.sleep(4);
        }
        System.out.println("casse bloc au dessus de soi");
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(500);

        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


        for(int i = 0; i<13;i++) {
            moveMouse(960, 800);
            Thread.sleep(1);
        }

        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void paladiumminer() throws InterruptedException {
        System.out.println("Mettez vous en position");
        System.out.println("Début du programme dans 3 secondes");
        Thread.sleep(1000);
        System.out.println("Début du programme dans 2 secondes");
        Thread.sleep(1000);
        System.out.println("Début du programme dans 1 secondes");
        Thread.sleep(1000);

        //calibration(pmcalibration);

        Thread.sleep(100);
        bot.keyPress(KeyEvent.VK_Z);
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i<1000000;i++){

            Thread.sleep(3000);
            bot.keyRelease(KeyEvent.VK_Z);
            Thread.sleep(105);
            bot.keyPress(KeyEvent.VK_Z);

        }

    }

    public static void straightmining() throws InterruptedException {

        System.out.println("Mettez vous en position");
        System.out.println("Début du programme dans 3 secondes");
        Thread.sleep(1000);
        System.out.println("Début du programme dans 2 secondes");
        Thread.sleep(1000);
        System.out.println("Début du programme dans 1 secondes");
        Thread.sleep(1000);


        for(int k=0;k<10000000;k++){



            jumpblock();


            zdclick();


            casseblochaut();

            System.out.println("1er bloc");

            //regarde a gauche
            for(int i = 0; i<3;i++){
                moveMouse(0,540);
                Thread.sleep(20);
            }

            //regarde a droite
            for(int i = 0; i<3;i++){
                moveMouse(1920,540);
                Thread.sleep(20);
            }

            //regarde legerement vers le bas pr ajuster la vision qui se leve petit a petit
            for(int i = 0; i<1;i++){
                moveMouse(960,618);
                Thread.sleep(20);
            }

            zdclick();
            System.out.println("2eme bloc");
            jumpblock();
            zdclick();
            System.out.println("3eme bloc");

            casseblochaut();

            zdclick();
            System.out.println("4eme bloc");
            jumpblock();
            zdclick();
            System.out.println("5eme bloc");
            casseblochaut();
            zdclick();
            System.out.println("6eme bloc");
            jumpblock();


            zdclick();
            System.out.println("7eme bloc");
            casseblochaut();
            zdclick();
            System.out.println("8eme bloc");
            jumpblock();
            zdclick();
            System.out.println("10eme bloc");

            casseblochaut();

            zdclick();
            System.out.println("11eme bloc");
            jumpblock();
            zdclick();
            System.out.println("12eme bloc");
            casseblochaut();
            zdclick();
            System.out.println("13eme bloc");


            Thread.sleep(400);
            System.out.println("Boucle numéro " + k);
        }
    }

}