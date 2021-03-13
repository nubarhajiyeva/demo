/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.inter;

import entity.Country;
import java.util.List;

/**
 *
 * @author NUBAR
 */
public interface CountryDaoInter {
    
    public List<Country> getAllCountry();
    
    public boolean addCountry (Country c);
    
    public boolean updateCountry(Country c);
    
    public boolean removeCountry(int id);
}
