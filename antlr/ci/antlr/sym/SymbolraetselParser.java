package ci.antlr.sym;// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g 2013-11-26 19:09:08

import org.antlr.runtime.*;


import org.antlr.runtime.tree.*;

public class SymbolraetselParser extends Parser {
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


        public SymbolraetselParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SymbolraetselParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SymbolraetselParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:21:1: start : program ;
    public final start_return start() throws RecognitionException {
        start_return retval = new start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        program_return program1 = null;



        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:21:7: ( program )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:21:10: program
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_program_in_start43);
            program1=program();

            state._fsp--;

            adaptor.addChild(root_0, program1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:23:1: program : b11= block o1= op b12= block '=' b13= block o2= op o4= op o6= op b21= block o3= op b22= block '=' b23= block '=' '=' '=' b31= block o5= op b32= block '=' b33= block -> ^( '=' ^( $o1 $b11 $b12) $b13) ^( '=' ^( $o2 $b11 $b21) $b31) ^( '=' ^( $o3 $b21 $b22) $b23) ^( '=' ^( $o4 $b12 $b22) $b32) ^( '=' ^( $o5 $b31 $b32) $b33) ^( '=' ^( $o6 $b13 $b23) $b33) ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal2=null;
        Token char_literal3=null;
        Token char_literal4=null;
        Token char_literal5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        block_return b11 = null;

        op_return o1 = null;

        block_return b12 = null;

        block_return b13 = null;

        op_return o2 = null;

        op_return o4 = null;

        op_return o6 = null;

        block_return b21 = null;

        op_return o3 = null;

        block_return b22 = null;

        block_return b23 = null;

        block_return b31 = null;

        op_return o5 = null;

        block_return b32 = null;

        block_return b33 = null;


        CommonTree char_literal2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal7_tree=null;
        RewriteRuleTokenStream stream_7=new RewriteRuleTokenStream(adaptor,"token 7");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:23:9: (b11= block o1= op b12= block '=' b13= block o2= op o4= op o6= op b21= block o3= op b22= block '=' b23= block '=' '=' '=' b31= block o5= op b32= block '=' b33= block -> ^( '=' ^( $o1 $b11 $b12) $b13) ^( '=' ^( $o2 $b11 $b21) $b31) ^( '=' ^( $o3 $b21 $b22) $b23) ^( '=' ^( $o4 $b12 $b22) $b32) ^( '=' ^( $o5 $b31 $b32) $b33) ^( '=' ^( $o6 $b13 $b23) $b33) )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:23:12: b11= block o1= op b12= block '=' b13= block o2= op o4= op o6= op b21= block o3= op b22= block '=' b23= block '=' '=' '=' b31= block o5= op b32= block '=' b33= block
            {
            pushFollow(FOLLOW_block_in_program54);
            b11=block();

            state._fsp--;

            stream_block.add(b11.getTree());
            pushFollow(FOLLOW_op_in_program58);
            o1=op();

            state._fsp--;

            stream_op.add(o1.getTree());
            pushFollow(FOLLOW_block_in_program62);
            b12=block();

            state._fsp--;

            stream_block.add(b12.getTree());
            char_literal2=(Token)match(input,7,FOLLOW_7_in_program64);  
            stream_7.add(char_literal2);

            pushFollow(FOLLOW_block_in_program68);
            b13=block();

            state._fsp--;

            stream_block.add(b13.getTree());
            pushFollow(FOLLOW_op_in_program75);
            o2=op();

            state._fsp--;

            stream_op.add(o2.getTree());
            pushFollow(FOLLOW_op_in_program79);
            o4=op();

            state._fsp--;

            stream_op.add(o4.getTree());
            pushFollow(FOLLOW_op_in_program83);
            o6=op();

            state._fsp--;

            stream_op.add(o6.getTree());
            pushFollow(FOLLOW_block_in_program90);
            b21=block();

            state._fsp--;

            stream_block.add(b21.getTree());
            pushFollow(FOLLOW_op_in_program94);
            o3=op();

            state._fsp--;

            stream_op.add(o3.getTree());
            pushFollow(FOLLOW_block_in_program98);
            b22=block();

            state._fsp--;

            stream_block.add(b22.getTree());
            char_literal3=(Token)match(input,7,FOLLOW_7_in_program100);  
            stream_7.add(char_literal3);

            pushFollow(FOLLOW_block_in_program104);
            b23=block();

            state._fsp--;

            stream_block.add(b23.getTree());
            char_literal4=(Token)match(input,7,FOLLOW_7_in_program109);  
            stream_7.add(char_literal4);

            char_literal5=(Token)match(input,7,FOLLOW_7_in_program111);  
            stream_7.add(char_literal5);

            char_literal6=(Token)match(input,7,FOLLOW_7_in_program113);  
            stream_7.add(char_literal6);

            pushFollow(FOLLOW_block_in_program120);
            b31=block();

            state._fsp--;

            stream_block.add(b31.getTree());
            pushFollow(FOLLOW_op_in_program124);
            o5=op();

            state._fsp--;

            stream_op.add(o5.getTree());
            pushFollow(FOLLOW_block_in_program128);
            b32=block();

            state._fsp--;

            stream_block.add(b32.getTree());
            char_literal7=(Token)match(input,7,FOLLOW_7_in_program130);  
            stream_7.add(char_literal7);

            pushFollow(FOLLOW_block_in_program134);
            b33=block();

            state._fsp--;

            stream_block.add(b33.getTree());


            // AST REWRITE
            // elements: b22, b13, b11, b12, o3, o5, 7, 7, 7, b13, b32, o1, b23, b31, b32, b21, b11, o4, b12, 7, b22, b31, b33, o6, b23, b21, b33, 7, o2, 7
            // token labels: 
            // rule labels: retval, o2, o1, o4, o3, o6, o5, b11, b12, b21, b22, b23, b33, b13, b31, b32
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_o2=new RewriteRuleSubtreeStream(adaptor,"rule o2",o2!=null?o2.tree:null);
            RewriteRuleSubtreeStream stream_o1=new RewriteRuleSubtreeStream(adaptor,"rule o1",o1!=null?o1.tree:null);
            RewriteRuleSubtreeStream stream_o4=new RewriteRuleSubtreeStream(adaptor,"rule o4",o4!=null?o4.tree:null);
            RewriteRuleSubtreeStream stream_o3=new RewriteRuleSubtreeStream(adaptor,"rule o3",o3!=null?o3.tree:null);
            RewriteRuleSubtreeStream stream_o6=new RewriteRuleSubtreeStream(adaptor,"rule o6",o6!=null?o6.tree:null);
            RewriteRuleSubtreeStream stream_o5=new RewriteRuleSubtreeStream(adaptor,"rule o5",o5!=null?o5.tree:null);
            RewriteRuleSubtreeStream stream_b11=new RewriteRuleSubtreeStream(adaptor,"rule b11",b11!=null?b11.tree:null);
            RewriteRuleSubtreeStream stream_b12=new RewriteRuleSubtreeStream(adaptor,"rule b12",b12!=null?b12.tree:null);
            RewriteRuleSubtreeStream stream_b21=new RewriteRuleSubtreeStream(adaptor,"rule b21",b21!=null?b21.tree:null);
            RewriteRuleSubtreeStream stream_b22=new RewriteRuleSubtreeStream(adaptor,"rule b22",b22!=null?b22.tree:null);
            RewriteRuleSubtreeStream stream_b23=new RewriteRuleSubtreeStream(adaptor,"rule b23",b23!=null?b23.tree:null);
            RewriteRuleSubtreeStream stream_b33=new RewriteRuleSubtreeStream(adaptor,"rule b33",b33!=null?b33.tree:null);
            RewriteRuleSubtreeStream stream_b13=new RewriteRuleSubtreeStream(adaptor,"rule b13",b13!=null?b13.tree:null);
            RewriteRuleSubtreeStream stream_b31=new RewriteRuleSubtreeStream(adaptor,"rule b31",b31!=null?b31.tree:null);
            RewriteRuleSubtreeStream stream_b32=new RewriteRuleSubtreeStream(adaptor,"rule b32",b32!=null?b32.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 29:4: -> ^( '=' ^( $o1 $b11 $b12) $b13) ^( '=' ^( $o2 $b11 $b21) $b31) ^( '=' ^( $o3 $b21 $b22) $b23) ^( '=' ^( $o4 $b12 $b22) $b32) ^( '=' ^( $o5 $b31 $b32) $b33) ^( '=' ^( $o6 $b13 $b23) $b33)
            {
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:31:4: ^( '=' ^( $o1 $b11 $b12) $b13)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:31:10: ^( $o1 $b11 $b12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o1.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b11.nextTree());
                adaptor.addChild(root_2, stream_b12.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b13.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:32:4: ^( '=' ^( $o2 $b11 $b21) $b31)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:32:10: ^( $o2 $b11 $b21)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o2.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b11.nextTree());
                adaptor.addChild(root_2, stream_b21.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b31.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:33:4: ^( '=' ^( $o3 $b21 $b22) $b23)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:33:10: ^( $o3 $b21 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o3.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b21.nextTree());
                adaptor.addChild(root_2, stream_b22.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b23.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:34:4: ^( '=' ^( $o4 $b12 $b22) $b32)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:34:10: ^( $o4 $b12 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o4.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b12.nextTree());
                adaptor.addChild(root_2, stream_b22.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b32.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:35:4: ^( '=' ^( $o5 $b31 $b32) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:35:10: ^( $o5 $b31 $b32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o5.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b31.nextTree());
                adaptor.addChild(root_2, stream_b32.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b33.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:36:4: ^( '=' ^( $o6 $b13 $b23) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:36:10: ^( $o6 $b13 $b23)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o6.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b13.nextTree());
                adaptor.addChild(root_2, stream_b23.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b33.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op"
    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:38:1: op : ( '+' | '-' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:38:4: ( '+' | '-' )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set8=(Token)input.LT(1);
            if ( (input.LA(1)>=8 && input.LA(1)<=9) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set8));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "op"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:40:1: block : letter -> ^( BLOCK letter ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        letter_return letter9 = null;


        RewriteRuleSubtreeStream stream_letter=new RewriteRuleSubtreeStream(adaptor,"rule letter");
        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:40:7: ( letter -> ^( BLOCK letter ) )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:40:10: letter
            {
            pushFollow(FOLLOW_letter_in_block303);
            letter9=letter();

            state._fsp--;

            stream_letter.add(letter9.getTree());


            // AST REWRITE
            // elements: letter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 40:17: -> ^( BLOCK letter )
            {
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:40:20: ^( BLOCK letter )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                adaptor.addChild(root_1, stream_letter.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class letter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "letter"
    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:41:1: letter : LETTERS ;
    public final letter_return letter() throws RecognitionException {
        letter_return retval = new letter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETTERS10=null;

        CommonTree LETTERS10_tree=null;

        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:41:8: ( LETTERS )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:41:11: LETTERS
            {
            root_0 = (CommonTree)adaptor.nil();

            LETTERS10=(Token)match(input,LETTERS,FOLLOW_LETTERS_in_letter319); 
            LETTERS10_tree = (CommonTree)adaptor.create(LETTERS10);
            adaptor.addChild(root_0, LETTERS10_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "letter"

    // Delegated rules


 

    public static final BitSet FOLLOW_program_in_start43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_program54 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program58 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program62 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program64 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program68 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program75 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program79 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program83 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program90 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program98 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program100 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program104 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program111 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program120 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program128 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letter_in_block303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTERS_in_letter319 = new BitSet(new long[]{0x0000000000000002L});

}