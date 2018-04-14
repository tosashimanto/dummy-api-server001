package jp.co.test.service;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.stereotype.Component;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;


@Component
public class HttpClientFactory {

    /**
     * Httpクライントを返す。
     *
     * @return
     */
    public CloseableHttpClient getClient() {
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(
                sslContext(), hostnameVerifier());

        return HttpClientBuilder.create()
                // .useSystemProperties()
                .setSSLSocketFactory(sslConnectionSocketFactory)
                .build();
    }

    /**
     * 非同期用Httpクライアントを返す。
     *
     * @return
     */
    public CloseableHttpAsyncClient getAsyncClient() {
        return HttpAsyncClientBuilder.create()
                // .useSystemProperties()
                .setSSLContext(sslContext())
                .setSSLHostnameVerifier(hostnameVerifier())
                .build();
    }

    private SSLContext sslContext() {
        try {
            return SSLContextBuilder
                    .create()
                    .loadTrustMaterial(new TrustSelfSignedStrategy())
                    .build();
        } catch (NoSuchAlgorithmException | KeyStoreException | KeyManagementException e) {
            throw new RuntimeException(e);
        }
    }

    private HostnameVerifier hostnameVerifier() {
        return new NoopHostnameVerifier();
    }
}


