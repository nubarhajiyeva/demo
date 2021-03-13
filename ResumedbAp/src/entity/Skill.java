/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author NUBAR
 */
public class Skill {
    private int id;
    private String name;
    private UserSkill userskill;

    public UserSkill getUserskill() {
        return userskill;
    }

    public void setUserskill(UserSkill userskill) {
        this.userskill = userskill;
    }
    
    public Skill() {
    }

    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Skill(int id, String name, UserSkill userskill) {
        this.id = id;
        this.name = name;
        this.userskill = userskill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill{" + "id=" + id + ", name=" + name + ", userskill=" + userskill + '}';
    }

    
    
}
