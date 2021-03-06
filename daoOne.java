/**
 * author: simu dec 2018
 * @Component is a generic stereotype for any Spring-managed component
 * @Service annotates classes at the service layer
 * @Repository annotates classes at the persistence layer, which will act as a database repository
 * 
 *  
 */
package com.simu.example.springboottutorialbasics.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class daoOne {

	public String retrieveDaoOne() {
		return "daoone";
	}
}
