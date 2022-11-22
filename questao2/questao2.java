package questao2;

import java.util.ArrayDeque;
import java.util.Deque;

public class questao2 {
    public static void main(String[] args) {
        Deque<Pessoa> deque = new ArrayDeque<>();
        deque.addLast(new Pessoa("Marcos", "3199935465", "marcos@gmail.com"));
        deque.addLast(new Pessoa("Felipe", "54999878584", "Felipe@gmail.com"));
        deque.addLast(new Pessoa("Paulo", "3299987543", "Paulo@gmail.com"));
        deque.addLast(new Pessoa("Ana", "81985462354", "Ana@gmail.com"));
        deque.addLast(new Pessoa("Luiza", "89945632154", "Luiza@gmail.com"));
        deque.addLast(new Pessoa("Marcia", "96999998787", "Marcia@gmail.com"));
        deque.addLast(new Pessoa("Elvis", "36999874545", "Elvis@gmail.com"));
        deque.addLast(new Pessoa("Claudia", "41999875645", "Claudia@gmail.com"));
        deque.addLast(new Pessoa("Lais", "31999875858", "Lais@gmail.com"));
        deque.addLast(new Pessoa("Patricia", "859946321545", "Patricia@gmail.com"));

        System.out.println("Ordem convencional");
        for (int i = 0; i < deque.size(); i++) {
            Pessoa temporaria = deque.pollFirst();
            System.out.println(temporaria);
            deque.addLast(temporaria);
        }
        System.out.println("Ordem não convencional");
        for (int i = 0; i < deque.size(); i++) {
            Pessoa temporaria = deque.pollLast();
            System.out.println(temporaria);
            deque.addFirst(temporaria);
        }

    }
}