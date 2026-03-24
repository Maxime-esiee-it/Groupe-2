package com.esieeit.projetsi.domain.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.esieeit.projetsi.domain.enums.UserRole;
import com.esieeit.projetsi.domain.exception.ValidationException;
import com.esieeit.projetsi.domain.validation.Validators;

public class User {
    private String email;
    private String username;
    private Set<UserRole> roles = new HashSet<>();

    public User(String email, String username, Set<UserRole> roles) {
        this.email = Validators.requireEmail(email, "email");
        this.username = Validators.requireNonBlank(username, "username", 1, 50);
        setRoles(roles);
    }

    public Set<UserRole> getRoles() {
        return Collections.unmodifiableSet(roles);
    }

    public final void setRoles(Set<UserRole> roles) {
        if (roles == null || roles.isEmpty())
            throw new ValidationException("roles doit contenir au moins un rôle");
        this.roles = new HashSet<>(roles);
    }

    public boolean hasRole(UserRole role) {
        return roles.contains(role);
    }

    public String getUsername() {
        return username;
    }
}
