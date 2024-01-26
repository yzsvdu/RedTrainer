/* 1 */ package f;public abstract class mp { public static void LPt7(Runnable paramRunnable) { synchronized (uo) { if (LE != null) { UB0.Kg0.fN(paramRunnable); return; }  uo.add(paramRunnable); if (!ii) { ii = true;
/* 2 */         super();
/* 3 */         A1.L7.nc
/* 4 */           .execute(paramRunnable); }
/*   */       
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final ik PE0 = C00.gd(mp.class);
/*   */   public static NodeList LE;
/*   */   public static Element tp0;
/*   */   public static boolean ii = false;
/*   */   public static ArrayList uo = new ArrayList();
/*   */   
/*   */   public static void L00() {
/*   */     byte b;
/*   */     byte[] arrayOfByte = null;
/*   */     try {
/*   */       String[] arrayOfString;
/*   */       (arrayOfString = new String[b = 2])[0] = "https://dl.pokemmo.com/news_feed.txt";
/*   */       (new String[b = 2])[1] = "https://files.pokemmo.com/news_feed.txt";
/*   */       byte b1 = 0;
/*   */       while (b1 < b) {
/*   */         try {
/*   */           arrayOfByte = LF.ld0(LF.F7(arrayOfString[b1], mp::G60));
/*   */           LF.F7(arrayOfString[b1], mp::G60).close();
/*   */           break;
/*   */         } catch (Exception exception) {
/*   */           b1++;
/*   */         } 
/*   */       } 
/*   */       if (arrayOfByte != null) {
/*   */         DocumentBuilderFactory documentBuilderFactory;
/*   */         try {
/*   */           (documentBuilderFactory = DocumentBuilderFactory.newInstance()).setFeature("http://xml.org/sax/features/external-general-entities", false);
/*   */           DocumentBuilderFactory.newInstance().setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
/*   */         } catch (ParserConfigurationException parserConfigurationException) {}
/*   */         this(arrayOfByte, StandardCharsets.UTF_8);
/*   */         LE = documentBuilderFactory.newDocumentBuilder().parse(new InputSource(new StringReader(null))).getElementsByTagName("item");
/*   */         NodeList nodeList;
/*   */         if ((nodeList = documentBuilderFactory.newDocumentBuilder().parse(new InputSource(new StringReader(null))).getElementsByTagName("serverstatus")).getLength() > 0 && nodeList.item(0) instanceof Element)
/*   */           tp0 = (Element)nodeList.item(0); 
/*   */         synchronized (uo) {
/*   */           ii = false;
/*   */           Iterator<Runnable> iterator = uo.iterator();
/*   */           while (iterator.hasNext())
/*   */             UB0.Kg0.fN(iterator.next()); 
/*   */           uo.clear();
/*   */         } 
/*   */       } else {
/*   */         throw new RuntimeException();
/*   */       } 
/*   */     } catch (Exception exception) {
/*   */       PE0.warn("Unable to load news feed", exception);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */