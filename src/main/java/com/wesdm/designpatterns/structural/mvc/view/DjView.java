package com.wesdm.designpatterns.structural.mvc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.wesdm.designpatterns.structural.mvc.controller.IController;
import com.wesdm.designpatterns.structural.mvc.model.IBeatModel;

public class DjView implements ActionListener, BeatObserver, BpmObserver {
	IBeatModel model;
	IController controller;
	JFrame frame;
	JPanel panel;
	BeatBar beatBar;
	JLabel bpmOutputLabel;
	
	public DjView(IController controller, IBeatModel model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BeatObserver)this);
		model.registerObserver((BpmObserver)this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBpm() {
		int bpm = model.getBpm();
		if(bpm == 0) {
			bpmOutputLabel.setText("offline");
		} else {
			bpmOutputLabel.setText("Current BPM: "+bpm);
		}
	}

	@Override
	public void updateBeat() {
		beatBar.setValue(100);
	}

	public void createView() {
		// TODO Auto-generated method stub
		
	}

	public void createControls() {
		// TODO Auto-generated method stub
		
	}

	public void disableStopMenuItem() {
		// TODO Auto-generated method stub
		
	}

	public void enableStartMenuItem() {
		// TODO Auto-generated method stub
		
	}

	public void disableStartMenuItem() {
		// TODO Auto-generated method stub
		
	}

	public void enableStopMenuItem() {
		// TODO Auto-generated method stub
		
	}

}
