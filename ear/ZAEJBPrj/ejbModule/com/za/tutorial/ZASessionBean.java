package com.za.tutorial;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ZASessionBean
 */
@Stateless
@LocalBean
public class ZASessionBean {

    /**
     * Default constructor. 
     */
    public String zaSessionBean() {
    	return "zasessionbean method";
    }

}
