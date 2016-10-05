/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spakai.flow;

public class FlowCInput implements SwfInput {
    
    private String mandatoryFromFlowB;
    private String optionalFromFlowA;  

    public String getMandatoryFromFlowB() {
        return mandatoryFromFlowB;
    }

    public void setMandatoryFromFlowB(String mandatoryFromFlowB) {
        this.mandatoryFromFlowB = mandatoryFromFlowB;
    }

    public String getOptionalFromFlowA() {
        return optionalFromFlowA;
    }

    public void setOptionalFromFlowA(String optionalFromFlowA) {
        this.optionalFromFlowA = optionalFromFlowA;
    }
   
    
    
}
