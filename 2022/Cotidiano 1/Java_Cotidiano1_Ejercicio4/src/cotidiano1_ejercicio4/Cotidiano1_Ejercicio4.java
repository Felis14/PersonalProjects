package cotidiano1_ejercicio4;

import javax.swing.JOptionPane;

public class Cotidiano1_Ejercicio4
{
    public static void main(String[] args)
    {
        int i=1, n, nota, sumAp=0, sumAl=0, sumRe=0, ccAp=0, ccRe=0, ccAl=0;
        float promAp=0, promRe=0, promAl=0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Notas a ingresar: "));
        
        while (i<=n)
        {
            nota = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite una nota: "));
            
            JOptionPane.showMessageDialog(null,
            i+" nota procesada.");
            
            if (nota>=70)
            {
                JOptionPane.showMessageDialog(null,
                "Nota aprobada");
                sumAp += nota; ccAp++;
            }
            else
            {
                if ((nota<70)&&(nota>=60))
                {
                    JOptionPane.showMessageDialog(null,
                    "Nota aplazada");
                    sumAl += nota; ccAl++;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                    "Nota reprobada");
                    sumRe += nota; ccRe++;
                }
            }
            
            i++;     
        }
        
        if (ccAp!=0)
        {
            promAp = sumAp / ccAp;
        }
        if (ccRe!=0)
        {
            promRe = sumRe / ccRe;
        }
        if (ccAl!=0)
        {
            promAl = sumAl / ccAl;
        }
        
        JOptionPane.showMessageDialog(null,
        "Se registraron "+ccAp+" notas aprobadas."+
        "\nEl promedio de las notas aprobadas es: "+promAp+
        "\n\nSe registraron "+ccAl+" notas aplazadas"+
        "\nEl promedio de las notas aplazadas es "+promAl+
        "\n\nSe registraron "+ccRe+" notas reprobadas."+
        "\nEl promedio de las notas reprobadas es: "+promRe, "Resultados",
        JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
