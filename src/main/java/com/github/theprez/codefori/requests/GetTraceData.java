package com.github.theprez.codefori.requests;

import com.github.theprez.codefori.ClientRequest;
import com.github.theprez.codefori.DataStreamProcessor;
import com.github.theprez.codefori.SystemConnection;
import com.github.theprez.codefori.Tracer;
import com.google.gson.JsonObject;

public class GetTraceData extends ClientRequest {

    public GetTraceData(final DataStreamProcessor _io, final SystemConnection m_conn, final JsonObject _reqObj) {
        super(_io, m_conn, _reqObj);
    }

    @Override
    public void go() throws Exception {
        StringBuffer rawData = Tracer.get().getRawData();
        String l = rawData.toString();
        addReplyData("tracedata", rawData);
    }

}