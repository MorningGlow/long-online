package com.luxshare.interceptors;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Statement;
import java.util.Properties;

/**
 * mybatis plugin interceptor
 * complete sql print
 *
 * @author lion hua
 * @since 2019-11-25
 */
@Slf4j
@Intercepts({
//        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class,
//                Object.class}),
        @Signature(type = Executor.class, method = "query", args = {Statement.class, ResultHandler.class})
})
public class CompleteSqlPrintInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        final Object[] args = invocation.getArgs();
        log.info("参数:" + JSON.toJSONString(args, true));

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        String sql = boundSql.getSql();
        log.info("执行SQL:{}", sql);
        // 执行之前
        final Object proceed = invocation.proceed();
        // 执行之后
        return proceed;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
