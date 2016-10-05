package com.spakai.builder;

import com.spakai.flow.SwfInput;


public interface Builder<I extends SwfInput> {
    public I build();
    
}
