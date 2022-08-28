package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k = 0;
        int[] ans = new int[100005];
        Scanner input = new Scanner(System.in);
        Trie_tree trie_tree = new Trie_tree();
        int n = input.nextInt();
        trie_tree.inserT(0);
        for (int i = 0; i < n; i++) {
            int choose = input.nextInt();
            int in = input.nextInt();
            if (choose == 1) {
                trie_tree.inserT(in);
            } else {
                ans[k++] = trie_tree.xormaxx(in);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(ans[i]).append("\n");
        }
        System.out.print(sb.toString().trim());

    }
}







