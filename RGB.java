import java.io.*;

public class RGB {
    public static void main(String[] args){
        String file = "src/arbreASCII.ppm";
        File arbreR = new File("src/arbreR.ppm");
        File arbreG = new File("src/arbreG.ppm");
        File arbreB = new File("src/arbreB.ppm");
        BufferedReader br;
        String tmp;
        try
        {
            br = new BufferedReader(new FileReader(file));
            FileReader in = new FileReader(file);
            FileWriter red = new FileWriter(arbreR);
            FileWriter green = new FileWriter(arbreG);
            FileWriter blue = new FileWriter(arbreB);
            tmp = br.readLine();
            red.write(tmp);
            red.write(System.getProperty("line.separator"));
            green.write(tmp);
            green.write(System.getProperty("line.separator"));
            blue.write(tmp);
            blue.write(System.getProperty("line.separator"));
            tmp = br.readLine();
            red.write(tmp);
            red.write(System.getProperty("line.separator"));
            green.write(tmp);
            green.write(System.getProperty("line.separator"));
            blue.write(tmp);
            blue.write(System.getProperty("line.separator"));
            String taille = br.readLine();
            String[] parts = taille.split(" ");
            String w = parts[0];
            red.write(w);
            red.write(" ");
            green.write(w);
            green.write(" ");
            blue.write(w);
            blue.write(" ");
            String h = parts[1];
            red.write(h);
            red.write(System.getProperty("line.separator"));
            green.write(h);
            green.write(System.getProperty("line.separator"));
            blue.write(h);
            blue.write(System.getProperty("line.separator"));
            String max = br.readLine();
            red.write(max);
            red.write(System.getProperty("line.separator"));
            green.write(max);
            green.write(System.getProperty("line.separator"));
            blue.write(max);
            blue.write(System.getProperty("line.separator"));
            for(int i=0; i<Integer.parseInt(w)*Integer.parseInt(h); i++){
                String r=br.readLine();
                String g=br.readLine();
                String b=br.readLine();
                red.write(r);
                red.write(System.getProperty("line.separator"));
                red.write(String.valueOf(0));
                red.write(System.getProperty("line.separator"));
                red.write(String.valueOf(0));
                red.write(System.getProperty("line.separator"));
                green.write(String.valueOf(0));
                green.write(System.getProperty("line.separator"));
                green.write(g);
                green.write(System.getProperty("line.separator"));
                green.write(String.valueOf(0));
                green.write(System.getProperty("line.separator"));
                blue.write(String.valueOf(0));
                blue.write(System.getProperty("line.separator"));
                blue.write(String.valueOf(0));
                blue.write(System.getProperty("line.separator"));
                blue.write(b);
                blue.write(System.getProperty("line.separator"));
            }
            in.close();
            red.close();
            green.close();
            blue.close();
        }
        catch(FileNotFoundException exc) { System.out.println("Erreur d'ouverture"); }
        catch (IOException ex) { System.err.println(ex); }
    }
}
