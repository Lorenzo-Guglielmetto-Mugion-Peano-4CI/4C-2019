/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000;

/**
 *
 * @author tancau.andrei
 */
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Inc1000 a = new Inc1000();
        Inc1000 b = new Inc1000();
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(Inc1000.count);
    }
    
}
