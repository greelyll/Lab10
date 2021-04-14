class Cookie {

    double cookieNumber;  
   private double cookieTemp;
   private double bakingTime;
   private boolean cookieBaked;

   double getCookieNumber () { return cookieNumber; }
   double getCookieTemp () { return cookieTemp; }
   double getBakingTime () { return bakingTime; }
   boolean getCookieBaked () {return cookieBaked; }

   Cookie() {
     this.cookieNumber = 0;
     this.cookieTemp = 0;
     this.bakingTemp = 0;
     this.cookieBaked = false;
   }

   Cookie(double number, double bakeTemp, double bakeTime) {
     cookieNumber = number;
     cookieTemp = bakeTemp;
     bakingTime = bakeTime;
     cookieBaked = false;

   }

   void setCookieBaked(boolean isReady) {
     cookieBaked = true;
   }

   double getNumber() {
     return cookieNumber;
   }

   static void bakeResults(double cookieTemp, double bakingTime ) {

     System.out.println(Number + "cookies were baked at" + cookieTemp + "degrees F for" + bakingTime + "minutes.");

     class Cookie extends cookieBaked {
        boolean cookieBaked = true;
     }

   }



}
