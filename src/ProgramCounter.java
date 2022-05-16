public class ProgramCounter extends Component{



    @Override
    public void operation() {
        this.memory.put(0,inputs[0]);
        outputs[0] = memory.get(0);
    }
}
