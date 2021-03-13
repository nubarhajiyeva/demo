/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.inter.CountryDaoInter;
import entity.Country;
import entity.Skill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NUBAR
 */
public class CountryDaoImpl extends AbstractDAO implements CountryDaoInter {

    private Country getCountry(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String nationality = rs.getString("nationality");
        return new Country(id, name, nationality);

    }

    @Override
    public List<Country> getAllCountry() {
        List<Country> result = new ArrayList<>();
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from country");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Country country = getCountry(rs);
                result.add(country);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean addCountry(Country country) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into country(id, name,nationality), values(?,?,?)");
            stmt.setInt(1, country.getId());
            stmt.setString(2, country.getName());
            stmt.setString(3, country.getNationality());
            return stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return true;
    }

    @Override
    public boolean updateCountry(Country country) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update country set name=?, surname=? where id=?");
            stmt.setString(1, country.getName());
            stmt.setString(2, country.getNationality());
            stmt.setInt(3, country.getId());
            return stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return true;
    }

    @Override
    public boolean removeCountry(int id) {
      try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("delete from skill where id=" + id);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return true; }
}
