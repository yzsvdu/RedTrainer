/*  1 */ package f;public final class Iz extends Kl0 { public nD0[] VC0; public Iz(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { qa0 qa0; if ((qa0 = km.u4.II) == null)
/*  2 */       return;  jc[] arrayOfJc = qa0.gb; int i; short s;
/*  3 */     for (this.VC0 = new nD0[i = Gc0()], s = 0; s < i; )
/*  4 */     { nD0 nD01; short s1 = this.Ws.getShort();
/*    */       
/*  6 */       int j = this.Ws.getInt();
/*  7 */       jc[] arrayOfJc1 = nD0.Ee; byte b; if ((b = this.Ws.get()) != 0) { byte b1; jc[] arrayOfJc2; byte b2; for (arrayOfJc2 = new jc[b1 = 2], b2 = 0; b2 < b1; )
/*  8 */         { jc jc; short s2; if ((s2 = this.Ws.getShort()) == -1) { jc = null; }
/*  9 */           else { jc = arrayOfJc[jc]; }  arrayOfJc2[b2] = jc; b2++; }  arrayOfJc1 = arrayOfJc2; }  qa0.f1(s, (short)arrayOfJc.length); this(s, s1, b, j, arrayOfJc1); this.VC0[s] = nD01; s = (short)(s + 1); }  } public final void Dl0() { qa0 qa0; if ((qa0 = km.u4.II) == null)
/*    */       return;  nD0[] arrayOfND01 = this.VC0; int i; nD0[] arrayOfND02; for (qa0.Ue0 = new nD0[(short)(qa0.KX - 1)], i = 0; i < (arrayOfND02 = qa0.Ue0).length; ) { nD0 nD01; int j = qa0.Mg0; short s = qa0.f1(i, qa0.KX); this(j, i, s); arrayOfND02[i] = nD01; i = (short)(i + 1); }
/* 11 */      byte b; for (i = arrayOfND01.length, b = 0; b < i; ) { nD0 nD01; if ((nD01 = arrayOfND01[b]) != null) { jc jc; int j; if ((jc = nD01.Q0) == null && (j = nD01.d5) >= 0) { (qa0.Ue0[nD01.Mn0])
/* 12 */             .Q0 = qa0.gb[j]; }
/*    */         else
/*    */         
/* 15 */         { (qa0.Ue0[nD01.Mn0])
/* 16 */             .Q0 = jc; }
/*    */ 
/*    */         
/* 19 */         nD02
/*    */           
/* 21 */           .HR = nD01.HR;
/*    */         nD0 nD02;
/* 23 */         (nD02 = qa0.Ue0[nD01.Mn0]).Bv0 = nD01.Bv0; jc[] arrayOfJc;
/* 24 */         if ((arrayOfJc = nD01.xn).length == 
/* 25 */           2) nD02.xn = arrayOfJc;  }  b++; }
/* 26 */      r8().TD(qa0); }
/*    */ 
/*    */   
/*    */   public final void Cx() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Iz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */