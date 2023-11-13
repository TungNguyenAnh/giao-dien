package service;

import model.User;

import java.sql.SQLException;

public interface IUserDAO {
    public void addUser (User user) throws SQLException;

}
