package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.events.Event;

/**
 * Interface for accessing TradingStrategy functionality.
 */
public interface ITradingStrategy {
	void actOnEvent(Event e, int pos, int price);
}
