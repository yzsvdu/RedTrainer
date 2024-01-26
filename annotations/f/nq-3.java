/*  1 */ package f;public abstract class nq extends JG0 implements r60 { public Un[] gq; public int Fy; public final Ip lpt1; public final dQ GA; public final Un g30; public final Un GR; private void Xh(byte paramByte) { ra0(); km.u4
/*  2 */       .lx0(paramByte, OI0.eF.Vv); } public final Un LPt5; public final IN cj0; public final long Dj; public final pA PI0; public final byte Zi; public nq(pA parampA, byte paramByte) { this(parampA, paramByte, 60, 63); } public nq(pA parampA, byte paramByte, int paramInt1, int paramInt2) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup2
/*    */     //   3: dup2
/*    */     //   4: iload_2
/*    */     //   5: aload_0
/*    */     //   6: aload_1
/*    */     //   7: aload_0
/*    */     //   8: dup
/*    */     //   9: dup2
/*    */     //   10: invokespecial <init> : ()V
/*    */     //   13: aconst_null
/*    */     //   14: putfield gq : [Lf/Un;
/*    */     //   17: iconst_1
/*    */     //   18: putfield Fy : I
/*    */     //   21: ldc 'confirm-widget'
/*    */     //   23: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   26: putfield PI0 : Lf/pA;
/*    */     //   29: putfield Zi : B
/*    */     //   32: new f/Ip
/*    */     //   35: dup
/*    */     //   36: astore_1
/*    */     //   37: aload_0
/*    */     //   38: aload_1
/*    */     //   39: dup
/*    */     //   40: invokespecial <init> : ()V
/*    */     //   43: putfield lpt1 : Lf/Ip;
/*    */     //   46: ldc 'confirm-panel'
/*    */     //   48: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   51: new f/dQ
/*    */     //   54: dup
/*    */     //   55: invokespecial <init> : ()V
/*    */     //   58: putfield GA : Lf/dQ;
/*    */     //   61: new f/IN
/*    */     //   64: dup
/*    */     //   65: dup
/*    */     //   66: aload_0
/*    */     //   67: swap
/*    */     //   68: dup
/*    */     //   69: invokespecial <init> : ()V
/*    */     //   72: putfield cj0 : Lf/IN;
/*    */     //   75: fconst_1
/*    */     //   76: invokevirtual Nu : (F)V
/*    */     //   79: ldc 'countdown-progressbar'
/*    */     //   81: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   84: new f/Un
/*    */     //   87: dup
/*    */     //   88: astore #5
/*    */     //   90: aload_0
/*    */     //   91: iload_2
/*    */     //   92: aload_0
/*    */     //   93: aload #5
/*    */     //   95: dup
/*    */     //   96: iload_3
/*    */     //   97: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   103: putfield g30 : Lf/Un;
/*    */     //   106: <illegal opcode> run : (Lf/nq;B)Ljava/lang/Runnable;
/*    */     //   111: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   114: new f/Un
/*    */     //   117: dup
/*    */     //   118: astore_3
/*    */     //   119: aload_0
/*    */     //   120: iload_2
/*    */     //   121: aload_0
/*    */     //   122: aload_3
/*    */     //   123: dup
/*    */     //   124: iload #4
/*    */     //   126: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   129: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   132: putfield GR : Lf/Un;
/*    */     //   135: <illegal opcode> run : (Lf/nq;B)Ljava/lang/Runnable;
/*    */     //   140: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   143: new f/Un
/*    */     //   146: dup
/*    */     //   147: astore #4
/*    */     //   149: aload_0
/*    */     //   150: iload_2
/*    */     //   151: aload_0
/*    */     //   152: aload #4
/*    */     //   154: dup
/*    */     //   155: sipush #202
/*    */     //   158: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   161: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   164: putfield LPt5 : Lf/Un;
/*    */     //   167: <illegal opcode> run : (Lf/nq;B)Ljava/lang/Runnable;
/*    */     //   172: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   175: invokevirtual ug : ()V
/*    */     //   178: aload_1
/*    */     //   179: invokevirtual J8 : (Lf/JG0;)V
/*    */     //   182: invokestatic currentTimeMillis : ()J
/*    */     //   185: ldc2_w 15000
/*    */     //   188: ladd
/*    */     //   189: putfield Dj : J
/*    */     //   192: iconst_3
/*    */     //   193: anewarray f/Un
/*    */     //   196: dup
/*    */     //   197: dup2
/*    */     //   198: iconst_0
/*    */     //   199: aload #5
/*    */     //   201: aastore
/*    */     //   202: iconst_1
/*    */     //   203: aload_3
/*    */     //   204: aastore
/*    */     //   205: iconst_2
/*    */     //   206: aload #4
/*    */     //   208: aastore
/*    */     //   209: putfield gq : [Lf/Un;
/*    */     //   212: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 10
/*  2 */     //   #2	-> 14 } private void BD(byte paramByte) { ra0(); km.u4.lx0(paramByte, OI0.m10.Vv); }
/*    */   
/*  4 */   public void ug() { arrayOfJG0[0] = this.g30; arrayOfJG0[1] = this.GR; JG0[] arrayOfJG0; (arrayOfJG0 = new JG0[3])[2] = this.LPt5; this.lpt1.WN(V2.Ur(this.lpt1, this.lpt1).Ya(this.GA).Ya(this.cj0).ee0(V2.Ur(this.lpt1, this.lpt1).Mg(new JG0[3])).Em0()); this.lpt1
/*    */ 
/*    */ 
/*    */       
/*  8 */       .rK0(Mr.X60(this.lpt1, this.lpt1).Ya(this.GA).Ya(this.cj0).ee0(Mr.X60(this.lpt1, this.lpt1).Ya(this.g30).Ya(this.GR).Ya(this.LPt5))); } public byte ke() { return OI0.A90.Vv; } public final void BA0(String paramString) { this.GA.E1(paramString); } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) { int i; if (h1.J20(i = paramoa0.GG0, BM.ni)) { this.Fy--; VA0.c90(Yo()); return true; }  if (h1.J20(i, BM.N70)) { this.Fy++; VA0.c90(Yo()); return true; }
/*  9 */        if (h1.J20(i, BM.bC)) {
/*    */ 
/*    */         
/* 12 */         hm.Fz0((Yo()).TG0.oh0); return true;
/* 13 */       }  Un un; if (h1.J20(i, BM.lc) && (un = this.GR) != null)
/*    */       
/*    */       { 
/* 16 */         hm.Fz0(un.TG0.oh0); return true; }  }
/* 17 */      return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public void V90(throws paramthrows) {
/*    */     float f;
/*    */     if ((f = (float)(this.Dj - System.currentTimeMillis()) / 1000.0F) > 0.0F) {
/*    */       this.cj0.Nu(f / 15.0F);
/*    */       super.V90(paramthrows);
/*    */       return;
/*    */     } 
/*    */     km.u4.lx0(this.Zi, OI0.Jy.Vv);
/*    */     this.PI0.jf0(this);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     this.lpt1.mM();
/*    */     mM();
/*    */     qB0(et.Wi0);
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     if (this.gq != null) {
/*    */       VA0.c90(Yo());
/*    */       return;
/*    */     } 
/*    */     throw new RuntimeException();
/*    */   }
/*    */   
/*    */   public final Un Yo() {
/*    */     if (this.Fy < 0)
/*    */       this.Fy = 0; 
/*    */     Un[] arrayOfUn;
/*    */     if (this.Fy >= (arrayOfUn = this.gq).length)
/*    */       this.Fy = arrayOfUn.length - 1; 
/*    */     return arrayOfUn[this.Fy];
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */