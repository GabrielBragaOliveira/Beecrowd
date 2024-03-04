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
 * @brief Class Ex7
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    //variaveis
    int X, Y;
    int a = 0;
    //estrutura de repitição
    do{
    X = ler.nextInt();
    Y = ler.nextInt();
    //para saber em qual quadrante ta
    if(X > 0 && Y > 0){
        System.out.println("primeiro");
    }else{
      if(X < 0 && Y > 0){
        System.out.println("segundo");
    }else{
        if(X < 0 && Y < 0){
        System.out.println("terceiro");
    }else{
        if(X > 0 && Y < 0){
        System.out.println("quarto");
    }else{
        if(X == 0 || Y == 0){
            //finalizar
            break;
        }
    }
    }
    }
    }
    }while(a < 1);
    }
}
