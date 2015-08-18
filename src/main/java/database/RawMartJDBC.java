package database;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by admin on 8/18/2015.
 */
public class RawMartJDBC implements RawMartDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcObject = new JdbcTemplate(dataSource);

    }

    @Override
    public java.util.List<RawMartBean> getVendorData() {
        String query = "select * from vendor";
        List<RawMartBean> vendorList = jdbcObject.query(query,new RawMartMapper());
        return vendorList;
    }
}
