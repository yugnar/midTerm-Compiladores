import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//import java.io.PrintWriter;

public class Main {
    //static PrintWriter out;
    public static void main(String[] args) {
        try {
            //out = new PrintWriter((args.length==0)?"salida.txt" : args[0]);
            CharStream input = CharStreams.fromStream(System.in);
            RegexGrammarLexer lexer = new RegexGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RegexGrammarParser parser = new RegexGrammarParser(tokens);
            ParseTree tree = parser.re();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
            MiVisitador eval = new MiVisitador();
            Node n = eval.visit(tree);
            n.gen("Finished");
            //out.close();
        }
        catch(Exception e) {
            System.out.println("Error " + e ); }
        //out.close();
    }

}
