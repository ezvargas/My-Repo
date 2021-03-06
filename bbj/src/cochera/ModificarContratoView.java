package cochera;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ModificarContratoView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private SistemaAdministracionCochera sistema;
	private JTextField textField_cli;
	private JTextField textField_coch;
	private JTextField textField_paten;
	private JTextField textField_entidad;
	private JTextField textCampo1;
	private JTextField textFieldVencim;
	private JTextField txtIdcontrato;

	public ModificarContratoView(SistemaAdministracionCochera sist) {
		sistema = sist;
		setVisible(true);
		setBounds(100, 100, 450, 505);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblContrato = new JLabel("Modificacion de contrato");
		lblContrato.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JLabel lblNewLabel = new JLabel("Tipo:");
		JLabel lblclie = new JLabel("*DNI cliente:");
		JLabel lblCoche = new JLabel("*ID cochera:");
		JLabel lblTam = new JLabel("Tama\u00F1o:");
		JLabel lblPeriodo = new JLabel("Periodo:");
		textField_cli = new JTextField();
		textField_cli.setColumns(10);
		textField_coch = new JTextField();
		textField_coch.setColumns(10);
		JLabel lblIDcontrato = new JLabel("N\u00B0 de contrato:");

		txtIdcontrato = new JTextField();
		txtIdcontrato.setColumns(10);

		JComboBox comboBox_tipo = new JComboBox();

		JLabel lblPatente = new JLabel("Patente:");

		textField_paten = new JTextField();
		textField_paten.setColumns(10);

		JComboBox comboBox_per = new JComboBox();
		comboBox_per.setModel(new DefaultComboBoxModel(new String[] { "Quincenal", "Mensual", "Semestral", "Anual" }));

		comboBox_tipo.setModel(
				new DefaultComboBoxModel(new String[] { "Efectivo", "Cheque", "Tarjeta de credito", "Debito CBU" }));

		JComboBox comboBoxTama = new JComboBox();
		comboBoxTama.setModel(new DefaultComboBoxModel(new String[] { "Peque\u00F1o", "Mediano", "Grande" }));
		JLabel lblEntidad = new JLabel("Entidad:");

		textField_entidad = new JTextField();
		textField_entidad.setColumns(10);

		JLabel lblCampo1 = new JLabel("campo1");

		textCampo1 = new JTextField();
		textCampo1.setColumns(10);
		JLabel lblVencimiento = new JLabel("Fecha vencimiento");
		textFieldVencim = new JTextField();
		textFieldVencim.setColumns(10);

		lblCampo1.setVisible(false);
		textCampo1.setVisible(false);
		lblVencimiento.setVisible(false);
		textFieldVencim.setVisible(false);
		lblEntidad.setVisible(false);
		textField_entidad.setVisible(false);

		comboBox_tipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_tipo.getSelectedItem().toString().compareTo("Efectivo") == 0
						|| comboBox_tipo.getSelectedItem().toString().compareTo("Cheque") == 0) {
					lblEntidad.setVisible(false);
					textField_entidad.setVisible(false);
					lblCampo1.setVisible(false);
					textCampo1.setVisible(false);
					lblVencimiento.setVisible(false);
					textFieldVencim.setVisible(false);
				} else {
					lblEntidad.setVisible(true);
					textField_entidad.setVisible(true);
					lblCampo1.setVisible(true);
					textCampo1.setVisible(true);
					lblVencimiento.setVisible(false);
					textFieldVencim.setVisible(false);
					if (comboBox_tipo.getSelectedItem().toString().compareTo("Debito CBU") == 0) {
						lblCampo1.setText("cbu:");
					} else {
						lblCampo1.setText("Numero:");
						lblVencimiento.setVisible(true);
						textFieldVencim.setVisible(true);

					}

				}

			}
		});

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(57)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
								.addComponent(lblIDcontrato).addComponent(lblclie).addComponent(lblCoche)
								.addComponent(lblTam).addComponent(lblPeriodo)
								.addGroup(gl_contentPanel.createSequentialGroup().addGap(1)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblEntidad).addComponent(lblPatente)))
						.addComponent(lblCampo1).addComponent(lblVencimiento)).addGap(
								75)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldVencim, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
								.addComponent(textCampo1, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
								.addComponent(textField_entidad, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
								.addComponent(textField_paten, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
								.addComponent(comboBox_per, 0, 131, Short.MAX_VALUE)
								.addComponent(comboBoxTama, Alignment.TRAILING, 0, 131, Short.MAX_VALUE)
								.addComponent(txtIdcontrato, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
								.addComponent(comboBox_tipo, 0, 131, Short.MAX_VALUE)
								.addComponent(textField_coch, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 131,
										Short.MAX_VALUE)
								.addComponent(textField_cli, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 131,
										Short.MAX_VALUE))
						.addGap(53))
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(107).addComponent(lblContrato)
						.addContainerGap(122, Short.MAX_VALUE)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addComponent(lblContrato).addGap(23)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(comboBox_tipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblIDcontrato)
						.addComponent(txtIdcontrato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_cli, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblclie))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblCoche).addComponent(
						textField_coch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(10)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblTam)
						.addComponent(comboBoxTama, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblPeriodo).addComponent(
						comboBox_per, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(19)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblPatente).addComponent(
						textField_paten, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(21)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblEntidad).addComponent(
						textField_entidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblCampo1).addComponent(
						textCampo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPanel
						.createParallelGroup(Alignment.BASELINE).addComponent(textFieldVencim,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVencimiento)).addGap(12)));
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						// Modificar Contrato efectivo
						if (comboBox_tipo.getSelectedItem().toString().compareTo("Efectivo") == 0)
							sistema.modificarEfectivo(Integer.parseInt(txtIdcontrato.getText()),
									textField_cli.getText(), textField_coch.getText(),
									comboBoxTama.getSelectedItem().toString(),
									comboBox_per.getSelectedItem().toString(), textField_paten.getText());

						// Modificar Contrato Cheque
						if (comboBox_tipo.getSelectedItem().toString().compareTo("Cheque") == 0)

							sistema.modificarCheque(Integer.parseInt(txtIdcontrato.getText()), textField_cli.getText(),
									textField_coch.getText(), comboBoxTama.getSelectedItem().toString(),
									comboBox_per.getSelectedItem().toString(), textField_paten.getText());

						// Modificar Contrato credito
						if (comboBox_tipo.getSelectedItem().toString().compareTo("Tarjeta de credito") == 0) {
							String fecha = textField_paten.getText();
							DateFormat df = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH);
							try {
								sistema.modificarDebitoTarjetaCredito(Integer.parseInt(txtIdcontrato.getText()),
										textField_cli.getText(), textField_coch.getText(),
										comboBoxTama.getSelectedItem().toString(),
										comboBox_per.getSelectedItem().toString(), textField_paten.getText(),
										textField_entidad.getText(), textCampo1.getText(), df.parse(fecha));

							} catch (Exception a) {
								a.printStackTrace();
							}
						}
						// Modificar Contrato Debito CBU
						if (comboBox_tipo.getSelectedItem().toString().compareTo("Debito CBU") == 0) {

							sistema.modificarContratoDebitoCBU(Integer.parseInt(txtIdcontrato.getText()),
									textField_cli.getText(), textField_coch.getText(),
									comboBoxTama.getSelectedItem().toString(),
									comboBox_per.getSelectedItem().toString(), textField_entidad.getText(),
									textCampo1.getText(), textField_paten.getText());
						}
						Contrato_menu clmenu = new Contrato_menu(sistema);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Contrato_menu clmenu = new Contrato_menu(sistema);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
