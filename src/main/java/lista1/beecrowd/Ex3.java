/*
 * Copyright (C) 2024 Gabriel Braga <ninjagamer9795286@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista1.beecrowd;
import java.util.*;
/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex3
 */
public class Ex3 {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
    //variaveis
    Double a, b, c, r, r2, f, f2, delta;
    
    a = ler.nextDouble();
    b = ler.nextDouble();
    c = ler.nextDouble();
    
    //calculo para saber o delta
    delta = (b*b) - 4*a*c;
    
    //fazer o b ficar negativo
    b = -1*b; 
    //conta da raiz do delta +b
    f = (b + Math.sqrt(delta));
    //conta da raiz do delta - b
    f2 = (b - Math.sqrt(delta));
    // divisão para saber o primeiro resultado
    r = f /(2*a);
    // divisão para saber o segundo resultado
    r2= f2 /(2*a);
    
    //saber de existe algum resultado no calculo
    if(delta > 0 &&  a != 0 )
    {
        System.out.printf("R1 = %.5f%n", r);
      System.out.printf("R2 = %.5f%n", r2);
    }
    else
    {
      System.out.println("Impossivel calcular");
    }
    
    
    }

}
