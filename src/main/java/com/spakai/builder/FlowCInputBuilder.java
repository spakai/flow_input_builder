package com.spakai.builder;

import com.spakai.flow.FlowAOutput;
import com.spakai.flow.FlowBOutput;
import com.spakai.flow.FlowCInput;

public class FlowCInputBuilder implements Builder<FlowCInput> {
    
    private FlowBOutput mandatoryflowBOutput;
    private FlowAOutput optionalflowAOutput;

    public FlowAOutput getOptionalflowAOutput() {
        return optionalflowAOutput;
    }

    public FlowCInputBuilder setOptionalflowAOutput(FlowAOutput optionalflowAOutput) {
        this.optionalflowAOutput = optionalflowAOutput;
        return this;
    }
    
    public FlowCInputBuilder(FlowBOutput mandatoryflowBOutput) {
        this.mandatoryflowBOutput = mandatoryflowBOutput;
    }
    
    @Override
    public FlowCInput build() {
        
        FlowCInput input = new FlowCInput();
        input.setMandatoryFromFlowB(mandatoryflowBOutput.getOutput1FromB());
        input.setOptionalFromFlowA(optionalflowAOutput.getOutput2FromA());
        
        return input;       
        
    }

    
}
