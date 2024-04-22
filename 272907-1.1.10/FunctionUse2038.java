import com.alibaba.druid.proxy.jdbc.ConnectionProxyImpl;
public class FunctionUse2038 {
public void funcUse() {
ConnectionProxyImpl connectionproxyimpl = new ConnectionProxyImpl();
connectionproxyimpl.getTransactionIsolation();
}
}