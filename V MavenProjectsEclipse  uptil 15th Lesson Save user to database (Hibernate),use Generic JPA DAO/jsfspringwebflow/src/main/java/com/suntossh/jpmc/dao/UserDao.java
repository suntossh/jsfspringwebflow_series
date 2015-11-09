package com.suntossh.jpmc.dao;

import com.suntossh.jpmc.commons.dao.GenericDao;
import com.suntossh.jpmc.domain.UserEntity;

/**
 * Data access object interface to work with User entity database operations.
 * 
 * @author Suntossh
 */
public interface UserDao extends GenericDao<UserEntity, Long> {

        /**
         * Queries database for user name availability
         * 
         * @param userName
         * @return true if available
         */
        boolean checkAvailable(String userName);
        
        /**
         * Queries user by username
         * 
         * @param userName
         * @return User entity
         */
        UserEntity loadUserByUserName(String userName);
}