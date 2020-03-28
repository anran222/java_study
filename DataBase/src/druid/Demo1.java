package druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Author:xiang
 * @Date:2020/3/28 22:35
 * Druid数据库连接池
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        //1、导入jar包
        //2、定义配置文件
        //3、加载配置文件
        Properties pro=new Properties();
        InputStream is=Demo1.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //4、获取连接池对象
        DataSource ds= DruidDataSourceFactory.createDataSource(pro);
       //5、获取连接
        Connection connection=ds.getConnection();
        System.out.println(connection);
    }
}
