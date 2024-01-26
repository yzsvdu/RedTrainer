/*  1 */ package f;public class hu extends zX implements Iterable { public static final Ll BK0 = Ll.F10("hasOpenMenus"); public final ArrayList aV; public final void mD(String paramString, Runnable paramRunnable) { this(paramString, paramRunnable); Hk0 hk0; this.aV.add(this); } public hu() { ArrayList arrayList; this(); this.aV = this; } public hu(String paramString) { super(paramString); ArrayList arrayList; this(); this.aV = this; } public final Iterator iterator() { return this.aV.iterator(); } public JG0 X9(io paramio, int paramInt) { this(this, paramio, paramInt); J7 j7; String str1 = "submenu"; String str2; if ((str2 = this.kn0) != null) { j7.Xu(str2); } else { j7.Xu(this); }  return j7; } public JG0 r7(io paramio, int paramInt, JG0 paramJG0) { int i; JG0[] arrayOfJG0; byte b; int j; for (arrayOfJG0 = new JG0[i = this.aV.size()], b = 0, j = this.aV.size(); b < j; ) { arrayOfJG0[b] = ((zX)this.aV.get(b)).X9(paramio, paramInt); b++; }
/*  2 */      this(paramInt, this, paramJG0); cr0 cr0; rJ0 rJ0; (new rJ0()).rK0((rJ0 = new rJ0()).AUX(arrayOfJG0));
/*  3 */     this(rJ0);
/*    */     String str;
/*  5 */     for (Ll ll1 = Ll.F10((str = "menuitem").concat("NotFirst")), ll2 = Ll.F10("menuitem".concat("NotLast")); j < i; ) { boolean bool; if (j > 0)
/*  6 */         G90(new Ei0(this.nL0, str)); 
/*  7 */       Ya(arrayOfJG0[j]);
/*  8 */       Sa0 sa0 = (arrayOfJG0[j]).O; if (j > 0) { bool = true; } else { bool = false; }  sa0
/*  9 */         .gf0(ll1, bool); if (j < i - 1) { bool = true; } else { bool = false; }  sa0.gf0(ll2, bool); j++; }  rJ0
/* 10 */       .WN(this);
/*    */     return rJ0; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */