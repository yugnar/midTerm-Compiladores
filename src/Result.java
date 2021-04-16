import java.util.*;

class Result extends TablaTransicion{

    public List<Character> charMapper = new ArrayList<Character>();
    public List<QState> statesMapper = new ArrayList<QState>();

    public Result(){
        charMapper.add('ñ');
    }

    public Set<Integer> get(int state, char c){ //DONE

        Set<Integer> result = new HashSet<Integer>();
        int characterIndex = charMapper.indexOf(c);
        StatesInfo queryResult = statesMapper.get(state).getTransitionsInfo(characterIndex);
        List<Integer> tmpResults = queryResult.getNodeInformation();
        for(int i=0; i<tmpResults.size(); i++){
            int tmp = tmpResults.get(i);
            result.add(tmp);
        }
        return result;
    }

    public int getStates(){ //DONE
        return statesMapper.size();
    }

    public Set<Character> getAlphabet(){ //DONE
        Set<Character> result = new HashSet<Character>();
        for(int i=0; i< charMapper.size(); i++){
            result.add(charMapper.get(i));
        }
        return result;
    }

}