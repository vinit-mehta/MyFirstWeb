package database;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by admin on 8/18/2015.
 */
public class RawMartMapper implements RowMapper{

    @Override
    public RawMartBean mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        RawMartBean rawMart = new RawMartBean();
        rawMart.setId(resultSet.getInt("id"));
        rawMart.setName(resultSet.getString("name"));
        rawMart.setContactNo(resultSet.getInt("contact_no"));
        rawMart.setEmailId(resultSet.getString("email"));
        return rawMart;
    }
}
