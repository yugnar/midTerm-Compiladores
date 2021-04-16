import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromStream(System.in);
            RegexGrammarLexer lexer = new RegexGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RegexGrammarParser parser = new RegexGrammarParser(tokens);
            ParseTree tree = parser.s();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
            MiVisitador eval = new MiVisitador();
            Node n = eval.visit(tree);
            n.gen("Finished");
        }
        catch(Exception e) {
            System.out.println("Error " + e ); }
    }

}
