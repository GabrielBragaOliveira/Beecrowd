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
import java.util.*;
/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex1
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        int s = ler.nextInt();//ler quantos segundos o usuario escolheu
        
        int h = s / 3600;//conversao dos segundos em horas
        int m = (s % 3600) / 60; //conversao dos segundos em minutos com o restante dos segundos da hora
        int st = (s%3600) % 60;//conversao dos segundos com o restante dos segundos dos minutos
        // h = horas, m = minutos, st = segundos
        
        System.out.printf("%d:%d:%d%n", h, m, st);//mostrar o tempo 00:00:00 com horas, minutos, segundos
 
    
    }
}
