/*  1 */ package f;public class Q20 extends JG0 { public int bm0 = 1; public int Ic; public et io = et.kL0; public Q20() { this(1); } public static int sK(JG0 paramJG0) { int i = paramJG0.Ub(); int j = 0; for (byte b = 0; b < i; b++) j = Math.max(j, paramJG0.lPt3(b).HY());  return j; } public final int AW() { int i; if (this.bm0 == 1) { int j; byte b; for (i = this.Ic, i = Math.max(0, (j = Ub()) - 1) * i, b = 0; b < j; ) { i = lPt3(b).AW() + i; b++; }  }
/*  2 */     else { i = Aj0(this); }  return Math.max(super.AW(), Ho() + i); } public static int Aj0(JG0 paramJG0) { int i = paramJG0.Ub(); int j = 0; for (byte b = 0; b < i; b++) j = Math.max(j, paramJG0.lPt3(b).AW());  return j; } public Q20(JG0... paramVarArgs) { jj(paramVarArgs); } public Q20(int paramInt) {} public final String TI() { return "boxlayout"; } public final void rc(int paramInt) { if (this.Ic != paramInt) { this.Ic = paramInt; MJ0(); }  } public final void Ei0(et paramet) { if (paramet != null) { if (this.io != paramet) { this.io = paramet; MJ0(); }  return; }  throw new NullPointerException("alignment"); } public final int HY() { int i; if (this.bm0 == 1) { i = sK(this); } else { int j; byte b; for (i = this.Ic, i = Math.max(0, (j = Ub()) - 1) * i, b = 0; b < j; ) { i = lPt3(b).HY() + i; b++; }  }  return Math.max(super.HY(), Et() + i); } public final int R80() { int i; if (this.bm0 == 1) { int j; byte b; for (i = this.Ic, i = Math.max(0, (j = Ub()) - 1) * i, b = 0; b < j; ) { int k = jG0.J50(); JG0 jG0; i = JG0.Fr((jG0 = lPt3(b)).AW(), k, jG0.W3()) + i; b++; }  }
/*  3 */     else { int j; byte b; for (i = Ub(), j = 0, b = 0; b < i; )
/*  4 */       { j = jG0.J50(); JG0 jG0;
/*  5 */         j = Math.max(j, JG0.Fr((jG0 = lPt3(b)).AW(), j, jG0.W3())); b++; }  i = j; }  return i; } public final int tJ0() { int i; if (this.bm0 == 1) { int j; byte b; for (j = Ub(), i = 0, b = 0; b < j; ) { int k = jG0.tj0(); JG0 jG0; k = Math.max(i, JG0.Fr((jG0 = lPt3(b)).HY(), k, jG0.Hj())); b++; }  } else { int j = this.Ic; byte b; for (j = Math.max(0, (i = Ub()) - 1) * j, b = 0; b < i; )
/*  6 */       { int k = jG0.tj0(); JG0 jG0; j = JG0.Fr((jG0 = lPt3(b)).HY(), k, jG0.Hj()) + j; b++; }  i = j; }  return i; } public final void Xw(nY paramnY) { super.Xw(paramnY); rc(((q80)paramnY).Km(0, "spacing")); String str = "alignment"; Enum enum_1; Class<Enum> clazz = (enum_1 = et.kL0).getDeclaringClass(); Enum enum_2; if ((enum_2 = (Enum)((q80)paramnY).Yz0(str, true, clazz, null)) != null) enum_1 = enum_2;  Ei0((et)enum_1); } public final void d40() { if (Ub() > 0) if (this.bm0 == 1) { int i; et et1; int j; int k; int m; int n; byte b; for (i = this.Ic, et1 = this.io, j = Ub(), k = Hy(), m = RS(), n = e3(), b = 0; b < j; ) { int i2, i1 = jG0.J50(); JG0 jG0; i1 = JG0.Fr((jG0 = lPt3(b)).AW(), i1, jG0.W3()); if (et1 == et.Lp) { i2 = k; } else { i2 = jG0.tj0(); i2 = JG0.Fr(jG0.HY(), i2, jG0.Hj()); }  jG0.Tm(i1, i2); jG0.Ol0(m, (k - i2) * et1.PO / 2 + n); m = i1 + i + m; b++; }  } else { int i = this.Ic; et et1 = this.io; int j, k, m, n; byte b;
/*  7 */         for (j = Ub(), k = qF(), m = RS(), n = e3(), b = 0; b < j; ) { int i1; JG0 jG0 = lPt3(b); if (et1 == et.Lp) { i1 = k; }
/*  8 */           else { i1 = jG0.J50(); i1 = JG0.Fr(jG0.AW(), i1, jG0.W3()); }
/*  9 */            int i2 = jG0.tj0();
/* 10 */           jG0.Tm(i1, i2); jG0.Ol0((k - i1) * et1.aN / 2 + m, n); n = (i2 = JG0.Fr(jG0.HY(), i2, jG0.Hj())) + i + n; b++; }
/*    */          }
/*    */         }
/*    */ 
/*    */   
/*    */   public final void jj(JG0... paramVarArgs) {
/*    */     if (paramVarArgs.length < 1)
/*    */       return; 
/*    */     int i;
/*    */     byte b;
/*    */     for (i = paramVarArgs.length, b = 0; b < i; ) {
/*    */       JG0 jG0 = paramVarArgs[b];
/*    */       si(jG0, Ub());
/*    */       b++;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Q20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */