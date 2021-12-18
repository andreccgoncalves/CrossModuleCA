/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajavamatrices;

/**
 *
* @author Jefferson Pereira de Matos 2019385
* @author Andre Goncalves 2020195
 */
public interface Matrix2by2Interface {

    /**
     * This method will only print out the equations typed by the user which can
     * be used later as a reference in case he forgets what he typed. This is my
     * initial method and it will call the following method when finished.
     */
    public abstract void readLEq();

    /**
     * Method used to find the Determinant of A for a matrix 2x2. This method
     * uses the formula det|A| = a.d - b.c .
     */
    public abstract void find2x2Determinant();

    /**
     * Method used only to prints out the Matrix A. That is one of the reasons why
     * we have created an array to store numbers as Strings. Wanted to keep
     * positive and negative signs.
     */
    public abstract void findA();

    /**
     * Method will find the Inverse of A in order to proceed with calculations.
     * Inverse of A = d -b -c a
     */
    public abstract void findInverseA();

    /**
     * Method used only to pint out the Matrix X. That is one of the reasons why
     */
    public abstract void findX();

    /**
     * Method used only to prints out the Matrix B. Matrix B is composed by the
     * constants (numbers after "="). That is one of the reasons why we have
     * created an array to store numbers as Strings. Wanted to keep positive and
     * negative signs.
     */
    public abstract void findB();

    /**
     * Method used to show the user the final results of X and Y. Formula used :
     * (1 / det|A|)* (A^-1 * B).
     */
    public abstract void readFinalResult();

    /**
     * Method used simply to be storing the variables typed 
     * in attributes which can be accessed by other classes or methods
     */
    public abstract void storeEquationsTyped();

}
