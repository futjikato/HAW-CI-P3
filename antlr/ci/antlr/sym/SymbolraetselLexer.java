package ci.antlr.sym;// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g 2013-11-26 19:09:08

import org.antlr.runtime.*;

public class SymbolraetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int BLOCK=4;
    public static final int LETTERS=5;
    public static final int WS=6;

    // delegates
    // delegators

    public SymbolraetselLexer() {;}
    public SymbolraetselLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:3:6: ( '=' )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:3:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:4:6: ( '+' )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:4:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:5:6: ( '-' )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:5:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "LETTERS"
    public final void mLETTERS() throws RecognitionException {
        try {
            int _type = LETTERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:43:9: ( ( 'A' .. 'Z' | 'a' .. 'z' )+ )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:43:12: ( 'A' .. 'Z' | 'a' .. 'z' )+
            {
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:43:12: ( 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTERS"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:45:4: ( ( ' ' | '\\t' | '\\n' ) )
            // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:45:14: ( ' ' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:1:8: ( T__7 | T__8 | T__9 | LETTERS | WS )
        int alt2=5;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt2=1;
            }
            break;
        case '+':
            {
            alt2=2;
            }
            break;
        case '-':
            {
            alt2=3;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt2=4;
            }
            break;
        case '\t':
        case '\n':
        case ' ':
            {
            alt2=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;
        }

        switch (alt2) {
            case 1 :
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:1:25: LETTERS
                {
                mLETTERS(); 

                }
                break;
            case 5 :
                // /Users/moritzspindelhirn/Downloads/Symbolraetsel/symbolraetsel.g:1:33: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}