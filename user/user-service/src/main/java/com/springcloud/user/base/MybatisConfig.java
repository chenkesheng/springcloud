package com.springcloud.user.base;

/**
 * @author cks
 * @Date 2017/7/19.
 */
//@Configuration
//@EnableTransactionManagement
//@ComponentScan
//@MapperScan("com.cksmaster.user.mapper")
public class MybatisConfig {

//    //定义一个全局的记录器，通过LoggerFactory获取
//    private final static Logger logger = LoggerFactory.getLogger(MybatisConfig.class);
//
//
//    @Value("${spring.datasource.type}")
//    private Class<? extends DataSource> dataSourceType;
//
//    @Bean(name = "dataSource", destroyMethod = "close", initMethod = "init")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() {
//        logger.info("-------------------- writeDataSource init ---------------------");
//        return DataSourceBuilder.create().type(dataSourceType).build();
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.cksmaster.user.mapper");
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
//        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    /**
//     * 配置事务管理器
//     */
//    @Bean(name = "transactionManager")
//    @Primary
//    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) throws Exception {
//        return new DataSourceTransactionManager(dataSource);
//    }


}