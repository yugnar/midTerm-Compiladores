public class MiVisitador  extends RegexGrammarBaseVisitor <Node>{
    @Override public Node visitSimpleReRe(RegexGrammarParser.SimpleReReContext ctx) {
        return visit(ctx.simpleRe());
    }

    @Override public Node visitUnionRe(RegexGrammarParser.UnionReContext ctx) {
        return visit(ctx.union());
    }

    @Override public Node visitUnion(RegexGrammarParser.UnionContext ctx) {
        System.out.println("Visit Node Union with" + ctx.getText());
        return new Node();
    }

    @Override public Node visitBasicReSimpleRe(RegexGrammarParser.BasicReSimpleReContext ctx) {
        return new Node();
    }

    @Override public Node visitConcatenationSimpleRe(RegexGrammarParser.ConcatenationSimpleReContext ctx) {
        return new Node();
    }

    @Override public Node visitConcatenation(RegexGrammarParser.ConcatenationContext ctx) {
        return new Node();
    }

    @Override public Node visitStarBasicRe(RegexGrammarParser.StarBasicReContext ctx) {
        return new Node();
    }

    @Override public Node visitPlusBasicRe(RegexGrammarParser.PlusBasicReContext ctx) {
        return new Node();
    }

    @Override public Node visitElementaryReBasicRe(RegexGrammarParser.ElementaryReBasicReContext ctx) {
        return new Node();
    }

    @Override public Node visitStar(RegexGrammarParser.StarContext ctx) {
        return new Node();
    }

    @Override public Node visitPlus(RegexGrammarParser.PlusContext ctx) {
        return new Node();
    }

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
    }

    @Override public Node visitEos(RegexGrammarParser.EosContext ctx) {
        return new Node();
    }

    @Override public Node visitLetra(RegexGrammarParser.LetraContext ctx) {
        return new Node();
    }

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
    }



}
