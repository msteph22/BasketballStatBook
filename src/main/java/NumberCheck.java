/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephensmac
 */
public class NumberCheck {
    public static void checkAge(int num) throws BelowZeroException  {
        if (num <= 0){
            throw new BelowZeroException("Attempted to make stat go below zero");
        }
    }
}
