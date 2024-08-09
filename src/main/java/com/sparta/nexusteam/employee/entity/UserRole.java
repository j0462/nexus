package com.sparta.nexusteam.employee.entity;

import lombok.Getter;

@Getter
public enum UserRole {
    USER(Authority.USER),  // 사용자 권한
    MANAGER(Authority.MANAGER), // 매니저 권한
    ADMIN(Authority.ADMIN);  // 최상위 권한

    private final String authority;

    UserRole(String authority) {
        this.authority = authority;
    }

    public static class Authority {
        public static final String USER = "ROLE_USER";
        public static final String MANAGER = "ROLE_MANAGER";
        public static final String ADMIN = "ROLE_ADMIN";
    }
}