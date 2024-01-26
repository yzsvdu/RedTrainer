/* 1 */ package f;public final class Sa0 implements fB0 { public final Sa0 Wb; public u70[] Sn; public throws F8; public final boolean z60(Ll paramLl) { Object object; int i; u70[] arrayOfU70; if ((i = paramLl.fK) < (
/* 2 */       arrayOfU70 = this.Sn).length) { object = arrayOfU70[i]; } else { object = null; }  if (object != null)
/* 3 */       return ((u70)object).xD0;  return ((this = this.Wb) != null) ? z60(paramLl) : false; } public Sa0(Sa0 paramSa0, int paramInt) { this.Wb = paramSa0; this.Sn = new u70[paramInt]; } public Sa0(Sa0 paramSa0) { this(paramSa0, 16); } public final void lg0(throws paramthrows) { this.F8 = paramthrows; long l = po0(); u70[] arrayOfU70; int i = (arrayOfU70 = this.Sn).length; for (byte b = 0; b < i; b++) { u70 u701; if ((u701 = arrayOfU70[b]) != null) u701.JK0 = l;  }  } public final int Fj0(Ll paramLl) { // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: getfield fK : I
/*   */     //   4: dup
/*   */     //   5: istore_2
/*   */     //   6: aload_0
/*   */     //   7: getfield Sn : [Lf/u70;
/*   */     //   10: dup
/*   */     //   11: astore_3
/*   */     //   12: arraylength
/*   */     //   13: if_icmpge -> 23
/*   */     //   16: aload_3
/*   */     //   17: iload_2
/*   */     //   18: aaload
/*   */     //   19: astore_2
/*   */     //   20: goto -> 25
/*   */     //   23: aconst_null
/*   */     //   24: astore_2
/*   */     //   25: aload_2
/*   */     //   26: ifnull -> 48
/*   */     //   29: aload_0
/*   */     //   30: invokevirtual po0 : ()J
/*   */     //   33: aload_2
/*   */     //   34: getfield JK0 : J
/*   */     //   37: lsub
/*   */     //   38: lstore_0
/*   */     //   39: ldc2_w 2147483647
/*   */     //   42: lload_0
/*   */     //   43: invokestatic min : (JJ)J
/*   */     //   46: l2i
/*   */     //   47: ireturn
/*   */     //   48: aload_0
/*   */     //   49: getfield Wb : Lf/Sa0;
/*   */     //   52: dup
/*   */     //   53: astore_2
/*   */     //   54: ifnull -> 63
/*   */     //   57: aload_2
/*   */     //   58: aload_1
/*   */     //   59: invokevirtual Fj0 : (Lf/Ll;)I
/*   */     //   62: ireturn
/*   */     //   63: aload_0
/*   */     //   64: invokevirtual po0 : ()J
/*   */     //   67: l2i
/*   */     //   68: ldc 2147483647
/*   */     //   70: iand
/*   */     //   71: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 7
/* 3 */     //   #3	-> 30 } public final boolean Oo0(Ll paramLl) { Object object; int i; u70[] arrayOfU70; if ((i = paramLl.fK) < (arrayOfU70 = this.Sn).length) { object = arrayOfU70[i]; } else { object = null; }  if (object != null) return ((u70)object).ul;  return ((this = this.Wb) != null) ? Oo0(paramLl) : false; } public final void gf0(Ll paramLl, boolean paramBoolean) { int i; u70[] arrayOfU70; u70 u701; if ((i = paramLl.fK) >= (arrayOfU70 = this.Sn).length || (u701 = arrayOfU70[i]) == null) { if (i >= arrayOfU70.length) { arrayOfU70 = new u70[i + 1]; int j = arrayOfU70.length; System.arraycopy(arrayOfU70, 0, arrayOfU70, 0, j); this.Sn = arrayOfU70; }  this(); (u701 = new u70()).JK0 = po0(); this.Sn[i] = u701; }  if (u701
/* 4 */       .xD0 != paramBoolean) { u701.xD0 = paramBoolean; u701.JK0 = po0(); u701.ul = true; }  } public final void Ym0(Ll paramLl) { int i; u70[] arrayOfU70; u70 u701; if ((i = paramLl.fK) >= (arrayOfU70 = this.Sn).length || (u701 = arrayOfU70[i]) == null) { if (i >= arrayOfU70.length) { arrayOfU70 = new u70[i + 1]; int j = arrayOfU70.length; System.arraycopy(arrayOfU70, 0, arrayOfU70, 0, j); this.Sn = arrayOfU70; }  this(); (u701 = new u70()).JK0 = po0(); this.Sn[i] = u701; }  u701.JK0 = po0(); u701.ul = true; }
/*   */ 
/*   */   
/*   */   public final long po0() {
/*   */     throws throws1;
/*   */     return ((throws1 = this.F8) != null) ? this.fC : 0L;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sa0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */