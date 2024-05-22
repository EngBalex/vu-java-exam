/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.evening;

/**
 *
 * @author Eng. Balex
 */
public class logical {
    public static void man(String [] args){
        /* Logical Operators
        Logical AND                   &&
        Logical OR                      ||
        Logical NOT                    !
        */
        
       boolean above18 = true;
       boolean canClub =true;
       
       boolean checkAND = above18 && canClub;
       System.out.println(checkAND);
       boolean notAbove18   = !above18;
       System.out.println(notAbove18);
       
     /*
       AND Gate
       P        Q              P && Q
       T        T                   T
       T        F                   F
       F        T                   F
       F        F                   F
       
       OR GATE
        P        Q           P || Q
       T        T                   T
       T        F                   T
       F        T                   T
       F        F                   F
       
       NOT
       P            !P
       T            F
       F            T
       
       */
       
    }
}
