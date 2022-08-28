package com.company;

import com.company.Trie_tree_node;

public class Trie_tree {
    private Trie_tree_node root ;
    private int revbinary[] = new int[60];      //max is 50
    private int binary[] = new int[60];      //max is 50
    private int size ;
    private int max = 0  ;
    private int maxx = 30 ;
    private int[] numbers = new int[50005];
    private int counter = 0 ;
    public Trie_tree(){
        root = new Trie_tree_node() ;
        root.setData(1000);
        root.setLeftChild(null);
        root.setRightChild(null);
        this.size = 0 ;
        this.max = 0;
    }


    public void inserT(int x) {
        int index = 0;
        while (x > 0) {
            revbinary[index++] = x % 2;
            x = x / 2;
        }
        int d = this.maxx - index;
        int size = index;
        for (int i = 0; i < d; i++) {
            binary[i] = 0;
        }
        for (int i = d; i < size + d; i++) {
            binary[i] = revbinary[--index];
        }

        Trie_tree_node temp = this.root;
        root.setData(1000);
        for (int i = 0; i < size + d; i++) {
            if (binary[i] == 0) {
                this.checkForLeftChild(temp);
                temp = temp.getLeftChild();
            } else {
                this.checkForRightChild(temp);
                temp = temp.getRightChild();
            }
        }
    }


    public int xormaxx(int x){
        if(root.getRightChild()==null && root.getLeftChild()==null){
            return x ;
        }
        int index = 0;
        int tempx = x ;
        int result[] = new int[60] ;
        int  k = 0 ;
        while(x > 0){
            revbinary[index++] = x%2;                 //lowest significant bit are stored in earlier position
            x = x/2;
        }
        x = tempx ;
            int d = this.maxx - index ;

            for(int i = 0 ; i < d ; i++){
                binary[i] = 0 ;
            }

            int size  = index + d;
            for(int i = d ; i < size ; i++){
                binary[i] = revbinary[--index];
            }
            Trie_tree_node temp = this.root ;
            for(int  i = 0 ; i < size  ; i++ ){
                if(binary[i]==0 && temp.getRightChild()!=null){
                    result[k++] = 1 ;
                    temp = temp.getRightChild() ;
                    continue;
                }
                if(binary[i]==0 && temp.getRightChild()==null){
                    if(temp.getLeftChild()==null)
                        break;
                    else{
                        result[k++] =   0 ;
                        temp = temp.getLeftChild() ;
                        continue;
                    }

                }
                if(binary[i]==1 && temp.getLeftChild()!=null){
                    result[k++] = 1 ;
                    temp  = temp.getLeftChild() ;
                    continue;
                }
                if(binary[i]==1 && temp.getLeftChild()==null){
                    if(temp.getRightChild()==null)
                        break;
                    else{
                        result[k++] = 0 ;
                        temp = temp.getRightChild() ;
                        continue;
                    }

                }

            }

        int decimal = 0 ;
        for(int i= 0 ; i < k ; i++){
            decimal += (Math.pow(2 , k-i-1)*result[i]) ;
        }
        return decimal ;


        }















    private void ClearArray(){
        for(int i = 0 ; i < 60 ; i++){
            this.revbinary[i] = 0 ;
            this.binary[i] = 0 ;
        }
    }

    private void checkForLeftChild(Trie_tree_node node){
        if(node.getLeftChild()==null){
            Trie_tree_node temp  = new Trie_tree_node();
            temp.setData(0);
//            System.out.print(0 + " ");
            node.setLeftChild(temp);
        }else{
//            System.out.print(0 + " ");
        }
    }

    private void checkForRightChild(Trie_tree_node node){
        if(node.getRightChild()==null){
            Trie_tree_node temp = new Trie_tree_node() ;
            temp.setData(1);
//            System.out.print(1 + " ");
            node.setRightChild(temp);
        }else{
//            System.out.print(1 + " ");
        }
    }





    public void inorderprint(Trie_tree_node node){
        if(node.getLeftChild()!=null)
            inorderprint(node.getLeftChild());
        System.out.print(node.getData()+ "        ");
        if(node.getRightChild()!=null)
            inorderprint(node.getRightChild());

    }



}

/*

9
1 13
1 11
1 20
1 64
1 5
1 10
2 3
2 5
2 55







10
1 4
1 5
1 13
1 15
1 62
2 32





10
1 13
1 9
1 1
2 85
2 3
2 64

 */















