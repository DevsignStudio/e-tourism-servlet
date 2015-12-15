/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Nizul Zaim
 */
public class TransactionAddon {
    Integer addon_id;
    Integer transaction_id;
    
    public TransactionAddon(Integer addon_id, Integer transaction_id) {
        this.addon_id = addon_id;
        this.transaction_id = transaction_id;
    }
}
