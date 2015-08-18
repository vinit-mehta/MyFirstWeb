package database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by admin on 8/18/2015.
 */

public class RawMartMain {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     RawMartJDBC data = (RawMartJDBC) context.getBean("RawMartJDBC");
     List<RawMartBean> rawData = data.getVendorData();
    public  List<RawMartBean> getData()
    {
        return  rawData;
    }
}
