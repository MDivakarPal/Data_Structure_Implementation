import java.util.*;

class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n=game.length,i=0;
        boolean res=true;
        while(res)
        {
            try{
            if(game[i]==0)
            {
                if(i==n-1 || i+leap>=n)
                {
                    res=true;
                    break;
                }
                else if(game[i+leap]==0)
                {
                    i=i+leap;
                    res=true;
                }
                else if(game[i+1]==0)
                {
                    i++;
                    res=true;
                }
                else if(game[i-1]==0)
                { 
                    if(game[i-1+leap]==0){
                    i=i+leap-1;
                    res=true;
                    }
                    else if(i-1+leap>=n)
                    {
                        res=true;
                        break;
                    }
                    else
                    {
                        res=false;
                        break;
                    }
                }
                else
                {
                    res=false;
                    break;
                }
            }
            else
            {
                res=false;
                break;
            }

        }
        catch (Exception e)
        {
            res=false;
        }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
