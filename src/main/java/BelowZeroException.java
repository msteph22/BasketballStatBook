/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephensmac
 */
public class BelowZeroException extends Exception{
    public BelowZeroException(String errorMessage){
        super (errorMessage);
    }
}
