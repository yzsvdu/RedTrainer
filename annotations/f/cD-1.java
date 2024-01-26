/*  1 */ package f;public final class cD extends Kl0 { public int gx0; public short Ka0; public short uI0; public cD(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { this
/*  2 */       .gx0 = this.Ws.getInt();
/*    */     
/*  4 */     this.Ka0 = this.Ws.getShort();
/*    */     
/*  6 */     this.uI0 = this.Ws.getShort(); } public final void Cx() { ro ro = r8(); int i = this.gx0; short s1 = this.Ka0, s2 = this.uI0; ve ve; pA pA; if ((pA = ((R8)this).YG0.MH0) != null && (ve = this.yq0) != null) { Df[] arrayOfDf; int j; byte b; for (j = (arrayOfDf = this.Xg).length, b = 0; b < j; ) { Df df = arrayOfDf[b]; Fy0 fy0 = this.vi; if (df.po0.Mg0 == i) { StringBuilder stringBuilder; boolean bool; df
/*  7 */             .K8.s6(Ml0.OH0(5504)); this(); qa0 qa0;
/*  8 */           int k = (qa0 = df.po0).KX; byte b1;
/*  9 */           if ((b1 = df.po0.b20) == 1) { bool = true; } else { bool = bool.pR; }  if (bool) { short s; String str; if (b1 == 1) { s = k; }
/* 10 */             else { s = (short)(k / 4); }  k = k - s; if (s2 >= 0)
/* 11 */             { str = s2 + "/" + s; } else { str = Ml0.OH0(5539); }  stringBuilder.append(Ml0.Go(5538, str)); stringBuilder.append("\n"); }  arrayOfString[0] = Integer.toString(s1); String[] arrayOfString; (arrayOfString = new String[2])[1] = Integer.toString(k); stringBuilder.append(Ml0.sB(5521, arrayOfString)); df.ap.E1(stringBuilder.toString()); df.K8
/* 12 */             .z4 = Ml0.OH0(5522);
/* 13 */           df.K8.zn();
/* 14 */           df.K8
/* 15 */             .jl = 250;
/*    */ 
/*    */ 
/*    */           
/* 19 */           fy0.s6(df.ap.wL.toString()); }  b++; }
/*    */        }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */