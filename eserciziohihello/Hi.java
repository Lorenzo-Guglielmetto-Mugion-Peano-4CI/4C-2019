/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziohihello;

/**
 *
 * @author tancau.andrei
 */
public class Hi extends Thread{
    public Hi(){
        
    }  
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }
    }
}
