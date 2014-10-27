package net.powermatcher.core.agent.concentrator;


import net.powermatcher.core.agent.concentrator.framework.AbstractConcentrator;
import net.powermatcher.core.configurable.service.Configurable;


/**
 * @author IBM
 * @version 0.9.0
 */
public class Concentrator extends AbstractConcentrator {
	/**
	 * Constructs an instance of this class.
	 * 
	 * @see #Concentrator(Configurable)
	 */
	public Concentrator() {
		super();
	}

	/**
	 * Constructs an instance of this class from the specified properties
	 * parameter.
	 * 
	 * @param configuration
	 *            The configuration (<code>ConfigurationService</code>)
	 *            parameter.
	 * @see #Concentrator()
	 */
	public Concentrator(final Configurable configuration) {
		super(configuration);
	}

}