/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author 17673
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SessionFactory sf =  NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        s.close();
        // TODO code application logic here
    }
    
}
