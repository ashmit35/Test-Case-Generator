import java.io.*;

public class Main {
    public static void generateInput(int i, File f1,File f2){

        try{

            FileWriter fw = new FileWriter(f1);
                int n = (int) ( (100*Math.random()) %100)  +1;


            int a[] = new int[n];
            fw.write(Integer.toString(n)+"\n");
            
            for(int idx=0;idx<n;idx++){
                int num = (int)((100*Math.random())%100)+1;
                a[idx] = num;
                fw.write(Integer.toString(num)+" ");
            }
            fw.write("\n");
            fw.close();

            generateOutput(f2,a);
        }
        catch(Exception e){}
    }

    public static void generateOutput(File f2,int a[]){

      try {
        FileWriter fw = new FileWriter(f2);

        int sum=0;
        for(int i=0;i<a.length;i++) sum+=a[i];

        fw.write(Integer.toString(sum)+"\n");
        fw.close();
      } catch (Exception e) {
      }

    }
    public static void main(String[] args) throws Exception {
        
        final String input[] = {"input1.in","input2.in","input3.in","input4.in","input5.in","input6.in","input7.in","input8.in","input9.in","input10.in","input11.in","input12.in"};
        final String output[] = {"input1.out","input2.out","input3.out","input4.out","input5.out","input6.out","input7.out","input8.out","input9.out","input10.out","input11.out","input12.out"};
        File f1,f2;
        
        for(int i=0;i<12;i++){

            f1 = new File(input[i]);
            f2 = new File(output[i]);
            f1.createNewFile();
            f2.createNewFile();
            generateInput(i,f1,f2);
        }
    }
}