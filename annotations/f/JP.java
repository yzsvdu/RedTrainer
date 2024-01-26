/*   */ package f;public class JP implements L8, VJ0 { public static final ik iS = C00.gd(JP.class); public throws NF = null; public long[] pd = new long[8]; public boolean[] jZ = new boolean[8]; public Lpt2 e9 = new Lpt2(); public int An = 0; public int Yj = 0; public int dk0 = 0; public int Ky = 0; public int Nf0 = 0; public double Va0 = 0.0D; public int nQ = 0; public byte Zc = -1; public byte Cl = -1; public byte ud0 = -1; public byte oc0 = -1; public boolean o60 = false; public Bn0 t20 = null; public JP(int paramInt) { km.Lpt1 = this; } public JP() {} public static int oW(int paramInt, boolean paramBoolean) { if (h1.J20(paramInt, BM.ni)) return 0;  if (h1.J20(paramInt, BM.N70)) return 1;  if (h1.J20(paramInt, BM.Oq)) return 2;  if (h1.J20(paramInt, BM.M8)) return 3;  if (h1.J20(paramInt, BM.bC)) return 4;  if (h1.J20(paramInt, BM.lc)) return 5;  if (h1.J20(paramInt, BM.go0)) return 6;  if (h1.J20(paramInt, BM.Nx)) return 7;  if (paramBoolean) { if (h1.J20(paramInt, BM.Ul)) return 8;  if (h1.J20(paramInt, BM.Vv0)) return 9;  if (h1.J20(paramInt, BM.lpT3)) return 10;  if (h1.J20(paramInt, BM.WN)) return 11;  if (h1.J20(paramInt, BM.Vs)) return 12;  if (h1.J20(paramInt, BM.jA)) return 13;  if (h1.J20(paramInt, BM.Um0)) return 14;  if (h1.J20(paramInt, BM.Km)) return 15;  if (h1.J20(paramInt, BM.Hg)) return 16;  if (h1.J20(paramInt, BM.Rd)) return 17;  if (h1.J20(paramInt, BM.cf)) return 18;  if (h1.J20(paramInt, BM.I0)) return 19;  if (h1.J20(paramInt, BM.TC)) return 20;  if (h1.J20(paramInt, BM.l30)) return 21;  if (h1.J20(paramInt, BM.eH0)) return 22;  if (h1.J20(paramInt, BM.W1)) return 23;  if (h1.J20(paramInt, BM.Ij0)) return 24;  if (h1.J20(paramInt, BM.i40)) return 25;  if (h1.J20(paramInt, BM.EW)) return 26;  }  return -1; } public final boolean bn0(BM paramBM) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_1
/*   */     //   2: invokevirtual y0 : ()I
/*   */     //   5: invokevirtual Y80 : (I)Z
/*   */     //   8: ifne -> 111
/*   */     //   11: getstatic f/g8.VS : Lf/ik;
/*   */     //   14: pop
/*   */     //   15: getstatic f/h1.D30 : Z
/*   */     //   18: ifne -> 24
/*   */     //   21: goto -> 100
/*   */     //   24: invokestatic mE : ()V
/*   */     //   27: getstatic f/g8.H70 : [Lf/rx0;
/*   */     //   30: dup
/*   */     //   31: astore_0
/*   */     //   32: arraylength
/*   */     //   33: istore_2
/*   */     //   34: iconst_0
/*   */     //   35: istore_3
/*   */     //   36: iload_3
/*   */     //   37: iload_2
/*   */     //   38: if_icmpge -> 100
/*   */     //   41: aload_0
/*   */     //   42: iload_3
/*   */     //   43: aaload
/*   */     //   44: dup
/*   */     //   45: astore #4
/*   */     //   47: getfield bm0 : Lf/ah0;
/*   */     //   50: dup
/*   */     //   51: astore #5
/*   */     //   53: ifnonnull -> 59
/*   */     //   56: goto -> 94
/*   */     //   59: aload #4
/*   */     //   61: getfield rc : Ljava/util/HashMap;
/*   */     //   64: aload_1
/*   */     //   65: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   68: checkcast f/Prn
/*   */     //   71: dup
/*   */     //   72: astore #4
/*   */     //   74: ifnonnull -> 80
/*   */     //   77: goto -> 94
/*   */     //   80: aload #4
/*   */     //   82: aload #5
/*   */     //   84: invokevirtual m6 : (Lf/ah0;)Z
/*   */     //   87: ifeq -> 94
/*   */     //   90: iconst_1
/*   */     //   91: goto -> 101
/*   */     //   94: iinc #3, 1
/*   */     //   97: goto -> 36
/*   */     //   100: iconst_0
/*   */     //   101: ifeq -> 107
/*   */     //   104: goto -> 111
/*   */     //   107: iconst_0
/*   */     //   108: goto -> 112
/*   */     //   111: iconst_1
/*   */     //   112: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 15
/*   */     //   #2	-> 47
/*   */     //   #3	-> 61
/*   */     //   #4	-> 84 } public final boolean Y80(int paramInt) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield t20 : Lf/Bn0;
/*   */     //   4: dup
/*   */     //   5: astore_0
/*   */     //   6: ifnull -> 111
/*   */     //   9: aload_0
/*   */     //   10: getfield PU : Z
/*   */     //   13: ifne -> 19
/*   */     //   16: goto -> 105
/*   */     //   19: iload_1
/*   */     //   20: getstatic f/h1.o5 : I
/*   */     //   23: if_icmpne -> 39
/*   */     //   26: aload_0
/*   */     //   27: getfield dr0 : Lf/ev;
/*   */     //   30: invokevirtual Qf0 : ()Z
/*   */     //   33: ifeq -> 39
/*   */     //   36: goto -> 56
/*   */     //   39: iload_1
/*   */     //   40: getstatic f/h1.nUL : I
/*   */     //   43: if_icmpne -> 60
/*   */     //   46: aload_0
/*   */     //   47: getfield cF : Lf/ev;
/*   */     //   50: invokevirtual Qf0 : ()Z
/*   */     //   53: ifeq -> 60
/*   */     //   56: iconst_1
/*   */     //   57: goto -> 106
/*   */     //   60: aload_0
/*   */     //   61: getfield H20 : F
/*   */     //   64: fconst_0
/*   */     //   65: fcmpl
/*   */     //   66: ifeq -> 105
/*   */     //   69: iload_1
/*   */     //   70: getstatic f/h1.Wa0 : I
/*   */     //   73: if_icmpeq -> 97
/*   */     //   76: iload_1
/*   */     //   77: getstatic f/h1.Ll : I
/*   */     //   80: if_icmpeq -> 97
/*   */     //   83: iload_1
/*   */     //   84: getstatic f/h1.wu : I
/*   */     //   87: if_icmpeq -> 97
/*   */     //   90: iload_1
/*   */     //   91: getstatic f/h1.SJ0 : I
/*   */     //   94: if_icmpne -> 105
/*   */     //   97: aload_0
/*   */     //   98: iload_1
/*   */     //   99: invokevirtual fp0 : (I)Z
/*   */     //   102: goto -> 106
/*   */     //   105: iconst_0
/*   */     //   106: ifeq -> 111
/*   */     //   109: iconst_1
/*   */     //   110: ireturn
/*   */     //   111: getstatic f/UB0.PU : Lf/aY;
/*   */     //   114: iload_1
/*   */     //   115: invokevirtual Ak : (I)Z
/*   */     //   118: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 10
/*   */     //   #2	-> 20
/* 1 */     //   #3	-> 111 } public final String am(int paramInt) { return H9(paramInt, Ml0.la(61, "None")); } public String H9(int paramInt, String paramString) { if (paramInt <= 0) return paramString;  if (paramInt >= 0) { if (paramInt <= 255) { switch (paramInt) { default: switch (paramInt) { default: switch (paramInt) { default: case 194: case 193: case 192: case 191: case 190: case 189: case 188: case 187: case 186: case 185: case 184: case 183: break; }  break;case 163: case 162: case 161: case 160: case 159: case 158: case 157: case 156: case 155: case 154: case 153: case 152: case 151: case 150: case 149: case 148: case 147: case 146: case 145: case 144: case 143: case 142: case 141: case 140: case 139: case 138: case 137: case 136: case 135: case 134: case 133: case 132: case 131: case 130: case 129:  } case 112: case 111: case 110: case 109: case 108: case 107: case 106: case 105: case 104: case 103: case 102: case 101: case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90: case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80: case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70: case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60: case 59: case 58: case 57: case 56: case 55: case 54: case 53: case 52: case 51: case 50: case 49: case 48: case 47: case 46: case 45: case 44: case 43: case 42: case 41: case 40: case 39: case 38: case 37: case 36: case 35: case 34: case 33: case 32: case 31: case 30: case 29: case 28: case 27: case 26: case 25: case 24: case 23: case 22: case 21: case 20: case 19: case 18: case 17: case 16: case 15: case 14: case 13: case 12: case 11: case 10: case 9: case 8: case 7: case 6: case 5: case 4: case 3: case 2: case 1: case 0:  }  return (paramInt != 115) ? ((paramInt != 116) ? ((paramInt != 120) ? ((paramInt != 121) ? ((paramInt != 123) ? ((paramInt != 124) ? ((paramInt != 243) ? "F13" : ":") : "Insert") : "End") : "Pause") : "Print") : "Scroll Lock") : "Caps Lock"; }  throw new IllegalArgumentException(
/* 2 */           XD0.SD0("keycode cannot be greater than 255, keycode: ", paramInt)); }
/* 3 */      throw new IllegalArgumentException(
/* 4 */         XD0.SD0("keycode cannot be negative, keycode: ", paramInt)); } public final boolean Zp0(int paramInt) { UB0.PU.getClass(); if (paramInt == 160) paramInt = 66;  long l = UB0.PU.hl0.ip0;
/* 5 */     Bl0(paramInt, true, l, false); byte b = 0; if (paramInt == 66) { b = 13; } else if (paramInt == 4) { paramInt = h1.nUL; } else if (paramInt == 67 || paramInt == 112)
/* 6 */     { return true; }  return this.NF.G50(paramInt, b, true, false); } public final boolean XM(int paramInt) { UB0.PU.getClass(); if (paramInt == 160) paramInt = 66;  long l = UB0.PU.hl0.ip0; Bl0(paramInt, false, l, false); byte b = 0; if (paramInt == 66) { b = 13; } else if (paramInt == 4) { paramInt = h1.nUL; }  return this.NF.G50(paramInt, b, false, false); } public final boolean d70(char paramChar) { byte b = 0; if (paramChar == '﻿') return true;  if (paramChar != '\b') { if (paramChar == '') b = 112;  } else { b = 67; }  boolean bool = this.NF.G50(b, paramChar, true, true); if (this.NF.G50(b, paramChar, false, true) || bool) return true;  } public final boolean bD0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { UB0.PU.getClass(); return this.NF.Qg0(paramInt1, paramInt2, paramInt4, true); } public final boolean Di(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { UB0.PU.getClass(); x80(paramInt1, paramInt2); return this.NF.Qg0(paramInt1, paramInt2, paramInt4, false); } public final boolean Xe(int paramInt1, int paramInt2, int paramInt3) { UB0.PU.getClass(); return this.NF.Qg0(paramInt1, paramInt2, -1, true); } public final boolean x80(int paramInt1, int paramInt2) { UB0.PU.getClass(); return this.NF.Qg0(paramInt1, paramInt2, -1, false); } public final boolean kG0(float paramFloat1, float paramFloat2) { JG0 jG0; UB0.PU.getClass(); int i = -((int)paramFloat2); throws throws1; (throws1 = this.NF).lO.kB0 = i; i = 8; if (this.NF.l30) { jG0 = this.F20; } else { jG0 = null; }  this.lO.kB0 = 0; return (MW(i, jG0) != null); } public final boolean Xg0(int paramInt, boolean paramBoolean) { if (this.NF == null) return false;  if (!km.wI0.oq0) return false;  if (!paramBoolean || oW(paramInt, false) == -1 || !this.jZ[oW(paramInt, false)]) { try { this.NF.G50(paramInt, false, paramBoolean, false); } catch (Exception exception)
/* 7 */       { iS.error("", exception); }  long l = System.nanoTime(); Bl0(paramInt, paramBoolean, l, true); return true; }  return false; } public final boolean Qa0(int paramInt, boolean paramBoolean) { if (this.NF == null) return false;  if (!km.wI0.oq0) return false;  if (!paramBoolean || oW(paramInt, false) == -1 || !this.jZ[oW(paramInt, false)]) { try { this.NF.G50(paramInt, false, paramBoolean, false); } catch (Exception exception) { iS.error("", exception); }  long l = System.nanoTime(); Bl0(paramInt, paramBoolean, l, false); return true; }
/*   */     
/*   */     return false; }
/*   */ 
/*   */   
/*   */   public final boolean vG0() {
/*   */     if (this.o60) {
/*   */       this.o60 = false;
/*   */       return true;
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final void Bl0(int paramInt, boolean paramBoolean1, long paramLong, boolean paramBoolean2) {
/*   */     if ((paramInt = oW(paramInt, false)) < 0)
/*   */       return; 
/*   */     if (paramBoolean1) {
/*   */       boolean[] arrayOfBoolean;
/*   */       if (!(arrayOfBoolean = this.jZ)[paramInt]) {
/*   */         arrayOfBoolean[paramInt] = true;
/*   */         this.pd[paramInt] = paramLong;
/*   */       } 
/*   */     } else {
/*   */       boolean[] arrayOfBoolean;
/*   */       if ((arrayOfBoolean = this.jZ)[paramInt]) {
/*   */         Lpt2 lpt2;
/*   */         arrayOfBoolean[paramInt] = false;
/*   */         int i;
/*   */         if ((i = (int)((paramLong - this.pd[paramInt]) / 1000000.0D)) == 0)
/*   */           this.dk0++; 
/*   */         this.An++;
/*   */         if (paramBoolean2)
/*   */           this.Yj++; 
/*   */         /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Lpt2}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/Lpt2}, expression=ThisExpression{ObjectType{f/JP}}, name=e9, descriptor=Lf/Lpt2;}} */
/*   */         try {
/*   */           boolean bool = true;
/*   */           Lpt2 lpt21;
/*   */           int j;
/*   */           if ((j = (lpt21 = this.e9).tw(System.currentTimeMillis())) < 0) {
/*   */             j = -j - 1;
/*   */             lpt21.ng0[j];
/*   */             bool = false;
/*   */           } 
/*   */           lpt21.ng0[j] = i;
/*   */           if (bool)
/*   */             lpt21.xt0(lpt21.kO); 
/*   */         } finally {}
/*   */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Lpt2}, name=null} */
/*   */         this.pd[paramInt] = 0L;
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */