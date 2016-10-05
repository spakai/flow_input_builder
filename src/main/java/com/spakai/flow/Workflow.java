package com.spakai.flow;

public interface Workflow<I extends SwfInput, O extends SwfOutput> {
    
    public O execute(I input);
    
    
}
