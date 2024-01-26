/* 1 */ package f;public class Ap extends JG0 { public static final Ll b00 = Ll.F10("hover"); public static final Ll x2 = Ll.F10("textChanged"); public static final Ll iB0 = Ll.F10("textSelection"); public pe Cq; public GE KW; public CharSequence wL = ""; public int jH0 = -1; public int W7 = -1; public int u00; public final void HC(CharSequence paramCharSequence) { MF.u10(); if (paramCharSequence != null) { this.wL = paramCharSequence; byte b = 0; int i; if ((i = paramCharSequence.length()) > 0) { byte b1; for (b = 1, b1 = 0; b1 < i; ) { if (paramCharSequence.charAt(b1) == '\n') b++;  b1++; }  }  this
/* 2 */         .u00 = b; this.sa = true;
/* 3 */       this.O
/* 4 */         .Ym0(x2); return; }  throw new NullPointerException("text"); } public boolean r10 = true; public boolean sa; public et d0 = et.Em; public String FZ = null; public Ap() { this(null, false); } public Ap(Sa0 paramSa0) { this(paramSa0, false); } public Ap(Sa0 paramSa0, boolean paramBoolean) { super(paramSa0, paramBoolean); } public final void Mi0() { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: iconst_0
/*   */     //   3: putfield sa : Z
/*   */     //   6: getfield r10 : Z
/*   */     //   9: ifeq -> 150
/*   */     //   12: aload_0
/*   */     //   13: invokevirtual NK : ()Z
/*   */     //   16: ifeq -> 150
/*   */     //   19: aload_0
/*   */     //   20: getfield Cq : Lf/pe;
/*   */     //   23: dup
/*   */     //   24: astore_1
/*   */     //   25: ifnull -> 150
/*   */     //   28: aload_1
/*   */     //   29: checkcast f/t90
/*   */     //   32: invokevirtual isMarkupEnabled : ()Z
/*   */     //   35: ifne -> 150
/*   */     //   38: aload_0
/*   */     //   39: getfield KW : Lf/GE;
/*   */     //   42: dup
/*   */     //   43: astore_1
/*   */     //   44: ifnonnull -> 67
/*   */     //   47: aload_0
/*   */     //   48: dup
/*   */     //   49: getfield Cq : Lf/pe;
/*   */     //   52: checkcast f/t90
/*   */     //   55: invokevirtual getFont : ()Lf/Me;
/*   */     //   58: invokevirtual ag0 : ()Lf/GE;
/*   */     //   61: putfield KW : Lf/GE;
/*   */     //   64: goto -> 71
/*   */     //   67: aload_1
/*   */     //   68: invokevirtual RV : ()V
/*   */     //   71: aload_0
/*   */     //   72: dup
/*   */     //   73: dup2
/*   */     //   74: dup2
/*   */     //   75: dup2
/*   */     //   76: dup2
/*   */     //   77: getfield Cq : Lf/pe;
/*   */     //   80: astore_0
/*   */     //   81: getfield KW : Lf/GE;
/*   */     //   84: astore_1
/*   */     //   85: getfield wL : Ljava/lang/CharSequence;
/*   */     //   88: astore_2
/*   */     //   89: invokevirtual qF : ()I
/*   */     //   92: istore_3
/*   */     //   93: getfield d0 : Lf/et;
/*   */     //   96: getfield tk0 : Lf/Mo;
/*   */     //   99: astore #4
/*   */     //   101: getfield FZ : Ljava/lang/String;
/*   */     //   104: astore #5
/*   */     //   106: aload_0
/*   */     //   107: checkcast f/t90
/*   */     //   110: aload_1
/*   */     //   111: aload_2
/*   */     //   112: iload_3
/*   */     //   113: aload #4
/*   */     //   115: aload #5
/*   */     //   117: invokevirtual cacheMultiLineText : (Lf/GE;Ljava/lang/CharSequence;ILf/Mo;Ljava/lang/String;)Lf/R3;
/*   */     //   120: getfield e20 : F
/*   */     //   123: f2i
/*   */     //   124: putfield jH0 : I
/*   */     //   127: getfield u00 : I
/*   */     //   130: i2f
/*   */     //   131: fstore_0
/*   */     //   132: getfield Cq : Lf/pe;
/*   */     //   135: checkcast f/t90
/*   */     //   138: invokevirtual getLineHeightF : ()F
/*   */     //   141: fload_0
/*   */     //   142: fmul
/*   */     //   143: f2i
/*   */     //   144: putfield W7 : I
/*   */     //   147: goto -> 235
/*   */     //   150: aload_0
/*   */     //   151: getfield Cq : Lf/pe;
/*   */     //   154: ifnull -> 231
/*   */     //   157: aload_0
/*   */     //   158: invokevirtual NK : ()Z
/*   */     //   161: ifeq -> 209
/*   */     //   164: aload_0
/*   */     //   165: dup
/*   */     //   166: dup2
/*   */     //   167: dup2
/*   */     //   168: getfield Cq : Lf/pe;
/*   */     //   171: astore_0
/*   */     //   172: getfield wL : Ljava/lang/CharSequence;
/*   */     //   175: aload_0
/*   */     //   176: checkcast f/t90
/*   */     //   179: swap
/*   */     //   180: invokevirtual computeTextWidth : (Ljava/lang/CharSequence;)I
/*   */     //   183: putfield jH0 : I
/*   */     //   186: getfield u00 : I
/*   */     //   189: i2f
/*   */     //   190: fstore_0
/*   */     //   191: getfield Cq : Lf/pe;
/*   */     //   194: checkcast f/t90
/*   */     //   197: invokevirtual getLineHeightF : ()F
/*   */     //   200: fload_0
/*   */     //   201: fmul
/*   */     //   202: f2i
/*   */     //   203: putfield W7 : I
/*   */     //   206: goto -> 235
/*   */     //   209: aload_0
/*   */     //   210: dup
/*   */     //   211: dup
/*   */     //   212: iconst_0
/*   */     //   213: putfield jH0 : I
/*   */     //   216: getfield Cq : Lf/pe;
/*   */     //   219: checkcast f/t90
/*   */     //   222: invokevirtual getLineHeight : ()I
/*   */     //   225: putfield W7 : I
/*   */     //   228: goto -> 235
/*   */     //   231: aload_0
/*   */     //   232: invokevirtual jA0 : ()V
/* 4 */     //   235: return } public String TI() { return "textwidget"; } public void UD0(pe parampe) { GE gE; if ((gE = this.KW) != null) { gE.RV(); this.KW = null; }  this.Cq = parampe; if (this.r10) this.sa = true;  } public final boolean NK() { return (this.u00 > 0); } public void C70(et paramet) { if (paramet != null) { if (this.d0 != paramet) { this.d0 = paramet; this.sa = true; }  return; }  throw new NullPointerException("alignment"); } public void qx(nY paramnY) { UD0(((q80)paramnY).aa0("font")); String str = "textAlignment"; Enum enum_1; Class<Enum> clazz = (enum_1 = et.Em).getDeclaringClass(); Enum enum_2; if ((enum_2 = (Enum)((q80)paramnY).Yz0(str, true, clazz, null)) != null) enum_1 = enum_2;  C70((et)enum_1); } public void Xw(nY paramnY) { super.Xw(paramnY); qx(paramnY); } public void jA0() { GE gE; if ((gE = this.KW) != null) { gE.RV(); this.KW = null; }  super.jA0(); } public int com4(boolean paramBoolean) { int i = RS(); byte b; return (paramBoolean && (b = this.d0.aN) > 0) ? ((qF() - Td0()) * b / 2 + i) : i; } public final int J4() { int i = e3(); byte b; return ((b = this.d0.PO) > 0) ? ((Hy() - n70()) * b / 2 + i - ((t90)this.Cq).getBaseLine()) : i; } public void Gu() { rq0(); this.sa = true; } public final void cb(oa0 paramoa0) { int i; if (B8.Pg(i = paramoa0.cz0) && !this.lPt4) { boolean bool; Sa0 sa0 = this.O;
/* 5 */       Ll ll = b00; if (i != 7) { bool = true; } else { bool = false; }  gf0(ll, bool); }
/*   */      }
/*   */ 
/*   */   
/*   */   public void J00(throws paramthrows) {
/*   */     Lp(this.O);
/*   */   }
/*   */   
/*   */   public int R80() {
/*   */     int i = super.R80();
/*   */     if (NK() && this.Cq != null)
/*   */       i = Math.max(i, Td0()); 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public int tJ0() {
/*   */     int i = super.tJ0();
/*   */     if (NK() && this.Cq != null)
/*   */       i = Math.max(i, n70()); 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final int Td0() {
/*   */     boolean bool;
/*   */     if (!(bool = this.sa) && this.r10)
/*   */       return this.jH0; 
/*   */     pe pe1;
/*   */     if ((pe1 = this.Cq) != null) {
/*   */       if (bool || !this.r10)
/*   */         if (this.u00 > 1) {
/*   */           CharSequence charSequence = this.wL;
/*   */           this.jH0 = ((t90)pe1).computeMultiLineTextWidth(charSequence);
/*   */         } else {
/*   */           CharSequence charSequence = this.wL;
/*   */           this.jH0 = ((t90)pe1).computeTextWidth(charSequence);
/*   */         }  
/*   */       return this.jH0;
/*   */     } 
/*   */     return 0;
/*   */   }
/*   */   
/*   */   public final int n70() {
/*   */     if (!this.sa && this.r10)
/*   */       return this.W7; 
/*   */     if (this.Cq != null) {
/*   */       float f = Math.max(1, this.u00);
/*   */       return this.W7 = (int)(((t90)this.Cq).getLineHeightF() * f);
/*   */     } 
/*   */     return 0;
/*   */   }
/*   */   
/*   */   public final void vL0() {
/*   */     boolean bool = false;
/*   */     if (this.r10) {
/*   */       this.r10 = bool;
/*   */       this.sa = true;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Lp(Sa0 paramSa0) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield sa : Z
/*   */     //   4: ifeq -> 11
/*   */     //   7: aload_0
/*   */     //   8: invokevirtual Mi0 : ()V
/*   */     //   11: aload_0
/*   */     //   12: invokevirtual NK : ()Z
/*   */     //   15: ifeq -> 146
/*   */     //   18: aload_0
/*   */     //   19: getfield Cq : Lf/pe;
/*   */     //   22: dup
/*   */     //   23: astore_2
/*   */     //   24: ifnull -> 146
/*   */     //   27: aload_0
/*   */     //   28: getfield KW : Lf/GE;
/*   */     //   31: dup
/*   */     //   32: astore_3
/*   */     //   33: ifnull -> 61
/*   */     //   36: aload_2
/*   */     //   37: aload_0
/*   */     //   38: dup
/*   */     //   39: iconst_0
/*   */     //   40: invokevirtual com4 : (Z)I
/*   */     //   43: istore_0
/*   */     //   44: invokevirtual J4 : ()I
/*   */     //   47: istore_2
/*   */     //   48: checkcast f/t90
/*   */     //   51: aload_3
/*   */     //   52: aload_1
/*   */     //   53: iload_0
/*   */     //   54: iload_2
/*   */     //   55: invokevirtual drawFromCache : (Lf/GE;Lf/fB0;II)V
/*   */     //   58: goto -> 146
/*   */     //   61: aload_0
/*   */     //   62: getfield u00 : I
/*   */     //   65: iconst_1
/*   */     //   66: if_icmple -> 118
/*   */     //   69: aload_2
/*   */     //   70: aload_0
/*   */     //   71: dup
/*   */     //   72: dup
/*   */     //   73: dup2
/*   */     //   74: iconst_1
/*   */     //   75: invokevirtual com4 : (Z)I
/*   */     //   78: istore_0
/*   */     //   79: invokevirtual J4 : ()I
/*   */     //   82: istore_2
/*   */     //   83: getfield wL : Ljava/lang/CharSequence;
/*   */     //   86: astore_3
/*   */     //   87: invokevirtual Td0 : ()I
/*   */     //   90: istore #4
/*   */     //   92: getfield d0 : Lf/et;
/*   */     //   95: getfield tk0 : Lf/Mo;
/*   */     //   98: astore #5
/*   */     //   100: checkcast f/t90
/*   */     //   103: aload_1
/*   */     //   104: iload_0
/*   */     //   105: iload_2
/*   */     //   106: aload_3
/*   */     //   107: iload #4
/*   */     //   109: aload #5
/*   */     //   111: invokevirtual drawMultiLineText : (Lf/fB0;IILjava/lang/CharSequence;ILf/Mo;)I
/*   */     //   114: pop
/*   */     //   115: goto -> 146
/*   */     //   118: aload_2
/*   */     //   119: aload_0
/*   */     //   120: dup
/*   */     //   121: dup
/*   */     //   122: iconst_1
/*   */     //   123: invokevirtual com4 : (Z)I
/*   */     //   126: istore_0
/*   */     //   127: invokevirtual J4 : ()I
/*   */     //   130: istore_2
/*   */     //   131: getfield wL : Ljava/lang/CharSequence;
/*   */     //   134: astore_3
/*   */     //   135: checkcast f/t90
/*   */     //   138: aload_1
/*   */     //   139: iload_0
/*   */     //   140: iload_2
/*   */     //   141: aload_3
/*   */     //   142: invokevirtual drawText : (Lf/fB0;IILjava/lang/CharSequence;)I
/*   */     //   145: pop
/*   */     //   146: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 28
/*   */     //   #2	-> 75
/*   */     //   #3	-> 79
/*   */     //   #4	-> 123
/*   */     //   #5	-> 127
/*   */   }
/*   */   
/*   */   public final void rs() {
/*   */     this.FZ = "";
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */