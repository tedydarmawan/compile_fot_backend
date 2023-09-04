package myor.matrix.setup.tenant;

import org.springframework.stereotype.Component;

@Component
public class TenantContext {

	private static ThreadLocal<String> tenantId = new InheritableThreadLocal<>();

    public static String getTenantId() {
        return tenantId.get();
    }

    public static void setTenantId(String tenant) {
    	tenantId.set(tenant);
    }

    public static void clear() {
    	tenantId.set(null);
    }
}
