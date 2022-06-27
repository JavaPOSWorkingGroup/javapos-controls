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
// MSRBeanInfo.java - Bean information for the JavaPOS MSR
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

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
                makeProperty("CapCardAuthentication"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapDataEncryption"),
                makeProperty("CapDeviceAuthentication"),
                makeProperty("CapISO"),
                makeProperty("CapJISOne"),
                makeProperty("CapJISTwo"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapTrackDataMasking"),
                makeProperty("CapTransmitSentinels"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapWritableTracks"),
                
                // Properties
                makeProperty("AccountNumber"),
                makeProperty("AdditionalSecurityInformation"),
                makeProperty("AutoDisable"),
                makeProperty("CardAuthenticationData"),
                makeProperty("CardAuthenticationDataLength"),
                makeProperty("CardPropertyList"),
                makeProperty("CardType"),
                makeProperty("CardTypeList"),
                makeProperty("DataCount"),
                makeProperty("DataEncryptionAlgorithm"),
                makeProperty("DataEventEnabled"),
                makeProperty("DecodeData"),
                makeProperty("DeviceAuthenticated"),
                makeProperty("DeviceAuthenticationProtocol"),
                makeProperty("EncodingMaxLength"),
                makeProperty("ErrorReportingType"),
                makeProperty("ExpirationDate"),
                makeProperty("FirstName"),
                makeProperty("MiddleInitial"),
                makeProperty("ParseDecodeData"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("ServiceCode"),
                makeProperty("Suffix"),
                makeProperty("Surname"),
                makeProperty("Title"),
                makeProperty("Track1Data"),
                makeProperty("Track1DiscretionaryData"),
                makeProperty("Track1EncryptedData"),
                makeProperty("Track1EncryptedDataLength"),
                makeProperty("Track2Data"),
                makeProperty("Track2DiscretionaryData"),
                makeProperty("Track2EncryptedData"),
                makeProperty("Track2EncryptedDataLength"),
                makeProperty("Track3Data"),
                makeProperty("Track3EncryptedData"),
                makeProperty("Track3EncryptedDataLength"),
                makeProperty("Track4Data"),
                makeProperty("Track4EncryptedData"),
                makeProperty("Track4EncryptedDataLength"),
                makeProperty("TracksToRead"),
                makeProperty("TracksToWrite"),
                makeProperty("TransmitSentinels"),
                makeProperty("WriteCardType")
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
