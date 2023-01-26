package com.java.solid.principle;

import java.util.List;

public class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {

        this.developers = developers;
    }

	
	  public void implement() {	  
	  developers.forEach(d->d.develop());	  
	  }
	 /* 
	 * private BackEndDeveloper backEndDeveloper = new BackEndDeveloper(); 
	 * private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
	 * 
	 * public void implement() {
	 * backEndDeveloper.writeJava(); frontEndDeveloper.writeJavascript(); }
	 */
}