import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCafe extends JFrame{
    private JTextField textFood1;
    private JTextField textBev1;
    private JTextField textFood2;
    private JTextField textFood3;
    private JTextField textFood4;
    private JTextField textFood5;
    private JTextField textFood6;
    private JTextField textBev2;
    private JTextField textBev3;
    private JTextField textBev4;
    private JTextField textBev5;
    private JTextField textBev6;
    private JButton Clear;
    private JButton Confirm;
    private JLabel labelFood;
    private JLabel labelBev;
    private JTextArea textHasil;
    private JPanel mainPanel;
    private JTextField textAN;
    private JTextPane textTotal;


    public MyCafe() {
        setContentPane(mainPanel);
        setTitle("MyCafe");
        setSize(600,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        String defaultHasil = ("Pesanan Atas Nama: " + textAN.getText() + "\n" +
                "Berikut daftar harga menu, \n" +
                " Nasi Goreng Rp. 12.000\n" +
                " Mie Goreng Rp. 15.000\n" +
                " Mie Kuah Rp. 17.000\n" +
                " Ayam Goreng Rp. 23.000\n" +
                " Ayam Bakar Rp. 22.000\n" +
                " Ayam Spesial Rp. 25.000\n" +
                " Air Mineral Rp. 1000\n" +
                " Es Teh Rp. 5000\n" +
                " Teh Panas Rp. 3000\n" +
                " Es Jeruk Rp. 8000\n" +
                " Jeruk Panas Rp. 6000\n" +
                " Es Kopyor  Rp. 10.000\n\n" +
                "Terima Kasih!");
        textHasil.setText(defaultHasil);

        Confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textAN.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Konfirmasi pesanan dengan memasukkan nama Anda");
                } else {
                    int total = 0;
                    int Qfood1 = Integer.parseInt(textFood1.getText());
                    int Qfood2 = Integer.parseInt(textFood2.getText());
                    int Qfood3 = Integer.parseInt(textFood3.getText());
                    int Qfood4 = Integer.parseInt(textFood4.getText());
                    int Qfood5 = Integer.parseInt(textFood5.getText());
                    int Qfood6 = Integer.parseInt(textFood6.getText());
                    int Qbev1 = Integer.parseInt(textBev1.getText());
                    int Qbev2 = Integer.parseInt(textBev2.getText());
                    int Qbev3 = Integer.parseInt(textBev3.getText());
                    int Qbev4 = Integer.parseInt(textBev4.getText());
                    int Qbev5 = Integer.parseInt(textBev5.getText());
                    int Qbev6 = Integer.parseInt(textBev6.getText());
                    for (int i = 0; i < Qfood1; i++) {
                        total = total + 12000;
                    }
                    for (int i = 0; i < Qfood2; i++) {
                        total = total + 15000;
                    }
                    for (int i = 0; i < Qfood3; i++) {
                        total = total + 17000;
                    }
                    for (int i = 0; i < Qfood4; i++) {
                        total = total + 23000;
                    }
                    for (int i = 0; i < Qfood5; i++) {
                        total = total + 22000;
                    }
                    for (int i = 0; i < Qfood6; i++) {
                        total = total + 25000;
                    }
                    for (int i = 0; i < Qbev1; i++) {
                        total = total + 1000;
                    }
                    for (int i = 0; i < Qbev2; i++) {
                        total = total + 5000;
                    }
                    for (int i = 0; i < Qbev3; i++) {
                        total = total + 3000;
                    }
                    for (int i = 0; i < Qbev4; i++) {
                        total = total + 8000;
                    }
                    for (int i = 0; i < Qbev5; i++) {
                        total = total + 6000;
                    }
                    for (int i = 0; i < Qbev6; i++) {
                        total = total + 10000;
                    }


                    textHasil.setText(
                            "Pesanan Atas Nama: " + textAN.getText() + "\n" +
                                    "Berikut pesanan Anda, \n" +
                                    Qfood1 + " Nasi Goreng \n" +
                                    Qfood2 + " Mie Goreng \n" +
                                    Qfood3 + " Mie Kuah \n" +
                                    Qfood4 + " Ayam Goreng \n" +
                                    Qfood5 + " Ayam Bakar \n" +
                                    Qfood6 + " Ayam Spesial \n" +
                                    Qbev1 + " Air Mineral \n" +
                                    Qbev2 + " Es Teh \n" +
                                    Qbev3 + " Teh Panas \n" +
                                    Qbev4 + " Es Jeruk \n" +
                                    Qbev5 + " Jeruk Panas \n" +
                                    Qbev6 + " Es Kopyor  \n\n" +
                                    "Terima Kasih!"
                    );
                    textTotal.setText("Total biaya Anda Rp. " + String.valueOf(total));
                }
            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textHasil.setText(defaultHasil);;textAN.setText("");textTotal.setText("");
                textFood1.setText("0");textFood2.setText("0");textFood3.setText("0");textFood4.setText("0");textFood5.setText("0");textFood6.setText("0");
                textBev1.setText("0");textBev2.setText("0");textBev3.setText("0");textBev4.setText("0");textBev5.setText("0");textBev6.setText("0");
            }
        });
    }

    public static void main(String[] args) {
        MyCafe frame = new MyCafe();
    }
}
