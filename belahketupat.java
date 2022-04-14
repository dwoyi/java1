/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Asus
 */

class Perhitungan {
    protected double Diagonal1, Diagonal2, Sisi, HasilKeliling, HasilLuas;
    protected int Menu;
    
    Scanner input = new Scanner(System.in);
    
    public void setDiagonal1(double Diagonal1){
        this.Diagonal1 = Diagonal1;
    }
    
    public void SetDiagonal2(double Diagonal2){
        this.Diagonal2 = Diagonal2;
    }
    
    public void setSisi(double Sisi){
        this.Sisi = Sisi;
    }
    
    public void setHasilKeliling(double HasilKeliling){
        this.HasilKeliling = HasilKeliling;
    }
    
    public void setHasilLuas(double HasilLuas){
        
        this.HasilLuas=HasilLuas;
    }
    
    public void setMenu(int Menu){
        this.Menu = Menu;
    }
    
    public double getDiagonal1(){
        return Diagonal1;
    }
    
    
    public double getDiagonal2(){
        return Diagonal2;
    }
    
    public double getSisi(){
        return Sisi;
    }
    
    public double getHasilKeliling(){
        Scanner i = new Scanner (System.in);
                System.out.println();
                System.out.println();
                System.out.println("Keliling");
                System.out.print("Masukkan sisi : ");
                Sisi = i.nextDouble();

                
                HasilKeliling =Sisi*4;
                System.out.print("luas : "+ HasilKeliling);
                System.out.println();
        return HasilKeliling;
    }
    
    public double getHasilLuas(){
        Scanner i = new Scanner (System.in);
                System.out.println();
                System.out.println();
                System.out.println("Luas");
                System.out.print("Masukkan Diagonal 1 : ");
                Diagonal1 = i.nextDouble();
                System.out.print("Masukkan Diagonal 2 : ");
                Diagonal2 = i.nextDouble();
                
                HasilLuas =(Diagonal1*Diagonal2)/2;
                System.out.print("luas : "+ HasilLuas);
                System.out.println();
        return HasilLuas;
    }
    
    public int getMenu(){
        return Menu;
    }
}


public class belahketupat{
    public static void main(String[] args){
         Perhitungan hit = new Perhitungan();
         int Menu;

        do{
        Scanner i = new Scanner (System.in);
        System.out.println();
        System.out.println("\tMENU");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Keluar ");
        System.out.print("Pilih menu : ");        
        Menu = i.nextInt();
        hit.setMenu(Menu);
        
        if(Menu == 1) {
                hit.getHasilKeliling();
        }else if (Menu == 2){
                hit.getHasilLuas();
        }else if (Menu == 3){
                System.exit(Menu);
        }else {
                System.out.println("inputan tidak tersedia di menu");
        }
        
        }while(hit.getMenu() != 3); 
       
       
        
        
    }

 }


