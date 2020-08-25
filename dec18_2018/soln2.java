package dec18_2018;

import java.util.*;
public class soln2{

    static int ctr2=0;
    static void comb2(boolean[][] arr,int i, int li, 
                     int num ,int tnum,
                     String asf){
        if(i==li){
            if(num==tnum+1){
                System.out.println(++ctr2+"."+asf);
            }
            return;
        }

        comb2( arr,i+1, li, num, tnum, asf);

        int r= i/4;
        int c= i%4;
        
        if(isValid(arr, r, c)){
        arr[r][c]=true;
        comb2(arr, i+1, li, num+1, tnum, asf+num+" "+r+c+" ");
        arr[r][c]=false;
         }

    }

    static boolean isValid(boolean [][] arr,int r, int c){

     //only 4 dxns
     for(int i=0; i<r; i++){

        if(arr[i][c]==true){
            return false;
        }
    }   

    for(int j=0; j<c; j++){
        if(arr[r][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i>=0 && j>=0; i--,j--){
        if(arr[i][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i>=0 && j<arr[0].length; --i,++j){
        if(arr[i][j]==true){
            return false;
        }
    }           
    
    return true;
    }   

    static int ctr3=0;
    static void perm2(boolean[][] arr, boolean[] arr2, int i, int li, 
                    int isf ,int tnum,
                        String asf){
        // isf= item so far
        if(i==li){
        if(isf==tnum+1){
        System.out.println(++ctr2+"."+asf);
        }
        return;
        }

    perm2( arr, arr2, i+1, li, isf, tnum, asf);

    int r= i/4;
    int c= i%4;

//    if(isValid2(arr, r, c)==true){
for(int j=0; j<arr2.length; j++){
if(arr2[j]==false){

    arr[r][c]=true;
    arr2[j]=true;

    perm2(arr, arr2, i+1, li, isf+1, tnum, asf+(j+1)+" "+r+c+" ");

    arr[r][c]=false;
    arr2[j]=false;
//}
}
}

}

    static boolean isValid2(boolean [][] arr2,int r, int c){
// 8 dxn
     
     for(int i=0; i<arr2.length; i++){

        if(arr2[i][c]==true){
            return false;
        }
    }   

    for(int j=0; j<arr2[0].length; j++){
        if(arr2[r][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i>=0 && j>=0; i--,j--){
        if(arr2[i][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i>=0 && j<arr2[0].length; --i,++j){
        if(arr2[i][j]==true){
            return false;
        }
    }
    
    for(int i=r, j=c ; i<arr2.length && j>=0; i++,j--){
        if(arr2[i][j]==true){
            return false;
        }
    }

    for(int i=r, j=c; i<arr2.length && j<arr2[0].length; ++i,++j){
        if(arr2[i][j]==true){
            return false;                                                                                                                                                                                                                                               
        }                                                                                                                                                                                                                                               
    }
    return true;
    }   
    
    public static void main(String[] args){

        int tot=4;
        
        comb2(new boolean[4][4], 0, 4*4, 1, tot, "");
        
        perm2(new boolean[4][4], new boolean[2],0, 4*4, 1, tot, "");//4! times comb
        
        

    }

}