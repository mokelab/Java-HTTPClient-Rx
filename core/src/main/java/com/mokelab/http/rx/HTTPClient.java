package com.mokelab.http.rx;

import io.reactivex.Single;

/**
 * HTTP client
 */
public interface HTTPClient {
    Single<HTTPResponse> send(Method method, String url, Header header, String body);
}
