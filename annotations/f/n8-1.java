/* 1 */ package f;public final class n8 { public final void ka0() { wJ wJ1; int i; if ((i = (wJ1 = this.Ha).v2) > 0) {
/* 2 */       (wJ1 = this)
/* 3 */         .Mg0 = i; this.v2 = i;
/* 4 */       for (int j = Math.min(i, i); j <= i; ) { if (((eG)this)
/* 5 */           .Va.get(j)) { uh(j); }
/* 6 */         else if (!((eG)this).Va.get(j)) { ((eG)this).Va.set(j); if (j < ((eG)this).e60) ((eG)this).e60 = j;  if (j > ((eG)this).Rh0) ((eG)this).Rh0 = j;  }  j++; }
/*   */     
/*   */     }  }
/*   */ 
/*   */   
/*   */   public final gg0 Kz0;
/*   */   public final wJ Ha;
/*   */   public Na oT;
/*   */   
/*   */   public n8(eG parameG) {
/*   */     this.Ha = parameG;
/*   */     this();
/*   */     this.Kz0 = gg01;
/*   */     gg01.ch0("selectNextRow", this::eK0, 5);
/*   */     gg01.ch0("selectPreviousRow", this::SJ0, 5);
/*   */     gg01.ch0("selectNextPage", this::yY, 5);
/*   */     gg01.ch0("selectPreviousPage", this::CL0, 5);
/*   */     gg01.ch0("selectFirstRow", this::s20, 5);
/*   */     gg01.ch0("selectLastRow", this::c70, 5);
/*   */     gg01.ch0("extendSelectionToNextRow", this::Iq, 5);
/*   */     gg01.ch0("extendSelectionToPreviousRow", this::i90, 5);
/*   */     gg01.ch0("extendSelectionToNextPage", this::Tj, 5);
/*   */     gg01.ch0("extendSelectionToPreviousPage", this::HC, 5);
/*   */     gg01.ch0("extendSelectionToFirstRow", this::DK, 5);
/*   */     gg01.ch0("extendSelectionToLastRow", this::i50, 5);
/*   */     gg01.ch0("moveLeadToNextRow", this::Si, 5);
/*   */     gg01.ch0("moveLeadToPreviousRow", this::j30, 5);
/*   */     gg01.ch0("moveLeadToNextPage", this::lPT3, 5);
/*   */     gg01.ch0("moveLeadToPreviousPage", this::px, 5);
/*   */     gg01.ch0("moveLeadToFirstRow", this::gJ, 5);
/*   */     gg01.ch0("moveLeadToLastRow", this::SX, 5);
/*   */     gg01.ch0("toggleSelectionOnLeadRow", this::ka0, 5);
/*   */     gg01.ch0("selectAll", this::N4, 5);
/*   */     gg0 gg01;
/*   */     (gg01 = new gg0()).ch0("selectNone", this::Eq0, 5);
/*   */   }
/*   */   
/*   */   public final void eK0() {
/*   */     Qt0(1, 2);
/*   */   }
/*   */   
/*   */   public final void SJ0() {
/*   */     Qt0(-1, 2);
/*   */   }
/*   */   
/*   */   public final void yY() {
/*   */     Qt0(bq0(), 2);
/*   */   }
/*   */   
/*   */   public final void CL0() {
/*   */     Qt0(-bq0(), 2);
/*   */   }
/*   */   
/*   */   public final void s20() {
/*   */     if (ei() > 0)
/*   */       No0(0, 2); 
/*   */   }
/*   */   
/*   */   public final void c70() {
/*   */     int i;
/*   */     if ((i = ei()) > 0)
/*   */       Qt0(i - 1, 2); 
/*   */   }
/*   */   
/*   */   public final void Iq() {
/*   */     Qt0(1, 1);
/*   */   }
/*   */   
/*   */   public final void i90() {
/*   */     Qt0(-1, 1);
/*   */   }
/*   */   
/*   */   public final void Tj() {
/*   */     Qt0(bq0(), 1);
/*   */   }
/*   */   
/*   */   public final void HC() {
/*   */     Qt0(-bq0(), 1);
/*   */   }
/*   */   
/*   */   public final void DK() {
/*   */     if (ei() > 0)
/*   */       No0(0, 1); 
/*   */   }
/*   */   
/*   */   public final void i50() {
/*   */     int i;
/*   */     if ((i = ei()) > 0)
/*   */       Qt0(i - 1, 1); 
/*   */   }
/*   */   
/*   */   public final void Si() {
/*   */     Qt0(1, 3);
/*   */   }
/*   */   
/*   */   public final void j30() {
/*   */     Qt0(-1, 3);
/*   */   }
/*   */   
/*   */   public final void lPT3() {
/*   */     Qt0(bq0(), 3);
/*   */   }
/*   */   
/*   */   public final void px() {
/*   */     Qt0(-bq0(), 3);
/*   */   }
/*   */   
/*   */   public final void gJ() {
/*   */     if (ei() > 0)
/*   */       No0(0, 3); 
/*   */   }
/*   */   
/*   */   public final void SX() {
/*   */     int i;
/*   */     if ((i = ei()) > 0)
/*   */       No0(i - 1, 3); 
/*   */   }
/*   */   
/*   */   public final void N4() {
/*   */     int i;
/*   */     if ((i = ei()) > 0)
/*   */       this.Ha.Yb(0, i - 1); 
/*   */   }
/*   */   
/*   */   public final void Eq0() {
/*   */     eG eG;
/*   */     if (((eG = (eG)this.Ha).Rh0 >= this.e60)) {
/*   */       this.e60 = Integer.MAX_VALUE;
/*   */       this.Rh0 = Integer.MIN_VALUE;
/*   */       this.Va.clear();
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Qt0(int paramInt1, int paramInt2) {
/*   */     int i;
/*   */     if ((i = ei()) > 0) {
/*   */       int j = Math.max(0, this.Ha.v2);
/*   */       No0(Math.max(0, Math.min(i - 1, j + paramInt1)), paramInt2);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void No0(int paramInt1, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield oT : Lf/Na;
/*   */     //   4: dup
/*   */     //   5: astore_3
/*   */     //   6: ifnull -> 14
/*   */     //   9: aload_3
/*   */     //   10: iload_1
/*   */     //   11: invokevirtual Wj0 : (I)V
/*   */     //   14: iload_2
/*   */     //   15: ifeq -> 76
/*   */     //   18: iload_2
/*   */     //   19: iconst_1
/*   */     //   20: if_icmpeq -> 51
/*   */     //   23: iload_2
/*   */     //   24: iconst_3
/*   */     //   25: if_icmpeq -> 40
/*   */     //   28: aload_0
/*   */     //   29: getfield Ha : Lf/wJ;
/*   */     //   32: iload_1
/*   */     //   33: dup
/*   */     //   34: invokevirtual Yb : (II)V
/*   */     //   37: goto -> 180
/*   */     //   40: aload_0
/*   */     //   41: getfield Ha : Lf/wJ;
/*   */     //   44: iload_1
/*   */     //   45: putfield v2 : I
/*   */     //   48: goto -> 180
/*   */     //   51: aload_0
/*   */     //   52: dup
/*   */     //   53: getfield Ha : Lf/wJ;
/*   */     //   56: getfield Mg0 : I
/*   */     //   59: iconst_0
/*   */     //   60: swap
/*   */     //   61: invokestatic max : (II)I
/*   */     //   64: istore_0
/*   */     //   65: getfield Ha : Lf/wJ;
/*   */     //   68: iload_0
/*   */     //   69: iload_1
/*   */     //   70: invokevirtual Yb : (II)V
/*   */     //   73: goto -> 180
/*   */     //   76: iload_1
/*   */     //   77: dup
/*   */     //   78: dup2
/*   */     //   79: aload_0
/*   */     //   80: getfield Ha : Lf/wJ;
/*   */     //   83: checkcast f/eG
/*   */     //   86: dup
/*   */     //   87: astore_0
/*   */     //   88: iload_1
/*   */     //   89: aload_0
/*   */     //   90: iload_1
/*   */     //   91: putfield Mg0 : I
/*   */     //   94: putfield v2 : I
/*   */     //   97: invokestatic min : (II)I
/*   */     //   100: istore_1
/*   */     //   101: invokestatic max : (II)I
/*   */     //   104: istore_2
/*   */     //   105: iload_1
/*   */     //   106: iload_2
/*   */     //   107: if_icmpgt -> 180
/*   */     //   110: aload_0
/*   */     //   111: getfield Va : Ljava/util/BitSet;
/*   */     //   114: iload_1
/*   */     //   115: invokevirtual get : (I)Z
/*   */     //   118: ifeq -> 129
/*   */     //   121: aload_0
/*   */     //   122: iload_1
/*   */     //   123: invokevirtual uh : (I)V
/*   */     //   126: goto -> 174
/*   */     //   129: aload_0
/*   */     //   130: getfield Va : Ljava/util/BitSet;
/*   */     //   133: iload_1
/*   */     //   134: invokevirtual get : (I)Z
/*   */     //   137: ifne -> 174
/*   */     //   140: iload_1
/*   */     //   141: aload_0
/*   */     //   142: dup
/*   */     //   143: getfield Va : Ljava/util/BitSet;
/*   */     //   146: iload_1
/*   */     //   147: invokevirtual set : (I)V
/*   */     //   150: getfield e60 : I
/*   */     //   153: if_icmpge -> 161
/*   */     //   156: aload_0
/*   */     //   157: iload_1
/*   */     //   158: putfield e60 : I
/*   */     //   161: iload_1
/*   */     //   162: aload_0
/*   */     //   163: getfield Rh0 : I
/*   */     //   166: if_icmple -> 174
/*   */     //   169: aload_0
/*   */     //   170: iload_1
/*   */     //   171: putfield Rh0 : I
/*   */     //   174: iinc #1, 1
/*   */     //   177: goto -> 105
/*   */     //   180: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 45
/*   */     //   #2	-> 53
/*   */     //   #3	-> 56
/*   */     //   #4	-> 61
/*   */     //   #5	-> 91
/*   */     //   #6	-> 94
/*   */     //   #7	-> 97
/*   */     //   #8	-> 111
/*   */     //   #9	-> 130
/*   */   }
/*   */   
/*   */   public final int ei() {
/*   */     Na na;
/*   */     return ((na = this.oT) != null) ? this.ge0 : 0;
/*   */   }
/*   */   
/*   */   public final int bq0() {
/*   */     Na na;
/*   */     if ((na = this.oT) != null) {
/*   */       int i = this.w70 - this.eS;
/*   */       if (!this.Ui)
/*   */         i++; 
/*   */       return Math.max(1, i);
/*   */     } 
/*   */     return 1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/n8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */