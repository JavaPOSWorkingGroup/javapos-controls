package jpos;

///////////////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individals)  MAKES NO
// REPRESENTATIONS OR WARRRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives. Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted. 
//
///////////////////////////////////////////////////////////////////////////////
import java.lang.reflect.Constructor;

import jpos.config.JposEntry;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceInstanceFactory;

/**
 * Sample com.xxx company JposServiceInstanceFactory
 * @since 0.1 (Philly 99 meeting)
 * @author E. Michael Maximilien (maxim@us.ibm.com)
 */
public final class TestServiceInstanceFactory extends Object implements JposServiceInstanceFactory
{
    /** 
     * Default ctor 
     * @since 0.1 (Philly 99 meeting)
     */
    public TestServiceInstanceFactory() {}

    /**
     * Simply creates an instance of a service.
     * @param logicalName the logical name for this entry
     * @param entry the JposEntry with properties for creating the service
     * @exception jpos.JposException in case the factory cannot create service or service throws exception
     */
    public JposServiceInstance createInstance( String logicalName, JposEntry entry ) throws JposException
    {
        if( !entry.hasPropertyWithName( JposEntry.SERVICE_CLASS_PROP_NAME ) )
            throw new JposException( JposConst.JPOS_E_NOSERVICE, "The JposEntry does not contain the 'serviceClass' property" );

        JposServiceInstance serviceInstance = null;

        try
        {
            String serviceClassName = (String)entry.getPropertyValue( JposEntry.SERVICE_CLASS_PROP_NAME );
            Class<?> serviceClass = Class.forName( serviceClassName );

            Class<?>[] params = new Class[ 0 ];

            Constructor<?> ctor = serviceClass.getConstructor( params );

            serviceInstance = (JposServiceInstance)ctor.newInstance( (Object[])params );

            return serviceInstance;
        }
        catch( Exception e )
        { 
        	throw new JposException( JposConst.JPOS_E_NOSERVICE, "Could not create the service instance: " + e.getMessage(), e ); 
        }
    }
}
