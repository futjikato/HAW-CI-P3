package ci.antlr.sym;// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g 2013-11-25 22:01:11

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class SymbolArithFormer extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "LETTER", "WS", "'='", "'+'", "'-'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int BLOCK=4;
    public static final int LETTER=5;
    public static final int WS=6;

    // delegates
    // delegators


        public SymbolArithFormer(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public SymbolArithFormer(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SymbolArithFormer.tokenNames; }
    public String getGrammarFileName() { return "/Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:10:1: prog : ( assign )+ ;
    public final prog_return prog() throws RecognitionException {
        prog_return retval = new prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        assign_return assign1 = null;



        try {
            // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:10:6: ( ( assign )+ )
            // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:10:8: ( assign )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:10:8: ( assign )+
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
            	    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:10:8: assign
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_assign_in_prog53);
            	    assign1=assign();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assign1.getTree());

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class assign_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign"
    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:12:1: assign : ( ^( '=' ^( '+' BLOCK BLOCK ) BLOCK ) | ^( '=' ^( '-' s1= BLOCK s2= BLOCK ) s3= BLOCK ) -> ^( '=' ^( '+' $s2 $s3) $s1) );
    public final assign_return assign() throws RecognitionException {
        assign_return retval = new assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree s1=null;
        CommonTree s2=null;
        CommonTree s3=null;
        CommonTree char_literal2=null;
        CommonTree char_literal3=null;
        CommonTree BLOCK4=null;
        CommonTree BLOCK5=null;
        CommonTree BLOCK6=null;
        CommonTree char_literal7=null;
        CommonTree char_literal8=null;

        CommonTree s1_tree=null;
        CommonTree s2_tree=null;
        CommonTree s3_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree BLOCK4_tree=null;
        CommonTree BLOCK5_tree=null;
        CommonTree BLOCK6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal8_tree=null;
        RewriteRuleNodeStream stream_7=new RewriteRuleNodeStream(adaptor,"token 7");
        RewriteRuleNodeStream stream_9=new RewriteRuleNodeStream(adaptor,"token 9");
        RewriteRuleNodeStream stream_BLOCK=new RewriteRuleNodeStream(adaptor,"token BLOCK");

        try {
            // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:12:8: ( ^( '=' ^( '+' BLOCK BLOCK ) BLOCK ) | ^( '=' ^( '-' s1= BLOCK s2= BLOCK ) s3= BLOCK ) -> ^( '=' ^( '+' $s2 $s3) $s1) )
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
                    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:12:10: ^( '=' ^( '+' BLOCK BLOCK ) BLOCK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal2=(CommonTree)match(input,7,FOLLOW_7_in_assign63); 
                    char_literal2_tree = (CommonTree)adaptor.dupNode(char_literal2);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal2_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal3=(CommonTree)match(input,8,FOLLOW_8_in_assign66); 
                    char_literal3_tree = (CommonTree)adaptor.dupNode(char_literal3);

                    root_2 = (CommonTree)adaptor.becomeRoot(char_literal3_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BLOCK4=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_assign68); 
                    BLOCK4_tree = (CommonTree)adaptor.dupNode(BLOCK4);

                    adaptor.addChild(root_2, BLOCK4_tree);

                    _last = (CommonTree)input.LT(1);
                    BLOCK5=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_assign70); 
                    BLOCK5_tree = (CommonTree)adaptor.dupNode(BLOCK5);

                    adaptor.addChild(root_2, BLOCK5_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    BLOCK6=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_assign73); 
                    BLOCK6_tree = (CommonTree)adaptor.dupNode(BLOCK6);

                    adaptor.addChild(root_1, BLOCK6_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:13:4: ^( '=' ^( '-' s1= BLOCK s2= BLOCK ) s3= BLOCK )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal7=(CommonTree)match(input,7,FOLLOW_7_in_assign80);  
                    stream_7.add(char_literal7);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal8=(CommonTree)match(input,9,FOLLOW_9_in_assign83);  
                    stream_9.add(char_literal8);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_assign87);  
                    stream_BLOCK.add(s1);

                    _last = (CommonTree)input.LT(1);
                    s2=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_assign91);  
                    stream_BLOCK.add(s2);


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    s3=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_assign96);  
                    stream_BLOCK.add(s3);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: s1, 7, s2, s3, 8
                    // token labels: s2, s1, s3
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleNodeStream stream_s2=new RewriteRuleNodeStream(adaptor,"token s2",s2);
                    RewriteRuleNodeStream stream_s1=new RewriteRuleNodeStream(adaptor,"token s1",s1);
                    RewriteRuleNodeStream stream_s3=new RewriteRuleNodeStream(adaptor,"token s3",s3);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 13:45: -> ^( '=' ^( '+' $s2 $s3) $s1)
                    {
                        // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:13:48: ^( '=' ^( '+' $s2 $s3) $s1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                        // /Users/moritzspindelhirn/CIP/SymArithFormer/SymbolArithFormer.g:13:54: ^( '+' $s2 $s3)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(8, "8"), root_2);

                        adaptor.addChild(root_2, stream_s2.nextNode());
                        adaptor.addChild(root_2, stream_s3.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_s1.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign"

    // Delegated rules


 

    public static final BitSet FOLLOW_assign_in_prog53 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7_in_assign63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_8_in_assign66 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_in_assign68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BLOCK_in_assign70 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_assign73 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_7_in_assign80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_9_in_assign83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLOCK_in_assign87 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BLOCK_in_assign91 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_assign96 = new BitSet(new long[]{0x0000000000000008L});

}