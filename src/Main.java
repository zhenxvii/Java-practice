public class Main {
   public static void main(String[] args) throws InterruptedException {

      String[] love = {

              """
            _________________
                    |
                    |
                    |
                    |
                    |
                    |
            _________________
            """,

              """
            |
            |
            |
            |
            |
            |
            |________________
            """,

              """
               OOOOOOOOO
             OO         OO
            OO           OO
            OO           OO
            OO           OO
            OO           OO
            OO           OO
             OO         OO
               OOOOOOOOO
            """,

              """
            VV         VV
             VV       VV
              VV     VV
               VV   VV
                VV VV
                 VVV
                  V
            """,

              """
            |--------------
            |
            |
            |--------------
            |
            |
            |--------------
            """,

              """
            YY         YY
             YY       YY
              YY     YY
               YY   YY
                YYYYY
                  Y
                  Y
                  Y
            """,

              """
               OOOOOOOOO
             OO         OO
            OO           OO
            OO           OO
            OO           OO
            OO           OO
            OO           OO
             OO         OO
               OOOOOOOOO
            """,

              """
            |               |
            |               |
            |               |
            |               |
            |               |
            |               |
            |               |
            |_______________|
            """,

              """
            BBBBBBBBBBBB
            BB          BB
            BB          BB
            BBBBBBBBBBBB
            BB          BB
            BB          BB
            BBBBBBBBBBBB
            """,

              """
                AAAAA
               AA   AA
              AA     AA
             AAAAAAAAAAA
             AA       AA
             AA       AA
             AA       AA
            """,

              """
            BBBBBBBBBBBB
            BB          BB
            BB          BB
            BBBBBBBBBBBB
            BB          BB
            BB          BB
            BBBBBBBBBBBB
            """,

              """
            YY         YY
             YY       YY
              YY     YY
               YY   YY
                YYYYY
                  Y
                  Y
                  Y
            """,
              """
      ******       ******
    **********   **********
   *************************
  ***************************
  ***************************
   *************************
    ***********************
      *******************
        ***************
          ***********
            *******
              ***
               *


               """
      };

      // Print all ASCII arts
      for (String art : love) {
         System.out.println(art);
         Thread.sleep(1000);
      }
   }
}