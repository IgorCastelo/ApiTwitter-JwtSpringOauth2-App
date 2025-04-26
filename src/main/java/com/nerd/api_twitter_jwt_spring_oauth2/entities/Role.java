package com.nerd.api_twitter_jwt_spring_oauth2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;
    private String name;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }
    public enum values{

            ADMIN(1L),
        BASIC(2L);

        long roleId;

        values(long roleId){
       this.roleId=roleId;
        }

   public long getRoleId(){
       return roleId;
   }
    }

}
