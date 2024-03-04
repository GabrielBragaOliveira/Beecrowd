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
 * @brief Class Ex9
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variavel de controle
        int casosTeste = sc.nextInt();
        //estrutura de repetição para dizer se é ou não é perfeito
        for (int caso = 0; caso < casosTeste; caso++) {
            int x = sc.nextInt();
            // ehPereito é a função
            if (ehPerfeito(x)) {
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
        }
    }
    //função para ver se o numero é perfeito
    public static boolean ehPerfeito(int num) {
        //variavel
        int soma = 0;
        //estrutura de repetição
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        //retorna se a soma for igual o numero
        return soma == num;
    }
}
