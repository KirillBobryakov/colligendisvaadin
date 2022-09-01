package com.bkv.colligendis.data.entity;

import com.bkv.colligendis.data.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Set;

@Node("User")
public class User extends AbstractEntity {

    private String name;
    private String loginName;
    @JsonIgnore
    private String passwordSHA;
    private Set<Role> roles;
    private String profilePictureUrl;

    public String getName() {
        return name;
    }
    public void setName(String username) {
        this.name = username;
    }
    public String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getPasswordSHA() {
        return passwordSHA;
    }
    public void setPasswordSHA(String passwordSHA) {
        this.passwordSHA = passwordSHA;
    }
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }
    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

}
