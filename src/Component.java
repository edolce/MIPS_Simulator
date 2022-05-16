import java.util.HashMap;

public abstract class Component {
    GenericData[] inputs;
    GenericData[] outputs;
    HashMap<Integer,GenericData> memory;

    public void setInputs(GenericData[] inputs){
        this.inputs=inputs;
        operation();
    }

    public GenericData[] getOutputs(){
        return outputs;
    }

    //Operation is activated once input are defined, to simulate a realtime input/output interaction
    public abstract void operation();
}
