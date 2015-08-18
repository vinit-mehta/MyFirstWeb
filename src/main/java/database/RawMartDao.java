package database;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by admin on 8/18/2015.
 */
public interface RawMartDao {

    public void setDataSource(DataSource dataSource);
    public List<RawMartBean> getVendorData();
}
