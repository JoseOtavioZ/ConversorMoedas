import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Valor extends JFrame{
    private JTextField textValor;
    private JComboBox comboBox1;
    private JButton converterButton;
    private JButton limparButton;
    private JTextField textResultado;
    public JPanel formValor;

    public Valor() {
    converterButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(comboBox1.getSelectedIndex()==0){
                textResultado.setText(textValor.getText());
                //reais
            }
            else if (comboBox1.getSelectedIndex()==1){
                Double valorConvertido = Double.valueOf(textValor.getText()) *5;
                textResultado.setText(valorConvertido.toString());
                //dolar
            }
            else if (comboBox1.getSelectedIndex()==2) {
                Double valorConvertido = Double.valueOf(textValor.getText()) *6;
                textResultado.setText(valorConvertido.toString());
                //euros
            }
            else if (comboBox1.getSelectedIndex()==3) {
                Double valorConvertido = Double.valueOf(textValor.getText()) *7;
                textResultado.setText(valorConvertido.toString());
                //libras
            }
            }
        }
    );
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textValor.setText("");
                textResultado.setText("");
            }
        });
    }
}
