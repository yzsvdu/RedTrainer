/*    */ package f;
/*  2 */ public final class TC0 extends Kl0 { public static boolean AJ(short paramShort, byte paramByte) { LPT3 lPT3 = Of.eH.On0(paramShort); if (paramByte != 0) { paramByte = 1; } else { paramByte = 0; }  lPT3
/*  3 */       .Sg0 = paramByte; return true; }
/*  4 */   public TC0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { gm.gm = this.Ws.get(); gm.Sk = this.Ws.getShort();
/*    */     
/*  6 */     gm.u90 = this.Ws.getFloat();
/*    */     
/*  8 */     gm.Ti0 = this.Ws.getShort();
/*    */     
/* 10 */     gm.K20 = this.Ws.getShort();
/*    */     
/* 12 */     gm.gx0 = this.Ws.getShort();
/*    */     
/* 14 */     gm.md = this.Ws.getInt();
/*    */     
/* 16 */     gm.lw = this.Ws.get();
/*    */     byte b;
/* 18 */     gm.By0 = (((b = this.Ws.get()) & 0x1) != 0); gm.tm = ((b & 0x2) != 0); gm.Ig0 = ((b & 0x8) != 0); gm.ym = ((b & 0x10) != 0); gm.n00 = ((b & 0x20) != 0); gm.P4 = ((b & 0x40) != 0);
/*    */     short[] arrayOfShort2;
/* 20 */     for (gm.nv0 = new short[this.Ws.getShort()], b = 0; b < (arrayOfShort2 = gm.nv0).length; ) { arrayOfShort2[b] = this
/* 21 */         .Ws.getShort();
/* 22 */       b++; }
/*    */      byte[] arrayOfByte;
/* 24 */     for (gm.mr = new byte[this.Ws.get()], b = 0; b < (arrayOfByte = gm.mr).length; ) { arrayOfByte[b] = this
/* 25 */         .Ws.get();
/* 26 */       b++; }
/*    */      short[] arrayOfShort1;
/* 28 */     for (gm.EI0 = new short[this.Ws.getShort()], b = 0; b < (arrayOfShort1 = gm.EI0).length; ) { arrayOfShort1[b] = this
/* 29 */         .Ws.getShort();
/* 30 */       b++; }
/*    */     
/* 32 */     for (gm.QN = new short[this.Ws.getShort()], b = 0; b < (arrayOfShort1 = gm.QN).length; ) { arrayOfShort1[b] = this
/* 33 */         .Ws.getShort();
/* 34 */       b++; }  int i; byte b1; for (gm.Tf = new Bn(), i = Gc0(), b1 = 0; b1 < i; ) {
/*    */       
/* 36 */       byte b2 = this.Ws.get();
/* 37 */       boolean bool = true; Bn bn; int j; if ((j = (bn = gm.Tf).vA(this.Ws.getShort())) < 0) { j = -j - 1; bn
/* 38 */           .JD[j]; bool = false; }  bn.JD[j] = b2; if (bool) bn.xt0(bn.iO);  b1++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public final void Cx() {
/*    */     this();
/*    */     ArrayList arrayList;
/*    */     short s, arrayOfShort1[];
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfShort1 = gm.EI0).length, b = 0; b < i; ) {
/*    */       short s1;
/*    */       if ((s1 = arrayOfShort1[b]) != 1 && s1 != 4 && s1 != 7)
/*    */         add((E)On.v30().lpT3(s1)); 
/*    */       b++;
/*    */     } 
/*    */     (Of.eH.On0((short)1422)).ia0 = toArray(new UD0[0]);
/*    */     Jw jw = TC0::AJ;
/*    */     Bn bn;
/*    */     byte[] arrayOfByte2 = (bn = gm.Tf).JO;
/*    */     byte[] arrayOfByte1 = this.JD;
/*    */     short[] arrayOfShort2;
/*    */     int j = (arrayOfShort2 = gm.Tf.x20).length;
/*    */     do {
/*    */       s = arrayOfShort2[j];
/*    */     } while (j-- > 0 && (arrayOfByte2[j] != 1 || jw.Zr(s, this[j])));
/*    */     km.wI0.getClass();
/*    */     UB0.Kg0.fN(new ED());
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */