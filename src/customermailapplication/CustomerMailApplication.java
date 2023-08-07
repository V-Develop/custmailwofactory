/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        customerFactory.getInputFromKeyBoard();
        System.out.println(customerFactory.generateMail());
    }
}
