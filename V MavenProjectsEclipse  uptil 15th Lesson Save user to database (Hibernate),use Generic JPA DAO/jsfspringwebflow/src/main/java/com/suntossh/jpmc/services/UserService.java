package com.suntossh.jpmc.services;

import com.suntossh.jpmc.domain.UserEntity;

/**
 * Service providing service methods to work with user data and entity.
 * 
 * @author Suntossh
 */
public interface UserService {

        /**
         * Create user - persist to database
         * 
         * @param userEntity
         * @return true if success
         */
        boolean createUser(UserEntity userEntity);
}