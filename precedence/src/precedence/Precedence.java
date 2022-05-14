package precedence;
public class Precedence {
public static void main(String[] args) {
   
    {int x = 25 - 5 * 4 / 2 - 10 + 4;
    System.out.println(x);
    // hasilnya 9    
    }
    {   int a = 10+20+30/3;    // without parentless
    System.out.println(a);
    // 40 hasilnya
}
    { int b = 10+20+30+(30/3);  //excpression with parenthese
     System.out.println(b);
    // 70
    }
    int c = (10+20+30)/30;   // average parenthese like this
    System.out.println(c);
  //2 hasilbnya         
}

    
    
    
    
    
}
