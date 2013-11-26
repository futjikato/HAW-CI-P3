package ci.antlr.sym;// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g 2013-11-25 21:59:53

import org.antlr.runtime.*;


import org.antlr.runtime.tree.*;

public class SymbolraetselParser extends Parser {
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
    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:23:1: program : b11= block op b12= block '=' b13= block op op op b21= block op b22= block '=' b23= block '=' '=' '=' b31= block op b32= block '=' b33= block -> ^( '=' ^( op $b11 $b12) $b13) ^( '=' ^( op $b11 $b21) $b31) ^( '=' ^( op $b21 $b22) $b23) ^( '=' ^( op $b12 $b22) $b32) ^( '=' ^( op $b31 $b32) $b33) ^( '=' ^( op $b13 $b23) $b33) ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal3=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal10=null;
        Token char_literal11=null;
        Token char_literal13=null;
        block_return b11 = null;

        block_return b12 = null;

        block_return b13 = null;

        block_return b21 = null;

        block_return b22 = null;

        block_return b23 = null;

        block_return b31 = null;

        block_return b32 = null;

        block_return b33 = null;

        op_return op2 = null;

        op_return op4 = null;

        op_return op5 = null;

        op_return op6 = null;

        op_return op7 = null;

        op_return op12 = null;


        CommonTree char_literal3_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_7=new RewriteRuleTokenStream(adaptor,"token 7");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:23:9: (b11= block op b12= block '=' b13= block op op op b21= block op b22= block '=' b23= block '=' '=' '=' b31= block op b32= block '=' b33= block -> ^( '=' ^( op $b11 $b12) $b13) ^( '=' ^( op $b11 $b21) $b31) ^( '=' ^( op $b21 $b22) $b23) ^( '=' ^( op $b12 $b22) $b32) ^( '=' ^( op $b31 $b32) $b33) ^( '=' ^( op $b13 $b23) $b33) )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:23:12: b11= block op b12= block '=' b13= block op op op b21= block op b22= block '=' b23= block '=' '=' '=' b31= block op b32= block '=' b33= block
            {
            pushFollow(FOLLOW_block_in_program54);
            b11=block();

            state._fsp--;

            stream_block.add(b11.getTree());
            pushFollow(FOLLOW_op_in_program56);
            op2=op();

            state._fsp--;

            stream_op.add(op2.getTree());
            pushFollow(FOLLOW_block_in_program60);
            b12=block();

            state._fsp--;

            stream_block.add(b12.getTree());
            char_literal3=(Token)match(input,7,FOLLOW_7_in_program62);  
            stream_7.add(char_literal3);

            pushFollow(FOLLOW_block_in_program66);
            b13=block();

            state._fsp--;

            stream_block.add(b13.getTree());
            pushFollow(FOLLOW_op_in_program71);
            op4=op();

            state._fsp--;

            stream_op.add(op4.getTree());
            pushFollow(FOLLOW_op_in_program73);
            op5=op();

            state._fsp--;

            stream_op.add(op5.getTree());
            pushFollow(FOLLOW_op_in_program75);
            op6=op();

            state._fsp--;

            stream_op.add(op6.getTree());
            pushFollow(FOLLOW_block_in_program82);
            b21=block();

            state._fsp--;

            stream_block.add(b21.getTree());
            pushFollow(FOLLOW_op_in_program84);
            op7=op();

            state._fsp--;

            stream_op.add(op7.getTree());
            pushFollow(FOLLOW_block_in_program88);
            b22=block();

            state._fsp--;

            stream_block.add(b22.getTree());
            char_literal8=(Token)match(input,7,FOLLOW_7_in_program90);  
            stream_7.add(char_literal8);

            pushFollow(FOLLOW_block_in_program94);
            b23=block();

            state._fsp--;

            stream_block.add(b23.getTree());
            char_literal9=(Token)match(input,7,FOLLOW_7_in_program99);  
            stream_7.add(char_literal9);

            char_literal10=(Token)match(input,7,FOLLOW_7_in_program101);  
            stream_7.add(char_literal10);

            char_literal11=(Token)match(input,7,FOLLOW_7_in_program103);  
            stream_7.add(char_literal11);

            pushFollow(FOLLOW_block_in_program110);
            b31=block();

            state._fsp--;

            stream_block.add(b31.getTree());
            pushFollow(FOLLOW_op_in_program112);
            op12=op();

            state._fsp--;

            stream_op.add(op12.getTree());
            pushFollow(FOLLOW_block_in_program116);
            b32=block();

            state._fsp--;

            stream_block.add(b32.getTree());
            char_literal13=(Token)match(input,7,FOLLOW_7_in_program118);  
            stream_7.add(char_literal13);

            pushFollow(FOLLOW_block_in_program122);
            b33=block();

            state._fsp--;

            stream_block.add(b33.getTree());


            // AST REWRITE
            // elements: 7, b32, 7, b13, 7, b22, b21, op, b31, b23, b23, op, 7, b12, op, op, b32, op, b22, 7, b33, b11, b31, b21, b33, 7, b11, op, b13, b12
            // token labels: 
            // rule labels: retval, b11, b12, b21, b22, b23, b33, b31, b13, b32
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b11=new RewriteRuleSubtreeStream(adaptor,"rule b11",b11!=null?b11.tree:null);
            RewriteRuleSubtreeStream stream_b12=new RewriteRuleSubtreeStream(adaptor,"rule b12",b12!=null?b12.tree:null);
            RewriteRuleSubtreeStream stream_b21=new RewriteRuleSubtreeStream(adaptor,"rule b21",b21!=null?b21.tree:null);
            RewriteRuleSubtreeStream stream_b22=new RewriteRuleSubtreeStream(adaptor,"rule b22",b22!=null?b22.tree:null);
            RewriteRuleSubtreeStream stream_b23=new RewriteRuleSubtreeStream(adaptor,"rule b23",b23!=null?b23.tree:null);
            RewriteRuleSubtreeStream stream_b33=new RewriteRuleSubtreeStream(adaptor,"rule b33",b33!=null?b33.tree:null);
            RewriteRuleSubtreeStream stream_b31=new RewriteRuleSubtreeStream(adaptor,"rule b31",b31!=null?b31.tree:null);
            RewriteRuleSubtreeStream stream_b13=new RewriteRuleSubtreeStream(adaptor,"rule b13",b13!=null?b13.tree:null);
            RewriteRuleSubtreeStream stream_b32=new RewriteRuleSubtreeStream(adaptor,"rule b32",b32!=null?b32.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 29:4: -> ^( '=' ^( op $b11 $b12) $b13) ^( '=' ^( op $b11 $b21) $b31) ^( '=' ^( op $b21 $b22) $b23) ^( '=' ^( op $b12 $b22) $b32) ^( '=' ^( op $b31 $b32) $b33) ^( '=' ^( op $b13 $b23) $b33)
            {
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:31:4: ^( '=' ^( op $b11 $b12) $b13)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:31:10: ^( op $b11 $b12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b11.nextTree());
                adaptor.addChild(root_2, stream_b12.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b13.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:32:4: ^( '=' ^( op $b11 $b21) $b31)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:32:10: ^( op $b11 $b21)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b11.nextTree());
                adaptor.addChild(root_2, stream_b21.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b31.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:33:4: ^( '=' ^( op $b21 $b22) $b23)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:33:10: ^( op $b21 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b21.nextTree());
                adaptor.addChild(root_2, stream_b22.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b23.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:34:4: ^( '=' ^( op $b12 $b22) $b32)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:34:10: ^( op $b12 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b12.nextTree());
                adaptor.addChild(root_2, stream_b22.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b32.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:35:4: ^( '=' ^( op $b31 $b32) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:35:10: ^( op $b31 $b32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b31.nextTree());
                adaptor.addChild(root_2, stream_b32.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_b33.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:36:4: ^( '=' ^( op $b13 $b23) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:36:10: ^( op $b13 $b23)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_2);

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

        Token set14=null;

        CommonTree set14_tree=null;

        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:38:4: ( '+' | '-' )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=8 && input.LA(1)<=9) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set14));
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

        letter_return letter15 = null;


        RewriteRuleSubtreeStream stream_letter=new RewriteRuleSubtreeStream(adaptor,"rule letter");
        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:40:7: ( letter -> ^( BLOCK letter ) )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:40:10: letter
            {
            pushFollow(FOLLOW_letter_in_block285);
            letter15=letter();

            state._fsp--;

            stream_letter.add(letter15.getTree());


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
    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:41:1: letter : ( LETTER )+ ;
    public final letter_return letter() throws RecognitionException {
        letter_return retval = new letter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETTER16=null;

        CommonTree LETTER16_tree=null;

        try {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:41:8: ( ( LETTER )+ )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:41:11: ( LETTER )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:41:11: ( LETTER )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LETTER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:41:11: LETTER
            	    {
            	    LETTER16=(Token)match(input,LETTER,FOLLOW_LETTER_in_letter301); 
            	    LETTER16_tree = (CommonTree)adaptor.create(LETTER16);
            	    adaptor.addChild(root_0, LETTER16_tree);


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
    public static final BitSet FOLLOW_op_in_program56 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program60 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program66 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program71 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program73 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program75 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program82 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program84 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program88 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program90 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program94 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program99 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program101 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program110 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_op_in_program112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program116 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_program118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_program122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letter_in_block285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_letter301 = new BitSet(new long[]{0x0000000000000022L});

}