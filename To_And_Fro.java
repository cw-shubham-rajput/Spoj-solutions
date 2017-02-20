/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham
 */

import java.util.*;

public class To_And_Fro 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        while(true) 
        {
            int columns = in.nextInt();
            if (columns == 0)
                break;
            String encrypted = in.next();
            int rows = encrypted.length()/columns;
            char[][] grid = zigzag(encrypted, columns, rows);
      
            for(int i=0;i<columns;++i)
                for(int j=0;j<rows;++j)
                    System.out.print(grid[j][i]);
            System.out.println();
        }
    }
  
    public static char[][] zigzag(String s, int columns, int rows) 
    {
        char[][] grid = new char[rows][columns];
        int currentCharacter = 0;
        for(int i=0;i<rows;++i)
            for(int j=0;j<columns;++j) 
            {
                grid[i][j] = s.charAt(currentCharacter);
                ++currentCharacter;
            }
        // now reverse the even rows
        for(int i=1;i<rows;i+=2)
            for(int j=0;j<columns/2;++j) 
            {
                // make sure to only go up to columns/2, since if you go all the way
                // you will swap everything twice, accomplishing nothing
                int oppositeColumn = columns-j-1;
                char temp = grid[i][j];
                grid[i][j] = grid[i][oppositeColumn];
                grid[i][oppositeColumn] = temp;
            }
        return grid;
    }
}
