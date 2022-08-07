package fileDemo;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTable;

public class demo {

	private JFrame frame;
	private JTextField txtSearchKey;
	private JTable tblCities;

	public DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo window = new demo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public demo() {
		initialize();
		populateCity();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 737, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtSearchKey = new JTextField();
		txtSearchKey.setBounds(125, 26, 180, 20);
		frame.getContentPane().add(txtSearchKey);
		txtSearchKey.setColumns(10);

		JLabel lblSearch = new JLabel("Arama :");
		lblSearch.setBounds(36, 29, 46, 14);
		frame.getContentPane().add(lblSearch);

		tblCities = new JTable();
		tblCities.setBounds(67, 268, 599, -145);
		frame.getContentPane().add(tblCities);
	}

	public void populateCity() {

		model = (DefaultTableModel) tblCities.getModel();
		model.setRowCount(0);

		try {
			ArrayList<City> cities = getCities();
			for (City city : cities) {
				Object[] row = { city.getId(), city.getCityName(), city.getCountryCode(), city.getDistruct(),
						city.getPopulation() };
				model.addRow(row);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public ArrayList<City> getCities() {
		ArrayList<City> cities = null;
		Connection connection;
		DbHelper dbHelper = null;
		Statement statement;
		ResultSet result;

		try {
			dbHelper = new DbHelper();
			connection = dbHelper.getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery("select * from city");
			cities = new ArrayList<City>();
			while (result.next()) {
				cities.add(new City(result.getInt("ID"), result.getString("City"), result.getString("City"),
						result.getString("Distruct"), result.getInt("Popultaion")));

			}
			statement.close();
			connection.close();

		} catch (SQLException exception) {
			dbHelper.showErrorMessage(exception);
		}
		return cities;

	}
	
	/*private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter =
                new TableRowSorter<DefaultTableModel>(model);
        tblCities.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }*/

}