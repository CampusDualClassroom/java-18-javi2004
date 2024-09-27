package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int tamaño = Utils.integer("Ingresa el tamaño del array");
		int[] array = createAndInitializeArray(tamaño);
		showInlineArray(array);

	}
	public static int[] createAndInitializeArray(int num){
		int[] arra = new int[num];
		for (int i = 0; i <num; i++) {
			arra[i] = i+1;
		}
		return arra;
	}
	public static void showInlineArray(int[] array){
		for (int i = 0; i <array.length; i++) {
			if ( i != array.length-1){
				System.out.print("Numero:"+array[i]+" ");
			}else {
				System.out.print("Numero:"+array[i]);
			}
		}

	}
}
