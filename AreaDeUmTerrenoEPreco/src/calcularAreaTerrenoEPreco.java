import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class calcularAreaTerrenoEPreco {

    public static void main(String[] args){

        //input

        double larguraQuebrada,largura, comprimentoQuebrado,comprimento, precoPorMetroQuadrado, area, precoTerreno;
        DecimalFormat decimalUmaCasa = new DecimalFormat("0.0");

        larguraQuebrada = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do terreno (em metros): "));

        String larguraFormatada = decimalUmaCasa.format(larguraQuebrada);
        largura = Double.parseDouble(larguraFormatada.replaceAll(",", "."));

        comprimentoQuebrado = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do terreno (em metros): "));
        String comprimentoFormatada = decimalUmaCasa.format(comprimentoQuebrado);
        comprimento = Double.parseDouble(comprimentoFormatada.replaceAll(",", "."));

        precoPorMetroQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Preço por metro quadrado (em R$): "));



        //process

        area = largura * comprimento;
        DecimalFormat decimal = new DecimalFormat("0.00");
        String areaFormatada = decimal.format(area);

        precoTerreno = area * precoPorMetroQuadrado;
        String precoTerrenoFormatada = decimal.format(precoTerreno);

        //output

        JOptionPane.showMessageDialog(null, "Area do terreno = "+areaFormatada+" metros\nPreço do terreno = R$"+precoTerrenoFormatada+".");

    }

}
