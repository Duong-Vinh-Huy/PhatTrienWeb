/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dvh.phattrienweb;

import com.dvh.repositories.impl.CategoryRepositoryImpl;



/**
 *
 * @author admin
 */
public class PhatTrienWeb {

    public static void main(String[] args) {
        
        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
        s.getCates().forEach(c -> System.out.println(c.getName()));
        
    }
}
