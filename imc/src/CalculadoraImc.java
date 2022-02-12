import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalculadoraImc {
    public static void main(String args[]){

        double peso, altura, imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso (Kg): "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura (M): "));

        imc = peso / (altura * altura);

        DecimalFormat decimalImc = new DecimalFormat("0.00");
        System.out.println(decimalImc);

        String imcFormatado = decimalImc.format(imc);

        if(peso <= 0 || altura <= 0){
            JOptionPane.showMessageDialog(null, "Os valores informados não são válidos.");
        }else if(imc < 18.5 && imc > 0) {
            JOptionPane.showMessageDialog(null, "Imc = "+imcFormatado+ " - Peso abaixo. Alerta de magreza!");
        } else if(imc >= 18.5 && imc < 25){
            JOptionPane.showMessageDialog(null, "Imc = "+imcFormatado+ " - Peso norma. Continue assim!");
        }else if(imc >= 24.9 && imc < 30.00) {
            JOptionPane.showMessageDialog(null, "Imc = "+imcFormatado+" - Com sobreso. Cuidado obesidade a vista!");
        }else if(imc >= 30.0 && imc < 35){
            JOptionPane.showMessageDialog(null, "Imc = "+imcFormatado+" - Obesidade grau 1. Perigo!!");
        }else if(imc >= 35.0 && imc < 40){
            JOptionPane.showMessageDialog(null, "Imc = "+imcFormatado+" - Obesidade Severa (grau 2). Perigo!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Imc = "+imcFormatado+" - Obesidade Mórbida (grau 3). Perigo!!!!");
        }
    };
};
