import java.util.ArrayList;
import java.util.List;

public class QState {

    public List<StatesInfo> transitionsInfo = new ArrayList<StatesInfo>();

    public StatesInfo getTransitionsInfo(int idx){
        return transitionsInfo.get(idx);
    }

    public void updateTransition(int idx, StatesInfo newState){

        if(transitionsInfo.size() <= idx){
            transitionsInfo.add(newState);
        }
        else if (transitionsInfo.size() > idx){
            transitionsInfo.remove(idx);
            transitionsInfo.add(idx, newState);
        }
    }

}
