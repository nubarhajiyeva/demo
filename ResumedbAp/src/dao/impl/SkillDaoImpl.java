/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.inter.SkillDaoInter;
import entity.Skill;
import entity.UserSkill;
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
public class SkillDaoImpl extends AbstractDAO implements SkillDaoInter {

    private Skill getSkill(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int power = rs.getInt("power");
        int userId = rs.getInt("id");
//       UserSkill userskill = new UserSkill(power);
        return new Skill(id, name, new UserSkill(power));
    }

    @Override
    public List<Skill> getAllSkill() {

        List<Skill> result = new ArrayList<>();
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select s.*,"
                    + "us.user_id,"
                    + " us.power "
                    + "from skill as s "
                    + "right join user_skill as us on s.id=us.skill_id");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Skill s = getSkill(rs);
                result.add(s);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return result;

    }

    @Override
    public boolean addSkill(Skill s) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into skill(id, name) values(?,?)");
            stmt.setInt(1, s.getId());
            stmt.setString(2, s.getName());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateSkill(Skill s) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update skill set name=?, where id=?");
            stmt.setString(1, s.getName());
            stmt.setInt(2, s.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeSkill(int id) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("delete from skill where id=" + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

}
