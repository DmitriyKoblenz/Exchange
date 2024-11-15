package com.exchangepoint.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 15-11-2024
 */
/*

 */


public class User {
    private Long id;             // Уникальный идентификатор пользователя
    private String name;         // Имя пользователя
    private String email;        // Email пользователя
    private String password;     // Пароль пользователя
    private Set<Role> roles;           // Роль пользователя (USER или ADMIN)
    private List<Account> accounts;
    private boolean isBlocked;   // Флаг блокировки

    public User() {
    }

    public User(long id, String name, String email, String password, Set<Role> roles, List<Account> accounts, boolean isBlocked) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.accounts = accounts;
        this.isBlocked = isBlocked;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.accounts = new ArrayList<>();
        this.isBlocked = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void setRole(Role role) {
    }

    public boolean getRole() {
     return false;
    }
}