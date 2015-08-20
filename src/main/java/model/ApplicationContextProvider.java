package model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by admin on 8/20/2015.
 */
public class ApplicationContextProvider implements ApplicationContextAware{



    private static ApplicationContext context;

    public ApplicationContext getApplicationContext() {
        return context;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    context = applicationContext;
    }
   /* public void vendorData()
    {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    IVendorDao vendorDao = context.getBean(IVendorDao.class);
   *//* Vendor vendor = new Vendor();
    vendor.setId(101);
    vendor.setName("vinit");
        vendorDao.save(vendor);
        System.out.println("data "+vendor);*//*
        List<Vendor> listData = vendorDao.getVendor();
        for(Vendor v : listData)
        {
            //System.out.println("list data "+v);
        }
        context.close();
    }*/

}
