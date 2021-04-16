public class MiVisitador  extends RegexGrammarBaseVisitor <Node>{

    Result analysisResult = new Result();
    int qStatePointer = -1;

    //Control variables

    int simpleLetterInsert = 0;
    int queueStarFunction = 0;
    int queuePlusFunction = 0;
    int queueUnionFunction = 0;

    @Override public Node visitS(RegexGrammarParser.SContext ctx) {
        QState q = new QState();
        StatesInfo baseState = new StatesInfo();
        baseState.nodeInformation.add(-1);
        q.transitionsInfo.add(baseState);
        analysisResult.statesMapper.add(q);
        qStatePointer++;
        return visit(ctx.re());
    }

    @Override public Node visitSimpleReRe(RegexGrammarParser.SimpleReReContext ctx) {
        return visit(ctx.simpleRe());
    }

    @Override public Node visitUnionRe(RegexGrammarParser.UnionReContext ctx) {
        return visit(ctx.union());
    }

    @Override public Node visitUnion(RegexGrammarParser.UnionContext ctx) {
        simpleLetterInsert = 0;
        queueUnionFunction = 2;
        visit(ctx.simpleRe());
        visit(ctx.re());
        return new Node();
    }

/*    @Override public Node visitBasicReSimpleRe(RegexGrammarParser.BasicReSimpleReContext ctx) {
        return new Node();
    }

    @Override public Node visitConcatenationSimpleRe(RegexGrammarParser.ConcatenationSimpleReContext ctx) {
        return new Node();
    }

    */

    @Override public Node visitConcatenation(RegexGrammarParser.ConcatenationContext ctx) {
        if(queueUnionFunction != 1){
            simpleLetterInsert = 1;
        }
        visit(ctx.basicRe());
        visit(ctx.simpleRe());
        return new Node();
    }

    /*

    @Override public Node visitStarBasicRe(RegexGrammarParser.StarBasicReContext ctx) {
        return new Node();
    }

    @Override public Node visitPlusBasicRe(RegexGrammarParser.PlusBasicReContext ctx) {
        return new Node();
    }

    @Override public Node visitElementaryReBasicRe(RegexGrammarParser.ElementaryReBasicReContext ctx) {
        return new Node();
    }

    */

    @Override public Node visitStar(RegexGrammarParser.StarContext ctx) {
        simpleLetterInsert = 0;
        queueStarFunction = 1;
        return visit(ctx.elementaryRe());
    }

    @Override public Node visitPlus(RegexGrammarParser.PlusContext ctx) {
        simpleLetterInsert = 0;
        queuePlusFunction = 1;
        return visit(ctx.elementaryRe());
    }

    /*

    @Override public Node visitGroupElementaryRe(RegexGrammarParser.GroupElementaryReContext ctx) {
        return new Node();
    }

    @Override public Node visitAnyElementaryRe(RegexGrammarParser.AnyElementaryReContext ctx) {
        return new Node();
    }

    @Override public Node visitEosElementaryRe(RegexGrammarParser.EosElementaryReContext ctx) {
        return new Node();
    }

    @Override public Node visitLetraElementaryRe(RegexGrammarParser.LetraElementaryReContext ctx) {
        return new Node();
    }

    @Override public Node visitSetElementaryRe(RegexGrammarParser.SetElementaryReContext ctx) {
        return new Node();
    }

    @Override public Node visitAny(RegexGrammarParser.AnyContext ctx) {
        return new Node();
    } */

    @Override public Node visitEos(RegexGrammarParser.EosContext ctx) {
        for(int i=0; i<analysisResult.statesMapper.size(); i++){
            while(analysisResult.statesMapper.get(i).transitionsInfo.size() < analysisResult.charMapper.size()){
                StatesInfo baseState = new StatesInfo();
                baseState.nodeInformation.add(-1);
                analysisResult.statesMapper.get(i).transitionsInfo.add(baseState);
            }
        }
        System.out.println("TABLE GENERATED:\n\n" + analysisResult);
        return new Node();
    }

    @Override public Node visitLetra(RegexGrammarParser.LetraContext ctx) {
        analysisResult.charMapper.add(ctx.getText().charAt(0));
        //add a letter
        if(simpleLetterInsert == 1){
            QState q = new QState();
            StatesInfo baseState = new StatesInfo();
            baseState.nodeInformation.add(-1);
            for(int i=0; i<analysisResult.charMapper.size(); i++){
                q.transitionsInfo.add(baseState);
            }
            analysisResult.statesMapper.add(q);

            int characterIndex = analysisResult.charMapper.indexOf(ctx.getText().charAt(0));
            StatesInfo updateState = new StatesInfo();
            updateState.nodeInformation.add(qStatePointer + 1); // [1]
            analysisResult.statesMapper.get(qStatePointer).updateTransition(characterIndex, updateState);
            qStatePointer++;
            simpleLetterInsert = 0;
        }
        else if(queueStarFunction == 1 || queuePlusFunction == 1){
            //First state Thompson for STAR/PLUS
            StatesInfo updateState = new StatesInfo();
            updateState.nodeInformation.add(qStatePointer+1);
            if(queueStarFunction == 1){
                updateState.nodeInformation.add(qStatePointer+3);
            }
            analysisResult.statesMapper.get(qStatePointer).updateTransition(0 ,updateState);
            qStatePointer++;

            //Second state Thompson for STAR/PLUS

            QState q = new QState();
            StatesInfo baseState = new StatesInfo();
            baseState.nodeInformation.add(-1);
            for(int i=0; i<analysisResult.charMapper.size(); i++){
                q.transitionsInfo.add(baseState);
            }
            analysisResult.statesMapper.add(q);

            int characterIndex = analysisResult.charMapper.indexOf(ctx.getText().charAt(0));
            updateState = new StatesInfo();
            updateState.nodeInformation.add(qStatePointer + 1);
            analysisResult.statesMapper.get(qStatePointer).updateTransition(characterIndex, updateState);
            qStatePointer++;

            //Third state Thompson for STAR/PLUS

            q = new QState();
            baseState = new StatesInfo();
            baseState.nodeInformation.add(-1);
            for(int i=0; i<analysisResult.charMapper.size(); i++){
                q.transitionsInfo.add(baseState);
            }
            analysisResult.statesMapper.add(q);
            updateState = new StatesInfo();
            updateState.nodeInformation.add(qStatePointer-1);
            updateState.nodeInformation.add(qStatePointer+1);
            analysisResult.statesMapper.get(qStatePointer).updateTransition(0 ,updateState);
            qStatePointer++;


            //Fourth state Thompson for STAR/PLUS
            q = new QState();
            baseState = new StatesInfo();
            baseState.nodeInformation.add(-1);
            for(int i=0; i<analysisResult.charMapper.size(); i++){
                q.transitionsInfo.add(baseState);
            }
            analysisResult.statesMapper.add(q);
            queueStarFunction = 0;
            queuePlusFunction = 0;
        }
        else if(queueUnionFunction > 0){
            if(queueUnionFunction == 2){
                //FIRST OPTION NODES for Thompson UNION
                StatesInfo updateState = new StatesInfo();
                updateState.nodeInformation.add(qStatePointer+1);
                updateState.nodeInformation.add(qStatePointer+3);
                analysisResult.statesMapper.get(qStatePointer).updateTransition(0 ,updateState);
                qStatePointer++;

                //1st option 2nd state
                QState q = new QState();
                StatesInfo baseState = new StatesInfo();
                baseState.nodeInformation.add(-1);
                for(int i=0; i<analysisResult.charMapper.size(); i++){
                    q.transitionsInfo.add(baseState);
                }
                analysisResult.statesMapper.add(q);

                int characterIndex = analysisResult.charMapper.indexOf(ctx.getText().charAt(0));
                updateState = new StatesInfo();
                updateState.nodeInformation.add(qStatePointer + 1);
                analysisResult.statesMapper.get(qStatePointer).updateTransition(characterIndex, updateState);
                qStatePointer++;

                //1st option 3rd state
                q = new QState();
                baseState = new StatesInfo();
                baseState.nodeInformation.add(-1);
                for(int i=0; i<analysisResult.charMapper.size(); i++){
                    if(i == 0){
                        updateState = new StatesInfo();
                        updateState.nodeInformation.add(qStatePointer+3);
                        q.transitionsInfo.add(updateState);
                    }
                    else{
                        q.transitionsInfo.add(baseState);
                    }
                }
                analysisResult.statesMapper.add(q);
                qStatePointer = qStatePointer++;
            }
            else if (queueUnionFunction == 1){
                //SECOND OPTION NODES for Thompson UNION
                //2nd option 1st state
                qStatePointer++;
                QState q = new QState();
                StatesInfo baseState = new StatesInfo();
                baseState.nodeInformation.add(-1);
                for(int i=0; i<analysisResult.charMapper.size(); i++){
                    q.transitionsInfo.add(baseState);
                }
                analysisResult.statesMapper.add(q);

                int characterIndex = analysisResult.charMapper.indexOf(ctx.getText().charAt(0));
                StatesInfo updateState = new StatesInfo();
                updateState.nodeInformation.add(qStatePointer + 1);
                analysisResult.statesMapper.get(qStatePointer).updateTransition(characterIndex, updateState);
                qStatePointer++;

                //2nd option 2nd state
                q = new QState();
                baseState = new StatesInfo();
                baseState.nodeInformation.add(-1);
                for(int i=0; i<analysisResult.charMapper.size(); i++){
                    if(i == 0){
                        updateState = new StatesInfo();
                        updateState.nodeInformation.add(qStatePointer+1);
                        q.transitionsInfo.add(updateState);
                    }
                    else{
                        q.transitionsInfo.add(baseState);
                    }
                }
                analysisResult.statesMapper.add(q);
                qStatePointer = qStatePointer++;

                //2nd option 3rd state
                q = new QState();
                baseState = new StatesInfo();
                baseState.nodeInformation.add(-1);
                for(int i=0; i<analysisResult.charMapper.size(); i++){
                    q.transitionsInfo.add(baseState);
                }
                analysisResult.statesMapper.add(q);
                qStatePointer++;
            }
            queueUnionFunction--;
        }
        return new Node();
    }

    /*

    @Override public Node visitSet(RegexGrammarParser.SetContext ctx) {
        return new Node();
    }

    @Override public Node visitSetItemSetItems(RegexGrammarParser.SetItemSetItemsContext ctx) {
        return new Node();
    }

    @Override public Node visitSetItemsSetItems(RegexGrammarParser.SetItemsSetItemsContext ctx) {
        return new Node();
    }

    @Override public Node visitRangeSetItem(RegexGrammarParser.RangeSetItemContext ctx) {
        return new Node();
    }

    @Override public Node visitLetraSetItem(RegexGrammarParser.LetraSetItemContext ctx) {
        return new Node();
    }

    @Override public Node visitRange(RegexGrammarParser.RangeContext ctx) {
        return new Node();
    }*/



}
