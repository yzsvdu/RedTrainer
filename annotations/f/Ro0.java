/* 1 */ package f;public final class Ro0 extends dQ { public final void uW() { if (!this.K8 && this.sM != null && this.Cq != null)
/* 2 */     { StringBuilder stringBuilder1; ArrayList<String> arrayList; StringBuilder stringBuilder2; int i; short s; if ((i = qF()) < (
/* 3 */         s = this.fu)) i = s;  int j;
/* 4 */       if ((j = this.g40) != -1) i = j;  this(); this(); for (byte b = 0; b < this.sM.length(); ) { if (Character.isWhitespace(this.sM.charAt(b))) { if (stringBuilder1.length() > 0) arrayList.add(stringBuilder1.toString());  stringBuilder1.setLength(0); } else { stringBuilder1.append(this.sM.charAt(b)); }  b++; }  if (stringBuilder1.length() > 0) arrayList.add(stringBuilder1.toString());  stringBuilder1.setLength(0); this(); while (!arrayList.isEmpty()) { String str1 = arrayList.remove(0);
/*   */         
/* 6 */         String str2 = stringBuilder2.toString() + " " + str1; if (((t90)this.Cq).computeTextWidth(str2) > i) { stringBuilder1.append(stringBuilder2.toString()).append("\n"); stringBuilder2.setLength(0); stringBuilder2.append(str1); continue; }  if (stringBuilder2.length() > 0) stringBuilder2.append(" ");  stringBuilder2.append(str1); }  if (stringBuilder2.length() > 0) stringBuilder1.append(stringBuilder2.toString());  super.E1(stringBuilder1.toString()); this.K8 = true; }  super.uW(); }
/*   */ 
/*   */   
/*   */   public String sM;
/*   */   public boolean K8;
/*   */   public int g40 = -1;
/*   */   
/*   */   public Ro0(String paramString) {
/*   */     super(paramString);
/*   */     Xu("label");
/*   */   }
/*   */   
/*   */   public Ro0() {
/*   */     Xu("label");
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     uW();
/*   */   }
/*   */   
/*   */   public final void E1(String paramString) {
/*   */     this.sM = paramString;
/*   */     this.K8 = false;
/*   */     if (this.Cq == null)
/*   */       super.E1(paramString); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ro0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */