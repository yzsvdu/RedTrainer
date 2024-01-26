/*  1 */ package f;public final class F60 extends Kl0 { public final void sM() { byte b; if (R00() == 1) { b = 1; } else { b = 0; }  this.VO = b; if (b) { if (R00() == 1) { b = 1; } else { b = 0; }  this.h2 = b; if (b) { qa0[] arrayOfQa0; for (this.i00 = new qa0[R00()], b = 0; b < (arrayOfQa0 = this.i00).length; ) { arrayOfQa0[b] = OH(); b++; }  } else { this
/*  2 */           .Fe = this.Ws.getInt(); short s;
/*  3 */         for (b = this.Ws.get(), s = 0; s < b; )
/*  4 */         { boolean bool; byte b1 = this.Ws.get();
/*  5 */           if (R00() == 1) { bool = true; } else { bool = false; }
/*  6 */            long l = this.Ws.getLong();
/*  7 */           this.Ws.getLong(); DK dK;
/*  8 */           if ((dK = DK.com4(b1)) != null) { dK
/*  9 */               .Eg0 = l;
/* 10 */             dK.yg0 = bool; }  s++; }  for (this
/*    */           
/* 12 */           .u5 = new Ad[this.Ws.get()], b = 0; b < this.u5.length; )
/* 13 */         { Ad ad; s = this.Ws.getShort();
/* 14 */           short s1 = this.Ws.getShort();
/*    */           
/* 16 */           DK dK = DK.com4(this.Ws.get()); byte b1; Za0[] arrayOfZa01;
/*    */           byte b2;
/* 18 */           for (arrayOfZa01 = new Za0[b1 = this.Ws.get()], b2 = 0; b2 < b1; ) { arrayOfZa01[b2] = qN(); b2++; }
/*    */            Za0[] arrayOfZa02; byte b3;
/* 20 */           for (arrayOfZa02 = new Za0[b1 = this.Ws.get()], b3 = 0; b3 < b1; ) { arrayOfZa02[b3] = qN(); b3++; }  this(dK, arrayOfZa01, arrayOfZa02, s, s1); this.u5[b] = ad; b++; }  }  this.Jw = NG(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public boolean VO;
/*    */   public boolean h2;
/*    */   public qa0[] i00 = null;
/*    */   public yX[] Jw;
/*    */   public Ad[] u5;
/*    */   public int Fe;
/*    */   
/*    */   public F60(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     ro ro = r8();
/*    */     boolean bool1 = this.VO, bool2 = this.h2;
/*    */     qa0[] arrayOfQa0 = this.i00;
/*    */     yX[] arrayOfYX = this.Jw;
/*    */     Ad[] arrayOfAd = this.u5;
/*    */     int i = this.Fe;
/*    */     pA pA;
/*    */     if ((pA = ((R8)this).YG0.MH0) != null)
/*    */       if (bool1) {
/*    */         ve ve;
/*    */         if ((ve = this.yq0) != null) {
/*    */           ve.LJ0(false, true);
/*    */         } else {
/*    */           if (ve != null) {
/*    */             ve.ra0();
/*    */             this.yq0 = null;
/*    */           } 
/*    */           this(this, bool2, arrayOfQa0, arrayOfYX, arrayOfAd, i);
/*    */           this.yq0 = new ve();
/*    */           J8(ve);
/*    */           this.yq0.mM();
/*    */           this.yq0.ME(km.wI0.dG() / 2 - this.yq0.xY / 2, km.wI0.k1() / 2 - this.yq0.HC / 2);
/*    */         } 
/*    */       } else {
/*    */         ve ve;
/*    */         if ((ve = this.yq0) != null) {
/*    */           ve.ra0();
/*    */           this.yq0 = null;
/*    */         } 
/*    */       }  
/*    */   }
/*    */   
/*    */   public final Za0 qN() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   4: invokevirtual get : ()B
/*    */     //   7: dup
/*    */     //   8: istore_1
/*    */     //   9: ifne -> 48
/*    */     //   12: new f/Za0
/*    */     //   15: dup
/*    */     //   16: iload_1
/*    */     //   17: aload_0
/*    */     //   18: dup
/*    */     //   19: dup
/*    */     //   20: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   23: invokevirtual getShort : ()S
/*    */     //   26: istore_0
/*    */     //   27: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   30: invokevirtual getShort : ()S
/*    */     //   33: istore_1
/*    */     //   34: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   37: invokevirtual getShort : ()S
/*    */     //   40: istore_2
/*    */     //   41: iload_0
/*    */     //   42: iload_1
/*    */     //   43: iload_2
/*    */     //   44: invokespecial <init> : (BSSS)V
/*    */     //   47: areturn
/*    */     //   48: iload_1
/*    */     //   49: iconst_1
/*    */     //   50: if_icmpne -> 155
/*    */     //   53: aload_0
/*    */     //   54: dup
/*    */     //   55: dup
/*    */     //   56: dup2
/*    */     //   57: new f/Za0
/*    */     //   60: astore_2
/*    */     //   61: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   64: invokevirtual getShort : ()S
/*    */     //   67: istore_3
/*    */     //   68: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   71: invokevirtual get : ()B
/*    */     //   74: pop
/*    */     //   75: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   78: invokevirtual get : ()B
/*    */     //   81: istore #4
/*    */     //   83: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   86: invokevirtual get : ()B
/*    */     //   89: istore #5
/*    */     //   91: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   94: invokevirtual get : ()B
/*    */     //   97: iconst_1
/*    */     //   98: if_icmpne -> 107
/*    */     //   101: iconst_1
/*    */     //   102: istore #6
/*    */     //   104: goto -> 110
/*    */     //   107: iconst_0
/*    */     //   108: istore #6
/*    */     //   110: aload_0
/*    */     //   111: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   114: invokevirtual get : ()B
/*    */     //   117: iconst_1
/*    */     //   118: if_icmpne -> 127
/*    */     //   121: iconst_1
/*    */     //   122: istore #7
/*    */     //   124: goto -> 130
/*    */     //   127: iconst_0
/*    */     //   128: istore #7
/*    */     //   130: aload_2
/*    */     //   131: dup
/*    */     //   132: iload_1
/*    */     //   133: aload_0
/*    */     //   134: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   137: invokevirtual getShort : ()S
/*    */     //   140: istore_0
/*    */     //   141: iload_3
/*    */     //   142: iload #4
/*    */     //   144: iload #5
/*    */     //   146: iload #6
/*    */     //   148: iload #7
/*    */     //   150: iload_0
/*    */     //   151: invokespecial <init> : (BSBBZZS)V
/*    */     //   154: areturn
/*    */     //   155: new f/Za0
/*    */     //   158: dup
/*    */     //   159: iload_1
/*    */     //   160: aload_0
/*    */     //   161: dup
/*    */     //   162: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   165: invokevirtual getShort : ()S
/*    */     //   168: istore_0
/*    */     //   169: getfield Ws : Ljava/nio/ByteBuffer;
/*    */     //   172: invokevirtual getShort : ()S
/*    */     //   175: iload_0
/*    */     //   176: swap
/*    */     //   177: invokespecial <init> : (BSS)V
/*    */     //   180: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 12
/*    */     //   #3	-> 20
/*    */     //   #4	-> 44
/*    */     //   #5	-> 61
/*    */     //   #6	-> 68
/*    */     //   #7	-> 134
/*    */     //   #8	-> 151
/*    */     //   #9	-> 162
/*    */     //   #10	-> 177
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/F60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */