/*  1 */ package f;public final class G1 extends Ap { public final void ai(int paramInt1, int paramInt2, int paramInt3) { int i = this.Fh.mq, j = this.Fh.r50; if (this.Fh.em0 != null && j > paramInt1 && i <= paramInt2) { int n, k = this.H10; pe pe; if ((pe = this.Cq) != null && i > paramInt1) { CharSequence charSequence = this.wL; n = ((t90)pe).computeTextWidth(charSequence, paramInt1, i); } else { n = 0; }  k = n + k; if (paramInt2 < j)
/*  2 */       { n = m40(); } else { n = this.H10; int i3 = Math.min(paramInt2, j); pe pe1;
/*  3 */         if ((pe1 = this.Cq) != null && i3 > paramInt1) { CharSequence charSequence = this.wL; i3 = ((t90)pe1).computeTextWidth(charSequence, paramInt1, i3); } else { i3 = 0; }  n = i3 + n; }
/*    */       
/*  5 */       Sa0 sa01 = this.O;
/*    */       
/*  7 */       int i1 = ((t90)this.Cq).getBaseLine() / 2 + paramInt3 - 1, i2 = n - k;
/*    */       
/*  9 */       int m = ((t90)this.Cq).getLineHeight(); this.Fh.em0.W8(sa01, k, i1, i2, m); }
/* 10 */      Sa0 sa0 = this.O;
/* 11 */     if (this.sa) Mi0();  if (NK() && this.Cq != null) {
/* 12 */       int k = com4(true); if (i < paramInt1) { i = paramInt1; } else if (i > paramInt2) { i = paramInt2; }  if (j < paramInt1) { j = paramInt1; } else if (j > paramInt2) { j = paramInt2; }  if (i > paramInt1)
/* 13 */       { pe pe = this.Cq; CharSequence charSequence = this.wL; k += ((t90)pe).drawText(sa0, k, paramInt3, charSequence, paramInt1, i); }  if (j > i) { Ll ll; sa0.gf0(ll = Ap.iB0, true); pe pe = this.Cq; CharSequence charSequence = this.wL; k += ((t90)pe).drawText(sa0, k, paramInt3, charSequence, i, j); sa0.gf0(ll, false); }  if (j < paramInt2) { pe pe = this.Cq; CharSequence charSequence = this.wL; ((t90)this).drawText(sa0, k, paramInt3, charSequence, j, paramInt2); }
/*    */     
/*    */     }  }
/*    */ 
/*    */   
/*    */   public int H10;
/*    */   public int bV;
/*    */   
/*    */   public G1(of paramof, Sa0 paramSa0) {
/*    */     super(paramSa0);
/*    */   }
/*    */   
/*    */   public final String TI() {
/*    */     return "textrenderer";
/*    */   }
/*    */   
/*    */   public final void J00(throws paramthrows) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Fh : Lf/of;
/*    */     //   4: dup
/*    */     //   5: astore_1
/*    */     //   6: getfield bh0 : Z
/*    */     //   9: ifeq -> 20
/*    */     //   12: aload_1
/*    */     //   13: dup
/*    */     //   14: getfield Td : Z
/*    */     //   17: invokevirtual gj : (Z)V
/*    */     //   20: aload_0
/*    */     //   21: getfield Fh : Lf/of;
/*    */     //   24: dup
/*    */     //   25: astore_1
/*    */     //   26: invokevirtual p3 : ()Z
/*    */     //   29: ifne -> 47
/*    */     //   32: aload_1
/*    */     //   33: getfield q50 : Z
/*    */     //   36: ifeq -> 42
/*    */     //   39: goto -> 47
/*    */     //   42: iconst_0
/*    */     //   43: istore_1
/*    */     //   44: goto -> 49
/*    */     //   47: iconst_1
/*    */     //   48: istore_1
/*    */     //   49: iload_1
/*    */     //   50: ifeq -> 64
/*    */     //   53: aload_0
/*    */     //   54: getfield Fh : Lf/of;
/*    */     //   57: getfield ju : I
/*    */     //   60: istore_1
/*    */     //   61: goto -> 66
/*    */     //   64: iconst_0
/*    */     //   65: istore_1
/*    */     //   66: aload_0
/*    */     //   67: dup
/*    */     //   68: dup
/*    */     //   69: dup2
/*    */     //   70: iload_1
/*    */     //   71: putfield bV : I
/*    */     //   74: iconst_1
/*    */     //   75: invokevirtual com4 : (Z)I
/*    */     //   78: putfield H10 : I
/*    */     //   81: getfield Fh : Lf/of;
/*    */     //   84: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   87: pop
/*    */     //   88: getfield Fh : Lf/of;
/*    */     //   91: invokevirtual jh : ()Z
/*    */     //   94: ifeq -> 250
/*    */     //   97: aload_0
/*    */     //   98: getfield Fh : Lf/of;
/*    */     //   101: dup
/*    */     //   102: astore_1
/*    */     //   103: invokevirtual p3 : ()Z
/*    */     //   106: ifne -> 124
/*    */     //   109: aload_1
/*    */     //   110: getfield q50 : Z
/*    */     //   113: ifeq -> 119
/*    */     //   116: goto -> 124
/*    */     //   119: iconst_0
/*    */     //   120: istore_1
/*    */     //   121: goto -> 126
/*    */     //   124: iconst_1
/*    */     //   125: istore_1
/*    */     //   126: iload_1
/*    */     //   127: ifeq -> 250
/*    */     //   130: aload_0
/*    */     //   131: getfield Fh : Lf/of;
/*    */     //   134: dup
/*    */     //   135: astore_1
/*    */     //   136: getfield GE : Z
/*    */     //   139: ifeq -> 224
/*    */     //   142: aload_0
/*    */     //   143: dup
/*    */     //   144: aload_1
/*    */     //   145: getfield F2 : Lf/ak0;
/*    */     //   148: iconst_0
/*    */     //   149: istore_1
/*    */     //   150: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   153: invokevirtual length : ()I
/*    */     //   156: istore_2
/*    */     //   157: invokevirtual J4 : ()I
/*    */     //   160: istore_3
/*    */     //   161: getfield Fh : Lf/of;
/*    */     //   164: getfield cj : Lf/G1;
/*    */     //   167: getfield Cq : Lf/pe;
/*    */     //   170: dup
/*    */     //   171: astore #4
/*    */     //   173: ifnull -> 189
/*    */     //   176: aload #4
/*    */     //   178: checkcast f/t90
/*    */     //   181: invokevirtual getLineHeight : ()I
/*    */     //   184: istore #4
/*    */     //   186: goto -> 192
/*    */     //   189: iconst_0
/*    */     //   190: istore #4
/*    */     //   192: iload_1
/*    */     //   193: iload_2
/*    */     //   194: if_icmpge -> 258
/*    */     //   197: iload_3
/*    */     //   198: iload #4
/*    */     //   200: aload_0
/*    */     //   201: iload_1
/*    */     //   202: aload_0
/*    */     //   203: getfield Fh : Lf/of;
/*    */     //   206: iload_1
/*    */     //   207: invokevirtual PW : (I)I
/*    */     //   210: dup
/*    */     //   211: istore_1
/*    */     //   212: iload_3
/*    */     //   213: invokevirtual ai : (III)V
/*    */     //   216: iadd
/*    */     //   217: istore_3
/*    */     //   218: iinc #1, 1
/*    */     //   221: goto -> 192
/*    */     //   224: aload_0
/*    */     //   225: dup
/*    */     //   226: aload_1
/*    */     //   227: getfield F2 : Lf/ak0;
/*    */     //   230: getfield PH0 : Ljava/lang/StringBuilder;
/*    */     //   233: invokevirtual length : ()I
/*    */     //   236: istore_0
/*    */     //   237: invokevirtual J4 : ()I
/*    */     //   240: istore_1
/*    */     //   241: iconst_0
/*    */     //   242: iload_0
/*    */     //   243: iload_1
/*    */     //   244: invokevirtual ai : (III)V
/*    */     //   247: goto -> 258
/*    */     //   250: aload_0
/*    */     //   251: dup
/*    */     //   252: getfield O : Lf/Sa0;
/*    */     //   255: invokevirtual Lp : (Lf/Sa0;)V
/*    */     //   258: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 26
/*    */     //   #2	-> 33
/*    */     //   #3	-> 54
/*    */     //   #4	-> 75
/*    */     //   #5	-> 78
/*    */     //   #6	-> 103
/*    */     //   #7	-> 110
/*    */     //   #8	-> 131
/*    */     //   #9	-> 145
/*    */     //   #10	-> 150
/*    */     //   #11	-> 153
/*    */     //   #12	-> 157
/*    */     //   #13	-> 164
/*    */     //   #14	-> 167
/*    */     //   #15	-> 178
/*    */     //   #16	-> 203
/*    */     //   #17	-> 227
/*    */     //   #18	-> 230
/*    */     //   #19	-> 233
/*    */     //   #20	-> 237
/*    */     //   #21	-> 252
/*    */     //   #22	-> 255
/*    */   }
/*    */   
/*    */   public final void Gu() {
/*    */     of of1;
/*    */     if ((of1 = this.Fh).y00)
/*    */       gj(true); 
/*    */   }
/*    */   
/*    */   public final int com4(boolean paramBoolean) {
/*    */     int i = RS();
/*    */     byte b;
/*    */     if (paramBoolean && (b = this.d0.aN) > 0)
/*    */       i = Math.max(0, qF() - Td0()) * b / 2 + i; 
/*    */     return i - this.bV;
/*    */   }
/*    */   
/*    */   public final void jA0() {
/*    */     super.jA0();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */