public class Main {
    public static void main(String[] args) {
        Valor form = new Valor();
        form.setContentPane(form.formValor);
        form.setVisible(true);
        form.setSize(500, 500);
        form.setTitle("Conversor de moeda");
    }
}