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
 * @brief Class Ex2
 */
public class Ex2 {
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
         int a, b, c, d; //variaveis
    
    a = ler.nextInt();
     b = ler.nextInt();
      c = ler.nextInt();
       d = ler.nextInt();
    
    if(b > c && d>a && c+d>a+b && a%2==0)
    /* B for maior do que C e se D for maior do que A, e a soma de C com D for
        maior que a soma de A e B e se C e D, ambos, forem positivos e se a 
                variável A for par */
    {
     System.out.println("Valores aceitos");
    }
    else
        //se não
    {
    System.out.println("Valores nao aceitos");
    }  
    }
}
