/*  1 */ package f;public final class Tt0 extends Kl0 { public final void sM() { boolean bool; this
/*  2 */       .VJ = this.Ws.get();
/*    */     
/*  4 */     this.FX = this.Ws.get();
/*    */     
/*  6 */     this.Oo = this.Ws.get();
/*    */     
/*  8 */     this.cOm5 = this.Ws.get(); if (R00() == 1) { bool = true; } else { bool = false; }  this.qx0 = bool; if (bool) { this
/*    */         
/* 10 */         .j00 = this.Ws.getShort();
/*    */       
/* 12 */       this.Io0 = this.Ws.getShort();
/*    */       
/* 14 */       this.A10 = this.Ws.get();
/* 15 */       if (this.Ws.get() == 1) { bool = true; } else { bool = false; }  this
/* 16 */         .AG0 = bool; }
/*    */      }
/*    */ 
/*    */   
/*    */   public byte VJ;
/*    */   public byte FX;
/*    */   public byte Oo;
/*    */   public byte cOm5;
/*    */   public boolean qx0;
/*    */   public short j00;
/*    */   public short Io0;
/*    */   public byte A10;
/*    */   public boolean AG0;
/*    */   
/*    */   public Tt0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     // Byte code:
/*    */     //   0: getstatic f/km.a3 : Lf/vh0;
/*    */     //   3: aload_0
/*    */     //   4: dup
/*    */     //   5: dup
/*    */     //   6: getfield VJ : B
/*    */     //   9: istore_1
/*    */     //   10: getfield FX : B
/*    */     //   13: istore_2
/*    */     //   14: getfield Oo : B
/*    */     //   17: istore_3
/*    */     //   18: iload_1
/*    */     //   19: iload_2
/*    */     //   20: iload_3
/*    */     //   21: invokevirtual COm8 : (BBB)Lf/KI;
/*    */     //   24: dup
/*    */     //   25: astore_1
/*    */     //   26: instanceof f/pI
/*    */     //   29: ifne -> 33
/*    */     //   32: return
/*    */     //   33: aload_0
/*    */     //   34: getfield qx0 : Z
/*    */     //   37: ifne -> 53
/*    */     //   40: aload_1
/*    */     //   41: aload_0
/*    */     //   42: getfield cOm5 : B
/*    */     //   45: istore_0
/*    */     //   46: getfield hc : [Lf/xr0;
/*    */     //   49: iload_0
/*    */     //   50: aconst_null
/*    */     //   51: aastore
/*    */     //   52: return
/*    */     //   53: aload_0
/*    */     //   54: getfield AG0 : Z
/*    */     //   57: aload_0
/*    */     //   58: dup
/*    */     //   59: dup
/*    */     //   60: getfield j00 : S
/*    */     //   63: istore_2
/*    */     //   64: getfield Io0 : S
/*    */     //   67: istore_3
/*    */     //   68: getfield A10 : B
/*    */     //   71: istore #4
/*    */     //   73: ifeq -> 88
/*    */     //   76: aload_1
/*    */     //   77: iload #4
/*    */     //   79: iload_2
/*    */     //   80: iload_3
/*    */     //   81: invokevirtual v4 : (BSS)Lf/xr0;
/*    */     //   84: astore_2
/*    */     //   85: goto -> 97
/*    */     //   88: aload_1
/*    */     //   89: iload_2
/*    */     //   90: iload_3
/*    */     //   91: iload #4
/*    */     //   93: invokevirtual v50 : (III)Lf/xr0;
/*    */     //   96: astore_2
/*    */     //   97: aload_2
/*    */     //   98: ifnonnull -> 102
/*    */     //   101: return
/*    */     //   102: aload_1
/*    */     //   103: aload_0
/*    */     //   104: getfield cOm5 : B
/*    */     //   107: istore_0
/*    */     //   108: getfield hc : [Lf/xr0;
/*    */     //   111: dup
/*    */     //   112: astore_1
/*    */     //   113: iload_0
/*    */     //   114: aaload
/*    */     //   115: aload_2
/*    */     //   116: if_acmpne -> 124
/*    */     //   119: iconst_1
/*    */     //   120: istore_3
/*    */     //   121: goto -> 126
/*    */     //   124: iconst_0
/*    */     //   125: istore_3
/*    */     //   126: iload_3
/*    */     //   127: ifeq -> 131
/*    */     //   130: return
/*    */     //   131: aload_2
/*    */     //   132: aload_1
/*    */     //   133: iload_0
/*    */     //   134: aload_2
/*    */     //   135: aastore
/*    */     //   136: new f/Lq0
/*    */     //   139: dup
/*    */     //   140: astore_1
/*    */     //   141: iload_0
/*    */     //   142: aload_2
/*    */     //   143: invokespecial <init> : (BLf/xr0;)V
/*    */     //   146: aload_1
/*    */     //   147: invokevirtual TL0 : (Lf/fZ;)V
/*    */     //   150: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 46
/*    */     //   #2	-> 51
/*    */     //   #3	-> 54
/*    */     //   #4	-> 81
/*    */     //   #5	-> 104
/*    */     //   #6	-> 108
/*    */     //   #7	-> 114
/*    */     //   #8	-> 135
/*    */     //   #9	-> 136
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Tt0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */