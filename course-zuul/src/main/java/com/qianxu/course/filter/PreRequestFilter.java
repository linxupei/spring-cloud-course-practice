package com.qianxu.course.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author 谦虚
 * @version 1.0
 * @date 2021/3/26 20:43
 * @describe 请求处理前的过滤器
 */
@Component
public class PreRequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //选择过滤器类型
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //过滤器排序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否启用过滤器
        //可实现复杂逻辑过滤某些链接
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //过滤器逻辑
        RequestContext currentContext = RequestContext.getCurrentContext();
        currentContext.set("startTime", System.currentTimeMillis());
        System.out.println("过滤器已经记录时间");
        return null;
    }
}
