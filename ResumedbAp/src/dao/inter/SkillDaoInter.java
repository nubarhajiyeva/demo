/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.inter;

import entity.Skill;
import java.util.List;

/**
 *
 * @author NUBAR
 */
public interface SkillDaoInter {
    public List<Skill> getAllSkill();
    
    public boolean addSkill (Skill s);
    
    public boolean updateSkill(Skill s);
    
    public boolean removeSkill(int id);

}
