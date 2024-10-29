package org.example;

class TwoSum {
    /*public static void main(String[] args) {
        TwoSum teste = new TwoSum();
        int[] testeArray = {2,5,5,11};
        int[] resultado = teste.twoSum(testeArray, 10);
        System.out.println(resultado[0] +", "+ resultado[1]);
    }*/

    public int[] twoSum(int[] nums, int target) {

        int[] indice = new int[2];

        for (int i = 0; i < nums.length -1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    indice[0] = i;
                    indice[1] = j;
                    return indice;
                }
            }
        }
        return indice;
    }
}