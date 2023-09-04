package myor.matrix.setup.tenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Component
public class TenantInterceptor implements WebRequestInterceptor {

    private static final String TENANT_HEADER = "X-Tenant";
    
    @Autowired
    private TenantContext dataTenant;
    
    @Override
    public void preHandle(WebRequest request) {
        String tenantId = "USERMYR0";
    	dataTenant.setTenantId(tenantId);
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) {
//    	TenantContext.clear();
    	dataTenant.clear();
    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) {

    }
}