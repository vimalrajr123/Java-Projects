package com.java.solid.principle;
public class BackEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
    	System.out.println("Back");
    }

}
