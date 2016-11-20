package com.mokelab.http.rx;

import io.reactivex.Observable;

/**
 * HTTP client
 */
public interface HTTPClient {
    Observable<HTTPResponse> send(Method method, String url, Header header, String body);
}
