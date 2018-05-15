package graphics;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScorePanel extends JPanel {
	
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Stop&Exit gomb a játékhoz való kilépéshez
	 */
	private JButton btnStopAndExit = new JButton();				
	
	private JLabel lblPlayer1 = new JLabel("Player 1: ");
	private JLabel lblPlayer2 = new JLabel("Player 2: ");
	
	private JLabel txtPlayer1Score = new JLabel("0");
	private JLabel txtPlayer2Score = new JLabel("0");
	
	private JPanel pointsPanel = new JPanel();
	public ScorePanel() {
		
		this.initComponents();
	}
	
	private void initComponents() {
		  this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		  this.initPointsPanel();
		  
		  javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(this);
	        this.setLayout(jPanelMainLayout);
	        jPanelMainLayout.setHorizontalGroup(
	        		jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        						.addGroup(jPanelMainLayout.createSequentialGroup()
	        						.addGap(30, 30, 30)
	        						.addComponent(pointsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	        						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        						.addComponent(btnStopAndExit)
	        						.addContainerGap())
	        );
	        jPanelMainLayout.setVerticalGroup(
	        		jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
	        						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        						.addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	        						.addComponent(pointsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	        						.addComponent(btnStopAndExit))
	        						.addContainerGap())
	        );
		  
	}
	
	private void initPointsPanel() {
		pointsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Points"));
		pointsPanel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		
		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(pointsPanel);
		pointsPanel.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel3Layout.createSequentialGroup()
	                        .addComponent(lblPlayer1)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(txtPlayer1Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel3Layout.createSequentialGroup()
	                        .addComponent(lblPlayer2)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(txtPlayer2Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(141, Short.MAX_VALUE))
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lblPlayer1)
	                    .addComponent(txtPlayer1Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lblPlayer2)
	                    .addComponent(txtPlayer2Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(50, Short.MAX_VALUE))
	        );
	}
}
