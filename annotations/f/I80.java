/*  1 */ package f;public final class I80 implements Runnable { public final void run() { Li0 li01; Vq0 vq0; Li0 li02; if ((li01 = this.W3) != (li02 = (vq0 = this.ur.bw).zO) && li01
/*  2 */       .EC0 != null)
/*  3 */       if (li01.T1
/*  4 */         .fr0 == vq0
/*  5 */         .PRN) { if (li01 == li02)
/*  6 */         { i = vq0.Us0.indexOf(li01); } else { i = -1; }  li01.qs0(null); vq0.PRN.jf0(li01.T1); vq0.Us0.remove(li01); if (i >= 0 && !vq0.Us0.isEmpty()) vq0.dA0(vq0.Us0.get(Math.min(vq0.Us0.size() - 1, i)));  byte b = 0;
/*  7 */         for (int i = vq0.Us0.size(); b < i; ) {
/*  8 */           boolean bool; Sa0 sa0 = ((Li0)vq0.Us0.get(b)).T1.O;
/*  9 */           Ll ll = Vq0.fj; if (b == 0) { bool = true; } else { bool = false; }  sa0.gf0(ll, bool); ll = Vq0.yX; if (b == i - 1) { bool = true; } else { bool = false; }  sa0.gf0(ll, bool); b++;
/* 10 */         }  if (this.ur.bw.nv0() > 2) this.ur.bw.dA0(this.ur.bw.Hf(0));  }
/* 11 */       else { throw new IllegalArgumentException("Invalid tab"); }
/*    */         }
/*    */ 
/*    */   
/*    */   public I80(ep paramep, Li0 paramLi0) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/I80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */