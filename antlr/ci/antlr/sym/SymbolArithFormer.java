package ci.antlr.sym;// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g 2013-11-26 18:58:36

import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SymbolArithFormer extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "LETTERS", "WS", "'='", "'+'", "'-'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int BLOCK=4;
    public static final int LETTERS=5;
    public static final int WS=6;

    // delegates
    // delegators


        public SymbolArithFormer(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public SymbolArithFormer(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SymbolArithFormer.tokenNames; }
    public String getGrammarFileName() { return "/Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g"; }


    /**
     * List of arith tasks to calculate
     * A task alwasy consists of 3 elements.
     * Calucaltion should be task[1] + task[2] = task[3]
     */
    public List<List<String>> tasks = new ArrayList<List<String>>();



    // $ANTLR start "prog"
    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:22:1: prog : ( assign )+ ;
    public final void prog() throws RecognitionException {
        try {
            // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:22:6: ( ( assign )+ )
            // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:22:8: ( assign )+
            {
            // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:22:8: ( assign )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:22:8: assign
            	    {
            	    pushFollow(FOLLOW_assign_in_prog47);
            	    assign();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "assign"
    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:24:1: assign : ( ^( '=' ^( '+' ^( BLOCK s1= LETTERS ) ^( BLOCK s2= LETTERS ) ) ^( BLOCK s3= LETTERS ) ) | ^( '=' ^( '-' ^( BLOCK s1= LETTERS ) ^( BLOCK s2= LETTERS ) ) ^( BLOCK s3= LETTERS ) ) );
    public final void assign() throws RecognitionException {
        CommonTree s1=null;
        CommonTree s2=null;
        CommonTree s3=null;

        try {
            // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:24:8: ( ^( '=' ^( '+' ^( BLOCK s1= LETTERS ) ^( BLOCK s2= LETTERS ) ) ^( BLOCK s3= LETTERS ) ) | ^( '=' ^( '-' ^( BLOCK s1= LETTERS ) ^( BLOCK s2= LETTERS ) ) ^( BLOCK s3= LETTERS ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==7) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==8) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==9) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:24:10: ^( '=' ^( '+' ^( BLOCK s1= LETTERS ) ^( BLOCK s2= LETTERS ) ) ^( BLOCK s3= LETTERS ) )
                    {
                    match(input,7,FOLLOW_7_in_assign57); 

                    match(input, Token.DOWN, null); 
                    match(input,8,FOLLOW_8_in_assign60); 

                    match(input, Token.DOWN, null); 
                    match(input,BLOCK,FOLLOW_BLOCK_in_assign63); 

                    match(input, Token.DOWN, null); 
                    s1=(CommonTree)match(input,LETTERS,FOLLOW_LETTERS_in_assign67); 

                    match(input, Token.UP, null); 
                    match(input,BLOCK,FOLLOW_BLOCK_in_assign71); 

                    match(input, Token.DOWN, null); 
                    s2=(CommonTree)match(input,LETTERS,FOLLOW_LETTERS_in_assign75); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    match(input,BLOCK,FOLLOW_BLOCK_in_assign80); 

                    match(input, Token.DOWN, null); 
                    s3=(CommonTree)match(input,LETTERS,FOLLOW_LETTERS_in_assign84); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    		List<String> task = new ArrayList<String>();
                    		task.add(s1.getText()); 
                    		task.add(s2.getText());
                    		task.add(s3.getText());
                    		tasks.add(task);
                    		

                    }
                    break;
                case 2 :
                    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:32:4: ^( '=' ^( '-' ^( BLOCK s1= LETTERS ) ^( BLOCK s2= LETTERS ) ) ^( BLOCK s3= LETTERS ) )
                    {
                    match(input,7,FOLLOW_7_in_assign97); 

                    match(input, Token.DOWN, null); 
                    match(input,9,FOLLOW_9_in_assign100); 

                    match(input, Token.DOWN, null); 
                    match(input,BLOCK,FOLLOW_BLOCK_in_assign103); 

                    match(input, Token.DOWN, null); 
                    s1=(CommonTree)match(input,LETTERS,FOLLOW_LETTERS_in_assign107); 

                    match(input, Token.UP, null); 
                    match(input,BLOCK,FOLLOW_BLOCK_in_assign111); 

                    match(input, Token.DOWN, null); 
                    s2=(CommonTree)match(input,LETTERS,FOLLOW_LETTERS_in_assign115); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    match(input,BLOCK,FOLLOW_BLOCK_in_assign120); 

                    match(input, Token.DOWN, null); 
                    s3=(CommonTree)match(input,LETTERS,FOLLOW_LETTERS_in_assign124); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    		List<String> task = new ArrayList<String>();
                    		task.add(s3.getText()); 
                    		task.add(s2.getText());
                    		task.add(s1.getText());
                    		tasks.add(task);
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assign"

    // Delegated rules


 

    public static final BitSet FOLLOW_assign_in_prog47 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7_in_assign57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_8_in_assign60 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_in_assign63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTERS_in_assign67 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_assign71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTERS_in_assign75 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_assign80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTERS_in_assign84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_7_in_assign97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_9_in_assign100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_in_assign103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTERS_in_assign107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_assign111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTERS_in_assign115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_assign120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTERS_in_assign124 = new BitSet(new long[]{0x0000000000000008L});

}