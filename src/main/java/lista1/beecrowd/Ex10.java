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

import java.util.Scanner;

/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex10
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
            //para ler arquivos para finalizar a repetição
            while (sc.hasNext()) {
                //quantidade de repetições
                int L = sc.nextInt();
            //iniciar a velocidade  
            int maxVelocidade = 0;

            //laço de repetição para ver qual a maior velocidade
            for (int i = 0; i < L; i++) {
                //tribuir qual o valor da velocidade
                int velocidade = sc.nextInt();
                // verificar  de a velocidade aumentou
                if (velocidade > maxVelocidade) {
                    //atribuir a velocidade maior na variavel
                    maxVelocidade = velocidade;
                }
            }

            // mostrar o numero dependendo de qual a velocidade
            if (maxVelocidade < 10) {
                System.out.println("1");
            } else if (maxVelocidade < 20) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
