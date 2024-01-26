/* 1 */ package f;public final class x6 extends PN { public final ArrayDeque VP; public int Ig; public final boolean iK0(ByteBuffer paramByteBuffer) { Ao0 ao0; if (this.Ig == 1) return super.iK0(paramByteBuffer);  if (!mo0(paramByteBuffer)) { this.E50
/* 2 */         .rX(final.Qx0, 0); Sa(); return false; }  cB0 cB0 = null;
/*   */     
/* 4 */     int j = paramByteBuffer.get() & 0xFF; int i; switch (Zk0.yE(i = this.Ig)) { case 3: if (j != 7) { if (j != 9) { if (j != 18) { if (j != 20) { if (j != 34) { TE0 tE0; Ao0 ao01; PV pV; switch (j) { case 4: this(this, paramByteBuffer); break;case 3: this(this, paramByteBuffer); break;case 1: this(this, paramByteBuffer); break;case 2: this(paramByteBuffer, this, j); break; }  } else {  }  } else { this(this, paramByteBuffer); break; }  } else {  }  } else { pF pF; this(this, paramByteBuffer); break; }  } else { dU dU; this(this, paramByteBuffer); break; } case 2: if (j != 1) { if (j != 8) { if (j == 9) { pF pF; this(this, paramByteBuffer); break; }  } else { cT cT; this(this, paramByteBuffer); break; }  } else { this(this, paramByteBuffer); break; } case 1: if (j != 1) { if (j != 38) { pF pF; cT cT; dU dU; nz0 nz0; pg0 pg0; switch (j) { case 9: this(this, paramByteBuffer); break;case 8: this(this, paramByteBuffer); break;case 7: this(this, paramByteBuffer); break;case 5: this(this, paramByteBuffer); break;case 6: this(paramByteBuffer, this, j); break; }  } else {  }  } else { this(this, paramByteBuffer); break; } case 0: jS.dk0(i, j, paramByteBuffer); break; }  if (ao0 != null && ao0
/* 5 */       .ZX()) { ao0.jZ(); UB0.Kg0.fN(ao0); }  return true; } public hb0 E50; public CK fv0; public x6(SocketChannel paramSocketChannel, Con paramCon, hb0 paramhb0, CK paramCK) { super(paramSocketChannel, paramCon, this); ArrayDeque arrayDeque; Sj0 sj0; this(); this.VP = this; this.Ig = 1; this((byte)16); this.YS = this; this.E50 = paramhb0; yF(); this.fv0 = paramCK; } public final boolean na0(ByteBuffer paramByteBuffer) { Object object; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/x6}}, name=kj0, descriptor=Ljava/lang/Object;}} */ try { if (this.Ig == 1) return super.na0(paramByteBuffer);  Mg mg; if ((mg = this.VP.pollFirst()) == null) return false;  paramByteBuffer.putShort((short)0); paramByteBuffer.put((byte)mg.LPt4); mg.rT(paramByteBuffer); paramByteBuffer.flip(); paramByteBuffer.putShort((short)0); short s = (short)(D1(paramByteBuffer) + 2); paramByteBuffer.putShort(0, s); return true; } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */ }  } public final boolean xo0() { if (this.Ig == 1) return this.aF.isEmpty() ^ true;  return this.VP.isEmpty() ^ true; } public final void xt() { if (this.Ig == 1) this.fv0.P3(this);  } public final void lpt5() { this.aF = null; this.Ig = 2; hb0 hb01; if ((hb01 = this.E50).qf0 == 3) { this.qf0 = 4; String str1 = this.nf0, str2 = this.V80; boolean bool = this.Pz0; nt nt = this.GA; this.rQ.Ab0(new mR(this, str2, false, bool, nt)); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void Wg() {
/*   */     Sa();
/*   */   }
/*   */   
/*   */   public final void Ab0(Mg paramMg) {
/*   */     Object object;
/*   */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/x6}}, name=kj0, descriptor=Ljava/lang/Object;}} */
/*   */     try {
/*   */       if (kj())
/*   */         return; 
/*   */       this.VP.addLast(paramMg);
/*   */       return;
/*   */     } finally {
/*   */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void dC0() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/x6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */