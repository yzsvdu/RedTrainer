/*  1 */ package f;public final class EE0 extends Kl0 { public byte H1; public RR Ov0 = null; public EE0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { LPT1[] arrayOfLPT1; this
/*  2 */       .H1 = this.Ws.get(); byte b1;
/*  3 */     if ((b1 = this.Ws.get()) == 0) return;  this
/*  4 */       .Ws.get();
/*  5 */     byte b2 = this.Ws.get(); int i = -1;
/*  6 */     String str = ""; if ((b1 & 0x1) != 0)
/*  7 */       i = this.Ws.getInt();  if ((b1 & 0x2) != 0)
/*    */     { byte b; byte b3;
/*  9 */       for (arrayOfLPT1 = new LPT1[b = this.Ws.get()], b3 = 0; b3 < b; ) { arrayOfLPT1[b3] = Ac(); b3++; }  } else { arrayOfLPT1 = new LPT1[0]; }  if ((b1 & 0x4) != 0) str = au();  if (i != -1) { this.Ov0 = new RR(this.H1, i, b2, arrayOfLPT1); } else { this.Ov0 = new RR(this.H1, str, b2, arrayOfLPT1); }  } public final void Cx() { ak ak; RR rR1; if ((rR1 = this.Ov0) != null) { int i; if (((i = rR1.Fc) != -1)) { String str1; LPT1[] arrayOfLPT1 = rR1.W; String str2; if ((str2 = (String)Ml0.nW.Z6(i)) == null) { str1 = XD0.SD0("STRING_", i); } else { str1 = Ml0.Lj(Ml0.CoM2(str2, arrayOfLPT1)); }  rR1.uf0 = str1; } else { String str = Ml0.LU(rR1.uf0); LPT1[] arrayOfLPT1; if (((arrayOfLPT1 = this.Ov0.W) != null && arrayOfLPT1.length > 
/* 10 */           0))
/* 11 */           str = Ml0.CoM2(str, arrayOfLPT1);  this.Ov0
/* 12 */           .uf0 = str; }  }
/* 13 */      ro ro = r8(); byte b = this.H1; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/ak}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/ak}, expression=ThisExpression{ObjectType{f/ro}}, name=lR, descriptor=Lf/ak;}} */ RR rR2; if ((rR2 = this.Ov0) != null)
/*    */       try { return; }
/* 15 */       finally { ro = null;
/*    */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/ak}, name=null} */ }
/*    */         }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/EE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */