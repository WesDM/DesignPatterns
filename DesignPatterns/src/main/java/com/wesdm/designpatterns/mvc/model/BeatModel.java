package com.wesdm.designpatterns.mvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;

import com.wesdm.designpatterns.mvc.view.BeatObserver;
import com.wesdm.designpatterns.mvc.view.BpmObserver;

public class BeatModel implements IBeatModel, MetaEventListener {
	Sequencer sequencer;
	List<BeatObserver> beatObservers  = new ArrayList<>();
	List<BpmObserver> bpmObservers = new ArrayList<>();
	int bpm = 90;

	@Override
	public void meta(MetaMessage meta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		setUpMidi();
		buildTrackAndStart();
	}

	private void buildTrackAndStart() {
		// TODO Auto-generated method stub
		
	}

	private void setUpMidi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void on() {
		sequencer.start();
		setBpm(90);
	}

	@Override
	public void off() {
		setBpm(0);
		sequencer.stop();
	}

	@Override
	public void setBpm(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBpm());
		notifyBpmObservers();
	}

	private void notifyBpmObservers() {
		for(BpmObserver o : bpmObservers){
			o.updateBpm();
		}
	}

	@Override
	public int getBpm() {
		return bpm;
	}
	
	void beatEvent(){
		notifyBeatObservers();
	}
	
	private void notifyBeatObservers(){
		for(BeatObserver o : beatObservers){
			o.updateBeat();
		}
	}

	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		beatObservers.remove(o);
	}

	@Override
	public void registerObserver(BpmObserver o) {
		bpmObservers.add(o);
	}

	@Override
	public void removeObserver(BpmObserver o) {
		bpmObservers.remove(o);
	}
}
