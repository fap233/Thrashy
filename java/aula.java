import javax.swing.JOptionPane;

public class FluxoDeDados {

    public static void main(String[] args) {
        
        int num1, num2;
        double quociente, potencia;
        
        
        String inputNum1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        String inputNum2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
        
       
        num1 = Integer.parseInt(inputNum1);
        num2 = Integer.parseInt(inputNum2);
        
        
        if (num2 != 0) {
            quociente = (double) num1 / num2;
        } else {
            quociente = Double.NaN; 
        }

        
        potencia = Math.pow(num1, num2);

        
        String mensagem = "Resultados:\n";
        mensagem += "Quociente da divisão de " + num1 + " por " + num2 + " = " + quociente + "\n";
        mensagem += "Potência de " + num1 + " elevado a " + num2 + " = " + potencia;

        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
