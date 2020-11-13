package com.example.springsoapslient;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import com.example.springsoapslient.wsdl.CheckTextRequest;
import com.example.springsoapslient.wsdl.CheckTextResponse;

import java.io.UnsupportedEncodingException;

public class SpellerClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SpellerClient.class);

    public CheckTextResponse getCheckText(String lang, String text) throws UnsupportedEncodingException {
        CheckTextRequest request = new CheckTextRequest();
        request.setFormat("");
        request.setOptions(0);
        request.setLang(lang);
        request.setText(text);

//        log.info("Requesting text for " + new String(request.getText().getBytes("UTF-8"), "windows-1251"));
        log.info("Requesting text for " + request.getText());


        CheckTextResponse response = (CheckTextResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://speller.yandex.net/services/spellservice", request,
                        new SoapActionCallback("http://speller.yandex.net/services/spellservice/checkText"));

        return response;
    }
}
