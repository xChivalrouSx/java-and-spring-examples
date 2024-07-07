package com.chivalrous.service.to.request.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
    name = "${com.chivalrous.feign.echo-client-name}", 
    url = "${com.chivalrous.feign.echo-service-url}")
public interface EchoClient {

    @GetMapping("/echo")
    public String doEcho(@RequestParam String value);

}
