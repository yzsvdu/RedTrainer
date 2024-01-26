/*    */ package f;
/*  2 */ public final class Qy0 extends Wr { public static final ik Yr = C00.gd(Qy0.class); public final Wx uy0; public final void D50() { if (!this.c7.isEmpty()) Lo(Ml0.OH0(1004));  } public final Ip N00; public Qy0(Wx paramWx) { I i; Ip ip; pRn pRn; this.uy0 = paramWx; this((byte)-1, (byte)-1, (byte)-1, (byte)-1); this(this, pRn); Vo0(i); Xu("changelog-frame"); EP(1); (new kI0()).Xh(false); (new kI0()).Xu("tabbedpane"); this(); this.N00 = ip; J8(ip); Lo(""); mp.LPt7(new id(this)); } public final void hi() { try { g0 g0; cr0 cr0; NodeList nodeList; if ((nodeList = mp.LE) == null || nodeList.getLength() < 1) return;  if (this
/*  3 */         .Bo0 == null)
/*  4 */         return;  Lo(Ml0.OH0(1004)); Ip ip; (ip = this.N00).getClass();
/*  5 */       this(ip);
/*  6 */       (ip = this.N00).getClass();
/*  7 */       this(ip); byte b = 0; while (b < nodeList
/*  8 */         .getLength()) { Node node; if ((node = nodeList.item(b)).getNodeType() == 1) { Un un; this(); try { rs rs; Element element; String str1 = (element = (Element)node).getElementsByTagName("link").item(0).getTextContent(); String str2; if ((str2 = ((Element)node).getElementsByTagName("title").item(0).getTextContent()).length() > 50) { str2 = str2.substring(0, 50) + " ... "; un
/*  9 */                 .z4 = element.getElementsByTagName("title").item(0).getTextContent(); un.zn();
/* 10 */               un.jl = 0; }  un
/* 11 */               .s6(str2); this(str1); un.tW(rs); g0.Ya(un); cr0.Ya(un); } catch (Exception exception) {} }  b++; }  this.N00.rK0(g0); this.N00.WN(cr0); mM(); this.uy0.MJ0(); this.uy0.uW(); } catch (Exception exception) { Yr.error("", this); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     mM();
/*    */     super.d40();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */