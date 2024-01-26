/*  1 */ package f;public final class Xc0 implements iq0 { public static final ik Prn = C00.gd(Xc0.class); public static int jE = -1; public static float LPt6 = 0.0F; public static float fm = 0.0F; public static Color Com4 = new Color(); public static boolean B70 = false; public static Color Hm0; public static void yu(boolean paramBoolean) { if (paramBoolean == B70) return;  if (B70 = paramBoolean) { UX[] arrayOfUX; int i; byte b; for (i = (arrayOfUX = UX.jj).length, b = 0; b < i; ) { Ef
/*  2 */           .set((arrayOfUX[b]).xK0); Ef.mul(Hm0);
/*  3 */         (arrayOfUX[b]).US
/*  4 */           .set(Ef); b++; }  Com4.set(Hm0); Nn0 = zN; } else { Com4.set(fm, fm, LPt6, 1.0F); Nn0 = Com4.toFloatBits(); }  }
/*    */   public static float zN = (Hm0 = new Color(0.7F, 0.7F, 0.85F, 1.0F)).toFloatBits(); public static Color Ef = new Color(); public static float Nn0 = 0.0F; public Ut0 U60 = new Ut0(); public Ut0 Kw = new Ut0(); public Ut0 iH = new Ut0(); public Texture cs0 = null; public Xc0() { try { ByteBuffer byteBuffer; if ((byteBuffer = ByteBuffer.wrap(UB0.vj0.aP("data/sprites/overlays-data.pak").iy0()).order(ByteOrder.LITTLE_ENDIAN)).getInt() == 21709136) { short s1 = byteBuffer.getShort(); short s2 = byteBuffer.getShort(); this.cs0 = new Texture(UB0.vj0.aP("data/sprites/overlays.pak")); short s; for (s = 0; s < s1; s++) { Ui0 ui0; short s3 = byteBuffer.getShort(); short s4 = byteBuffer.getShort(); byte b = byteBuffer.get(); short s5 = byteBuffer.getShort(); short s6 = byteBuffer.getShort(); this(new pe0(this.cs0, s5, s6, 8, 8)); this.Kw.A3(s4 * 65536 + s3, new V70(b, ui0)); }  for (s1 = 0; s1 < s2; s1++) { Ui0 ui0; s = byteBuffer.getShort(); byte b = byteBuffer.get(); short s3 = byteBuffer.getShort(); short s4 = byteBuffer.getShort(); this(new pe0(this.cs0, s3, s4, 16, 16)); this.iH.A3(b * 65536 + s, ui0); }  }
/*    */       else { throw new RuntimeException("Missing header"); }
/*    */        }
/*    */     catch (Exception exception) { Prn.error("", this); }
/*  9 */      } public final AC0 L(int paramInt1, int paramInt2) { Ut0 ut0; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Ut0}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/Ut0}, expression=ThisExpression{ObjectType{f/Xc0}}, name=U60, descriptor=Lf/Ut0;}} */ try { AC0 aC0; return aC0; } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Ut0}, name=null} */ }  } public final void G80(int paramInt) { if (paramInt == jE) return;  float f1 = paramInt / 255.0F; jE = paramInt; LPt6 = 1.0F - paramInt / Bz.protected / 255.0F; float f2 = 1.0F - paramInt / Bz.GS / 255.0F; Com4.set(f2, f2, LPt6, 1.0F); UX[] arrayOfUX; int i; byte b; for (Nn0 = Com4.toFloatBits(), i = (arrayOfUX = UX.jj).length, b = 0; b < i; ) { Ef.set((arrayOfUX[b]).xK0); Ef.mul(Com4); (arrayOfUX[b]).US.set(Ef); b++; }  Ut0 ut02; (ut02 = this.Kw).getClass(); for (Iterator<V70> iterator1 = (new mt(ut02)).iterator(); iterator1.hasNext();) { if ((v70 = iterator1.next()).cE == 0) v70.he0.t(f1);  }  Ut0 ut01; (ut01 = this.iH).getClass();
/*    */     
/* 11 */     for (Iterator iterator = (new mt(this)).iterator(); hasNext(); ((Ui0)next()).t(f1)); }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     Ut0 ut0;
/*    */     (ut0 = this.U60).getClass();
/*    */     for (Iterator iterator = (new mt(ut0)).iterator(); ((DA0)iterator).hasNext(); ) {
/*    */       AC0 aC0;
/*    */       g g;
/*    */       if ((g = (aC0 = (AC0)((iF0)iterator).next()).p9) != null)
/*    */         g.dispose(); 
/*    */       aC0.p9 = null;
/*    */     } 
/*    */     this.U60.clear();
/*    */     Texture texture;
/*    */     if ((texture = this.cs0) != null)
/*    */       dispose(); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Xc0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */