import com.spakai.builder.FlowCInputBuilder;
import com.spakai.flow.FlowAOutput;
import com.spakai.flow.FlowBOutput;
import com.spakai.flow.FlowCInput;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;


public class FlowInputBuilderTest {
    @Test 
    public void testFlow() {
        FlowBOutput mandatoryflowBOutput = new FlowBOutput();
        
        mandatoryflowBOutput.setOutput1FromB("iNeedThis");
        FlowAOutput optionalflowAOutput = new FlowAOutput();
        FlowCInput input =  new FlowCInputBuilder(mandatoryflowBOutput)
                .setOptionalflowAOutput(optionalflowAOutput)
                .build();
        
        
        assertThat(input.getMandatoryFromFlowB(), is("iNeedThis"));
        
    }
}
