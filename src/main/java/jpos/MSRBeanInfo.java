//------------------------------------------------------------------------------
//
// THIS SOFTWARE IS PROVIDED AS IS. THE JAVAPOS WORKING GROUP MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
// NON-INFRINGEMENT.  INDIVIDUAL OR CORPORATE MEMBERS OF THE JAVAPOS
// WORKING GROUP SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED AS A RESULT
// OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
//
// MSRBeanInfo.java - Bean information for the JavaPOS MSR
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;
import java.lang.reflect.*;

public class MSRBeanInfo
  extends SimpleBeanInfo
{
  public BeanDescriptor getBeanDescriptor()
  {
    return new BeanDescriptor(jpos.MSR.class);
  }

  public PropertyDescriptor makeProperty(String propertyName)
    throws IntrospectionException
  {
    return new PropertyDescriptor(propertyName, jpos.MSR.class);
  }

  public PropertyDescriptor[] getPropertyDescriptors()
  {
    try
    {
      PropertyDescriptor[] properties =
      {
        // Capabilities
        makeProperty("CapISO"),
        makeProperty("CapJISOne"),
        makeProperty("CapJISTwo"),
        makeProperty("CapPowerReporting"),
        makeProperty("CapTransmitSentinels"),

        // Properties
        makeProperty("AccountNumber"),
        makeProperty("AutoDisable"),
        makeProperty("DataCount"),
        makeProperty("DataEventEnabled"),
        makeProperty("DecodeData"),
        makeProperty("ErrorReportingType"),
        makeProperty("ExpirationDate"),
        makeProperty("FirstName"),
        makeProperty("MiddleInitial"),
        makeProperty("ParseDecodeData"),
        makeProperty("ServiceCode"),
        makeProperty("Suffix"),
        makeProperty("Surname"),
        makeProperty("Title"),
        makeProperty("Track1Data"),
        makeProperty("Track1DiscretionaryData"),
        makeProperty("Track2Data"),
        makeProperty("Track2DiscretionaryData"),
        makeProperty("Track3Data"),
        makeProperty("TracksToRead"),
        makeProperty("PowerNotify"),
        makeProperty("PowerState"),
        makeProperty("Track4Data"),
        makeProperty("TransmitSentinels"),

      };

      return properties;
    }
    catch(Exception e)
    {
      return super.getPropertyDescriptors();
    }
  }

  public EventSetDescriptor makeEvent(String eventName)
    throws IntrospectionException, ClassNotFoundException
  {
    String listener = "jpos.events." + eventName + "Listener";
    return new EventSetDescriptor(jpos.MSR.class,
                                  eventName,
                                  Class.forName(listener),
                                  eventName + "Occurred");
  }

  public EventSetDescriptor[] getEventSetDescriptors()
  {
    try
    {
      EventSetDescriptor[] events =
      {
        makeEvent("Data"),
        makeEvent("DirectIO"),
        makeEvent("Error"),
        makeEvent("StatusUpdate")
      };

      return events;
    }
    catch(Exception e)
    {
      return super.getEventSetDescriptors();
    }
  }
}
