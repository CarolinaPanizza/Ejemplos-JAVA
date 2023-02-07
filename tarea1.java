//MARIA CAROLINA PANIZZA DE SOUZA
        //229053 


        public class Solution {
            public static void main(String args[]) throws Exception {
                Scanner in = new Scanner(System.in);
                String mov = in.nextLine(); 
                int pto = in.nextInt();
                int min = pto;
                int max = pto;
                int pos = 1;
                for (int i = 0; i < mov.length(); i++){
                    if((mov.charAt(i) == 'I') && (pto > -10000)){
                        pto--;
                    }
                    else{
                        if((mov.charAt(i) == 'D') && (pto < 10000)){
                            pto++;
                        }
                    }
                if(max < pto){
                    max = pto;
                }
                if(min > pto){
                    min = pto;
                }
                }
                pos = 1 + max - min;
                System.out.println(pos);
            }
        }