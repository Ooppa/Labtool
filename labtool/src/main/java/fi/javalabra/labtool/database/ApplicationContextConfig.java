package fi.javalabra.labtool.database;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("fi.javalabra.labtool.repository")
@EnableTransactionManagement
public class ApplicationContextConfig {

	  @Bean
	  public DataSource dataSource() {
	    EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
	    return builder.setType(EmbeddedDatabaseType.H2).build();
	  }

	  @Bean
	  public EntityManagerFactory entityManagerFactory() {
	    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	    vendorAdapter.setGenerateDdl(true);

	    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	    factory.setJpaVendorAdapter(vendorAdapter);
	    factory.setPackagesToScan("fi.javalabra.labtool.domain");
	    factory.setDataSource(dataSource());
	    factory.afterPropertiesSet();

	    return factory.getObject();
	  }
	  
	  @Bean
	  public PlatformTransactionManager transactionManager() {
	    JpaTransactionManager txManager = new JpaTransactionManager();
	    txManager.setEntityManagerFactory(entityManagerFactory());
	    return txManager;
	  }
	  
	  @Autowired
	  @Bean
	  public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory entityManagerFactory) {
		  HibernateJpaSessionFactoryBean sessionFactory = new HibernateJpaSessionFactoryBean();
		  sessionFactory.setEntityManagerFactory(entityManagerFactory);
		  Properties props = new Properties();
		  props.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		  props.put("hibernate.hbm2ddl.auto", "create");
		  props.put("hibernate.show_sql", "true");
		  sessionFactory.setJpaProperties(props);
		  
		  return sessionFactory;
	  }

}
