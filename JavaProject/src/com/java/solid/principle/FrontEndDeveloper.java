package com.java.solid.principle;

public class FrontEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript() {
    	System.out.println("Front");
    }

}
