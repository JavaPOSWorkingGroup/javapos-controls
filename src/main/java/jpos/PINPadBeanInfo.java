//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
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
// PINPadBeanInfo.java - Bean information for the JavaPOS PINPad
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;
import java.lang.reflect.*;

public class PINPadBeanInfo
  extends SimpleBeanInfo
{
  public BeanDescriptor getBeanDescriptor()
  {
    return new BeanDescriptor(jpos.PINPad.class);
  }

  public PropertyDescriptor makeProperty(String propertyName)
    throws IntrospectionException
  {
    return new PropertyDescriptor(propertyName, jpos.PINPad.class);
  }

  public PropertyDescriptor[] getPropertyDescriptors()
  {
    try
    {
      PropertyDescriptor[] properties =
      {
        // Capabilities
        makeProperty("CapDisplay"),
        makeProperty("CapLanguage"),
        makeProperty("CapKeyboard"),
        makeProperty("CapMACCalculation"),
        makeProperty("CapPowerReporting"),
        makeProperty("CapTone"),

        // Properties
        makeProperty("CheckHealthText"),
        makeProperty("Claimed"),
        makeProperty("DeviceControlDescription"),
        makeProperty("DeviceControlVersion"),
        makeProperty("DeviceEnabled"),
        makeProperty("DeviceServiceDescription"),
        makeProperty("DeviceServiceVersion"),
        makeProperty("FreezeEvents"),
        makeProperty("PhysicalDeviceDescription"),
        makeProperty("PhysicalDeviceName"),
        makeProperty("State"),
        makeProperty("AccountNumber"),
        makeProperty("AdditionalSecurityInformation"),
        makeProperty("Amount"),
        makeProperty("AvailableLanguagesList"),
        makeProperty("AvailablePromptsList"),
        makeProperty("DataCount"),
        makeProperty("DataEventEnabled"),
        makeProperty("EncryptedPIN"),
        makeProperty("MaximumPINLength"),
        makeProperty("MerchantID"),
        makeProperty("MinimumPINLength"),
        makeProperty("PINEntryEnabled"),
        makeProperty("PowerNotify"),
        makeProperty("PowerState"),
        makeProperty("Prompt"),
        makeProperty("PromptLanguage"),
        makeProperty("TerminalID"),
        makeProperty("Track1Data"),
        makeProperty("Track2Data"),
        makeProperty("Track3Data"),
        makeProperty("TransactionType"),
        makeProperty("Track4Data"),

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
    return new EventSetDescriptor(jpos.PINPad.class,
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